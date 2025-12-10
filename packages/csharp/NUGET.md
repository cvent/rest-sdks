# Cvent.SDK


<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name                      | Type   | Scheme       |
| ------------------------- | ------ | ------------ |
| `OAuth2ClientCredentials` | oauth2 | OAuth2 token |
| `OAuth2AuthorizationCode` | oauth2 | OAuth2 token |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK();

Oauth2TokenRequest req = new Oauth2TokenRequest() {
    GrantType = GrantType.ClientCredentials,
    ClientId = "djc98u3jiedmi283eu928",
    Scope = "event/events:read event/attendees:read",
    RedirectUri = "https://example.com/redirect",
    RefreshToken = "dn43ud8uj32nk2je",
    Code = "AUTHORIZATION_CODE",
};

var res = await sdk.Authentication.Oauth2TokenAsync(
    security: new Oauth2TokenSecurity() {
        Username = "",
        Password = "",
    },
    request: req
);

// handle response
```
<!-- End Authentication [security] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `null`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End Pagination [pagination] -->

<!-- Start Error Handling [errors] -->
## Error Handling

[`CventSDKException`](./src/Cvent/SDK/Models/Errors/CventSDKException.cs) is the base exception class for all HTTP error responses. It has the following properties:

| Property      | Type                  | Description           |
|---------------|-----------------------|-----------------------|
| `Message`     | *string*              | Error message         |
| `Request`     | *HttpRequestMessage*  | HTTP request object   |
| `Response`    | *HttpResponseMessage* | HTTP response object  |

Some exceptions in this SDK include an additional `Payload` field, which will contain deserialized custom error data when present. Possible exceptions are listed in the [Error Classes](#error-classes) section.

### Example

```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Errors;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

try
{
    GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
        Token = "1a2b3c4d5e6f7g8h9i10j11k",
        Filter = "name eq 'My User Group'",
    };

    GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

    while(res != null)
    {
        // handle items

        res = await res.Next!();
    }
}
catch (CventSDKException ex)  // all SDK exceptions inherit from CventSDKException
{
    // ex.ToString() provides a detailed error message
    System.Console.WriteLine(ex);

    // Base exception fields
    HttpRequestMessage request = ex.Request;
    HttpResponseMessage response = ex.Response;
    var statusCode = (int)response.StatusCode;
    var responseBody = ex.Body;

    if (ex is Models.Errors.ErrorResponse) // different exceptions may be thrown depending on the method
    {
        // Check error data fields
        Models.Errors.ErrorResponsePayload payload = ex.Payload;
        long Code = payload.Code;
        string Message = payload.Message;
        // ...
    }

    // An underlying cause may be provided
    if (ex.InnerException != null)
    {
        Exception cause = ex.InnerException;
    }
}
catch (System.Net.Http.HttpRequestException ex)
{
    // Check ex.InnerException for Network connectivity errors
}
```

### Error Classes

**Primary exceptions:**
* [`CventSDKException`](./src/Cvent/SDK/Models/Errors/CventSDKException.cs): The base class for HTTP error responses.
  * [`ErrorResponse`](./src/Cvent/SDK/Models/Errors/ErrorResponse.cs): Represents an error response with additional details of cascading error messages. *

<details><summary>Less common exceptions (4)</summary>

* [`System.Net.Http.HttpRequestException`](https://learn.microsoft.com/en-us/dotnet/api/system.net.http.httprequestexception): Network connectivity error. For more details about the underlying cause, inspect the `ex.InnerException`.

* Inheriting from [`CventSDKException`](./src/Cvent/SDK/Models/Errors/CventSDKException.cs):
  * [`ErrorResponseJson20`](./src/Cvent/SDK/Models/Errors/ErrorResponseJson20.cs): The error response. Applicable to 11 of 423 methods.*
  * [`BadRequestException`](./src/Cvent/SDK/Models/Errors/BadRequestException.cs): A bad token response. Status code `400`. Applicable to 1 of 423 methods.*
  * [`ResponseValidationError`](./src/Cvent/SDK/Models/Errors/ResponseValidationError.cs): Thrown when the response data could not be deserialized into the expected type.
</details>

\* Refer to the [relevant documentation](#available-resources-and-operations) to determine whether an exception applies to a specific operation.
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex: int` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                  | Description |
| --- | --------------------------------------- | ----------- |
| 0   | `https://api-platform-eur.cvent.com/ea` |             |
| 1   | `https://api-platform.cvent.com/ea`     |             |

#### Example

```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(
    serverIndex: 0,
    security: new Security() {
        OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
            ClientID = "<YOUR_CLIENT_ID_HERE>",
            ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
            TokenURL = "<YOUR_TOKEN_URL_HERE>",
            Scopes = "<YOUR_SCOPES_HERE>",
        },
    }
);

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverUrl: string` optional parameter when initializing the SDK client instance. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(
    serverUrl: "https://api-platform.cvent.com/ea",
    security: new Security() {
        OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
            ClientID = "<YOUR_CLIENT_ID_HERE>",
            ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
            TokenURL = "<YOUR_TOKEN_URL_HERE>",
            Scopes = "<YOUR_SCOPES_HERE>",
        },
    }
);

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CardTokenRequest req = new CardTokenRequest() {
    CreditCard = new CreditCardRequestJson() {
        AccountHolderName = "John Doe",
        ExpMonth = 11,
        ExpYear = 2026,
        Cvv = "123",
        AddressLine1 = "123 Main Street",
        AddressLine2 = "First Floor",
        AddressLine3 = "Apt 101",
        AddressCity = "McLean",
        AddressStateProvince = "VA",
        AddressPostalCode = "12345",
        AddressCountry = "USA",
        AddressCountryAlpha2 = "US",
        ContactPhone = "910-999-9999",
        Email = "jdoe@example.com",
        Number = "4111111111111111",
    },
};

var res = await sdk.CardTokens.CreateCardTokensAsync(
    request: req,
    serverUrl: "https://secure-ecommerce.api-platform.cvent.com/ea"
);

// handle response
```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The C# SDK makes API calls using an `ISpeakeasyHttpClient` that wraps the native
[HttpClient](https://docs.microsoft.com/en-us/dotnet/api/system.net.http.httpclient). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `ISpeakeasyHttpClient` interface allows you to either use the default `SpeakeasyHttpClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom message handlers, timeouts,
connection pooling, and other HTTP client settings.

The following example shows how to create a custom HTTP client with request modification and error handling:

```csharp
using Cvent.SDK;
using Cvent.SDK.Utils;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;

// Create a custom HTTP client
public class CustomHttpClient : ISpeakeasyHttpClient
{
    private readonly ISpeakeasyHttpClient _defaultClient;

    public CustomHttpClient()
    {
        _defaultClient = new SpeakeasyHttpClient();
    }

    public async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken? cancellationToken = null)
    {
        // Add custom header and timeout
        request.Headers.Add("x-custom-header", "custom value");
        request.Headers.Add("x-request-timeout", "30");
        
        try
        {
            var response = await _defaultClient.SendAsync(request, cancellationToken);
            // Log successful response
            Console.WriteLine($"Request successful: {response.StatusCode}");
            return response;
        }
        catch (Exception error)
        {
            // Log error
            Console.WriteLine($"Request failed: {error.Message}");
            throw;
        }
    }

    public void Dispose()
    {
        _httpClient?.Dispose();
        _defaultClient?.Dispose();
    }
}

// Use the custom HTTP client with the SDK
var customHttpClient = new CustomHttpClient();
var sdk = new CventSDK(client: customHttpClient);
```

<details>
<summary>You can also provide a completely custom HTTP client with your own configuration:</summary>

```csharp
using Cvent.SDK.Utils;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;

// Custom HTTP client with custom configuration
public class AdvancedHttpClient : ISpeakeasyHttpClient
{
    private readonly HttpClient _httpClient;

    public AdvancedHttpClient()
    {
        var handler = new HttpClientHandler()
        {
            MaxConnectionsPerServer = 10,
            // ServerCertificateCustomValidationCallback = customCertValidation, // Custom SSL validation if needed
        };

        _httpClient = new HttpClient(handler)
        {
            Timeout = TimeSpan.FromSeconds(30)
        };
    }

    public async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken? cancellationToken = null)
    {
        return await _httpClient.SendAsync(request, cancellationToken ?? CancellationToken.None);
    }

    public void Dispose()
    {
        _httpClient?.Dispose();
    }
}

var sdk = CventSDK.Builder()
    .WithClient(new AdvancedHttpClient())
    .Build();
```
</details>

<details>
<summary>For simple debugging, you can enable request/response logging by implementing a custom client:</summary>

```csharp
public class LoggingHttpClient : ISpeakeasyHttpClient
{
    private readonly ISpeakeasyHttpClient _innerClient;

    public LoggingHttpClient(ISpeakeasyHttpClient innerClient = null)
    {
        _innerClient = innerClient ?? new SpeakeasyHttpClient();
    }

    public async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken? cancellationToken = null)
    {
        // Log request
        Console.WriteLine($"Sending {request.Method} request to {request.RequestUri}");
        
        var response = await _innerClient.SendAsync(request, cancellationToken);
        
        // Log response
        Console.WriteLine($"Received {response.StatusCode} response");
        
        return response;
    }

    public void Dispose() => _innerClient?.Dispose();
}

var sdk = new CventSDK(client: new LoggingHttpClient());
```
</details>

The SDK also provides built-in hook support through the `SDKConfiguration.Hooks` system, which automatically handles
`BeforeRequestAsync`, `AfterSuccessAsync`, and `AfterErrorAsync` hooks for advanced request lifecycle management.
<!-- End Custom HTTP Client [http-client] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->