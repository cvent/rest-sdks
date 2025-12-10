# Campaigns

## Overview

Planners use eMarketing campaigns to contact an audience, such as newsletters, press releases, or product updates. Campaign emails are used as newsletters, promotions, advertisements, or marketing messages. Use these APIs to send an email and get historical data about your campaigns.

### Available Operations

* [getCampaigns](#getcampaigns) - List eMarketing Campaigns
* [getEmailTemplates](#getemailtemplates) - List Email Templates
* [sendEMarketingEmails](#sendemarketingemails) - Send Email To Recipients
* [getEmarketingEmailStatus](#getemarketingemailstatus) - List Emarketing Email Status

## getCampaigns

Gets a list of eMarketing campaigns.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCampaigns" method="get" path="/campaigns" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetCampaignsRequest;
import com.cvent.models.operations.GetCampaignsResponse;
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

        GetCampaignsRequest req = GetCampaignsRequest.builder()
                .before("2021-03-25T02:30:00Z")
                .after("2021-03-26T02:30:00Z")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("campaign.active eq '1'")
                .build();


        sdk.campaigns().getCampaigns()
                .callAsStream()
                .forEach((GetCampaignsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetCampaignsRequest](../../models/operations/GetCampaignsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetCampaignsResponse](../../models/operations/GetCampaignsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEmailTemplates

Gets a list of eMarketing email templates.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEmailTemplates" method="get" path="/emarketing/campaigns/{campaignId}/email-templates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEmailTemplatesRequest;
import com.cvent.models.operations.GetEmailTemplatesResponse;
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

        GetEmailTemplatesRequest req = GetEmailTemplatesRequest.builder()
                .campaignId("9A641E55-3367-4C50-B21B-B6A7613DFB23")
                .before("2021-03-25T02:30:00Z")
                .after("2021-03-26T02:30:00Z")
                .filter("emailName eq 'Invitation'")
                .build();

        GetEmailTemplatesResponse res = sdk.campaigns().getEmailTemplates()
                .request(req)
                .call();

        if (res.emailTemplatePaginatedResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetEmailTemplatesRequest](../../models/operations/GetEmailTemplatesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetEmailTemplatesResponse](../../models/operations/GetEmailTemplatesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## sendEMarketingEmails

Sends an email to one or more eMarketing campaign recipients who are on the recipient list.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="sendEMarketingEmails" method="post" path="/emarketing/emails" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.SendEMarketingEmailsResponse;
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

        SendEmailRequest req = SendEmailRequest.builder()
                .templateId("12345")
                .recipients(List.of())
                .build();

        SendEMarketingEmailsResponse res = sdk.campaigns().sendEMarketingEmails()
                .request(req)
                .call();

        if (res.sendEmailResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [SendEmailRequest](../../models/shared/SendEmailRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[SendEMarketingEmailsResponse](../../models/operations/SendEMarketingEmailsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEmarketingEmailStatus

Gets the status of email using unique email request ID that was generated as a response of [Send Email To Recipients](#tag/Campaigns/operation/sendEMarketingEmails) request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEmarketingEmailStatus" method="get" path="/emarketing/emails/{emailRequestId}/status" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEmarketingEmailStatusRequest;
import com.cvent.models.operations.GetEmarketingEmailStatusResponse;
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

        GetEmarketingEmailStatusRequest req = GetEmarketingEmailStatusRequest.builder()
                .emailRequestId("2A941E55-3367-4C50-B21B-B6A7613DFB23")
                .build();

        GetEmarketingEmailStatusResponse res = sdk.campaigns().getEmarketingEmailStatus()
                .request(req)
                .call();

        if (res.sendEmailEmarketingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetEmarketingEmailStatusRequest](../../models/operations/GetEmarketingEmailStatusRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetEmarketingEmailStatusResponse](../../models/operations/GetEmarketingEmailStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |