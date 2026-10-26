# VenueLeads

## Overview

Manage inbound leads submitted to venues through Cvent's sourcing channels.

### Available Operations

* [CreateLeadCatcher](#createleadcatcher) - Create Lead Catcher
* [ListLeadCatchersOverview](#listleadcatchersoverview) - List Lead Catchers Overview
* [UpdateLeadCatcher](#updateleadcatcher) - Update Lead Catcher
* [PatchLeadCatcher](#patchleadcatcher) - Patch Lead Catcher
* [DeleteLeadCatcher](#deleteleadcatcher) - Delete Lead Catcher
* [GetLeadCatcherOverview](#getleadcatcheroverview) - Get Lead Catcher Overview

## CreateLeadCatcher

Creates a new lead catcher contact for the specified venue. Lead catchers receive email notifications when RFPs are submitted to the venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createLeadCatcher" method="post" path="/venues/{venueId}/lead-catchers" -->
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

CreateLeadCatcherRequest req = new CreateLeadCatcherRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    LeadCatcher = new LeadCatcher() {
        FirstName = "Jane",
        LastName = "Smith",
        Title = "Director of Sales",
        Email = "jane.smith@example.com",
        Phone = "+1-555-555-0101",
        Fax = "+1-555-555-0101",
        Address = new LeadCatcherAddress() {
            StreetAddress1 = "1234 Trap Road",
            StreetAddress2 = "Suite 100",
            City = "Vienna",
            ZipPostalCode = "22182",
        },
        Config = new LeadCatcherConfig() {
            SupplierContactRole = "Sales Manager",
        },
        AdditionalInfo = "Preferred contact for APAC venues.",
    },
};

var res = await sdk.VenueLeads.CreateLeadCatcherAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLeadCatcherRequest](../../Models/Requests/CreateLeadCatcherRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLeadCatcherResponse](../../Models/Requests/CreateLeadCatcherResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListLeadCatchersOverview

Returns a paginated, lightweight overview of the lead catchers for the specified venue,
containing only `id`, `firstName`, and `lastName` for each contact.

Use this endpoint to discover the `leadCatcherId` needed for PATCH, PUT, and DELETE.
The response does not include contact details such as email address or phone number.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listLeadCatchersOverview" method="get" path="/venues/{venueId}/lead-catchers/overview" -->
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

ListLeadCatchersOverviewRequest req = new ListLeadCatchersOverviewRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListLeadCatchersOverviewResponse? res = await sdk.VenueLeads.ListLeadCatchersOverviewAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListLeadCatchersOverviewRequest](../../Models/Requests/ListLeadCatchersOverviewRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListLeadCatchersOverviewResponse](../../Models/Requests/ListLeadCatchersOverviewResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateLeadCatcher

Updates the given lead catcher for the specified venue, replacing the existing lead catcher data.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateLeadCatcher" method="put" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
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

UpdateLeadCatcherRequest req = new UpdateLeadCatcherRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    LeadCatcherId = "6e7d0d64-13f7-4472-8308-fa7067dba173",
    ExistingLeadCatcher = new ExistingLeadCatcherInput() {
        FirstName = "Jane",
        LastName = "Smith",
        Title = "Director of Sales",
        Email = "jane.smith@example.com",
        Phone = "+1-555-555-0101",
        Fax = "+1-555-555-0101",
        Address = new LeadCatcherAddress() {
            StreetAddress1 = "1234 Trap Road",
            StreetAddress2 = "Suite 100",
            City = "Vienna",
            ZipPostalCode = "22182",
        },
        Config = new LeadCatcherConfig() {
            SupplierContactRole = "Sales Manager",
        },
        AdditionalInfo = "Preferred contact for APAC venues.",
    },
};

var res = await sdk.VenueLeads.UpdateLeadCatcherAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLeadCatcherRequest](../../Models/Requests/UpdateLeadCatcherRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLeadCatcherResponse](../../Models/Requests/UpdateLeadCatcherResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## PatchLeadCatcher

Partially updates the specified lead catcher using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- The response contains only the fields that were provided in the request payload.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="patchLeadCatcher" method="patch" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
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

PatchLeadCatcherRequest req = new PatchLeadCatcherRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    LeadCatcherId = "f72c984a-4f55-4563-90e5-7e34a3be1552",
    LeadCatcherPatch = new LeadCatcherPatch() {
        FirstName = "Jane",
        LastName = "Smith",
        Title = "Director of Sales",
        Email = "jane.smith@example.com",
        Phone = "+1-555-0100",
        Fax = "+1-555-0101",
        Address = new LeadCatcherAddressPatch() {
            StreetAddress1 = "1234 Trap Road",
            StreetAddress2 = "Suite 100",
            City = "Vienna",
            ZipPostalCode = "22182",
        },
        Locale = "en-US",
        Config = new LeadCatcherConfigPatch() {
            RfpEmailEnabled = true,
            PdfLinkEnabled = true,
            SupplierContactRole = "roleName",
        },
        AdditionalInfo = "Preferred contact for APAC venues.",
    },
};

var res = await sdk.VenueLeads.PatchLeadCatcherAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLeadCatcherRequest](../../Models/Requests/PatchLeadCatcherRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLeadCatcherResponse](../../Models/Requests/PatchLeadCatcherResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteLeadCatcher

Deletes the specified lead catcher for the venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteLeadCatcher" method="delete" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
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

DeleteLeadCatcherRequest req = new DeleteLeadCatcherRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    LeadCatcherId = "d7aa3fa0-4c8f-4353-9810-3984886b6a9d",
};

var res = await sdk.VenueLeads.DeleteLeadCatcherAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteLeadCatcherRequest](../../Models/Requests/DeleteLeadCatcherRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteLeadCatcherResponse](../../Models/Requests/DeleteLeadCatcherResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetLeadCatcherOverview

Retrieves a lightweight overview of a specific lead catcher for the specified venue,
containing only `id`, `firstName`, and `lastName`.

The response does not include contact details such as email address or phone number.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="getLeadCatcherOverview" method="get" path="/venues/{venueId}/lead-catchers/{leadCatcherId}/overview" -->
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

GetLeadCatcherOverviewRequest req = new GetLeadCatcherOverviewRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    LeadCatcherId = "7de41b14-8083-46d4-91b6-5a3239d59277",
};

var res = await sdk.VenueLeads.GetLeadCatcherOverviewAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetLeadCatcherOverviewRequest](../../Models/Requests/GetLeadCatcherOverviewRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetLeadCatcherOverviewResponse](../../Models/Requests/GetLeadCatcherOverviewResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |