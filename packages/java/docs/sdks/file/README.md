# File

## Overview

Allows you to upload files and get file location using the file ID. File ID can be used with other APIs to associate the file to an entity. For example:
* <a href="#operation/addSessionDoc">Add Document To Session</a>
* <a href="#operation/addSpeakerDoc">Add Document To Speaker</a>
* <a href="#operation/assignContactProfileImage">Assign Contact Profile Picture</a>
* <a href="#operation/updateExhibitorCategoryBanner">Assign Banner to Exhibitor Category</a>
* <a href="#operation/updateExhibitorBanner">Assign Exhibitor Banner Image</a>
* <a href="#operation/updateExhibitorLogo">Assign Exhibitor Logo Image</a>
* <a href="#operation/assignSpeakerProfileImage">Assign Speaker Profile Picture</a>


### Available Operations

* [uploadFile](#uploadfile) - Upload a File
* [getFile](#getfile) - Get File Location

## uploadFile

Uploads a file and returns a unique ID to identify the file. The file must be less than 10MB. The file ID can be used with other APIs to associate the file with an entity. Unassociated files expire within 30 days.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="uploadFile" method="post" path="/files" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UploadFileResponse;
import com.cvent.utils.Utils;
import java.io.FileInputStream;
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

        FileUpload req = FileUpload.builder()
                .file(FileUploadFile.builder()
                    .fileName("example.file")
                    .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                    .build())
                .build();

        UploadFileResponse res = sdk.file().uploadFile()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [FileUpload](../../models/shared/FileUpload.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[UploadFileResponse](../../models/operations/UploadFileResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getFile

Returns the file upload location for the specified file ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getFile" method="get" path="/files/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetFileRequest;
import com.cvent.models.operations.GetFileResponse;
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

        GetFileRequest req = GetFileRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetFileResponse res = sdk.file().getFile()
                .request(req)
                .call();

        if (res.fileWithAudit().isPresent()) {
            System.out.println(res.fileWithAudit().get());
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetFileRequest](../../models/operations/GetFileRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetFileResponse](../../models/operations/GetFileResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |