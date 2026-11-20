# RFPSuppliers

## Overview

Suppliers are the venues and service providers that receive and respond to RFPs. Use these APIs to manage supplier associations, view recipient history, and create award details.

### Available Operations

* [ListRfpRecipientsHistory](#listrfprecipientshistory) - List RFP Recipients History
* [GetRfpSuppliers](#getrfpsuppliers) - List RFP Suppliers
* [GetRfpSupplier](#getrfpsupplier) - Get RFP Supplier
* [AssociateRfpSupplier](#associaterfpsupplier) - Associate Supplier to RFP
* [DisassociateRfpSupplier](#disassociaterfpsupplier) - Disassociate RFP Supplier

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
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
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
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpSupplier

Returns details of a specific supplier associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpSupplier" method="get" path="/rfps/{rfpId}/suppliers/{supplierId}" -->
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

GetRfpSupplierRequest req = new GetRfpSupplierRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SupplierId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Expand = new List<LeadSourceExpand>() {
        LeadSourceExpand.LeadSource,
        LeadSourceExpand.LeadSourceSection,
    },
};

var res = await sdk.RFPSuppliers.GetRfpSupplierAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetRfpSupplierRequest](../../Models/Requests/GetRfpSupplierRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetRfpSupplierResponse](../../Models/Requests/GetRfpSupplierResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## AssociateRfpSupplier

Associates a given supplier to an RFP.

Lead source: only `leadSource.section.id` is used; `leadSource.id` is ignored. If you omit the section, Cvent sets the default section. A caller can send only the default section. Another section is rejected with 400.

If the supplier is already associated with the RFP, only the `promotion` in the request is applied. The rest of the existing association, including its lead source, is left unchanged.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateRfpSupplier" method="put" path="/rfps/{rfpId}/suppliers/{supplierId}" -->
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

AssociateRfpSupplierRequest req = new AssociateRfpSupplierRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SupplierId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpSupplier = new RfpSupplierInput() {
        LeadSource = new RfpSupplierLeadSource() {
            Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
            Section = new LeadSourceSection() {
                Id = "40dc08af-24a9-4d01-84be-3d43133dc945",
            },
        },
        Promotion = new Promotion() {
            Id = "41cc09af-61a0-5e21-942e-2d41232dc923",
        },
    },
};

var res = await sdk.RFPSuppliers.AssociateRfpSupplierAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AssociateRfpSupplierRequest](../../Models/Requests/AssociateRfpSupplierRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AssociateRfpSupplierResponse](../../Models/Requests/AssociateRfpSupplierResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DisassociateRfpSupplier

Disassociates the specified supplier from an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateRfpSupplier" method="delete" path="/rfps/{rfpId}/suppliers/{supplierId}" -->
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

DisassociateRfpSupplierRequest req = new DisassociateRfpSupplierRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SupplierId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPSuppliers.DisassociateRfpSupplierAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DisassociateRfpSupplierRequest](../../Models/Requests/DisassociateRfpSupplierRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DisassociateRfpSupplierResponse](../../Models/Requests/DisassociateRfpSupplierResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |