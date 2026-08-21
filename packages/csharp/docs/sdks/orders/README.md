# Orders

## Overview

Orders represent a collection of order items purchased by an attendee. Use these APIs to get information about orders and order items.

### Available Operations

* [GetAccountOrders](#getaccountorders) - List Account Orders
* [GetAccountOrderById](#getaccountorderbyid) - Get Order
* [GetAccountOrderItemsByOrderId](#getaccountorderitemsbyorderid) - List Account Order Items
* [GetAccountOrderItem](#getaccountorderitem) - Get Order Item

## GetAccountOrders

Gets a paginated list of orders in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated orders may not be immediately reflected in the response.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountOrders" method="get" path="/orders" -->
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

GetAccountOrdersRequest req = new GetAccountOrdersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "filter=event.id eq '7e8a9c45-2f1b-4d3e-9a67-8b5c4f2e1a90'",
};

GetAccountOrdersResponse? res = await sdk.Orders.GetAccountOrdersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAccountOrdersRequest](../../Models/Requests/GetAccountOrdersRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAccountOrdersResponse](../../Models/Requests/GetAccountOrdersResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetAccountOrderById

Gets the order for a given orderId. Newly created or updated orders may not be immediately reflected in the response.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountOrderById" method="get" path="/orders/{orderId}" -->
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

GetAccountOrderByIdRequest req = new GetAccountOrderByIdRequest() {
    OrderId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Orders.GetAccountOrderByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountOrderByIdRequest](../../Models/Requests/GetAccountOrderByIdRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountOrderByIdResponse](../../Models/Requests/GetAccountOrderByIdResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetAccountOrderItemsByOrderId

Gets a paginated list of order items for a given orderId in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated order items may not be immediately reflected in the response.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountOrderItemsByOrderId" method="get" path="/orders/{orderId}/items" -->
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

GetAccountOrderItemsByOrderIdRequest req = new GetAccountOrderItemsByOrderIdRequest() {
    OrderId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'f82ea335-3844-47bf-92f6-4e00d60f7800' AND (created lt '2025-08-19T20:43:13.000Z' OR created gt '2023-08-19T20:43:13.000Z')",
};

GetAccountOrderItemsByOrderIdResponse? res = await sdk.Orders.GetAccountOrderItemsByOrderIdAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetAccountOrderItemsByOrderIdRequest](../../Models/Requests/GetAccountOrderItemsByOrderIdRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetAccountOrderItemsByOrderIdResponse](../../Models/Requests/GetAccountOrderItemsByOrderIdResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetAccountOrderItem

Gets a order item for a given orderItemId in the account. Newly created or updated order items may not be immediately reflected in the response.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountOrderItem" method="get" path="/orders/{orderId}/items/{orderItemId}" -->
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

GetAccountOrderItemRequest req = new GetAccountOrderItemRequest() {
    OrderId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    OrderItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Orders.GetAccountOrderItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountOrderItemRequest](../../Models/Requests/GetAccountOrderItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountOrderItemResponse](../../Models/Requests/GetAccountOrderItemResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |