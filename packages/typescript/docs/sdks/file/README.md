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

<!-- UsageSnippet language="typescript" operationID="uploadFile" method="post" path="/files" -->
```typescript
import { CventSDK } from "@cvent/sdk";
import { openAsBlob } from "node:fs";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.file.uploadFile({
    file: await openAsBlob("example.file"),
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { fileUploadFile } from "@cvent/sdk/funcs/fileUploadFile.js";
import { openAsBlob } from "node:fs";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await fileUploadFile(cventSDK, {
    file: await openAsBlob("example.file"),
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("fileUploadFile failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.FileUpload](../../models/components/fileupload.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.FileWithAudit](../../models/components/filewithaudit.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getFile

Returns the file upload location for the specified file ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getFile" method="get" path="/files/{id}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.file.getFile({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { fileGetFile } from "@cvent/sdk/funcs/fileGetFile.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await fileGetFile(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("fileGetFile failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetFileRequest](../../models/operations/getfilerequest.md)                                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.FileWithAudit](../../models/components/filewithaudit.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |