# MeetingRequest

## Overview

When planning an event, meeting request forms are customizable online questionnaires to capture information about the event and facilitate the approval of events. When a meeting request form is submitted it becomes a meeting request. Use this API to view forms, create meeting requests and track the status of meeting requests. **Legacy meeting request forms are not supported by this API.**

### Available Operations

* [getMeetingRequestByEventId](#getmeetingrequestbyeventid) - Get MR by Event ID
* [listMRF](#listmrf) - List MR Forms
* [getMRFById](#getmrfbyid) - Get MR Form
* [createMeetingRequest](#createmeetingrequest) - Create MR (Bulk)
* [updateMeetingRequest](#updatemeetingrequest) - Update MR (Bulk)
* [listMeetingRequest](#listmeetingrequest) - List MR
* [getMeetingRequestById](#getmeetingrequestbyid) - Get MR
* [listMeetingRequestDocuments](#listmeetingrequestdocuments) - List MR Documents

## getMeetingRequestByEventId

Gets a meeting request connected to a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getMeetingRequestByEventId" method="get" path="/events/{id}/meeting-requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetMeetingRequestByEventIdRequest;
import com.cvent.models.operations.GetMeetingRequestByEventIdResponse;
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

        GetMeetingRequestByEventIdRequest req = GetMeetingRequestByEventIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetMeetingRequestByEventIdResponse res = sdk.meetingRequest().getMeetingRequestByEventId()
                .request(req)
                .call();

        if (res.meetingRequest().isPresent()) {
            System.out.println(res.meetingRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetMeetingRequestByEventIdRequest](../../models/operations/GetMeetingRequestByEventIdRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetMeetingRequestByEventIdResponse](../../models/operations/GetMeetingRequestByEventIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listMRF

Get a paginated list of meeting request forms.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listMRF" method="get" path="/meeting-request-forms" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListMRFRequest;
import com.cvent.models.operations.ListMRFResponse;
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

        ListMRFRequest req = ListMRFRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("active eq 'true'")
                .build();


        sdk.meetingRequest().listMRF()
                .callAsStream()
                .forEach((ListMRFResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [ListMRFRequest](../../models/operations/ListMRFRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[ListMRFResponse](../../models/operations/ListMRFResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getMRFById

Get a single meeting request form by ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getMRFById" method="get" path="/meeting-request-forms/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetMRFByIdRequest;
import com.cvent.models.operations.GetMRFByIdResponse;
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

        GetMRFByIdRequest req = GetMRFByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetMRFByIdResponse res = sdk.meetingRequest().getMRFById()
                .request(req)
                .call();

        if (res.meetingRequestForm().isPresent()) {
            System.out.println(res.meetingRequestForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetMRFByIdRequest](../../models/operations/GetMRFByIdRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetMRFByIdResponse](../../models/operations/GetMRFByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 422, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createMeetingRequest

Creates a collection of meeting requests for a given active form. For complex questions such as Meeting Room Requirements, Sleeping Room Requirements, or Budget Estimates, send the answer as a JSON-serialized string. See the question schema and the [Complex Questions Guide](/docs/rest-api/guides/meeting-request-complex-questions) for details.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createMeetingRequest" method="post" path="/meeting-request-forms/{id}/requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateMeetingRequestRequest;
import com.cvent.models.operations.CreateMeetingRequestResponse;
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

        CreateMeetingRequestRequest req = CreateMeetingRequestRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of(
                    MeetingRequestCreateJson.builder()
                        .name("####test")
                        .questions(List.of(
                            RequestedMeetingRequestQuestionJson.builder()
                                .id("f1ea56cd-6860-4f1a-baf7-973118384384")
                                .value(List.of(
                                    "Green"))
                                .build()))
                        .sourceId("sourceId12")
                        .build()))
                .build();

        CreateMeetingRequestResponse res = sdk.meetingRequest().createMeetingRequest()
                .request(req)
                .call();

        if (res.meetingRequestBulkResponse().isPresent()) {
            System.out.println(res.meetingRequestBulkResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateMeetingRequestRequest](../../models/operations/CreateMeetingRequestRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateMeetingRequestResponse](../../models/operations/CreateMeetingRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateMeetingRequest

Updates a collection of meeting requests for a given form, adding information to the existing meeting requests. For complex questions such as Meeting Room Requirements, Sleeping Room Requirements, or Budget Estimates, send the answer as a JSON-serialized string. See the question schema and the [Complex Questions Guide](/docs/rest-api/guides/meeting-request-complex-questions) for details.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMeetingRequest" method="put" path="/meeting-request-forms/{id}/requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateMeetingRequestRequest;
import com.cvent.models.operations.UpdateMeetingRequestResponse;
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

        UpdateMeetingRequestRequest req = UpdateMeetingRequestRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of())
                .build();

        UpdateMeetingRequestResponse res = sdk.meetingRequest().updateMeetingRequest()
                .request(req)
                .call();

        if (res.meetingRequestBulkResponse().isPresent()) {
            System.out.println(res.meetingRequestBulkResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateMeetingRequestRequest](../../models/operations/UpdateMeetingRequestRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateMeetingRequestResponse](../../models/operations/UpdateMeetingRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listMeetingRequest

Gets a paginated list of meeting requests for a given form.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listMeetingRequest" method="get" path="/meeting-request-forms/{id}/requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListMeetingRequestRequest;
import com.cvent.models.operations.ListMeetingRequestResponse;
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

        ListMeetingRequestRequest req = ListMeetingRequestRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("meeting-request.id eq '775b7a6c-de7f-4dfe-8d16-966acdc0e848'")
                .build();


        sdk.meetingRequest().listMeetingRequest()
                .callAsStream()
                .forEach((ListMeetingRequestResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListMeetingRequestRequest](../../models/operations/ListMeetingRequestRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListMeetingRequestResponse](../../models/operations/ListMeetingRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getMeetingRequestById

Gets a single meeting request by ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getMeetingRequestById" method="get" path="/meeting-request-forms/{id}/requests/{requestId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetMeetingRequestByIdRequest;
import com.cvent.models.operations.GetMeetingRequestByIdResponse;
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

        GetMeetingRequestByIdRequest req = GetMeetingRequestByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetMeetingRequestByIdResponse res = sdk.meetingRequest().getMeetingRequestById()
                .request(req)
                .call();

        if (res.meetingRequest().isPresent()) {
            System.out.println(res.meetingRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetMeetingRequestByIdRequest](../../models/operations/GetMeetingRequestByIdRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetMeetingRequestByIdResponse](../../models/operations/GetMeetingRequestByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listMeetingRequestDocuments

Gets a paginated list of documents for a given meeting request ID. When a meeting request form is submitted, it becomes a meeting request. Some meeting requests have document attachments.

### Example Usage

<!-- UsageSnippet language="java" operationID="listMeetingRequestDocuments" method="get" path="/meeting-requests/{requestId}/documents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListMeetingRequestDocumentsRequest;
import com.cvent.models.operations.ListMeetingRequestDocumentsResponse;
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

        ListMeetingRequestDocumentsRequest req = ListMeetingRequestDocumentsRequest.builder()
                .requestId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("lastModified lt '2024-12-12T03:00:00Z'")
                .build();


        sdk.meetingRequest().listMeetingRequestDocuments()
                .callAsStream()
                .forEach((ListMeetingRequestDocumentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListMeetingRequestDocumentsRequest](../../models/operations/ListMeetingRequestDocumentsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListMeetingRequestDocumentsResponse](../../models/operations/ListMeetingRequestDocumentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |