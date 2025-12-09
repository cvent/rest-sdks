# Signatures

## Overview

Retrieves Check-In & Check-Out Signatures Of Attendees

### Available Operations

* [GetSignatures](#getsignatures) - List Signatures

## GetSignatures

Retrieves a paginated list of check-in & check-out signatures associated with the account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSignatures" method="get" path="/signatures" -->
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

GetSignaturesRequest req = new GetSignaturesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "event.id:ASC,lastModified:DESC",
    Filter = "event.id eq 'a81bc81b-dead-4e5d-abff-90865d1e13b1' or session.id eq 'de14c31b-aaad-2e5d-asgf-89865d1e13b1'",
};

GetSignaturesResponse? res = await sdk.Signatures.GetSignaturesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetSignaturesRequest](../../Models/Requests/GetSignaturesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetSignaturesResponse](../../Models/Requests/GetSignaturesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |