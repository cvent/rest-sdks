# Usage

## Overview

Use these APIs view your REST API usage and limits metrics. For more details on limits - [Rate Limits](#section/Getting-Started/Rate-Limits)

### Available Operations

* [getUsage](#getusage) - Get Current Usage
* [getUsageTier](#getusagetier) - Get Current Usage Tier

## getUsage

Returns API call usage for the last seven days, or between some date range (up to the past seven days) for
the current caller's account.


### Example Usage

<!-- UsageSnippet language="java" operationID="getUsage" method="get" path="/usage" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetUsageResponse;
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

        GetUsageResponse res = sdk.usage().getUsage()
                .call();

        if (res.usagePaginatedResponse().isPresent()) {
            System.out.println(res.usagePaginatedResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetUsageRequest](../../models/operations/GetUsageRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetUsageResponse](../../models/operations/GetUsageResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getUsageTier

Returns the current usage tier of the caller's account.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getUsageTier" method="get" path="/usage/tier" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetUsageTierResponse;
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

        GetUsageTierResponse res = sdk.usage().getUsageTier()
                .call();

        if (res.publicUsagePlan().isPresent()) {
            System.out.println(res.publicUsagePlan().get());
        }
    }
}
```

### Response

**[GetUsageTierResponse](../../models/operations/GetUsageTierResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 429               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |