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

* [UploadFile](#uploadfile) - Upload a File
* [GetFile](#getfile) - Get File Location

## UploadFile

Uploads a file and returns a unique ID to identify the file. The file must be less than 10MB. The file ID can be used with other APIs to associate the file with an entity. Unassociated files expire within 30 days.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="uploadFile" method="post" path="/files" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

FileUpload req = new FileUpload() {
    File = new FileUploadFile() {
        FileName = "example.file",
        Content = System.IO.File.ReadAllBytes("example.file"),
    },
};

var res = await sdk.File.UploadFileAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [FileUpload](../../Models/Components/FileUpload.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[UploadFileResponse](../../Models/Requests/UploadFileResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetFile

Returns the file upload location for the specified file ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getFile" method="get" path="/files/{id}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetFileRequest req = new GetFileRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.File.GetFileAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetFileRequest](../../Models/Requests/GetFileRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetFileResponse](../../Models/Requests/GetFileResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |