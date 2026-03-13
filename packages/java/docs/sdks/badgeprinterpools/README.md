# BadgePrinterPools

## Overview

Badge printer pools are set up from Cvent UI. You can use this API to retrieve badge printer pools.

### Available Operations

* [getBadgePrinterPools](#getbadgeprinterpools) - List Badge Printer Pools
* [getBadgePrinterPool](#getbadgeprinterpool) - Get Badge Printer Pool

## getBadgePrinterPools

Gets a paginated list of badge printer pools

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBadgePrinterPools" method="get" path="/events/{eventId}/badge-printer-pools" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBadgePrinterPoolsRequest;
import com.cvent.models.operations.GetBadgePrinterPoolsResponse;
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

        GetBadgePrinterPoolsRequest req = GetBadgePrinterPoolsRequest.builder()
                .eventId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("disabled eq 'true'")
                .build();


        sdk.badgePrinterPools().getBadgePrinterPools()
                .callAsStream()
                .forEach((GetBadgePrinterPoolsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetBadgePrinterPoolsRequest](../../models/operations/GetBadgePrinterPoolsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetBadgePrinterPoolsResponse](../../models/operations/GetBadgePrinterPoolsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBadgePrinterPool

Gets a single badge printer pool by its ID

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBadgePrinterPool" method="get" path="/events/{eventId}/badge-printer-pools/{poolId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBadgePrinterPoolRequest;
import com.cvent.models.operations.GetBadgePrinterPoolResponse;
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

        GetBadgePrinterPoolRequest req = GetBadgePrinterPoolRequest.builder()
                .eventId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .poolId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetBadgePrinterPoolResponse res = sdk.badgePrinterPools().getBadgePrinterPool()
                .request(req)
                .call();

        if (res.existingBadgePrinterPool().isPresent()) {
            System.out.println(res.existingBadgePrinterPool().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetBadgePrinterPoolRequest](../../models/operations/GetBadgePrinterPoolRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetBadgePrinterPoolResponse](../../models/operations/GetBadgePrinterPoolResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |