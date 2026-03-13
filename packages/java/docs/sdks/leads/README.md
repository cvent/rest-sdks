# Leads

## Overview

* **Leads -** Leads include leads gathered by LeadCapture, Appointments, and Inbound Leads. Use this API to get information for the lead and how it was captured.

* **Lead Qualification Question -** Custom questions created by each exhibitor to qualify a lead. Questions and answers are their own endpoints.

* **Eliterature Requests -** List of E-literature requests data sent to lead.


### Available Operations

* [getEliteratureRequests](#geteliteraturerequests) - List E-literature Requests
* [getLeadQualificationAnswers](#getleadqualificationanswers) - List Qualification Answers
* [getLeads](#getleads) - List Leads
* [getLeadsPostFiltersData](#getleadspostfiltersdata) - List Leads

## getEliteratureRequests

Gets a paginated list of eliterature requests data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEliteratureRequests" method="get" path="/eliterature-requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEliteratureRequestsRequest;
import com.cvent.models.operations.GetEliteratureRequestsResponse;
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

        GetEliteratureRequestsRequest req = GetEliteratureRequestsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("event.id eq '{UUID}' and exhibitor.id eq '{UUID}' and lead.id eq '{UUID}'")
                .build();


        sdk.leads().getEliteratureRequests()
                .callAsStream()
                .forEach((GetEliteratureRequestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetEliteratureRequestsRequest](../../models/operations/GetEliteratureRequestsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetEliteratureRequestsResponse](../../models/operations/GetEliteratureRequestsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getLeadQualificationAnswers

Gets a list of answers to lead qualification questions for a given lead id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getLeadQualificationAnswers" method="get" path="/events/{id}/exhibitors/{exhibitorId}/leads/{leadId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetLeadQualificationAnswersRequest;
import com.cvent.models.operations.GetLeadQualificationAnswersResponse;
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

        GetLeadQualificationAnswersRequest req = GetLeadQualificationAnswersRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .leadId("cdd0d110-3a84-4bc5-a420-37c007716c73")
                .build();

        GetLeadQualificationAnswersResponse res = sdk.leads().getLeadQualificationAnswers()
                .request(req)
                .call();

        if (res.leadQualificationAnswersListResponse().isPresent()) {
            System.out.println(res.leadQualificationAnswersListResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetLeadQualificationAnswersRequest](../../models/operations/GetLeadQualificationAnswersRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetLeadQualificationAnswersResponse](../../models/operations/GetLeadQualificationAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getLeads

Gets a paginated list of leads

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getLeads" method="get" path="/leads" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetLeadsRequest;
import com.cvent.models.operations.GetLeadsResponse;
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

        GetLeadsRequest req = GetLeadsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("deleted eq 'true' and event.id eq '{UUID}' and exhibitor.id eq '{UUID}'")
                .build();


        sdk.leads().getLeads()
                .callAsStream()
                .forEach((GetLeadsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetLeadsRequest](../../models/operations/GetLeadsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetLeadsResponse](../../models/operations/GetLeadsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getLeadsPostFiltersData

Gets a paginated list of leads

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getLeadsPostFiltersData" method="post" path="/leads/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetLeadsPostFiltersDataRequest;
import com.cvent.models.operations.GetLeadsPostFiltersDataResponse;
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

        GetLeadsPostFiltersDataRequest req = GetLeadsPostFiltersDataRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter(Filter.builder()
                    .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' AND attendee.id eq 'edf40757-3bc3-4a66-8180-93bff15b890b'")
                    .build())
                .build();


        sdk.leads().getLeadsPostFiltersData()
                .callAsStream()
                .forEach((GetLeadsPostFiltersDataResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetLeadsPostFiltersDataRequest](../../models/operations/GetLeadsPostFiltersDataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetLeadsPostFiltersDataResponse](../../models/operations/GetLeadsPostFiltersDataResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |