# RFPSuppliers

## Overview

Suppliers are the venues and service providers that receive and respond to RFPs. Use these APIs to manage supplier associations, view recipient history, and create award details.

### Available Operations

* [ListRfpRecipientsHistory](#listrfprecipientshistory) - List RFP Recipients History
* [GetRfpSuppliers](#getrfpsuppliers) - List RFP Suppliers

## ListRfpRecipientsHistory

Returns the paginated list of logs of all the recipients that were copied on an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpRecipientsHistory" method="get" path="/rfps/{rfpId}/recipients/history" -->
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

ListRfpRecipientsHistoryRequest req = new ListRfpRecipientsHistoryRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac')",
};

ListRfpRecipientsHistoryResponse? res = await sdk.RFPSuppliers.ListRfpRecipientsHistoryAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListRfpRecipientsHistoryRequest](../../Models/Requests/ListRfpRecipientsHistoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListRfpRecipientsHistoryResponse](../../Models/Requests/ListRfpRecipientsHistoryResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpSuppliers

Returns the paginated list of suppliers associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpSuppliers" method="get" path="/rfps/{rfpId}/suppliers" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetRfpSuppliersRequest req = new GetRfpSuppliersRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac')",
    Expand = new List<LeadSourceExpand>() {
        LeadSourceExpand.LeadSource,
        LeadSourceExpand.LeadSourceSection,
    },
};

GetRfpSuppliersResponse? res = await sdk.RFPSuppliers.GetRfpSuppliersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRfpSuppliersRequest](../../Models/Requests/GetRfpSuppliersRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRfpSuppliersResponse](../../Models/Requests/GetRfpSuppliersResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |