# BadgePrintJob

## Overview

Badge print jobs can be scheduled to a printer pool, so a printer in the printer pool can consume the job and print the badge.

### Available Operations

* [createBadgePrintJob](#createbadgeprintjob) - Create Badge Print Job
* [getEventBadgePrintJobs](#geteventbadgeprintjobs) - List Badge Print Jobs
* [getBadgePrintJob](#getbadgeprintjob) - Get Badge Print Job

## createBadgePrintJob

Creates a new badge print job

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createBadgePrintJob" method="post" path="/events/{eventId}/badge-print-jobs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateBadgePrintJobRequest;
import com.cvent.models.operations.CreateBadgePrintJobResponse;
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

        CreateBadgePrintJobRequest req = CreateBadgePrintJobRequest.builder()
                .eventId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .badgePrintJobCreated(BadgePrintJobCreatedInput.builder()
                    .pool(BadgePrinterPoolReferenceJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .badgeId("VNNDLJ6DKVK")
                    .status(BadgePrintJobStatusJson.SCHEDULED)
                    .build())
                .build();

        CreateBadgePrintJobResponse res = sdk.badgePrintJob().createBadgePrintJob()
                .request(req)
                .call();

        if (res.badgePrintJobCreated().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateBadgePrintJobRequest](../../models/operations/CreateBadgePrintJobRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateBadgePrintJobResponse](../../models/operations/CreateBadgePrintJobResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventBadgePrintJobs

Gets a paginated list of badge print jobs for a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventBadgePrintJobs" method="get" path="/events/{eventId}/badge-print-jobs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventBadgePrintJobsRequest;
import com.cvent.models.operations.GetEventBadgePrintJobsResponse;
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

        GetEventBadgePrintJobsRequest req = GetEventBadgePrintJobsRequest.builder()
                .eventId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("poolId eq '{UUID}' and status eq 'ASSIGNED'")
                .build();


        sdk.badgePrintJob().getEventBadgePrintJobs()
                .callAsStream()
                .forEach((GetEventBadgePrintJobsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetEventBadgePrintJobsRequest](../../models/operations/GetEventBadgePrintJobsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetEventBadgePrintJobsResponse](../../models/operations/GetEventBadgePrintJobsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBadgePrintJob

Gets a badge print job

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBadgePrintJob" method="get" path="/events/{eventId}/badge-print-jobs/{jobId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBadgePrintJobRequest;
import com.cvent.models.operations.GetBadgePrintJobResponse;
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

        GetBadgePrintJobRequest req = GetBadgePrintJobRequest.builder()
                .eventId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .jobId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetBadgePrintJobResponse res = sdk.badgePrintJob().getBadgePrintJob()
                .request(req)
                .call();

        if (res.existingBadgePrintJob().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetBadgePrintJobRequest](../../models/operations/GetBadgePrintJobRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetBadgePrintJobResponse](../../models/operations/GetBadgePrintJobResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |