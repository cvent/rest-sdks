# Exhibitor

## Overview

* **Exhibitor -** An exhibitor is an organization that is sponsoring or exhibiting at your event. This API allows you to get information about your exhibitors.

* **Registration Pack -** Registration Pack provides capacities of different registration types allocated by the planner to a specific exhibitor.

* **Exhibitor Questions -** Set of questions for an exhibitor.

* **Exhibitor Answers -** Set of answers to exhibitor questions for an exhibitor.

* **Exhibitor Categories -** Set of exhibitor categories for an event. Exhibitor Categories are used in Attendee Hub and Event App to differentiate exhibitors.

* **Sponsorship Levels -** Sponsorship levels are defined by the planner. Use this API to get details of existing sponsorship levels defined within the event. To assign sponsorship levels to exhibitors, use the Exhibitor endpoints.


### Available Operations

* [getExhibitorCategories](#getexhibitorcategories) - List Exhibitor Categories
* [createExhibitorCategory](#createexhibitorcategory) - Create Exhibitor Category
* [updateExhibitorCategory](#updateexhibitorcategory) - Update Exhibitor Category
* [deleteExhibitorCategory](#deleteexhibitorcategory) - Delete Exhibitor Category
* [updateExhibitorCategoryBanner](#updateexhibitorcategorybanner) - Assign Banner to Category
* [deleteExhibitorCategoryImage](#deleteexhibitorcategoryimage) - Delete Banner from Category
* [listExhibitors](#listexhibitors) - List Category's Exhibitors
* [addExhibitorToExhibitorCategory](#addexhibitortoexhibitorcategory) - Assign Exhibitor to Category
* [removeExhibitorFromExhibitorCategory](#removeexhibitorfromexhibitorcategory) - Delete Exhibitor from Category
* [getExhibitorQuestions](#getexhibitorquestions) - List Exhibitor Questions
* [getExhibitors](#getexhibitors) - List Exhibitors
* [createExhibitor](#createexhibitor) - Create Exhibitor
* [getExhibitor](#getexhibitor) - Get Exhibitor
* [updateExhibitor](#updateexhibitor) - Update Exhibitor
* [deleteExhibitor](#deleteexhibitor) - Delete Exhibitor
* [updateExhibitorBanner](#updateexhibitorbanner) - Assign Exhibitor Banner Image
* [deleteExhibitorBanner](#deleteexhibitorbanner) - Delete Exhibitor Banner Image
* [getExhibitorAnswers](#getexhibitoranswers) - List Exhibitor Answers
* [updateExhibitorAnswers](#updateexhibitoranswers) - Update Exhibitor Answers
* [listExhibitorCategories](#listexhibitorcategories) - List Exhibitor's Categories
* [updateExhibitorLogo](#updateexhibitorlogo) - Assign Exhibitor Logo Image
* [deleteExhibitorLogo](#deleteexhibitorlogo) - Delete Exhibitor Logo Image
* [getLeadQualificationQuestions](#getleadqualificationquestions) - List Qualification Questions
* [postRegistrationPack](#postregistrationpack) - Create Registration Pack
* [getExhibitorRegistrationPacks](#getexhibitorregistrationpacks) - List Registration Packs
* [getRegistrationPack](#getregistrationpack) - Get Registration Pack
* [updateRegistrationPack](#updateregistrationpack) - Update Registration Pack
* [deleteRegistrationPack](#deleteregistrationpack) - Delete Registration Pack
* [getSponsorshipLevels](#getsponsorshiplevels) - List Sponsorship Levels
* [getSponsorshipLevel](#getsponsorshiplevel) - Get Sponsorship Level

## getExhibitorCategories

Retrieves a paginated list of exhibitor categories associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorCategories" method="get" path="/events/{id}/exhibitor-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorCategoriesRequest;
import com.cvent.models.operations.GetExhibitorCategoriesResponse;
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

        GetExhibitorCategoriesRequest req = GetExhibitorCategoriesRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.exhibitor().getExhibitorCategories()
                .callAsStream()
                .forEach((GetExhibitorCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetExhibitorCategoriesRequest](../../models/operations/GetExhibitorCategoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetExhibitorCategoriesResponse](../../models/operations/GetExhibitorCategoriesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createExhibitorCategory

Creates a single exhibitor category entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createExhibitorCategory" method="post" path="/events/{id}/exhibitor-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateExhibitorCategoryRequest;
import com.cvent.models.operations.CreateExhibitorCategoryResponse;
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

        CreateExhibitorCategoryRequest req = CreateExhibitorCategoryRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryRequest(ExhibitorCategoryRequest.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .name("Automobile")
                    .order(3L)
                    .type(ExhibitorCategoryRequestType.LOGO)
                    .description("everything related to automobiles")
                    .build())
                .build();

        CreateExhibitorCategoryResponse res = sdk.exhibitor().createExhibitorCategory()
                .request(req)
                .call();

        if (res.exhibitorCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateExhibitorCategoryRequest](../../models/operations/CreateExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateExhibitorCategoryResponse](../../models/operations/CreateExhibitorCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorCategory

Updates data for a single exhibitor category entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorCategory" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorCategoryRequest;
import com.cvent.models.operations.UpdateExhibitorCategoryResponse;
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

        UpdateExhibitorCategoryRequest req = UpdateExhibitorCategoryRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .exhibitorCategoryRequest(ExhibitorCategoryRequest.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .name("Automobile")
                    .order(3L)
                    .type(ExhibitorCategoryRequestType.LOGO)
                    .description("everything related to automobiles")
                    .build())
                .build();

        UpdateExhibitorCategoryResponse res = sdk.exhibitor().updateExhibitorCategory()
                .request(req)
                .call();

        if (res.exhibitorCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateExhibitorCategoryRequest](../../models/operations/UpdateExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateExhibitorCategoryResponse](../../models/operations/UpdateExhibitorCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteExhibitorCategory

Deletes a single exhibitor Category entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExhibitorCategory" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExhibitorCategoryRequest;
import com.cvent.models.operations.DeleteExhibitorCategoryResponse;
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

        DeleteExhibitorCategoryRequest req = DeleteExhibitorCategoryRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .build();

        DeleteExhibitorCategoryResponse res = sdk.exhibitor().deleteExhibitorCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [DeleteExhibitorCategoryRequest](../../models/operations/DeleteExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[DeleteExhibitorCategoryResponse](../../models/operations/DeleteExhibitorCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorCategoryBanner

Assign a banner image to an exhibitor category with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current banner image if one is assigned.

**Note:** For category banner images we recommend images that are 900x300 pixels and 5MiB or smaller. File types supported are : JPEG, JPG, PNG, GIF.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorCategoryBanner" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/banner-files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorCategoryBannerRequest;
import com.cvent.models.operations.UpdateExhibitorCategoryBannerResponse;
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

        UpdateExhibitorCategoryBannerRequest req = UpdateExhibitorCategoryBannerRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        UpdateExhibitorCategoryBannerResponse res = sdk.exhibitor().updateExhibitorCategoryBanner()
                .request(req)
                .call();

        if (res.exhibitorCategoryBannerFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateExhibitorCategoryBannerRequest](../../models/operations/UpdateExhibitorCategoryBannerRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateExhibitorCategoryBannerResponse](../../models/operations/UpdateExhibitorCategoryBannerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteExhibitorCategoryImage

Deletes an exhibitor Category banner image.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExhibitorCategoryImage" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/banner-files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExhibitorCategoryImageRequest;
import com.cvent.models.operations.DeleteExhibitorCategoryImageResponse;
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

        DeleteExhibitorCategoryImageRequest req = DeleteExhibitorCategoryImageRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteExhibitorCategoryImageResponse res = sdk.exhibitor().deleteExhibitorCategoryImage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [DeleteExhibitorCategoryImageRequest](../../models/operations/DeleteExhibitorCategoryImageRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[DeleteExhibitorCategoryImageResponse](../../models/operations/DeleteExhibitorCategoryImageResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listExhibitors

Get a paginated list of exhibitors assigned to the provided exhibitor-category Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listExhibitors" method="get" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListExhibitorsRequest;
import com.cvent.models.operations.ListExhibitorsResponse;
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

        ListExhibitorsRequest req = ListExhibitorsRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.exhibitor().listExhibitors()
                .callAsStream()
                .forEach((ListExhibitorsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListExhibitorsRequest](../../models/operations/ListExhibitorsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListExhibitorsResponse](../../models/operations/ListExhibitorsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## addExhibitorToExhibitorCategory

Assign an exhibitor ID to an exhibitor-category Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="addExhibitorToExhibitorCategory" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors/{exhibitorId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AddExhibitorToExhibitorCategoryRequest;
import com.cvent.models.operations.AddExhibitorToExhibitorCategoryResponse;
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

        AddExhibitorToExhibitorCategoryRequest req = AddExhibitorToExhibitorCategoryRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        AddExhibitorToExhibitorCategoryResponse res = sdk.exhibitor().addExhibitorToExhibitorCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AddExhibitorToExhibitorCategoryRequest](../../models/operations/AddExhibitorToExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AddExhibitorToExhibitorCategoryResponse](../../models/operations/AddExhibitorToExhibitorCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## removeExhibitorFromExhibitorCategory

delete an exhibitor from an exhibitor-category

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="removeExhibitorFromExhibitorCategory" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors/{exhibitorId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.RemoveExhibitorFromExhibitorCategoryRequest;
import com.cvent.models.operations.RemoveExhibitorFromExhibitorCategoryResponse;
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

        RemoveExhibitorFromExhibitorCategoryRequest req = RemoveExhibitorFromExhibitorCategoryRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorCategoryId("534a465b-b4cb-471d-9498-4bf3917ad8bf")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        RemoveExhibitorFromExhibitorCategoryResponse res = sdk.exhibitor().removeExhibitorFromExhibitorCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [RemoveExhibitorFromExhibitorCategoryRequest](../../models/operations/RemoveExhibitorFromExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[RemoveExhibitorFromExhibitorCategoryResponse](../../models/operations/RemoveExhibitorFromExhibitorCategoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getExhibitorQuestions

Gets a list of exhibitor questions for a given event id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorQuestions" method="get" path="/events/{id}/exhibitor-questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorQuestionsRequest;
import com.cvent.models.operations.GetExhibitorQuestionsResponse;
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

        GetExhibitorQuestionsRequest req = GetExhibitorQuestionsRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .build();

        GetExhibitorQuestionsResponse res = sdk.exhibitor().getExhibitorQuestions()
                .request(req)
                .call();

        if (res.exhibitorQuestionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetExhibitorQuestionsRequest](../../models/operations/GetExhibitorQuestionsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetExhibitorQuestionsResponse](../../models/operations/GetExhibitorQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getExhibitors

Retrieves a paginated list of exhibitors associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitors" method="get" path="/events/{id}/exhibitors" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorsRequest;
import com.cvent.models.operations.GetExhibitorsResponse;
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

        GetExhibitorsRequest req = GetExhibitorsRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("id in ('{UUID}', '{UUID}') AND deleted eq 'true' AND hidden eq 'true'")
                .build();


        sdk.exhibitor().getExhibitors()
                .callAsStream()
                .forEach((GetExhibitorsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetExhibitorsRequest](../../models/operations/GetExhibitorsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetExhibitorsResponse](../../models/operations/GetExhibitorsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createExhibitor

Creates a single exhibitor entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createExhibitor" method="post" path="/events/{id}/exhibitors" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateExhibitorRequest;
import com.cvent.models.operations.CreateExhibitorResponse;
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

        CreateExhibitorRequest req = CreateExhibitorRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorRequest(ExhibitorRequest.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .name("Potterfield Harry")
                    .description("A man who sells relatively good hotdogs")
                    .code("abc123")
                    .sourceId("software")
                    .location("Taj Mahal")
                    .address(ExhibitorAddressJson.builder()
                        .address1("Cvent Inc.")
                        .address2("4001 West Parmer Lane")
                        .city("Austin")
                        .region("Texas")
                        .postalCode("78727")
                        .country("United States of America")
                        .build())
                    .email("h.potterfield@test.com")
                    .mobilePhone("555-555-5555")
                    .workPhone("555-555-5555")
                    .otherPhone("555-555-5555")
                    .website("www.superhappyfuntime.com")
                    .contactLinks(ContactLinksJson2.builder()
                        .twitterUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .facebookUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .linkedInUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .instagramUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .build())
                    .sponsorshipLevel(SponsorshipLevelJson.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .build())
                .build();

        CreateExhibitorResponse res = sdk.exhibitor().createExhibitor()
                .request(req)
                .call();

        if (res.exhibitorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateExhibitorRequest](../../models/operations/CreateExhibitorRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateExhibitorResponse](../../models/operations/CreateExhibitorResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getExhibitor

Retrieves a single exhibitor entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitor" method="get" path="/events/{id}/exhibitors/{exhibitorId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorRequest;
import com.cvent.models.operations.GetExhibitorResponse;
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

        GetExhibitorRequest req = GetExhibitorRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        GetExhibitorResponse res = sdk.exhibitor().getExhibitor()
                .request(req)
                .call();

        if (res.exhibitorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetExhibitorRequest](../../models/operations/GetExhibitorRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetExhibitorResponse](../../models/operations/GetExhibitorResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitor

Updates data for a single exhibitor entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitor" method="put" path="/events/{id}/exhibitors/{exhibitorId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorRequest;
import com.cvent.models.operations.UpdateExhibitorResponse;
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

        UpdateExhibitorRequest req = UpdateExhibitorRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .exhibitorRequest(ExhibitorRequest.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .name("Potterfield Harry")
                    .description("A man who sells relatively good hotdogs")
                    .code("abc123")
                    .sourceId("software")
                    .location("Taj Mahal")
                    .address(ExhibitorAddressJson.builder()
                        .address1("Cvent Inc.")
                        .address2("4001 West Parmer Lane")
                        .city("Austin")
                        .region("Texas")
                        .postalCode("78727")
                        .country("United States of America")
                        .build())
                    .email("h.potterfield@test.com")
                    .mobilePhone("555-555-5555")
                    .workPhone("555-555-5555")
                    .otherPhone("555-555-5555")
                    .website("www.superhappyfuntime.com")
                    .contactLinks(ContactLinksJson2.builder()
                        .twitterUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .facebookUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .linkedInUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .instagramUrl(LinkJson.builder()
                            .href("?token=90c5f062-76ad-4ea4-aa53-00eb698d9262")
                            .build())
                        .build())
                    .sponsorshipLevel(SponsorshipLevelJson.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .build())
                .build();

        UpdateExhibitorResponse res = sdk.exhibitor().updateExhibitor()
                .request(req)
                .call();

        if (res.exhibitorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateExhibitorRequest](../../models/operations/UpdateExhibitorRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateExhibitorResponse](../../models/operations/UpdateExhibitorResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteExhibitor

Deletes a single exhibitor entity. To be deleted, exhibitors must have no tasks, registrations, or LeadCapture licenses assigned and must not be a sponsored or featured exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExhibitor" method="delete" path="/events/{id}/exhibitors/{exhibitorId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExhibitorRequest;
import com.cvent.models.operations.DeleteExhibitorResponse;
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

        DeleteExhibitorRequest req = DeleteExhibitorRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        DeleteExhibitorResponse res = sdk.exhibitor().deleteExhibitor()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [DeleteExhibitorRequest](../../models/operations/DeleteExhibitorRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[DeleteExhibitorResponse](../../models/operations/DeleteExhibitorResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorBanner

Assign a banner image to an exhibitor with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current banner image if one is assigned.

**Note:** For exhibitor profile banner images, we recommend images that are 1872x320 pixels or smaller images that have an aspect ratio of 5.85:1. File extensions supported: JPEG, JPG, PNG, GIF


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorBanner" method="put" path="/events/{id}/exhibitors/{exhibitorId}/banner-files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorBannerRequest;
import com.cvent.models.operations.UpdateExhibitorBannerResponse;
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

        UpdateExhibitorBannerRequest req = UpdateExhibitorBannerRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        UpdateExhibitorBannerResponse res = sdk.exhibitor().updateExhibitorBanner()
                .request(req)
                .call();

        if (res.exhibitorBannerLogoFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateExhibitorBannerRequest](../../models/operations/UpdateExhibitorBannerRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateExhibitorBannerResponse](../../models/operations/UpdateExhibitorBannerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteExhibitorBanner

Deletes exhibitor banner image data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExhibitorBanner" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/banner-files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExhibitorBannerRequest;
import com.cvent.models.operations.DeleteExhibitorBannerResponse;
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

        DeleteExhibitorBannerRequest req = DeleteExhibitorBannerRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteExhibitorBannerResponse res = sdk.exhibitor().deleteExhibitorBanner()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteExhibitorBannerRequest](../../models/operations/DeleteExhibitorBannerRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteExhibitorBannerResponse](../../models/operations/DeleteExhibitorBannerResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getExhibitorAnswers

Gets a list of answers to exhibitor questions for a given exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorAnswers" method="get" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorAnswersRequest;
import com.cvent.models.operations.GetExhibitorAnswersResponse;
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

        GetExhibitorAnswersRequest req = GetExhibitorAnswersRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        GetExhibitorAnswersResponse res = sdk.exhibitor().getExhibitorAnswers()
                .request(req)
                .call();

        if (res.exhibitorAnswersResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetExhibitorAnswersRequest](../../models/operations/GetExhibitorAnswersRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetExhibitorAnswersResponse](../../models/operations/GetExhibitorAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorAnswers

Updates answers to exhibitor questions for a given exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorAnswers" method="put" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorAnswersRequest;
import com.cvent.models.operations.UpdateExhibitorAnswersResponse;
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

        UpdateExhibitorAnswersRequest req = UpdateExhibitorAnswersRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .exhibitorAnswersRequest(ExhibitorAnswersRequest.builder()
                    .data(List.of(
                        ExistingExhibitorAnswerJsonInput.builder()
                            .question(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .event(EventJson5.builder()
                                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                                .build())
                            .exhibitor(ExhibitorJson.builder()
                                .id("4888db54-db22-11eb-8d19-0242ac130003")
                                .build())
                            .answers(List.of(
                                AnswerJson0.builder()
                                    .type(AnswerTypeJson0.CHOICE)
                                    .value("Choice A")
                                    .build()))
                            .build()))
                    .build())
                .build();

        UpdateExhibitorAnswersResponse res = sdk.exhibitor().updateExhibitorAnswers()
                .request(req)
                .call();

        if (res.exhibitorAnswersResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateExhibitorAnswersRequest](../../models/operations/UpdateExhibitorAnswersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateExhibitorAnswersResponse](../../models/operations/UpdateExhibitorAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listExhibitorCategories

Get a paginated list of exhibitor-categories assigned to the provided exhibitor Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listExhibitorCategories" method="get" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-categories" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListExhibitorCategoriesRequest;
import com.cvent.models.operations.ListExhibitorCategoriesResponse;
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

        ListExhibitorCategoriesRequest req = ListExhibitorCategoriesRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.exhibitor().listExhibitorCategories()
                .callAsStream()
                .forEach((ListExhibitorCategoriesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListExhibitorCategoriesRequest](../../models/operations/ListExhibitorCategoriesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListExhibitorCategoriesResponse](../../models/operations/ListExhibitorCategoriesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorLogo

Assign a logo image to an exhibitor with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current logo image if one is assigned.

**Note:**  For exhibitor profile logo images we recommend square images larger than 300x300 pixels. The file types supported are : JPEG, JPG, PNG, GIF


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorLogo" method="put" path="/events/{id}/exhibitors/{exhibitorId}/logo-files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorLogoRequest;
import com.cvent.models.operations.UpdateExhibitorLogoResponse;
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

        UpdateExhibitorLogoRequest req = UpdateExhibitorLogoRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        UpdateExhibitorLogoResponse res = sdk.exhibitor().updateExhibitorLogo()
                .request(req)
                .call();

        if (res.exhibitorBannerLogoFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateExhibitorLogoRequest](../../models/operations/UpdateExhibitorLogoRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateExhibitorLogoResponse](../../models/operations/UpdateExhibitorLogoResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteExhibitorLogo

Deletes exhibitor logo image data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExhibitorLogo" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/logo-files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExhibitorLogoRequest;
import com.cvent.models.operations.DeleteExhibitorLogoResponse;
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

        DeleteExhibitorLogoRequest req = DeleteExhibitorLogoRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteExhibitorLogoResponse res = sdk.exhibitor().deleteExhibitorLogo()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeleteExhibitorLogoRequest](../../models/operations/DeleteExhibitorLogoRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeleteExhibitorLogoResponse](../../models/operations/DeleteExhibitorLogoResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getLeadQualificationQuestions

Retrieves a list of lead qualification questions associated with a single exhibitor at the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getLeadQualificationQuestions" method="get" path="/events/{id}/exhibitors/{exhibitorId}/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetLeadQualificationQuestionsRequest;
import com.cvent.models.operations.GetLeadQualificationQuestionsResponse;
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

        GetLeadQualificationQuestionsRequest req = GetLeadQualificationQuestionsRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        GetLeadQualificationQuestionsResponse res = sdk.exhibitor().getLeadQualificationQuestions()
                .request(req)
                .call();

        if (res.leadQualificationQuestionsListResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetLeadQualificationQuestionsRequest](../../models/operations/GetLeadQualificationQuestionsRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetLeadQualificationQuestionsResponse](../../models/operations/GetLeadQualificationQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## postRegistrationPack

Create registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="postRegistrationPack" method="post" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PostRegistrationPackRequest;
import com.cvent.models.operations.PostRegistrationPackResponse;
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

        PostRegistrationPackRequest req = PostRegistrationPackRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .registrationPackRequest(RegistrationPackRequest.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .capacities(List.of(
                        CapacityJson.builder()
                            .registrationType(CapacityJsonRegistrationType.builder()
                                .id("923d5629-3cac-40c2-8237-34937dd93475")
                                .build())
                            .reservedCapacity(5L)
                            .build()))
                    .build())
                .build();

        PostRegistrationPackResponse res = sdk.exhibitor().postRegistrationPack()
                .request(req)
                .call();

        if (res.registrationPackResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PostRegistrationPackRequest](../../models/operations/PostRegistrationPackRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PostRegistrationPackResponse](../../models/operations/PostRegistrationPackResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 409, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## getExhibitorRegistrationPacks

Retrieves registration packs associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorRegistrationPacks" method="get" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorRegistrationPacksRequest;
import com.cvent.models.operations.GetExhibitorRegistrationPacksResponse;
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

        GetExhibitorRegistrationPacksRequest req = GetExhibitorRegistrationPacksRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        GetExhibitorRegistrationPacksResponse res = sdk.exhibitor().getExhibitorRegistrationPacks()
                .request(req)
                .call();

        if (res.exhibitorRegistrationPackListResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetExhibitorRegistrationPacksRequest](../../models/operations/GetExhibitorRegistrationPacksRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetExhibitorRegistrationPacksResponse](../../models/operations/GetExhibitorRegistrationPacksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getRegistrationPack

Retrieves registration types allocated to an exhibitor, along with the count of registrations utilized.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getRegistrationPack" method="get" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetRegistrationPackRequest;
import com.cvent.models.operations.GetRegistrationPackResponse;
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

        GetRegistrationPackRequest req = GetRegistrationPackRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .registrationPackId("50f4f0df-0c2d-4e6b-8e68-e1413b6917f5")
                .build();

        GetRegistrationPackResponse res = sdk.exhibitor().getRegistrationPack()
                .request(req)
                .call();

        if (res.registrationPackResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetRegistrationPackRequest](../../models/operations/GetRegistrationPackRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetRegistrationPackResponse](../../models/operations/GetRegistrationPackResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateRegistrationPack

Update registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRegistrationPack" method="put" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateRegistrationPackRequest;
import com.cvent.models.operations.UpdateRegistrationPackResponse;
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

        UpdateRegistrationPackRequest req = UpdateRegistrationPackRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .registrationPackId("50f4f0df-0c2d-4e6b-8e68-e1413b6917f5")
                .registrationPackRequest(RegistrationPackRequest.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .capacities(List.of(
                        CapacityJson.builder()
                            .registrationType(CapacityJsonRegistrationType.builder()
                                .id("923d5629-3cac-40c2-8237-34937dd93475")
                                .build())
                            .reservedCapacity(5L)
                            .build()))
                    .build())
                .build();

        UpdateRegistrationPackResponse res = sdk.exhibitor().updateRegistrationPack()
                .request(req)
                .call();

        if (res.registrationPackResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateRegistrationPackRequest](../../models/operations/UpdateRegistrationPackRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateRegistrationPackResponse](../../models/operations/UpdateRegistrationPackResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteRegistrationPack

Delete registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRegistrationPack" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteRegistrationPackRequest;
import com.cvent.models.operations.DeleteRegistrationPackResponse;
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

        DeleteRegistrationPackRequest req = DeleteRegistrationPackRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .registrationPackId("50f4f0df-0c2d-4e6b-8e68-e1413b6917f5")
                .build();

        DeleteRegistrationPackResponse res = sdk.exhibitor().deleteRegistrationPack()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteRegistrationPackRequest](../../models/operations/DeleteRegistrationPackRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteRegistrationPackResponse](../../models/operations/DeleteRegistrationPackResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSponsorshipLevels

Gets a list of associated sponsorship levels for a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSponsorshipLevels" method="get" path="/events/{id}/sponsorship-levels" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSponsorshipLevelsRequest;
import com.cvent.models.operations.GetSponsorshipLevelsResponse;
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

        GetSponsorshipLevelsRequest req = GetSponsorshipLevelsRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .build();

        GetSponsorshipLevelsResponse res = sdk.exhibitor().getSponsorshipLevels()
                .request(req)
                .call();

        if (res.sponsorshipLevelListResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetSponsorshipLevelsRequest](../../models/operations/GetSponsorshipLevelsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetSponsorshipLevelsResponse](../../models/operations/GetSponsorshipLevelsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSponsorshipLevel

Retrieves associated sponsorship level data for a single sponsorship level ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getSponsorshipLevel" method="get" path="/events/{id}/sponsorship-levels/{sponsorshipLevelId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSponsorshipLevelRequest;
import com.cvent.models.operations.GetSponsorshipLevelResponse;
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

        GetSponsorshipLevelRequest req = GetSponsorshipLevelRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .sponsorshipLevelId("1765848c-2a7f-48d2-85a2-6668b8e64ffb")
                .build();

        GetSponsorshipLevelResponse res = sdk.exhibitor().getSponsorshipLevel()
                .request(req)
                .call();

        if (res.existingSponsorshipLevel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSponsorshipLevelRequest](../../models/operations/GetSponsorshipLevelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSponsorshipLevelResponse](../../models/operations/GetSponsorshipLevelResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |