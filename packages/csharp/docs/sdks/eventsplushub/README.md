# EventsPlusHub

## Overview

An Events+ Hub persists basic information needed to assign an owner and optionally customize the public presentation.

### Available Operations

* [ListHubs](#listhubs) - List Events+ Hubs
* [GetHubMembers](#gethubmembers) - Get Events+ Hub Members

## ListHubs

Get a paginated list of all Events+ hubs associated with your account. Each Events+ hub returned contains owner and theme information as well as the current status.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listHubs" method="get" path="/hubs" -->
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

ListHubsRequest req = new ListHubsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "(id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (id eq '16322408-bae8-4b29-a559-702d2023e13a')",
};

ListHubsResponse? res = await sdk.EventsPlusHub.ListHubsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [ListHubsRequest](../../Models/Requests/ListHubsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[ListHubsResponse](../../Models/Requests/ListHubsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHubMembers

Fetches a list of members associated with a particular Events+ hub.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHubMembers" method="get" path="/hubs/{hubId}/members" -->
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

GetHubMembersRequest req = new GetHubMembersRequest() {
    HubId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "(firstName contains 'tim') and (lastName contains 'wood')",
    Sort = "firstName:ASC,lastName:ASC",
};

GetHubMembersResponse? res = await sdk.EventsPlusHub.GetHubMembersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetHubMembersRequest](../../Models/Requests/GetHubMembersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetHubMembersResponse](../../Models/Requests/GetHubMembersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |