using System;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using Cvent.SDK.Hooks;

namespace Cvent.SDK.Tests.Hooks;

[TestFixture]
public class CventRateLimitHookTest
{
    private readonly CventRateLimitHook _hook = new CventRateLimitHook();

    private static HttpResponseMessage CreateResponse(HttpStatusCode statusCode, string body)
    {
        return new HttpResponseMessage(statusCode)
        {
            Content = new StringContent(body, Encoding.UTF8, "application/json")
        };
    }

    private static AfterErrorContext CreateContext()
    {
        var config = new SDKConfig();
        var hookCtx = new HookContext(config, "", "testOp", null, null);
        return new AfterErrorContext(hookCtx);
    }

    // --- AfterErrorAsync: throttling (Too Many Requests) ---

    [Test]
    public async Task AfterErrorAsync_429WithTooManyRequests_ReturnsThrottlingException()
    {
        var response = CreateResponse((HttpStatusCode)429, "{\"code\":429,\"message\":\"Too Many Requests\"}");

        var (resultResponse, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultResponse, Is.Null);
        Assert.That(resultError, Is.InstanceOf<ThrottlingException>());
        var ex = (ThrottlingException)resultError!;
        Assert.That(ex.StatusCode, Is.EqualTo(429));
        Assert.That(ex.ResponseBody, Does.Contain("Too Many Requests"));
        Assert.That(ex.RawResponse, Is.SameAs(response));
    }

    // --- AfterErrorAsync: quota exceeded (Limit Exceeded) ---

    [Test]
    public async Task AfterErrorAsync_429WithLimitExceeded_ReturnsQuotaExceededException()
    {
        var response = CreateResponse((HttpStatusCode)429, "{\"code\":429,\"message\":\"Limit Exceeded\"}");

        var (resultResponse, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultResponse, Is.Null);
        Assert.That(resultError, Is.InstanceOf<QuotaExceededException>());
        var ex = (QuotaExceededException)resultError!;
        Assert.That(ex.StatusCode, Is.EqualTo(429));
        Assert.That(ex.ResponseBody, Does.Contain("Limit Exceeded"));
        Assert.That(ex.RawResponse, Is.SameAs(response));
    }

    // --- AfterErrorAsync: case-insensitive matching ---

    [Test]
    public async Task AfterErrorAsync_429WithLimitExceededCaseInsensitive_ReturnsQuotaExceededException()
    {
        var response = CreateResponse((HttpStatusCode)429, "{\"code\":429,\"message\":\"limit exceeded\"}");

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<QuotaExceededException>());
    }

    // --- AfterErrorAsync: unrecognized 429 message defaults to throttling ---

    [Test]
    public async Task AfterErrorAsync_429WithUnrecognizedMessage_DefaultsToThrottlingException()
    {
        var response = CreateResponse((HttpStatusCode)429, "{\"code\":429,\"message\":\"Something else entirely\"}");

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<ThrottlingException>());
    }

    // --- AfterErrorAsync: empty body defaults to throttling ---

    [Test]
    public async Task AfterErrorAsync_429WithEmptyBody_DefaultsToThrottlingException()
    {
        var response = CreateResponse((HttpStatusCode)429, "");

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<ThrottlingException>());
    }

    // --- AfterErrorAsync: invalid JSON body defaults to throttling ---

    [Test]
    public async Task AfterErrorAsync_429WithInvalidJson_DefaultsToThrottlingException()
    {
        var response = CreateResponse((HttpStatusCode)429, "not json at all");

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<ThrottlingException>());
    }

    // --- AfterErrorAsync: SCIM schema (detail field) ---

    [Test]
    public async Task AfterErrorAsync_429WithScimDetailTooManyRequests_ReturnsThrottlingException()
    {
        var body = "{\"schemas\":[\"urn:ietf:params:scim:api:messages:2.0:Error\"],\"status\":429,\"detail\":\"Too Many Requests\"}";
        var response = CreateResponse((HttpStatusCode)429, body);

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<ThrottlingException>());
    }

    [Test]
    public async Task AfterErrorAsync_429WithScimDetailLimitExceeded_ReturnsQuotaExceededException()
    {
        var body = "{\"schemas\":[\"urn:ietf:params:scim:api:messages:2.0:Error\"],\"status\":429,\"detail\":\"Limit Exceeded\"}";
        var response = CreateResponse((HttpStatusCode)429, body);

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<QuotaExceededException>());
    }

    // --- AfterErrorAsync: message field takes precedence over detail ---

    [Test]
    public async Task AfterErrorAsync_429WithBothMessageAndDetail_MessageTakesPrecedence()
    {
        var body = "{\"code\":429,\"message\":\"Limit Exceeded\",\"detail\":\"Too Many Requests\"}";
        var response = CreateResponse((HttpStatusCode)429, body);

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        Assert.That(resultError, Is.InstanceOf<QuotaExceededException>());
    }

    // --- AfterErrorAsync: non-429 pass-through ---

    [Test]
    public async Task AfterErrorAsync_Non429Response_PassesThroughUnchanged()
    {
        var response = CreateResponse(HttpStatusCode.InternalServerError, "{\"error\":\"server error\"}");
        var originalError = new Exception("original");

        var (resultResponse, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, originalError);

        Assert.That(resultResponse, Is.SameAs(response));
        Assert.That(resultError, Is.SameAs(originalError));
    }

    [Test]
    public async Task AfterErrorAsync_NullResponse_PassesThroughUnchanged()
    {
        var originalError = new Exception("connection failed");

        var (resultResponse, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), null, originalError);

        Assert.That(resultResponse, Is.Null);
        Assert.That(resultError, Is.SameAs(originalError));
    }

    // --- AfterErrorAsync: exception properties ---

    [Test]
    public async Task ThrottlingException_HasCorrectProperties()
    {
        var bodyJson = "{\"code\":429,\"message\":\"Too Many Requests\"}";
        var response = CreateResponse((HttpStatusCode)429, bodyJson);

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        var ex = (ThrottlingException)resultError!;
        Assert.That(ex.StatusCode, Is.EqualTo(429));
        Assert.That(ex.ResponseBody, Is.EqualTo(bodyJson));
        Assert.That(ex.RawResponse, Is.Not.Null);
        Assert.That(ex.Message, Does.Contain("429"));
    }

    [Test]
    public async Task QuotaExceededException_HasCorrectProperties()
    {
        var bodyJson = "{\"code\":429,\"message\":\"Limit Exceeded\"}";
        var response = CreateResponse((HttpStatusCode)429, bodyJson);

        var (_, resultError) = await _hook.AfterErrorAsync(
            CreateContext(), response, null);

        var ex = (QuotaExceededException)resultError!;
        Assert.That(ex.StatusCode, Is.EqualTo(429));
        Assert.That(ex.ResponseBody, Is.EqualTo(bodyJson));
        Assert.That(ex.RawResponse, Is.Not.Null);
        Assert.That(ex.Message, Does.Contain("Limit Exceeded"));
    }

}
