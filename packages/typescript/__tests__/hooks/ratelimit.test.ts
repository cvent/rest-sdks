import { CventRateLimitHook, ThrottlingError, QuotaExceededError } from "../../src/hooks/ratelimit";
import { AfterErrorContext } from "../../src/hooks/types";

function makeResponse(status: number, body: string): Response {
    return new Response(body, {
        status,
        headers: { "Content-Type": "application/json" },
    });
}

const dummyContext: AfterErrorContext = {
    baseURL: "https://api.cvent.com",
    operationID: "test-op",
    oAuth2Scopes: null,
    retryConfig: { strategy: "none" },
    resolvedSecurity: null,
    options: {},
} as unknown as AfterErrorContext;

describe("CventRateLimitHook", () => {
    let hook: CventRateLimitHook;

    beforeEach(() => {
        hook = new CventRateLimitHook();
    });

    describe("throttling (Too Many Requests)", () => {
        it("should return ThrottlingError for standard throttling message", async () => {
            const response = makeResponse(429, JSON.stringify({ message: "Too Many Requests" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.response).toBeNull();
            expect(result.error).toBeInstanceOf(ThrottlingError);
            const err = result.error as ThrottlingError;
            expect(err.statusCode).toBe(429);
        });

        it("should return ThrottlingError for unrecognized 429 message", async () => {
            const response = makeResponse(429, JSON.stringify({ message: "Something Unexpected" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should default to ThrottlingError when message field is missing", async () => {
            const response = makeResponse(429, JSON.stringify({ code: "RATE_LIMITED" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should default to ThrottlingError for malformed JSON body", async () => {
            const response = makeResponse(429, "not valid json");
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should default to ThrottlingError for empty body", async () => {
            const response = makeResponse(429, "");
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should be case-insensitive for throttling message", async () => {
            const response = makeResponse(429, JSON.stringify({ message: "too many requests" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should preserve response body in ThrottlingError", async () => {
            const body = JSON.stringify({ message: "Too Many Requests", retryAfter: 5 });
            const response = makeResponse(429, body);
            const result = await hook.afterError(dummyContext, response, null);
            const err = result.error as ThrottlingError;
            expect(err.responseBody).toBe(body);
        });
    });

    describe("quota exceeded (Limit Exceeded)", () => {
        it("should return QuotaExceededError for quota exceeded message", async () => {
            const response = makeResponse(429, JSON.stringify({ message: "Limit Exceeded" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.response).toBeNull();
            expect(result.error).toBeInstanceOf(QuotaExceededError);
            const err = result.error as QuotaExceededError;
            expect(err.statusCode).toBe(429);
        });

        it("should be case-insensitive for quota exceeded message", async () => {
            const response = makeResponse(429, JSON.stringify({ message: "limit exceeded" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(QuotaExceededError);
        });

        it("should preserve response body in QuotaExceededError", async () => {
            const body = JSON.stringify({ message: "Limit Exceeded", code: "QUOTA_EXHAUSTED" });
            const response = makeResponse(429, body);
            const result = await hook.afterError(dummyContext, response, null);
            const err = result.error as QuotaExceededError;
            expect(err.responseBody).toBe(body);
        });
    });

    describe("SCIM detail field support", () => {
        it("should use detail field when message field is absent", async () => {
            const response = makeResponse(429, JSON.stringify({ detail: "Too Many Requests", status: "429" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should detect quota exceeded via detail field", async () => {
            const response = makeResponse(429, JSON.stringify({ detail: "Limit Exceeded", status: "429" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(QuotaExceededError);
        });

        it("should prefer message over detail when both present", async () => {
            const response = makeResponse(429, JSON.stringify({ message: "Too Many Requests", detail: "Limit Exceeded" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });

        it("should default to ThrottlingError when detail is also missing", async () => {
            const response = makeResponse(429, JSON.stringify({ status: "429" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.error).toBeInstanceOf(ThrottlingError);
        });
    });

    describe("non-429 passthrough", () => {
        it("should pass through 500 responses unchanged", async () => {
            const response = makeResponse(500, JSON.stringify({ message: "Internal Server Error" }));
            const originalError = new Error("server error");
            const result = await hook.afterError(dummyContext, response, originalError);
            expect(result.response).toBe(response);
            expect(result.error).toBe(originalError);
        });

        it("should pass through 401 responses unchanged", async () => {
            const response = makeResponse(401, JSON.stringify({ message: "Unauthorized" }));
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.response).toBe(response);
            expect(result.error).toBeNull();
        });

        it("should pass through null response with error unchanged", async () => {
            const originalError = new Error("connection failed");
            const result = await hook.afterError(dummyContext, null, originalError);
            expect(result.response).toBeNull();
            expect(result.error).toBe(originalError);
        });

        it("should pass through 200 responses unchanged", async () => {
            const response = makeResponse(200, "OK");
            const result = await hook.afterError(dummyContext, response, null);
            expect(result.response).toBe(response);
            expect(result.error).toBeNull();
        });
    });

    describe("error class properties", () => {
        it("ThrottlingError should have correct name", () => {
            const err = new ThrottlingError(429, "body", makeResponse(429, "body"));
            expect(err.name).toBe("ThrottlingError");
            expect(err).toBeInstanceOf(Error);
        });

        it("QuotaExceededError should have correct name", () => {
            const err = new QuotaExceededError(429, "body", makeResponse(429, "body"));
            expect(err.name).toBe("QuotaExceededError");
            expect(err).toBeInstanceOf(Error);
        });

        it("ThrottlingError should truncate long bodies in message", () => {
            const longBody = "x".repeat(300);
            const err = new ThrottlingError(429, longBody, makeResponse(429, longBody));
            expect(err.message.length).toBeLessThan(300);
            expect(err.message).toContain("...");
        });
    });
});
