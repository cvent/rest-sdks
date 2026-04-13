# EventFeatures

## Overview

EventFeatures related APIs

### Available Operations

* [GetEventFeatures](#geteventfeatures) - List Event Features
* [UpdateEventFeatures](#updateeventfeatures) - Update Event Feature
* [LaunchEventFeatures](#launcheventfeatures) - Launch Event Feature
* [ListEventWeblinks](#listeventweblinks) - List Event Weblinks

## GetEventFeatures

A resource responsible for providing the set of event features that are available for an event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventFeatures" method="get" path="/events/{id}/features" -->
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

GetEventFeaturesRequest req = new GetEventFeaturesRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
    Filter = "enabled eq 'true'",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

GetEventFeaturesResponse? res = await sdk.EventFeatures.GetEventFeaturesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetEventFeaturesRequest](../../Models/Requests/GetEventFeaturesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetEventFeaturesResponse](../../Models/Requests/GetEventFeaturesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateEventFeatures

A resource responsible to enable / disable an event feature

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateEventFeatures" method="put" path="/events/{id}/features/{type}" -->
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

UpdateEventFeaturesRequest req = new UpdateEventFeaturesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Type = FeatureTypeJson.Registration,
    FeatureUpdate = new FeatureUpdate() {
        Type = FeatureTypeJson.Registration,
        Enabled = true,
        EnabledTier = TierJson.Premier,
        Config = FeatureUpdateConfig.CreateZeroAnyOf(
            new ZeroAnyOf() {
                Pricing = new PricingConfigJson() {
                    Enabled = true,
                    InvoicePrefix = "EVE001",
                    RevenueGoal = 10000D,
                    MerchantAccount = "Event merchant account - USD",
                    Currency = "USD",
                    AllowedPaymentMethods = new List<PaymentMethodTypeJson>() {
                        PaymentMethodTypeJson.Visa,
                        PaymentMethodTypeJson.DinersClub,
                        PaymentMethodTypeJson.Mastercard,
                    },
                },
            }
        ),
    },
};

var res = await sdk.EventFeatures.UpdateEventFeaturesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateEventFeaturesRequest](../../Models/Requests/UpdateEventFeaturesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateEventFeaturesResponse](../../Models/Requests/UpdateEventFeaturesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## LaunchEventFeatures

Launch event features to make them available to an audience.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="launchEventFeatures" method="post" path="/events/{id}/features/{type}/launch" -->
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

LaunchEventFeaturesRequest req = new LaunchEventFeaturesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Type = LaunchFeatureTypeJson.Registration,
};

var res = await sdk.EventFeatures.LaunchEventFeaturesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [LaunchEventFeaturesRequest](../../Models/Requests/LaunchEventFeaturesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[LaunchEventFeaturesResponse](../../Models/Requests/LaunchEventFeaturesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListEventWeblinks

Gets a paginated list of weblinks for the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listEventWeblinks" method="get" path="/events/{id}/weblinks" -->
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

ListEventWeblinksRequest req = new ListEventWeblinksRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

ListEventWeblinksResponse? res = await sdk.EventFeatures.ListEventWeblinksAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListEventWeblinksRequest](../../Models/Requests/ListEventWeblinksRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListEventWeblinksResponse](../../Models/Requests/ListEventWeblinksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |