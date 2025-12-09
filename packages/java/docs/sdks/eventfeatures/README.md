# EventFeatures

## Overview

EventFeatures related APIs

### Available Operations

* [getEventFeatures](#geteventfeatures) - List Event Features
* [updateEventFeatures](#updateeventfeatures) - Update Event Feature
* [launchEventFeatures](#launcheventfeatures) - Launch Event Feature
* [listEventWeblinks](#listeventweblinks) - List Event Weblinks

## getEventFeatures

A resource responsible for providing the set of event features that are available for an event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventFeatures" method="get" path="/events/{id}/features" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventFeaturesRequest;
import com.cvent.models.operations.GetEventFeaturesResponse;
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

        GetEventFeaturesRequest req = GetEventFeaturesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .filter("enabled eq 'true'")
                .build();


        sdk.eventFeatures().getEventFeatures()
                .callAsStream()
                .forEach((GetEventFeaturesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetEventFeaturesRequest](../../models/operations/GetEventFeaturesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetEventFeaturesResponse](../../models/operations/GetEventFeaturesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateEventFeatures

A resource responsible to enable / disable an event feature

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateEventFeatures" method="put" path="/events/{id}/features/{type}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateEventFeaturesRequest;
import com.cvent.models.operations.UpdateEventFeaturesResponse;
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

        UpdateEventFeaturesRequest req = UpdateEventFeaturesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .type(FeatureTypeJson.REGISTRATION)
                .featureUpdate(FeatureUpdate.builder()
                    .type(FeatureTypeJson.REGISTRATION)
                    .enabled(true)
                    .enabledTier(TierJson.PREMIER)
                    .config(FeatureUpdateConfig.of(ZeroAnyOf.builder()
                        .pricing(PricingConfigJson.builder()
                            .enabled(true)
                            .invoicePrefix("EVE001")
                            .revenueGoal(10000d)
                            .merchantAccount("Event merchant account - USD")
                            .currency("USD")
                            .allowedPaymentMethods(List.of(
                                PaymentMethodTypeJson.VISA,
                                PaymentMethodTypeJson.DINERS_CLUB,
                                PaymentMethodTypeJson.MASTERCARD))
                            .build())
                        .build()))
                    .build())
                .build();

        UpdateEventFeaturesResponse res = sdk.eventFeatures().updateEventFeatures()
                .request(req)
                .call();

        if (res.eventFeaturesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateEventFeaturesRequest](../../models/operations/UpdateEventFeaturesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateEventFeaturesResponse](../../models/operations/UpdateEventFeaturesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## launchEventFeatures

Launch event features to make them available to an audience.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="launchEventFeatures" method="post" path="/events/{id}/features/{type}/launch" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.LaunchEventFeaturesRequest;
import com.cvent.models.operations.LaunchEventFeaturesResponse;
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

        LaunchEventFeaturesRequest req = LaunchEventFeaturesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .type(LaunchFeatureTypeJson.REGISTRATION)
                .build();

        LaunchEventFeaturesResponse res = sdk.eventFeatures().launchEventFeatures()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [LaunchEventFeaturesRequest](../../models/operations/LaunchEventFeaturesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[LaunchEventFeaturesResponse](../../models/operations/LaunchEventFeaturesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listEventWeblinks

Gets a paginated list of weblinks for the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listEventWeblinks" method="get" path="/events/{id}/weblinks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListEventWeblinksRequest;
import com.cvent.models.operations.ListEventWeblinksResponse;
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

        ListEventWeblinksRequest req = ListEventWeblinksRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .build();


        sdk.eventFeatures().listEventWeblinks()
                .callAsStream()
                .forEach((ListEventWeblinksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListEventWeblinksRequest](../../models/operations/ListEventWeblinksRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListEventWeblinksResponse](../../models/operations/ListEventWeblinksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |