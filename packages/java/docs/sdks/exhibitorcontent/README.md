# ExhibitorContent

## Overview

Exhibitor Content operations for an exhibitor. This API allows you to upload & get exhibitor content data such as files, weblinks.


### Available Operations

* [listExhibitorFiles](#listexhibitorfiles) - List Exhibitor Files
* [getExhibitorFile](#getexhibitorfile) - Get Exhibitor File
* [updateExhibitorFile](#updateexhibitorfile) - Associate Exhibitor File
* [disassociateExhibitorFile](#disassociateexhibitorfile) - Disassociate Exhibitor File
* [listExhibitorWeblinks](#listexhibitorweblinks) - List Exhibitor Weblinks
* [createExhibitorWeblink](#createexhibitorweblink) - Create Exhibitor Weblink
* [getExhibitorWeblink](#getexhibitorweblink) - Get Exhibitor Weblink
* [updateExhibitorWeblink](#updateexhibitorweblink) - Update Exhibitor Weblink
* [deleteExhibitorWeblink](#deleteexhibitorweblink) - Delete Exhibitor Weblink

## listExhibitorFiles

Retrieves a list of files associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listExhibitorFiles" method="get" path="/events/{id}/exhibitors/{exhibitorId}/files" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListExhibitorFilesRequest;
import com.cvent.models.operations.ListExhibitorFilesResponse;
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

        ListExhibitorFilesRequest req = ListExhibitorFilesRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        ListExhibitorFilesResponse res = sdk.exhibitorContent().listExhibitorFiles()
                .request(req)
                .call();

        if (res.fileListResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListExhibitorFilesRequest](../../models/operations/ListExhibitorFilesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListExhibitorFilesResponse](../../models/operations/ListExhibitorFilesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getExhibitorFile

Get a single file for an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorFile" method="get" path="/events/{id}/exhibitors/{exhibitorId}/files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorFileRequest;
import com.cvent.models.operations.GetExhibitorFileResponse;
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

        GetExhibitorFileRequest req = GetExhibitorFileRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetExhibitorFileResponse res = sdk.exhibitorContent().getExhibitorFile()
                .request(req)
                .call();

        if (res.existingFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetExhibitorFileRequest](../../models/operations/GetExhibitorFileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetExhibitorFileResponse](../../models/operations/GetExhibitorFileResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorFile

Associate a file to an exhibitor using a file ID taken from the <a href="#operation/uploadFile">file upload</a> endpoint.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorFile" method="put" path="/events/{id}/exhibitors/{exhibitorId}/files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorFileRequest;
import com.cvent.models.operations.UpdateExhibitorFileResponse;
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

        UpdateExhibitorFileRequest req = UpdateExhibitorFileRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .file(FileInput.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .displayName("Marketing Page")
                    .order(3L)
                    .build())
                .build();

        UpdateExhibitorFileResponse res = sdk.exhibitorContent().updateExhibitorFile()
                .request(req)
                .call();

        if (res.existingFile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateExhibitorFileRequest](../../models/operations/UpdateExhibitorFileRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateExhibitorFileResponse](../../models/operations/UpdateExhibitorFileResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 422, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## disassociateExhibitorFile

Disassociate a single file from an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateExhibitorFile" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/files/{fileId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DisassociateExhibitorFileRequest;
import com.cvent.models.operations.DisassociateExhibitorFileResponse;
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

        DisassociateExhibitorFileRequest req = DisassociateExhibitorFileRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .fileId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DisassociateExhibitorFileResponse res = sdk.exhibitorContent().disassociateExhibitorFile()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DisassociateExhibitorFileRequest](../../models/operations/DisassociateExhibitorFileRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DisassociateExhibitorFileResponse](../../models/operations/DisassociateExhibitorFileResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listExhibitorWeblinks

Retrieves a list of content weblinks associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listExhibitorWeblinks" method="get" path="/events/{id}/exhibitors/{exhibitorId}/weblinks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListExhibitorWeblinksRequest;
import com.cvent.models.operations.ListExhibitorWeblinksResponse;
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

        ListExhibitorWeblinksRequest req = ListExhibitorWeblinksRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .build();

        ListExhibitorWeblinksResponse res = sdk.exhibitorContent().listExhibitorWeblinks()
                .request(req)
                .call();

        if (res.weblinkListResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListExhibitorWeblinksRequest](../../models/operations/ListExhibitorWeblinksRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListExhibitorWeblinksResponse](../../models/operations/ListExhibitorWeblinksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createExhibitorWeblink

Creates a single content weblink for an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createExhibitorWeblink" method="post" path="/events/{id}/exhibitors/{exhibitorId}/weblinks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateExhibitorWeblinkRequest;
import com.cvent.models.operations.CreateExhibitorWeblinkResponse;
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

        CreateExhibitorWeblinkRequest req = CreateExhibitorWeblinkRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .weblink(Weblink.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .name("Marketing Page")
                    .url("http://www.example.com")
                    .order(3L)
                    .build())
                .build();

        CreateExhibitorWeblinkResponse res = sdk.exhibitorContent().createExhibitorWeblink()
                .request(req)
                .call();

        if (res.existingWeblink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateExhibitorWeblinkRequest](../../models/operations/CreateExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateExhibitorWeblinkResponse](../../models/operations/CreateExhibitorWeblinkResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 422, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## getExhibitorWeblink

Retrieves a single content weblink for an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getExhibitorWeblink" method="get" path="/events/{id}/exhibitors/{exhibitorId}/weblinks/{weblinkId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetExhibitorWeblinkRequest;
import com.cvent.models.operations.GetExhibitorWeblinkResponse;
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

        GetExhibitorWeblinkRequest req = GetExhibitorWeblinkRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .weblinkId("4d44b9e4-8c1a-403d-a20a-0b981f539935")
                .build();

        GetExhibitorWeblinkResponse res = sdk.exhibitorContent().getExhibitorWeblink()
                .request(req)
                .call();

        if (res.existingWeblink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetExhibitorWeblinkRequest](../../models/operations/GetExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetExhibitorWeblinkResponse](../../models/operations/GetExhibitorWeblinkResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExhibitorWeblink

Updates content weblink data in an event for a given exhibitor ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExhibitorWeblink" method="put" path="/events/{id}/exhibitors/{exhibitorId}/weblinks/{weblinkId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExhibitorWeblinkRequest;
import com.cvent.models.operations.UpdateExhibitorWeblinkResponse;
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

        UpdateExhibitorWeblinkRequest req = UpdateExhibitorWeblinkRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .weblinkId("4d44b9e4-8c1a-403d-a20a-0b981f539935")
                .weblink(Weblink.builder()
                    .event(EventJson5.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .exhibitor(ExhibitorJson.builder()
                        .id("4888db54-db22-11eb-8d19-0242ac130003")
                        .build())
                    .name("Marketing Page")
                    .url("http://www.example.com")
                    .order(3L)
                    .build())
                .build();

        UpdateExhibitorWeblinkResponse res = sdk.exhibitorContent().updateExhibitorWeblink()
                .request(req)
                .call();

        if (res.existingWeblink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateExhibitorWeblinkRequest](../../models/operations/UpdateExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateExhibitorWeblinkResponse](../../models/operations/UpdateExhibitorWeblinkResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 422, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## deleteExhibitorWeblink

Deletes a single exhibitor content weblink.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExhibitorWeblink" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/weblinks/{weblinkId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExhibitorWeblinkRequest;
import com.cvent.models.operations.DeleteExhibitorWeblinkResponse;
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

        DeleteExhibitorWeblinkRequest req = DeleteExhibitorWeblinkRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .exhibitorId("4888db54-db22-11eb-8d19-0242ac130003")
                .weblinkId("4d44b9e4-8c1a-403d-a20a-0b981f539935")
                .build();

        DeleteExhibitorWeblinkResponse res = sdk.exhibitorContent().deleteExhibitorWeblink()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteExhibitorWeblinkRequest](../../models/operations/DeleteExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteExhibitorWeblinkResponse](../../models/operations/DeleteExhibitorWeblinkResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |