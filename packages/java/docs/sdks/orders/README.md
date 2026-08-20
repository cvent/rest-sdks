# Orders

## Overview

Orders represent a collection of order items purchased by an attendee. Use these APIs to get information about orders and order items.

### Available Operations

* [getAccountOrders](#getaccountorders) - List Account Orders
* [getAccountOrderById](#getaccountorderbyid) - Get Order
* [getAccountOrderItemsByOrderId](#getaccountorderitemsbyorderid) - List Account Order Items
* [getAccountOrderItem](#getaccountorderitem) - Get Order Item

## getAccountOrders

Gets a paginated list of orders in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated orders may not be immediately reflected in the response.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountOrders" method="get" path="/orders" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.GetAccountOrdersRequest;
import com.cvent.models.operations.GetAccountOrdersResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetAccountOrdersRequest req = GetAccountOrdersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("filter=event.id eq '7e8a9c45-2f1b-4d3e-9a67-8b5c4f2e1a90'")
                .build();


        sdk.orders().getAccountOrders()
                .callAsStream()
                .forEach((GetAccountOrdersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetAccountOrdersRequest](../../models/operations/GetAccountOrdersRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetAccountOrdersResponse](../../models/operations/GetAccountOrdersResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountOrderById

Gets the order for a given orderId. Newly created or updated orders may not be immediately reflected in the response.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountOrderById" method="get" path="/orders/{orderId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.GetAccountOrderByIdRequest;
import com.cvent.models.operations.GetAccountOrderByIdResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetAccountOrderByIdRequest req = GetAccountOrderByIdRequest.builder()
                .orderId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetAccountOrderByIdResponse res = sdk.orders().getAccountOrderById()
                .request(req)
                .call();

        if (res.orderDetail().isPresent()) {
            System.out.println(res.orderDetail().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAccountOrderByIdRequest](../../models/operations/GetAccountOrderByIdRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAccountOrderByIdResponse](../../models/operations/GetAccountOrderByIdResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountOrderItemsByOrderId

Gets a paginated list of order items for a given orderId in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated order items may not be immediately reflected in the response.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountOrderItemsByOrderId" method="get" path="/orders/{orderId}/items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.GetAccountOrderItemsByOrderIdRequest;
import com.cvent.models.operations.GetAccountOrderItemsByOrderIdResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetAccountOrderItemsByOrderIdRequest req = GetAccountOrderItemsByOrderIdRequest.builder()
                .orderId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'f82ea335-3844-47bf-92f6-4e00d60f7800' AND (created lt '2025-08-19T20:43:13.000Z' OR created gt '2023-08-19T20:43:13.000Z')")
                .build();


        sdk.orders().getAccountOrderItemsByOrderId()
                .callAsStream()
                .forEach((GetAccountOrderItemsByOrderIdResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetAccountOrderItemsByOrderIdRequest](../../models/operations/GetAccountOrderItemsByOrderIdRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetAccountOrderItemsByOrderIdResponse](../../models/operations/GetAccountOrderItemsByOrderIdResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountOrderItem

Gets a order item for a given orderItemId in the account. Newly created or updated order items may not be immediately reflected in the response.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountOrderItem" method="get" path="/orders/{orderId}/items/{orderItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.GetAccountOrderItemRequest;
import com.cvent.models.operations.GetAccountOrderItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetAccountOrderItemRequest req = GetAccountOrderItemRequest.builder()
                .orderId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .orderItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetAccountOrderItemResponse res = sdk.orders().getAccountOrderItem()
                .request(req)
                .call();

        if (res.orderItemResponse().isPresent()) {
            System.out.println(res.orderItemResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAccountOrderItemRequest](../../models/operations/GetAccountOrderItemRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAccountOrderItemResponse](../../models/operations/GetAccountOrderItemResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |