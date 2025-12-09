# Speakers

## Overview

Speakers are individuals presenting at your event's session(s). Use Speaker APIs to read existing speaker data, create new speakers or update existing speakers in your events.

### Available Operations

* [getSessionProgramSpeakers](#getsessionprogramspeakers) - Get Session Program Speakers
* [listSessionProgramSpeakersPostFilters](#listsessionprogramspeakerspostfilters) - List Session Program Speakers
* [createSessionProgramSpeaker](#createsessionprogramspeaker) - Add Session Program Speaker
* [getSessionProgramSpeaker](#getsessionprogramspeaker) - Get Session Program Speaker
* [deleteSessionProgramSpeaker](#deletesessionprogramspeaker) - Delete Session Program Speaker
* [listSpeakersCategories](#listspeakerscategories) - List Speakers Categories
* [addSpeakerCategory](#addspeakercategory) - Create Speaker Category
* [listSpeakers](#listspeakers) - List Speakers
* [createSpeaker](#createspeaker) - Create Speaker
* [listSpeakersPostFilter](#listspeakerspostfilter) - List Speakers
* [updateSpeaker](#updatespeaker) - Update Speaker
* [deleteSpeaker](#deletespeaker) - Delete Speaker
* [listSpeakerDocs](#listspeakerdocs) - List Speaker's Documents
* [getSpeakerDoc](#getspeakerdoc) - Get a document for a speaker
* [addSpeakerDoc](#addspeakerdoc) - Add Document To Speaker
* [deleteSpeakerDocument](#deletespeakerdocument) - Delete Document From Speaker
* [deleteSpeakerProfileImage](#deletespeakerprofileimage) - Delete Speaker Profile Picture
* [assignSpeakerProfileImage](#assignspeakerprofileimage) - Assign Speaker Profile Picture
* [listSpeakerSessions](#listspeakersessions) - List Speaker's Sessions

## getSessionProgramSpeakers

Returns a paginated list of session program item and speaker associations.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionProgramSpeakers" method="get" path="/program-items/speakers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSessionProgramSpeakersRequest;
import com.cvent.models.operations.GetSessionProgramSpeakersResponse;
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

        GetSessionProgramSpeakersRequest req = GetSessionProgramSpeakersRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("session.id in ('04ca6ae2-0dc3-487b-953e-86d6abbdf7d3', '34ca65e2-1dc3-487b-589e-839d8bbdf7d3')")
                .build();


        sdk.speakers().getSessionProgramSpeakers()
                .callAsStream()
                .forEach((GetSessionProgramSpeakersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetSessionProgramSpeakersRequest](../../models/operations/GetSessionProgramSpeakersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetSessionProgramSpeakersResponse](../../models/operations/GetSessionProgramSpeakersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionProgramSpeakersPostFilters

Gets a paginated list of session program speaker by providing filters in the body of the request. This method returns the same data as <a href="#operation/getSessionProgramSpeakers">GET Session Program Speakers</a> but allows for longer filters.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionProgramSpeakersPostFilters" method="post" path="/program-items/speakers/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionProgramSpeakersPostFiltersRequest;
import com.cvent.models.operations.ListSessionProgramSpeakersPostFiltersResponse;
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

        ListSessionProgramSpeakersPostFiltersRequest req = ListSessionProgramSpeakersPostFiltersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .filter(Filter.builder()
                    .filter("property eq 'value'")
                    .build())
                .build();


        sdk.speakers().listSessionProgramSpeakersPostFilters()
                .callAsStream()
                .forEach((ListSessionProgramSpeakersPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [ListSessionProgramSpeakersPostFiltersRequest](../../models/operations/ListSessionProgramSpeakersPostFiltersRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |

### Response

**[ListSessionProgramSpeakersPostFiltersResponse](../../models/operations/ListSessionProgramSpeakersPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createSessionProgramSpeaker

Creates a relationship between a session program item and a speaker. Limit 10 speakers per session program item.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSessionProgramSpeaker" method="put" path="/program-items/{programItemId}/speakers/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateSessionProgramSpeakerRequest;
import com.cvent.models.operations.CreateSessionProgramSpeakerResponse;
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

        CreateSessionProgramSpeakerRequest req = CreateSessionProgramSpeakerRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        CreateSessionProgramSpeakerResponse res = sdk.speakers().createSessionProgramSpeaker()
                .request(req)
                .call();

        if (res.speakerProgramItem().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateSessionProgramSpeakerRequest](../../models/operations/CreateSessionProgramSpeakerRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateSessionProgramSpeakerResponse](../../models/operations/CreateSessionProgramSpeakerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSessionProgramSpeaker

Returns a session program speaker relationship.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionProgramSpeaker" method="get" path="/program-items/{programItemId}/speakers/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSessionProgramSpeakerRequest;
import com.cvent.models.operations.GetSessionProgramSpeakerResponse;
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

        GetSessionProgramSpeakerRequest req = GetSessionProgramSpeakerRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSessionProgramSpeakerResponse res = sdk.speakers().getSessionProgramSpeaker()
                .request(req)
                .call();

        if (res.speakerProgramItem().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetSessionProgramSpeakerRequest](../../models/operations/GetSessionProgramSpeakerRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetSessionProgramSpeakerResponse](../../models/operations/GetSessionProgramSpeakerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSessionProgramSpeaker

Deletes session program item to speaker relationship.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSessionProgramSpeaker" method="delete" path="/program-items/{programItemId}/speakers/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSessionProgramSpeakerRequest;
import com.cvent.models.operations.DeleteSessionProgramSpeakerResponse;
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

        DeleteSessionProgramSpeakerRequest req = DeleteSessionProgramSpeakerRequest.builder()
                .programItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSessionProgramSpeakerResponse res = sdk.speakers().deleteSessionProgramSpeaker()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [DeleteSessionProgramSpeakerRequest](../../models/operations/DeleteSessionProgramSpeakerRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[DeleteSessionProgramSpeakerResponse](../../models/operations/DeleteSessionProgramSpeakerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSpeakersCategories

Gets a paginated list of speakers categories.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSpeakersCategories" method="get" path="/speaker-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSpeakersCategoriesRequest;
import com.cvent.models.operations.ListSpeakersCategoriesResponse;
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

        ListSpeakersCategoriesRequest req = ListSpeakersCategoriesRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("active eq 'true'")
                .build();


        sdk.speakers().listSpeakersCategories()
                .callAsStream()
                .forEach((ListSpeakersCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSpeakersCategoriesRequest](../../models/operations/ListSpeakersCategoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSpeakersCategoriesResponse](../../models/operations/ListSpeakersCategoriesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addSpeakerCategory

Create a new speaker category

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addSpeakerCategory" method="post" path="/speaker-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddSpeakerCategoryResponse;
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

        SpeakerCategory req = SpeakerCategory.builder()
                .name("Presenters")
                .build();

        AddSpeakerCategoryResponse res = sdk.speakers().addSpeakerCategory()
                .request(req)
                .call();

        if (res.existingSpeakerCategory().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [SpeakerCategory](../../models/shared/SpeakerCategory.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[AddSpeakerCategoryResponse](../../models/operations/AddSpeakerCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSpeakers

Gets a paginated list of speakers.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSpeakers" method="get" path="/speakers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSpeakersRequest;
import com.cvent.models.operations.ListSpeakersResponse;
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

        ListSpeakersRequest req = ListSpeakersRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("lastName:DESC,company:ASC")
                .locale("en-US")
                .filter("event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.speakers().listSpeakers()
                .callAsStream()
                .forEach((ListSpeakersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListSpeakersRequest](../../models/operations/ListSpeakersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListSpeakersResponse](../../models/operations/ListSpeakersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createSpeaker

Create a single speaker based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createSpeaker" method="post" path="/speakers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateSpeakerResponse;
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

        Speaker req = Speaker.builder()
                .event(SpeakerEvent.builder()
                    .build())
                .firstName("Barbra")
                .lastName("Smith")
                .code("sbarbra")
                .email("barbrasmith@cvent.com")
                .prefix("Dr.")
                .designation("PhD")
                .company("Cvent")
                .title("Lead Engineer")
                .category(CategoryIdNameJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .name("Presenters")
                    .build())
                .links(ContactLinksJsonInput.builder()
                    .twitterUrl(LinkJson.builder()
                        .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                        .build())
                    .facebookUrl(LinkJson.builder()
                        .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                        .build())
                    .linkedInUrl(LinkJson.builder()
                        .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                        .build())
                    .build())
                .visibility(false)
                .biography("Presentation and Speaking voice expert, Barbara is a highly regarded coach and facilitator")
                .internalNote("Barbara is multilingual")
                .relevance(2.3)
                .build();

        CreateSpeakerResponse res = sdk.speakers().createSpeaker()
                .request(req)
                .call();

        if (res.existingSpeaker().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Speaker](../../models/shared/Speaker.md)  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[CreateSpeakerResponse](../../models/operations/CreateSpeakerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSpeakersPostFilter

Get a paginated list of speakers by sending a filter in the body of the request. This method will return the same data as GET List Speakers but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSpeakersPostFilter" method="post" path="/speakers/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSpeakersPostFilterRequest;
import com.cvent.models.operations.ListSpeakersPostFilterResponse;
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

        ListSpeakersPostFilterRequest req = ListSpeakersPostFilterRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("lastName:DESC,company:ASC")
                .locale("en-US")
                .filter(Filter.builder()
                    .filter("id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'")
                    .build())
                .build();


        sdk.speakers().listSpeakersPostFilter()
                .callAsStream()
                .forEach((ListSpeakersPostFilterResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSpeakersPostFilterRequest](../../models/operations/ListSpeakersPostFilterRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSpeakersPostFilterResponse](../../models/operations/ListSpeakersPostFilterResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateSpeaker

Updates a particular speaker based on the given speaker ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSpeaker" method="put" path="/speakers/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateSpeakerRequest;
import com.cvent.models.operations.UpdateSpeakerResponse;
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

        UpdateSpeakerRequest req = UpdateSpeakerRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .existingSpeaker(ExistingSpeakerInput.builder()
                    .event(ExistingSpeakerEvent.builder()
                        .build())
                    .firstName("Barbra")
                    .lastName("Smith")
                    .code("sbarbra")
                    .email("barbrasmith@cvent.com")
                    .prefix("Dr.")
                    .designation("PhD")
                    .company("Cvent")
                    .title("Lead Engineer")
                    .category(CategoryIdNameJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .name("Presenters")
                        .build())
                    .links(ContactLinksJsonInput.builder()
                        .twitterUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .facebookUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .linkedInUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .build())
                    .visibility(false)
                    .biography("Presentation and Speaking voice expert, Barbara is a highly regarded coach and facilitator")
                    .internalNote("Barbara is multilingual")
                    .relevance(2.3)
                    .build())
                .build();

        UpdateSpeakerResponse res = sdk.speakers().updateSpeaker()
                .request(req)
                .call();

        if (res.existingSpeaker().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateSpeakerRequest](../../models/operations/UpdateSpeakerRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateSpeakerResponse](../../models/operations/UpdateSpeakerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSpeaker

Deletes a particular speaker based on the given speaker ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSpeaker" method="delete" path="/speakers/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSpeakerRequest;
import com.cvent.models.operations.DeleteSpeakerResponse;
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

        DeleteSpeakerRequest req = DeleteSpeakerRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSpeakerResponse res = sdk.speakers().deleteSpeaker()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeleteSpeakerRequest](../../models/operations/DeleteSpeakerRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeleteSpeakerResponse](../../models/operations/DeleteSpeakerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSpeakerDocs

Gets a paginated list of document URLs for a single speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSpeakerDocs" method="get" path="/speakers/{id}/docs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSpeakerDocsRequest;
import com.cvent.models.operations.ListSpeakerDocsResponse;
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

        ListSpeakerDocsRequest req = ListSpeakerDocsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("file.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.speakers().listSpeakerDocs()
                .callAsStream()
                .forEach((ListSpeakerDocsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListSpeakerDocsRequest](../../models/operations/ListSpeakerDocsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListSpeakerDocsResponse](../../models/operations/ListSpeakerDocsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSpeakerDoc

Get a specific document that is assigned to a specific speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSpeakerDoc" method="get" path="/speakers/{id}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSpeakerDocRequest;
import com.cvent.models.operations.GetSpeakerDocResponse;
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

        GetSpeakerDocRequest req = GetSpeakerDocRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSpeakerDocResponse res = sdk.speakers().getSpeakerDoc()
                .request(req)
                .call();

        if (res.speakerFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSpeakerDocRequest](../../models/operations/GetSpeakerDocRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSpeakerDocResponse](../../models/operations/GetSpeakerDocResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addSpeakerDoc

Add a single document to a speaker with a UUID provided by <a href="#operation/uploadFile">file upload</a>.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addSpeakerDoc" method="put" path="/speakers/{id}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddSpeakerDocRequest;
import com.cvent.models.operations.AddSpeakerDocResponse;
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

        AddSpeakerDocRequest req = AddSpeakerDocRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AddSpeakerDocResponse res = sdk.speakers().addSpeakerDoc()
                .request(req)
                .call();

        if (res.speakerFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AddSpeakerDocRequest](../../models/operations/AddSpeakerDocRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[AddSpeakerDocResponse](../../models/operations/AddSpeakerDocResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSpeakerDocument

Use to delete a document from a speaker with a UUID provided by <a href="#operation/uploadFile">file upload</a>.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSpeakerDocument" method="delete" path="/speakers/{id}/docs/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSpeakerDocumentRequest;
import com.cvent.models.operations.DeleteSpeakerDocumentResponse;
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

        DeleteSpeakerDocumentRequest req = DeleteSpeakerDocumentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSpeakerDocumentResponse res = sdk.speakers().deleteSpeakerDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteSpeakerDocumentRequest](../../models/operations/DeleteSpeakerDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteSpeakerDocumentResponse](../../models/operations/DeleteSpeakerDocumentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSpeakerProfileImage

Deletes the profile picture of the given speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSpeakerProfileImage" method="delete" path="/speakers/{id}/profile-images" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSpeakerProfileImageRequest;
import com.cvent.models.operations.DeleteSpeakerProfileImageResponse;
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

        DeleteSpeakerProfileImageRequest req = DeleteSpeakerProfileImageRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSpeakerProfileImageResponse res = sdk.speakers().deleteSpeakerProfileImage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DeleteSpeakerProfileImageRequest](../../models/operations/DeleteSpeakerProfileImageRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DeleteSpeakerProfileImageResponse](../../models/operations/DeleteSpeakerProfileImageResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## assignSpeakerProfileImage

Assign a profile picture to a speaker with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current profile picture if one is assigned.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="assignSpeakerProfileImage" method="put" path="/speakers/{id}/profile-images" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AssignSpeakerProfileImageRequest;
import com.cvent.models.operations.AssignSpeakerProfileImageResponse;
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

        AssignSpeakerProfileImageRequest req = AssignSpeakerProfileImageRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .speakerFile(SpeakerFileInput.builder()
                    .file(SpeakerFileFile.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .build())
                .build();

        AssignSpeakerProfileImageResponse res = sdk.speakers().assignSpeakerProfileImage()
                .request(req)
                .call();

        if (res.speakerFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AssignSpeakerProfileImageRequest](../../models/operations/AssignSpeakerProfileImageRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AssignSpeakerProfileImageResponse](../../models/operations/AssignSpeakerProfileImageResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSpeakerSessions

Gets a paginated list of sessions assigned to a speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSpeakerSessions" method="get" path="/speakers/{id}/sessions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSpeakerSessionsRequest;
import com.cvent.models.operations.ListSpeakerSessionsResponse;
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

        ListSpeakerSessionsRequest req = ListSpeakerSessionsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.speakers().listSpeakerSessions()
                .callAsStream()
                .forEach((ListSpeakerSessionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListSpeakerSessionsRequest](../../models/operations/ListSpeakerSessionsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListSpeakerSessionsResponse](../../models/operations/ListSpeakerSessionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |