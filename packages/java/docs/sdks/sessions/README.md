# Sessions

## Overview

A session is a presentation, discussion, or activity. Use these APIs to get information about your sessions and use the session ID to get further data within the event.

### Available Operations

* [getSessionLocation](#getsessionlocation) - List Session Locations
* [addSessionLocation](#addsessionlocation) - Add Session Location
* [createProgramItem](#createprogramitem) - Create Program Item
* [listProgramItems](#listprogramitems) - List Program Items
* [filterProgramItemDocuments](#filterprogramitemdocuments) - Filter Program Item Documents
* [listProgramItemsPostFilters](#listprogramitemspostfilters) - List Program Items
* [updateProgramItem](#updateprogramitem) - Update Program Item
* [deleteProgramItem](#deleteprogramitem) - Delete Session Program Item
* [~~getProgramItemDocuments~~](#getprogramitemdocuments) - Get Program Item Documents :warning: **Deprecated**
* [relateProgramItemToSessionDocument](#relateprogramitemtosessiondocument) - Add Program Item Document
* [getProgramItemSessionDocument](#getprogramitemsessiondocument) - Get Program Item Document
* [deleteProgramItemSessionDocument](#deleteprogramitemsessiondocument) - Delete Program Item Document
* [listSessionsCategories](#listsessionscategories) - List Session Categories
* [createSessionCategory](#createsessioncategory) - Create Session Categories
* [getSessionSegments](#getsessionsegments) - Get Session Segments
* [listSessions](#listsessions) - List Sessions
* [createSession](#createsession) - Create Session
* [listSessionsPostFilters](#listsessionspostfilters) - List Sessions
* [getSessionById](#getsessionbyid) - Get Session
* [updateSession](#updatesession) - Update Session
* [deleteSession](#deletesession) - Delete Session
* [updateSessionCustomFieldAnswers](#updatesessioncustomfieldanswers) - Update Custom Field Answers
* [listSessionDocs](#listsessiondocs) - List Session Documents
* [getSessionDoc](#getsessiondoc) - Get Session Document
* [addSessionDoc](#addsessiondoc) - Add Document To Session
* [deleteSessionDocument](#deletesessiondocument) - Delete Document from Session
* [listSessionSpeakers](#listsessionspeakers) - List Session's Speakers
* [addSpeakerToSession](#addspeakertosession) - Assign Speaker to Session
* [removeSpeakerFromSession](#removespeakerfromsession) - Delete Speaker From Session

## getSessionLocation

Gets a paginated list of session locations.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionLocation" method="get" path="/events/{id}/session-locations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSessionLocationRequest;
import com.cvent.models.operations.GetSessionLocationResponse;
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

        GetSessionLocationRequest req = GetSessionLocationRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.sessions().getSessionLocation()
                .callAsStream()
                .forEach((GetSessionLocationResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSessionLocationRequest](../../models/operations/GetSessionLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSessionLocationResponse](../../models/operations/GetSessionLocationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addSessionLocation

Add a session location to the specified event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addSessionLocation" method="post" path="/events/{id}/session-locations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddSessionLocationRequest;
import com.cvent.models.operations.AddSessionLocationResponse;
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

        AddSessionLocationRequest req = AddSessionLocationRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .sessionLocation(SessionLocationInput.builder()
                    .code("ConfA")
                    .name("Conference Room A")
                    .build())
                .build();

        AddSessionLocationResponse res = sdk.sessions().addSessionLocation()
                .request(req)
                .call();

        if (res.sessionLocation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AddSessionLocationRequest](../../models/operations/AddSessionLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AddSessionLocationResponse](../../models/operations/AddSessionLocationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createProgramItem

Create a session program item based on the details provided in the body of the request. A session program item is a specific part of a session's schedule, like a talk, workshop, or panel discussion. Max 25 program items per session.

### Example Usage

<!-- UsageSnippet language="java" operationID="createProgramItem" method="post" path="/program-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateProgramItemResponse;
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

        ProgramItemInput req = ProgramItemInput.builder()
                .event(EventLiteJson1.builder()
                    .id("78842378-5d83-11ee-8c99-0242ac120002")
                    .build())
                .session(SessionLiteJson1.builder()
                    .id("78842aee-5d83-11ee-8c99-0242ac120002")
                    .build())
                .name("Day 1 Program Item.")
                .duration(30L)
                .description("This is a sample description of the day 1 program item.")
                .rteDescription("{\"format\":\"draftjs-nucleus\",\"version\":1,\"content\":{\"blocks\":[{\"key\":\"cubve\",\"text\":\"Program Item Description\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}}")
                .build();

        CreateProgramItemResponse res = sdk.sessions().createProgramItem()
                .request(req)
                .call();

        if (res.programItem().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [ProgramItemInput](../../models/shared/ProgramItemInput.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateProgramItemResponse](../../models/operations/CreateProgramItemResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listProgramItems

Gets a paginated list of session program items.

### Example Usage

<!-- UsageSnippet language="java" operationID="listProgramItems" method="get" path="/program-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListProgramItemsRequest;
import com.cvent.models.operations.ListProgramItemsResponse;
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

        ListProgramItemsRequest req = ListProgramItemsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("session.id in ('04ca6ae2-0dc3-487b-953e-86d6abbdf7d3', '34ca65e2-1dc3-487b-589e-839d8bbdf7d3')")
                .build();


        sdk.sessions().listProgramItems()
                .callAsStream()
                .forEach((ListProgramItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListProgramItemsRequest](../../models/operations/ListProgramItemsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListProgramItemsResponse](../../models/operations/ListProgramItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## filterProgramItemDocuments

Gets a paginated list of session program item documents using a filter in the body of the request.

### Example Usage

<!-- UsageSnippet language="java" operationID="filterProgramItemDocuments" method="post" path="/program-items/docs/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.FilterProgramItemDocumentsRequest;
import com.cvent.models.operations.FilterProgramItemDocumentsResponse;
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

        FilterProgramItemDocumentsRequest req = FilterProgramItemDocumentsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("property eq 'value'")
                    .build())
                .build();


        sdk.sessions().filterProgramItemDocuments()
                .callAsStream()
                .forEach((FilterProgramItemDocumentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [FilterProgramItemDocumentsRequest](../../models/operations/FilterProgramItemDocumentsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[FilterProgramItemDocumentsResponse](../../models/operations/FilterProgramItemDocumentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listProgramItemsPostFilters

Gets a paginated list of session program items by sending a filter in the body of the request. This method will return the same data as <a href="#operation/listProgramItems">GET List Program Items</a> but allows for longer filters.

### Example Usage

<!-- UsageSnippet language="java" operationID="listProgramItemsPostFilters" method="post" path="/program-items/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListProgramItemsPostFiltersRequest;
import com.cvent.models.operations.ListProgramItemsPostFiltersResponse;
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

        ListProgramItemsPostFiltersRequest req = ListProgramItemsPostFiltersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .filter(Filter.builder()
                    .filter("property eq 'value'")
                    .build())
                .build();


        sdk.sessions().listProgramItemsPostFilters()
                .callAsStream()
                .forEach((ListProgramItemsPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListProgramItemsPostFiltersRequest](../../models/operations/ListProgramItemsPostFiltersRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListProgramItemsPostFiltersResponse](../../models/operations/ListProgramItemsPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateProgramItem

Updates the given session program item based on the details provided in the body of the request.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateProgramItem" method="put" path="/program-items/{programItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateProgramItemRequest;
import com.cvent.models.operations.UpdateProgramItemResponse;
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

        UpdateProgramItemRequest req = UpdateProgramItemRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .programItemUpdateRequest(ProgramItemUpdateRequest.builder()
                    .id("38db6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .event(EventLiteJson1.builder()
                        .id("78842378-5d83-11ee-8c99-0242ac120002")
                        .build())
                    .session(SessionLiteJson1.builder()
                        .id("78842aee-5d83-11ee-8c99-0242ac120002")
                        .build())
                    .name("Day 1 Program Item.")
                    .duration(30L)
                    .description("This is a sample description of the day 1 program item.")
                    .rteDescription("{\"format\":\"draftjs-nucleus\",\"version\":1,\"content\":{\"blocks\":[{\"key\":\"cubve\",\"text\":\"Program Item Description\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}}")
                    .build())
                .build();

        UpdateProgramItemResponse res = sdk.sessions().updateProgramItem()
                .request(req)
                .call();

        if (res.programItem().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateProgramItemRequest](../../models/operations/UpdateProgramItemRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateProgramItemResponse](../../models/operations/UpdateProgramItemResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteProgramItem

Delete the given session program item.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteProgramItem" method="delete" path="/program-items/{programItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteProgramItemRequest;
import com.cvent.models.operations.DeleteProgramItemResponse;
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

        DeleteProgramItemRequest req = DeleteProgramItemRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteProgramItemResponse res = sdk.sessions().deleteProgramItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteProgramItemRequest](../../models/operations/DeleteProgramItemRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteProgramItemResponse](../../models/operations/DeleteProgramItemResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## ~~getProgramItemDocuments~~

Returns a list of session documents for the specified program item ID.
**Note:** This endpoint is deprecated. use <a href="#operation/filterProgramItemDocuments">Filter Program Item Documents</a>

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="getProgramItemDocuments" method="get" path="/program-items/{programItemId}/docs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetProgramItemDocumentsRequest;
import com.cvent.models.operations.GetProgramItemDocumentsResponse;
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

        GetProgramItemDocumentsRequest req = GetProgramItemDocumentsRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetProgramItemDocumentsResponse res = sdk.sessions().getProgramItemDocuments()
                .request(req)
                .call();

        if (res.programItemSessionDocuments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetProgramItemDocumentsRequest](../../models/operations/GetProgramItemDocumentsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetProgramItemDocumentsResponse](../../models/operations/GetProgramItemDocumentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## relateProgramItemToSessionDocument

Creates a relationship between a session program item and a session document. Limit 10 session documents per session program item.

### Example Usage

<!-- UsageSnippet language="java" operationID="relateProgramItemToSessionDocument" method="put" path="/program-items/{programItemId}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.RelateProgramItemToSessionDocumentRequest;
import com.cvent.models.operations.RelateProgramItemToSessionDocumentResponse;
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

        RelateProgramItemToSessionDocumentRequest req = RelateProgramItemToSessionDocumentRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        RelateProgramItemToSessionDocumentResponse res = sdk.sessions().relateProgramItemToSessionDocument()
                .request(req)
                .call();

        if (res.programItemSessionDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [RelateProgramItemToSessionDocumentRequest](../../models/operations/RelateProgramItemToSessionDocumentRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[RelateProgramItemToSessionDocumentResponse](../../models/operations/RelateProgramItemToSessionDocumentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getProgramItemSessionDocument

Returns a single program item to session document relationship for the provided IDs.

### Example Usage

<!-- UsageSnippet language="java" operationID="getProgramItemSessionDocument" method="get" path="/program-items/{programItemId}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetProgramItemSessionDocumentRequest;
import com.cvent.models.operations.GetProgramItemSessionDocumentResponse;
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

        GetProgramItemSessionDocumentRequest req = GetProgramItemSessionDocumentRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetProgramItemSessionDocumentResponse res = sdk.sessions().getProgramItemSessionDocument()
                .request(req)
                .call();

        if (res.programItemSessionDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetProgramItemSessionDocumentRequest](../../models/operations/GetProgramItemSessionDocumentRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetProgramItemSessionDocumentResponse](../../models/operations/GetProgramItemSessionDocumentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteProgramItemSessionDocument

Deletes session program item to session document relationship based on the provided IDs.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteProgramItemSessionDocument" method="delete" path="/program-items/{programItemId}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteProgramItemSessionDocumentRequest;
import com.cvent.models.operations.DeleteProgramItemSessionDocumentResponse;
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

        DeleteProgramItemSessionDocumentRequest req = DeleteProgramItemSessionDocumentRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteProgramItemSessionDocumentResponse res = sdk.sessions().deleteProgramItemSessionDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [DeleteProgramItemSessionDocumentRequest](../../models/operations/DeleteProgramItemSessionDocumentRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[DeleteProgramItemSessionDocumentResponse](../../models/operations/DeleteProgramItemSessionDocumentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionsCategories

Gets a paginated list of session categories.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionsCategories" method="get" path="/session-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionsCategoriesRequest;
import com.cvent.models.operations.ListSessionsCategoriesResponse;
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

        ListSessionsCategoriesRequest req = ListSessionsCategoriesRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.sessions().listSessionsCategories()
                .callAsStream()
                .forEach((ListSessionsCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSessionsCategoriesRequest](../../models/operations/ListSessionsCategoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSessionsCategoriesResponse](../../models/operations/ListSessionsCategoriesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createSessionCategory

Create a session category.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createSessionCategory" method="post" path="/session-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateSessionCategoryResponse;
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

        SessionCategoryInput req = SessionCategoryInput.builder()
                .name("Networking")
                .description("During networking sessions, come meet fellow workers in your field.")
                .build();

        CreateSessionCategoryResponse res = sdk.sessions().createSessionCategory()
                .request(req)
                .call();

        if (res.sessionCategory().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [SessionCategoryInput](../../models/shared/SessionCategoryInput.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateSessionCategoryResponse](../../models/operations/CreateSessionCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSessionSegments

Return a list of session and audience segment associations.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="GetSessionSegments" method="get" path="/session-segments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSessionSegmentsRequest;
import com.cvent.models.operations.GetSessionSegmentsResponse;
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

        GetSessionSegmentsRequest req = GetSessionSegmentsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("segment.id in ('04ca6ae2-0dc3-487b-953e-86d6abbdf7d3', '34ca65e2-1dc3-487b-589e-839d8bbdf7d3')")
                .build();


        sdk.sessions().getSessionSegments()
                .callAsStream()
                .forEach((GetSessionSegmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSessionSegmentsRequest](../../models/operations/GetSessionSegmentsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSessionSegmentsResponse](../../models/operations/GetSessionSegmentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessions

Gets a paginated list of sessions.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessions" method="get" path="/sessions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionsRequest;
import com.cvent.models.operations.ListSessionsResponse;
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

        ListSessionsRequest req = ListSessionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("start:DESC,order:ASC,title:ASC")
                .locale("en-US")
                .filter("status eq 'active' or status eq 'closed' or event.id eq 'abc' or customField.{uuid of custom field} in ('abc','def')")
                .build();


        sdk.sessions().listSessions()
                .callAsStream()
                .forEach((ListSessionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListSessionsRequest](../../models/operations/ListSessionsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListSessionsResponse](../../models/operations/ListSessionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createSession

Creates a single session based on the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createSession" method="post" path="/sessions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateSessionResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        SessionInput req = SessionInput.builder()
                .event(UuidJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .title("Day 1 Keynote Session")
                .start(OffsetDateTime.parse("2020-02-03T13:00:00.000Z"))
                .end(OffsetDateTime.parse("2020-02-07T17:00:00.000Z"))
                .status(SessionStatusJson.ACTIVE)
                .code("R5NP4NJYB3D")
                .category(IdNameJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .name("Sample Object name")
                    .build())
                .type(SessionLookup.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .code("MU")
                    .name("Meet up")
                    .build())
                .location(LocationJson2Input.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .description("Keynote session to kick off the event. The dynamic and energetic Dr. Smith will be speaking about the industry.")
                .automaticallyOpensOn(LocalDate.parse("2022-08-01"))
                .automaticallyClosesOn(LocalDate.parse("2022-08-12"))
                .enableWaitlist(false)
                .waitlistCapacity(100L)
                .enableWaitlistVirtual(true)
                .capacity(150L)
                .capacityUnlimited(false)
                .capacityVirtual(150L)
                .virtualCapacityUnlimited(false)
                .waitlistCapacityVirtual(150L)
                .featured(true)
                .group("b0cd3bac-0565-4593-be6e-5333753a6c25")
                .admissionItems(List.of(
                    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3"))
                .openForRegistration(false)
                .openForAttendeeHub(true)
                .registrationTypes(List.of(
                    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3"))
                .presentationType("Power Point")
                .dataTagCode("Optional Session")
                .order(1L)
                .includedSession(true)
                .relevance(2.3)
                .build();

        CreateSessionResponse res = sdk.sessions().createSession()
                .request(req)
                .call();

        if (res.session().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SessionInput](../../models/shared/SessionInput.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateSessionResponse](../../models/operations/CreateSessionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionsPostFilters

Gets a paginated list of sessions by sending a filter in the request's body. This method returns the same data as <a href="#operation/listSessions">GET List Sessions</a> but allows longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionsPostFilters" method="post" path="/sessions/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionsPostFiltersRequest;
import com.cvent.models.operations.ListSessionsPostFiltersResponse;
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

        ListSessionsPostFiltersRequest req = ListSessionsPostFiltersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .filter(Filter.builder()
                    .filter("property eq 'value'")
                    .build())
                .build();


        sdk.sessions().listSessionsPostFilters()
                .callAsStream()
                .forEach((ListSessionsPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListSessionsPostFiltersRequest](../../models/operations/ListSessionsPostFiltersRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListSessionsPostFiltersResponse](../../models/operations/ListSessionsPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSessionById

Gets a single session based on the provided session ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionById" method="get" path="/sessions/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSessionByIdRequest;
import com.cvent.models.operations.GetSessionByIdResponse;
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

        GetSessionByIdRequest req = GetSessionByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSessionByIdResponse res = sdk.sessions().getSessionById()
                .request(req)
                .call();

        if (res.session().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetSessionByIdRequest](../../models/operations/GetSessionByIdRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetSessionByIdResponse](../../models/operations/GetSessionByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateSession

Updates the given session with the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSession" method="put" path="/sessions/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateSessionRequest;
import com.cvent.models.operations.UpdateSessionResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateSessionRequest req = UpdateSessionRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .sessionUpdate(SessionUpdate.builder()
                    .event(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .title("Day 1 Keynote Session")
                    .start(OffsetDateTime.parse("2020-02-03T13:00:00.000Z"))
                    .end(OffsetDateTime.parse("2020-02-07T17:00:00.000Z"))
                    .status(SessionStatusJson.ACTIVE)
                    .code("R5NP4NJYB3D")
                    .category(IdNameJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .name("Sample Object name")
                        .build())
                    .type(SessionUpdateLookup.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .code("MU")
                        .name("Meet up")
                        .build())
                    .location(LocationJson2Input.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .description("Keynote session to kick off the event. The dynamic and energetic Dr. Smith will be speaking about the industry.")
                    .automaticallyOpensOn(LocalDate.parse("2022-08-01"))
                    .automaticallyClosesOn(LocalDate.parse("2022-08-12"))
                    .enableWaitlist(false)
                    .waitlistCapacity(100L)
                    .enableWaitlistVirtual(true)
                    .capacity(150L)
                    .capacityUnlimited(false)
                    .capacityVirtual(150L)
                    .virtualCapacityUnlimited(false)
                    .waitlistCapacityVirtual(150L)
                    .featured(true)
                    .group("b0cd3bac-0565-4593-be6e-5333753a6c25")
                    .admissionItems(List.of(
                        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3"))
                    .openForRegistration(false)
                    .openForAttendeeHub(true)
                    .registrationTypes(List.of(
                        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3"))
                    .presentationType("Power Point")
                    .dataTagCode("Optional Session")
                    .order(1L)
                    .build())
                .build();

        UpdateSessionResponse res = sdk.sessions().updateSession()
                .request(req)
                .call();

        if (res.session().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateSessionRequest](../../models/operations/UpdateSessionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateSessionResponse](../../models/operations/UpdateSessionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSession

Deletes a session based on the given session ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSession" method="delete" path="/sessions/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSessionRequest;
import com.cvent.models.operations.DeleteSessionResponse;
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

        DeleteSessionRequest req = DeleteSessionRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSessionResponse res = sdk.sessions().deleteSession()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeleteSessionRequest](../../models/operations/DeleteSessionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeleteSessionResponse](../../models/operations/DeleteSessionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateSessionCustomFieldAnswers

Updates custom field answers for a single custom field and single session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSessionCustomFieldAnswers" method="put" path="/sessions/{id}/custom-fields/{customFieldId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateSessionCustomFieldAnswersRequest;
import com.cvent.models.operations.UpdateSessionCustomFieldAnswersResponse;
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

        UpdateSessionCustomFieldAnswersRequest req = UpdateSessionCustomFieldAnswersRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customField1(CustomField1Input.builder()
                    .id("5bcc98a1-7899-448a-a52d-4fcaf9af774f")
                    .value(List.of(
                        "Choice C",
                        "Choice A"))
                    .type(CustomField1CustomFieldType.GENERAL)
                    .build())
                .build();

        UpdateSessionCustomFieldAnswersResponse res = sdk.sessions().updateSessionCustomFieldAnswers()
                .request(req)
                .call();

        if (res.customField1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [UpdateSessionCustomFieldAnswersRequest](../../models/operations/UpdateSessionCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[UpdateSessionCustomFieldAnswersResponse](../../models/operations/UpdateSessionCustomFieldAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionDocs

Gets a paginated list of document URLs for a single session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionDocs" method="get" path="/sessions/{id}/docs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionDocsRequest;
import com.cvent.models.operations.ListSessionDocsResponse;
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

        ListSessionDocsRequest req = ListSessionDocsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("file.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.sessions().listSessionDocs()
                .callAsStream()
                .forEach((ListSessionDocsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListSessionDocsRequest](../../models/operations/ListSessionDocsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListSessionDocsResponse](../../models/operations/ListSessionDocsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSessionDoc

Get a specific document that is assigned to a specific session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionDoc" method="get" path="/sessions/{id}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSessionDocRequest;
import com.cvent.models.operations.GetSessionDocResponse;
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

        GetSessionDocRequest req = GetSessionDocRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSessionDocResponse res = sdk.sessions().getSessionDoc()
                .request(req)
                .call();

        if (res.sessionFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSessionDocRequest](../../models/operations/GetSessionDocRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSessionDocResponse](../../models/operations/GetSessionDocResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addSessionDoc

Associates a given document to a session. Documents must be
<a href="#operation/uploadFile">uploaded</a> before you can associate
them.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addSessionDoc" method="put" path="/sessions/{id}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddSessionDocRequest;
import com.cvent.models.operations.AddSessionDocResponse;
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

        AddSessionDocRequest req = AddSessionDocRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AddSessionDocResponse res = sdk.sessions().addSessionDoc()
                .request(req)
                .call();

        if (res.sessionFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AddSessionDocRequest](../../models/operations/AddSessionDocRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[AddSessionDocResponse](../../models/operations/AddSessionDocResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSessionDocument

Disassociates a given document from a session. Document IDs are provided after <a href="#operation/uploadFile">file upload</a>.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSessionDocument" method="delete" path="/sessions/{id}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSessionDocumentRequest;
import com.cvent.models.operations.DeleteSessionDocumentResponse;
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

        DeleteSessionDocumentRequest req = DeleteSessionDocumentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSessionDocumentResponse res = sdk.sessions().deleteSessionDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteSessionDocumentRequest](../../models/operations/DeleteSessionDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteSessionDocumentResponse](../../models/operations/DeleteSessionDocumentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionSpeakers

Get a paginated list of speakers and categories assigned to the provided session ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionSpeakers" method="get" path="/sessions/{id}/speakers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionSpeakersRequest;
import com.cvent.models.operations.ListSessionSpeakersResponse;
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

        ListSessionSpeakersRequest req = ListSessionSpeakersRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.sessions().listSessionSpeakers()
                .callAsStream()
                .forEach((ListSessionSpeakersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListSessionSpeakersRequest](../../models/operations/ListSessionSpeakersRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListSessionSpeakersResponse](../../models/operations/ListSessionSpeakersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addSpeakerToSession

Assign a given speaker to a given session based on their IDs.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addSpeakerToSession" method="put" path="/sessions/{id}/speakers/{speakerId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddSpeakerToSessionRequest;
import com.cvent.models.operations.AddSpeakerToSessionResponse;
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

        AddSpeakerToSessionRequest req = AddSpeakerToSessionRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .speakerId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .sessionSpeakerAssignment(SessionSpeakerAssignment.builder()
                    .speakerCategory(CategoryIdJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .order(1L)
                    .build())
                .build();

        AddSpeakerToSessionResponse res = sdk.sessions().addSpeakerToSession()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AddSpeakerToSessionRequest](../../models/operations/AddSpeakerToSessionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AddSpeakerToSessionResponse](../../models/operations/AddSpeakerToSessionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## removeSpeakerFromSession

Deletes a speaker from a session.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSpeakerFromSession" method="delete" path="/sessions/{id}/speakers/{speakerId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.RemoveSpeakerFromSessionRequest;
import com.cvent.models.operations.RemoveSpeakerFromSessionResponse;
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

        RemoveSpeakerFromSessionRequest req = RemoveSpeakerFromSessionRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .speakerId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        RemoveSpeakerFromSessionResponse res = sdk.sessions().removeSpeakerFromSession()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveSpeakerFromSessionRequest](../../models/operations/RemoveSpeakerFromSessionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveSpeakerFromSessionResponse](../../models/operations/RemoveSpeakerFromSessionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |