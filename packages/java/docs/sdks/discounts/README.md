# Discounts

## Overview

Discounts provide a way to reduce the cost of event registration items. Use these APIs to manage event discounts, including creating, updating, and linking discounts to agenda items.

### Available Operations

* [listEventDiscounts](#listeventdiscounts) - List Event Discounts
* [createEventDiscount](#createeventdiscount) - Create Event Discount
* [listDiscountedAgendaItems](#listdiscountedagendaitems) - List Discounted Agenda Items
* [updateEventDiscount](#updateeventdiscount) - Update Event Discount
* [linkAgendaItemToDiscount](#linkagendaitemtodiscount) - Link Agenda Item to Discount
* [unlinkAgendaItemFromDiscount](#unlinkagendaitemfromdiscount) - Unlink Agenda Item Discount

## listEventDiscounts

Returns a paginated list of all discounts used in an event, including both event-specific and account-level discount codes used in an event.


### Example Usage

<!-- UsageSnippet language="java" operationID="listEventDiscounts" method="get" path="/events/{id}/discounts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListEventDiscountsRequest;
import com.cvent.models.operations.ListEventDiscountsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

        ListEventDiscountsRequest req = ListEventDiscountsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("name:DESC,code:ASC")
                .filter("id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and method.type eq 'PERCENTAGE'")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .build();


        sdk.discounts().listEventDiscounts()
                .callAsStream()
                .forEach((ListEventDiscountsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListEventDiscountsRequest](../../models/operations/ListEventDiscountsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListEventDiscountsResponse](../../models/operations/ListEventDiscountsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createEventDiscount

Create discount in an event.


### Example Usage

<!-- UsageSnippet language="java" operationID="createEventDiscount" method="post" path="/events/{id}/discounts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateEventDiscountRequest;
import com.cvent.models.operations.CreateEventDiscountResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

        CreateEventDiscountRequest req = CreateEventDiscountRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .createUpdateDiscount(CreateUpdateDiscountCode.builder()
                    .name("10% off")
                    .method(DiscountMethodJson.builder()
                        .value(10d)
                        .type(DiscountMethodTypeJson.BY_PERCENTAGE)
                        .build())
                    .code("10OFF")
                    .type(CreateUpdateDiscountCodeType.DISCOUNT_CODE)
                    .includeGuestsTowardsCapacity(true)
                    .autoApply(true)
                    .build())
                .build();

        CreateEventDiscountResponse res = sdk.discounts().createEventDiscount()
                .request(req)
                .call();

        if (res.createUpdateDiscountResponse().isPresent()) {
            CreateUpdateDiscountResponse unionValue = res.createUpdateDiscountResponse().get();
            switch (unionValue.type()) {
                case "DISCOUNT_CODE":
                    // Handle DISCOUNT_CODE discriminator variant
                    break;
                case "VOLUME_DISCOUNT":
                    // Handle VOLUME_DISCOUNT discriminator variant
                    break;
                default:
                    // Handle unknown discriminator variant
            }
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateEventDiscountRequest](../../models/operations/CreateEventDiscountRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateEventDiscountResponse](../../models/operations/CreateEventDiscountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listDiscountedAgendaItems

Returns a paginated list of agenda items that are associated with discounts for the specified event.  This endpoint helps identify which agenda items (such as admission items, sessions, session bundles, membership-items or quantity-items) are currently associated with discounts.


### Example Usage

<!-- UsageSnippet language="java" operationID="listDiscountedAgendaItems" method="get" path="/events/{id}/discounts/agenda-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListDiscountedAgendaItemsRequest;
import com.cvent.models.operations.ListDiscountedAgendaItemsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

        ListDiscountedAgendaItemsRequest req = ListDiscountedAgendaItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("type eq 'AdmissionItem' and discount.id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16')")
                .build();


        sdk.discounts().listDiscountedAgendaItems()
                .callAsStream()
                .forEach((ListDiscountedAgendaItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListDiscountedAgendaItemsRequest](../../models/operations/ListDiscountedAgendaItemsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListDiscountedAgendaItemsResponse](../../models/operations/ListDiscountedAgendaItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateEventDiscount

Update a discount in an event based on details in the request body. Fields not included in the request will revert to their default value.


### Example Usage

<!-- UsageSnippet language="java" operationID="updateEventDiscount" method="put" path="/events/{id}/discounts/{discountId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateEventDiscountRequest;
import com.cvent.models.operations.UpdateEventDiscountResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

        UpdateEventDiscountRequest req = UpdateEventDiscountRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .discountId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .createUpdateDiscount(CreateUpdateDiscountCode.builder()
                    .name("10% off")
                    .method(DiscountMethodJson.builder()
                        .value(10d)
                        .type(DiscountMethodTypeJson.BY_PERCENTAGE)
                        .build())
                    .code("10OFF")
                    .type(CreateUpdateDiscountCodeType.DISCOUNT_CODE)
                    .includeGuestsTowardsCapacity(true)
                    .autoApply(true)
                    .build())
                .build();

        UpdateEventDiscountResponse res = sdk.discounts().updateEventDiscount()
                .request(req)
                .call();

        if (res.createUpdateDiscountResponse().isPresent()) {
            CreateUpdateDiscountResponse unionValue = res.createUpdateDiscountResponse().get();
            switch (unionValue.type()) {
                case "DISCOUNT_CODE":
                    // Handle DISCOUNT_CODE discriminator variant
                    break;
                case "VOLUME_DISCOUNT":
                    // Handle VOLUME_DISCOUNT discriminator variant
                    break;
                default:
                    // Handle unknown discriminator variant
            }
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateEventDiscountRequest](../../models/operations/UpdateEventDiscountRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateEventDiscountResponse](../../models/operations/UpdateEventDiscountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## linkAgendaItemToDiscount

Links an agenda item to a given event discount.

### Example Usage

<!-- UsageSnippet language="java" operationID="linkAgendaItemToDiscount" method="put" path="/events/{id}/discounts/{discountId}/agenda-items/{agendaItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.LinkAgendaItemToDiscountRequest;
import com.cvent.models.operations.LinkAgendaItemToDiscountResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

        LinkAgendaItemToDiscountRequest req = LinkAgendaItemToDiscountRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .discountId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .agendaItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        LinkAgendaItemToDiscountResponse res = sdk.discounts().linkAgendaItemToDiscount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [LinkAgendaItemToDiscountRequest](../../models/operations/LinkAgendaItemToDiscountRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[LinkAgendaItemToDiscountResponse](../../models/operations/LinkAgendaItemToDiscountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## unlinkAgendaItemFromDiscount

Unlinks an agenda item from a given event discount.

### Example Usage

<!-- UsageSnippet language="java" operationID="unlinkAgendaItemFromDiscount" method="delete" path="/events/{id}/discounts/{discountId}/agenda-items/{agendaItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UnlinkAgendaItemFromDiscountRequest;
import com.cvent.models.operations.UnlinkAgendaItemFromDiscountResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

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

        UnlinkAgendaItemFromDiscountRequest req = UnlinkAgendaItemFromDiscountRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .discountId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .agendaItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        UnlinkAgendaItemFromDiscountResponse res = sdk.discounts().unlinkAgendaItemFromDiscount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UnlinkAgendaItemFromDiscountRequest](../../models/operations/UnlinkAgendaItemFromDiscountRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UnlinkAgendaItemFromDiscountResponse](../../models/operations/UnlinkAgendaItemFromDiscountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |