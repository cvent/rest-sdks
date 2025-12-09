# Discounts

## Overview

Discounts provide a way to reduce the cost of event registration items. Use these APIs to manage event discounts, including creating, updating, and linking discounts to agenda items.

### Available Operations

* [ListEventDiscounts](#listeventdiscounts) - List Event Discounts
* [CreateEventDiscount](#createeventdiscount) - Create Event Discount
* [ListDiscountedAgendaItems](#listdiscountedagendaitems) - List Discounted Agenda Items
* [UpdateEventDiscount](#updateeventdiscount) - Update Event Discount
* [LinkAgendaItemToDiscount](#linkagendaitemtodiscount) - Link Agenda Item to Discount
* [UnlinkAgendaItemFromDiscount](#unlinkagendaitemfromdiscount) - Unlink Agenda Item Discount

## ListEventDiscounts

Returns a paginated list of all discounts used in an event, including both event-specific and account-level discount codes used in an event.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listEventDiscounts" method="get" path="/events/{id}/discounts" -->
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

ListEventDiscountsRequest req = new ListEventDiscountsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "name:DESC,code:ASC",
    Filter = "id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and method.type eq 'PERCENTAGE'",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
};

ListEventDiscountsResponse? res = await sdk.Discounts.ListEventDiscountsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListEventDiscountsRequest](../../Models/Requests/ListEventDiscountsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListEventDiscountsResponse](../../Models/Requests/ListEventDiscountsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateEventDiscount

Create discount in an event.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="createEventDiscount" method="post" path="/events/{id}/discounts" -->
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

CreateEventDiscountRequest req = new CreateEventDiscountRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CreateUpdateDiscount = CreateUpdateDiscount.CreateDiscountCode(
        new CreateUpdateDiscountCode() {
            Name = "10% off",
            Method = new DiscountMethodJson() {
                Type = DiscountMethodTypeJson.ByPercentage,
                Value = 10D,
            },
            Code = "10OFF",
            IncludeGuestsTowardsCapacity = true,
            AutoApply = true,
            Type = CreateUpdateDiscountCodeType.DiscountCode,
        }
    ),
};

var res = await sdk.Discounts.CreateEventDiscountAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateEventDiscountRequest](../../Models/Requests/CreateEventDiscountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateEventDiscountResponse](../../Models/Requests/CreateEventDiscountResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListDiscountedAgendaItems

Returns a paginated list of agenda items that are associated with discounts for the specified event.  This endpoint helps identify which agenda items (such as admission items, sessions, session bundles, membership-items or quantity-items) are currently associated with discounts.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listDiscountedAgendaItems" method="get" path="/events/{id}/discounts/agenda-items" -->
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

ListDiscountedAgendaItemsRequest req = new ListDiscountedAgendaItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "type eq 'AdmissionItem' and discount.id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16')",
};

ListDiscountedAgendaItemsResponse? res = await sdk.Discounts.ListDiscountedAgendaItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListDiscountedAgendaItemsRequest](../../Models/Requests/ListDiscountedAgendaItemsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListDiscountedAgendaItemsResponse](../../Models/Requests/ListDiscountedAgendaItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateEventDiscount

Update a discount in an event based on details in the request body. Fields not included in the request will revert to their default value.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateEventDiscount" method="put" path="/events/{id}/discounts/{discountId}" -->
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

UpdateEventDiscountRequest req = new UpdateEventDiscountRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DiscountId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CreateUpdateDiscount = CreateUpdateDiscount.CreateDiscountCode(
        new CreateUpdateDiscountCode() {
            Name = "10% off",
            Method = new DiscountMethodJson() {
                Type = DiscountMethodTypeJson.ByPercentage,
                Value = 10D,
            },
            Code = "10OFF",
            IncludeGuestsTowardsCapacity = true,
            AutoApply = true,
            Type = CreateUpdateDiscountCodeType.DiscountCode,
        }
    ),
};

var res = await sdk.Discounts.UpdateEventDiscountAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateEventDiscountRequest](../../Models/Requests/UpdateEventDiscountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateEventDiscountResponse](../../Models/Requests/UpdateEventDiscountResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## LinkAgendaItemToDiscount

Links an agenda item to a given event discount.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="linkAgendaItemToDiscount" method="put" path="/events/{id}/discounts/{discountId}/agenda-items/{agendaItemId}" -->
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

LinkAgendaItemToDiscountRequest req = new LinkAgendaItemToDiscountRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DiscountId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AgendaItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Discounts.LinkAgendaItemToDiscountAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [LinkAgendaItemToDiscountRequest](../../Models/Requests/LinkAgendaItemToDiscountRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[LinkAgendaItemToDiscountResponse](../../Models/Requests/LinkAgendaItemToDiscountResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UnlinkAgendaItemFromDiscount

Unlinks an agenda item from a given event discount.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="unlinkAgendaItemFromDiscount" method="delete" path="/events/{id}/discounts/{discountId}/agenda-items/{agendaItemId}" -->
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

UnlinkAgendaItemFromDiscountRequest req = new UnlinkAgendaItemFromDiscountRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DiscountId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AgendaItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Discounts.UnlinkAgendaItemFromDiscountAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UnlinkAgendaItemFromDiscountRequest](../../Models/Requests/UnlinkAgendaItemFromDiscountRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UnlinkAgendaItemFromDiscountResponse](../../Models/Requests/UnlinkAgendaItemFromDiscountResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |