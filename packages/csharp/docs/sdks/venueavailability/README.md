# VenueAvailability

## Overview

Manage the date ranges when a venue is available for event bookings.


### Available Operations

* [GetVenueAvailabilitySettings](#getvenueavailabilitysettings) - Get Availability Settings
* [UpdateVenueAvailabilitySettings](#updatevenueavailabilitysettings) - Update Availability Settings
* [ListVenueNeedDates](#listvenueneeddates) - List Venue Need Dates
* [CreateVenueNeedDate](#createvenueneeddate) - Create Venue Need Date
* [GetVenueNeedDate](#getvenueneeddate) - Get Venue Need Date
* [UpdateVenueNeedDate](#updatevenueneeddate) - Update Venue Need Date
* [DeleteVenueNeedDate](#deletevenueneeddate) - Delete Venue Need Date

## GetVenueAvailabilitySettings

Retrieve the availability settings for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVenueAvailabilitySettings" method="get" path="/venues/{venueId}/availability-settings" -->
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

GetVenueAvailabilitySettingsRequest req = new GetVenueAvailabilitySettingsRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
};

var res = await sdk.VenueAvailability.GetVenueAvailabilitySettingsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetVenueAvailabilitySettingsRequest](../../Models/Requests/GetVenueAvailabilitySettingsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetVenueAvailabilitySettingsResponse](../../Models/Requests/GetVenueAvailabilitySettingsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateVenueAvailabilitySettings

Update the availability settings for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueAvailabilitySettings" method="put" path="/venues/{venueId}/availability-settings" -->
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

UpdateVenueAvailabilitySettingsRequest req = new UpdateVenueAvailabilitySettingsRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueAvailabilitySettings = new VenueAvailabilitySettings() {
        DisplayNeedDatesToPlanner = true,
    },
};

var res = await sdk.VenueAvailability.UpdateVenueAvailabilitySettingsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UpdateVenueAvailabilitySettingsRequest](../../Models/Requests/UpdateVenueAvailabilitySettingsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UpdateVenueAvailabilitySettingsResponse](../../Models/Requests/UpdateVenueAvailabilitySettingsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListVenueNeedDates

Returns a paginated list of active need dates for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listVenueNeedDates" method="get" path="/venues/{venueId}/need-dates" -->
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

ListVenueNeedDatesRequest req = new ListVenueNeedDatesRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListVenueNeedDatesResponse? res = await sdk.VenueAvailability.ListVenueNeedDatesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListVenueNeedDatesRequest](../../Models/Requests/ListVenueNeedDatesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListVenueNeedDatesResponse](../../Models/Requests/ListVenueNeedDatesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateVenueNeedDate

Creates a new need date range for the specified venue. If the submitted range overlaps or is adjacent to an existing range, they are merged into a single range. For example, submitting 2026-08-10 to 2026-08-14 when 2026-08-12 to 2026-08-18 exists returns 2026-08-10 to 2026-08-18.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createVenueNeedDate" method="post" path="/venues/{venueId}/need-dates" -->
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

CreateVenueNeedDateRequest req = new CreateVenueNeedDateRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueNeedDate = new VenueNeedDate() {
        StartDate = DateOnly.Parse("2026-07-01"),
        EndDate = DateOnly.Parse("2026-07-31"),
    },
};

var res = await sdk.VenueAvailability.CreateVenueNeedDateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateVenueNeedDateRequest](../../Models/Requests/CreateVenueNeedDateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateVenueNeedDateResponse](../../Models/Requests/CreateVenueNeedDateResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetVenueNeedDate

Retrieves an active need date range for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVenueNeedDate" method="get" path="/venues/{venueId}/need-dates/{needDateId}" -->
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

GetVenueNeedDateRequest req = new GetVenueNeedDateRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    NeedDateId = "8a4d1f3c-c9ee-42b5-bcd0-037295f7820a",
};

var res = await sdk.VenueAvailability.GetVenueNeedDateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetVenueNeedDateRequest](../../Models/Requests/GetVenueNeedDateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetVenueNeedDateResponse](../../Models/Requests/GetVenueNeedDateResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateVenueNeedDate

Replaces the specified need date range with the values provided in the request body. If the updated range overlaps or is adjacent to another existing range, both are merged into a single range. For example, if 2026-08-01 to 2026-08-10 and 2026-08-15 to 2026-08-20 exist and you update the first to 2026-08-01 to 2026-08-16, the response returns 2026-08-01 to 2026-08-20.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueNeedDate" method="put" path="/venues/{venueId}/need-dates/{needDateId}" -->
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

UpdateVenueNeedDateRequest req = new UpdateVenueNeedDateRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    NeedDateId = "8a4d1f3c-c9ee-42b5-bcd0-037295f7820a",
    ExistingVenueNeedDate = new ExistingVenueNeedDateInput() {
        StartDate = DateOnly.Parse("2026-07-01"),
        EndDate = DateOnly.Parse("2026-07-31"),
    },
};

var res = await sdk.VenueAvailability.UpdateVenueNeedDateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateVenueNeedDateRequest](../../Models/Requests/UpdateVenueNeedDateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateVenueNeedDateResponse](../../Models/Requests/UpdateVenueNeedDateResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteVenueNeedDate

Deletes the specified need date range for the venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteVenueNeedDate" method="delete" path="/venues/{venueId}/need-dates/{needDateId}" -->
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

DeleteVenueNeedDateRequest req = new DeleteVenueNeedDateRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    NeedDateId = "8a4d1f3c-c9ee-42b5-bcd0-037295f7820a",
};

var res = await sdk.VenueAvailability.DeleteVenueNeedDateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteVenueNeedDateRequest](../../Models/Requests/DeleteVenueNeedDateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteVenueNeedDateResponse](../../Models/Requests/DeleteVenueNeedDateResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |