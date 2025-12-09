# Hooks

## Overview

These APIs allow you to create hooks. When triggered, a hook sends a request to your service to
get updated data related to the related Cvent object.

For more information on using hooks, see the
[getting started guide](https://developers.cvent.com/docs/cid/attendee-identification-service).


### Available Operations

* [ListContactHooks](#listcontacthooks) - List Contact Hooks
* [CreateContactHook](#createcontacthook) - Create Contact Hook
* [UpdateContactHook](#updatecontacthook) - Update Contact Hook
* [DeleteContactHook](#deletecontacthook) - Delete Contact Hook

## ListContactHooks

Gets a list of contact hooks configured in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListContactHooks" method="get" path="/contacts/hooks" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListContactHooksRequest req = new ListContactHooksRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and name ne 'sampleIntegration'",
};

ListContactHooksResponse? res = await sdk.Hooks.ListContactHooksAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListContactHooksRequest](../../Models/Requests/ListContactHooksRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListContactHooksResponse](../../Models/Requests/ListContactHooksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateContactHook

Creates a contact hook. Contact hooks have a callback URI pointing to your system where Cvent will request contact information.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createContactHook" method="post" path="/contacts/hooks" -->
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

HookInput req = new HookInput() {
    Name = "Attendee Identification",
    Callback = "https://myserver.com/send/callback/here",
    Security = HookSecurityJson.CreateBasicAuthentication(
        new BasicAuthentication() {
            Type = AuthorizationHeaderType2.ApiKey,
            Secret = "ZGVtbzpwQDU1dzByZA==",
        }
    ),
};

var res = await sdk.Hooks.CreateContactHookAsync(req);

// handle response
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [HookInput](../../Models/Components/HookInput.md) | :heavy_check_mark:                                | The request object to use for the request.        |

### Response

**[CreateContactHookResponse](../../Models/Requests/CreateContactHookResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateContactHook

Update a contact hook's details, including its associated callback URI.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateContactHook" method="put" path="/contacts/hooks/{id}" -->
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

UpdateContactHookRequest req = new UpdateContactHookRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Hook = new HookInput() {
        Name = "Attendee Identification",
        Callback = "https://myserver.com/send/callback/here",
        Security = HookSecurityJson.CreateAPIKeyAuthentication(
            new APIKeyAuthentication() {
                Type = AuthorizationHeaderType1.ApiKey,
                Secret = "2b3cc2bf083ff11206ce6b2f3ee09591",
                AuthHeaderKey = "x-api-key",
            }
        ),
    },
};

var res = await sdk.Hooks.UpdateContactHookAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateContactHookRequest](../../Models/Requests/UpdateContactHookRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateContactHookResponse](../../Models/Requests/UpdateContactHookResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteContactHook

Delete a contact hook's details.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteContactHook" method="delete" path="/contacts/hooks/{id}" -->
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

DeleteContactHookRequest req = new DeleteContactHookRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Hooks.DeleteContactHookAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteContactHookRequest](../../Models/Requests/DeleteContactHookRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteContactHookResponse](../../Models/Requests/DeleteContactHookResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |