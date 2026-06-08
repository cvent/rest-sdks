# RFPManagement

## Overview

RFP (Request for Proposal) management APIs for core RFP operations including CRUD operations for base RFPs.

### Available Operations

* [GetRfpLeadSource](#getrfpleadsource) - Get RFP Lead Source
* [GetRfpLeadSourceSection](#getrfpleadsourcesection) - Get RFP Lead Source Section
* [GetRFP](#getrfp) - Get RFP

## GetRfpLeadSource

Returns details about a given lead source of an RFP. The lead source indicates the primary origin of the RFP or the supplier being added to the RFP, such as a particular software or website.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpLeadSource" method="get" path="/rfps/lead-sources/{leadSourceId}" -->
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

GetRfpLeadSourceRequest req = new GetRfpLeadSourceRequest() {
    LeadSourceId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPManagement.GetRfpLeadSourceAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpLeadSourceRequest](../../Models/Requests/GetRfpLeadSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpLeadSourceResponse](../../Models/Requests/GetRfpLeadSourceResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse1 | 401, 403, 404, 429                     | application/json                       |
| Cvent.SDK.Models.Errors.APIException   | 4XX, 5XX                               | \*/\*                                  |

## GetRfpLeadSourceSection

Returns details about the lead source section of an RFP. The lead source section identifies the specific segment or channel within the broader lead source, such as a particular website domain, form, or integration point, where the RFP originated. This enables more granular tracking and attribution of RFPs by pinpointing the exact section within the overall lead source. See the [Lead Source](#tag/RFP-Management/operation/getRfpLeadSource) endpoint for more information about lead sources.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpLeadSourceSection" method="get" path="/rfps/lead-sources/{leadSourceId}/sections/{leadSourceSectionId}" -->
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

GetRfpLeadSourceSectionRequest req = new GetRfpLeadSourceSectionRequest() {
    LeadSourceId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    LeadSourceSectionId = "779934d2-f6eb-4815-bcfa-a2dd8655c164",
};

var res = await sdk.RFPManagement.GetRfpLeadSourceSectionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetRfpLeadSourceSectionRequest](../../Models/Requests/GetRfpLeadSourceSectionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetRfpLeadSourceSectionResponse](../../Models/Requests/GetRfpLeadSourceSectionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse1 | 401, 403, 404, 429                     | application/json                       |
| Cvent.SDK.Models.Errors.APIException   | 4XX, 5XX                               | \*/\*                                  |

## GetRFP

Returns basic details of the given RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRFP" method="get" path="/rfps/{rfpId}" -->
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

GetRFPRequest req = new GetRFPRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Expand = new List<LeadSourceExpand>() {
        LeadSourceExpand.LeadSource,
        LeadSourceExpand.LeadSourceSection,
    },
};

var res = await sdk.RFPManagement.GetRFPAsync(req);

// handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [GetRFPRequest](../../Models/Requests/GetRFPRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[GetRFPResponse](../../Models/Requests/GetRFPResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse1 | 400, 401, 403, 404, 429                | application/json                       |
| Cvent.SDK.Models.Errors.APIException   | 4XX, 5XX                               | \*/\*                                  |