# Emails

## Overview

Event planners use emails to invite registrants, market their events and request feedback from attendees. Use these APIs to get historical data about your emails and see relevant details like the types of emails sent, the recipient, and delivery status.

### Available Operations

* [getBounceDetails](#getbouncedetails) - List Email Bounces
* [getEmailsHistory](#getemailshistory) - Get Emails History Data
* [~~getEmailStatus~~](#getemailstatus) - List Email Status :warning: **Deprecated**

## getBounceDetails

Returns a paginated list of email bounce details in your account.

Before/after filters can be used to retrieve email bounce data up to six months in the past.
If no date filter is provided, defaults to 1 month back from the current time.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBounceDetails" method="get" path="/bounces" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBounceDetailsRequest;
import com.cvent.models.operations.GetBounceDetailsResponse;
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

        GetBounceDetailsRequest req = GetBounceDetailsRequest.builder()
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("productLine eq 'EVENT'")
                .build();


        sdk.emails().getBounceDetails()
                .callAsStream()
                .forEach((GetBounceDetailsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetBounceDetailsRequest](../../models/operations/GetBounceDetailsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetBounceDetailsResponse](../../models/operations/GetBounceDetailsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEmailsHistory

Returns the paginated list of sent emails. Default behaviour is to retrieve all emails for the account. Maximum 6 months of records can be fetched.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEmailsHistory" method="get" path="/emails" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEmailsHistoryRequest;
import com.cvent.models.operations.GetEmailsHistoryResponse;
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

        GetEmailsHistoryRequest req = GetEmailsHistoryRequest.builder()
                .before("2021-03-25T02:30:00Z")
                .after("2021-03-26T02:30:00Z")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.emails().getEmailsHistory()
                .callAsStream()
                .forEach((GetEmailsHistoryResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetEmailsHistoryRequest](../../models/operations/GetEmailsHistoryRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetEmailsHistoryResponse](../../models/operations/GetEmailsHistoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## ~~getEmailStatus~~

Gets the status of emails using unique email request ID that was generated as a response of [Send Email To Recipients](#tag/Campaigns/operation/sendEMarketingEmails) request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="getEmailStatus" method="get" path="/emails/{emailRequestId}/status" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEmailStatusRequest;
import com.cvent.models.operations.GetEmailStatusResponse;
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

        GetEmailStatusRequest req = GetEmailStatusRequest.builder()
                .emailRequestId("2A941E55-3367-4C50-B21B-B6A7613DFB23")
                .build();

        GetEmailStatusResponse res = sdk.emails().getEmailStatus()
                .request(req)
                .call();

        if (res.emailSendStatus().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetEmailStatusRequest](../../models/operations/GetEmailStatusRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetEmailStatusResponse](../../models/operations/GetEmailStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |