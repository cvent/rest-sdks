# RFPAdditionalDetails

## Overview

RFP additional details APIs for managing past event references and other miscellaneous RFP operations.

### Available Operations

* [ListRfpPastEvents](#listrfppastevents) - List RFP Past Events

## ListRfpPastEvents

Returns list of past events saved by the planner at the time of RFP creation. These can be non-Cvent events.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpPastEvents" method="get" path="/rfps/{rfpId}/past-events" -->
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

ListRfpPastEventsRequest req = new ListRfpPastEventsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPAdditionalDetails.ListRfpPastEventsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListRfpPastEventsRequest](../../Models/Requests/ListRfpPastEventsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListRfpPastEventsResponse](../../Models/Requests/ListRfpPastEventsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |