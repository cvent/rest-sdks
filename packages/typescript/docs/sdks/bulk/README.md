# Bulk

## Overview

The Bulk API provides a simple interface to upload large amounts of data into Cvent.  The API processes the uploaded data asynchronously making API calls on behalf of the caller.

Consumers of the bulk API will do the following:
* [Create a bulk job](#operation/createBulkJob) with or without data
* *(Optional)* If a bulk job was created without data, then [upload bulk job data](#operation/uploadBulkJobData) as many times as needed
* *(Optional)* [Run bulk job](#operation/runBulkJob)
* Use [get bulk job](#operation/getBulkJobById) to track status
* Use [list bulk job results](#operation/listBulkJobResult) to get details of items uploaded

For more details, see the [Bulk Job User Guide](/docs/rest-api/guides/bulk-api-user-guide).

**Note:** These bulk jobs have a TTL and will expire once they are complete or never ran. Bulk jobs will expire
1 week after creation, and this one week is refreshed when data is uploaded and the job is run. The Bulk Job
will be available for 1 week after completion to get results. Right now we do NOT support bulk GET requests.


### Available Operations

* [createBulkJob](#createbulkjob) - Create Bulk Job
* [getBulkJobById](#getbulkjobbyid) - Get Bulk Job
* [cancelBulkJob](#cancelbulkjob) - Cancel Bulk Job
* [uploadBulkJobData](#uploadbulkjobdata) - Upload Bulk Job Data
* [listBulkJobResult](#listbulkjobresult) - List Bulk Job Result
* [runBulkJob](#runbulkjob) - Run Bulk Job

## createBulkJob

Creates a bulk job.

**Note:** When creating a bulk job you can optionally include the data in the create request.
If data is supplied the job will be started and there is no need to call the [run bulk job](#operation/runBulkJob) endpoint.
If data is NOT supplied then the [upload bulk job data](#operation/uploadBulkJobData) endpoint can be called
to upload data and then using [run bulk job](#operation/runBulkJob).
In addition, if data is supplied and your account has reached its limit for concurrently running bulk jobs,
the job will not be created.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="createBulkJob" method="post" path="/bulk-jobs" -->
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
  const result = await cventSDK.bulk.createBulkJob({
    description: "Q1 Contact Import",
    url: "/contacts/{id}",
    operation: "PUT",
    headers: {
      "header1": "header1Value",
      "header2": "header2Value",
    },
    queryParams: {
      "param1": "param1Value",
      "param2": "param2Value",
    },
    data: [
      {
        pathParams: {
          "id": "11111111-0dc3-487b-953e-86d6abbdf7d3",
        },
        queryParams: {
          "param1": "param1Value",
          "param2": "param2Value",
        },
        headers: {
          "header1": "header1Value",
          "header2": "header2Value",
        },
        dataRecord: {
          "event": {},
          "title": {},
          "start": {},
          "end": {},
          "status": {},
        },
      },
    ],
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { bulkCreateBulkJob } from "@cvent/sdk/funcs/bulkCreateBulkJob.js";

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
  const res = await bulkCreateBulkJob(cventSDK, {
    description: "Q1 Contact Import",
    url: "/contacts/{id}",
    operation: "PUT",
    headers: {
      "header1": "header1Value",
      "header2": "header2Value",
    },
    queryParams: {
      "param1": "param1Value",
      "param2": "param2Value",
    },
    data: [
      {
        pathParams: {
          "id": "11111111-0dc3-487b-953e-86d6abbdf7d3",
        },
        queryParams: {
          "param1": "param1Value",
          "param2": "param2Value",
        },
        headers: {
          "header1": "header1Value",
          "header2": "header2Value",
        },
        dataRecord: {
          "event": {},
          "title": {},
          "start": {},
          "end": {},
          "status": {},
        },
      },
    ],
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("bulkCreateBulkJob failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.BulkJobWithDataInput](../../models/components/bulkjobwithdatainput.md)                                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BulkJobWithData](../../models/components/bulkjobwithdata.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 409, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getBulkJobById

Gets a bulk job by its identifier.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getBulkJobById" method="get" path="/bulk-jobs/{id}" -->
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
  const result = await cventSDK.bulk.getBulkJobById({
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
import { bulkGetBulkJobById } from "@cvent/sdk/funcs/bulkGetBulkJobById.js";

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
  const res = await bulkGetBulkJobById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("bulkGetBulkJobById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetBulkJobByIdRequest](../../models/operations/getbulkjobbyidrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BulkJob](../../models/components/bulkjob.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## cancelBulkJob

Cancels the bulk job. The job will stop processing after it finishes processing its current batch, if any.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="cancelBulkJob" method="post" path="/bulk-jobs/{id}/cancel" -->
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
  const result = await cventSDK.bulk.cancelBulkJob({
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
import { bulkCancelBulkJob } from "@cvent/sdk/funcs/bulkCancelBulkJob.js";

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
  const res = await bulkCancelBulkJob(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("bulkCancelBulkJob failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CancelBulkJobRequest](../../models/operations/cancelbulkjobrequest.md)                                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BulkJob](../../models/components/bulkjob.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## uploadBulkJobData

This will upload data to be processed by a bulk job. There is a limit on the number of records that
can be uploaded per call and this endpoint can be called multiple times before starting a job run.

Note: there is a maximum _total_ number of 50,000 records that can be uploaded for a job.
If you have a need for a greater limit, this can be increased for your account (up to a hard limit of 150,000)
by contacting Cvent support.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="uploadBulkJobData" method="post" path="/bulk-jobs/{id}/data" -->
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
  const result = await cventSDK.bulk.uploadBulkJobData({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    bulkData: {
      data: [
        {
          pathParams: {
            "id": "11111111-0dc3-487b-953e-86d6abbdf7d3",
          },
          queryParams: {
            "param1": "param1Value",
            "param2": "param2Value",
          },
          headers: {
            "header1": "header1Value",
            "header2": "header2Value",
          },
          dataRecord: {
            "event": {},
            "title": {},
            "start": {},
            "end": {},
            "status": {},
          },
        },
      ],
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { bulkUploadBulkJobData } from "@cvent/sdk/funcs/bulkUploadBulkJobData.js";

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
  const res = await bulkUploadBulkJobData(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    bulkData: {
      data: [
        {
          pathParams: {
            "id": "11111111-0dc3-487b-953e-86d6abbdf7d3",
          },
          queryParams: {
            "param1": "param1Value",
            "param2": "param2Value",
          },
          headers: {
            "header1": "header1Value",
            "header2": "header2Value",
          },
          dataRecord: {
            "event": {},
            "title": {},
            "start": {},
            "end": {},
            "status": {},
          },
        },
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("bulkUploadBulkJobData failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UploadBulkJobDataRequest](../../models/operations/uploadbulkjobdatarequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BulkDataUploadResponse](../../models/components/bulkdatauploadresponse.md)\>**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| errors.ErrorResponse         | 400, 401, 403, 404, 409, 429 | application/json             |
| errors.APIError              | 4XX, 5XX                     | \*/\*                        |

## listBulkJobResult

Used to list the results of a bulk Job.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listBulkJobResult" method="get" path="/bulk-jobs/{id}/results" -->
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
  const result = await cventSDK.bulk.listBulkJobResult({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "failed eq \"true\"",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { bulkListBulkJobResult } from "@cvent/sdk/funcs/bulkListBulkJobResult.js";

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
  const res = await bulkListBulkJobResult(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "failed eq \"true\"",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("bulkListBulkJobResult failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListBulkJobResultRequest](../../models/operations/listbulkjobresultrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListBulkJobResultResponse](../../models/operations/listbulkjobresultresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## runBulkJob

Begins the processing of data uploaded in a bulk job.

 **Note**: You can have a maximum of two bulk jobs running concurrently.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="runBulkJob" method="post" path="/bulk-jobs/{id}/run" -->
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
  const result = await cventSDK.bulk.runBulkJob({
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
import { bulkRunBulkJob } from "@cvent/sdk/funcs/bulkRunBulkJob.js";

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
  const res = await bulkRunBulkJob(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("bulkRunBulkJob failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.RunBulkJobRequest](../../models/operations/runbulkjobrequest.md)                                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BulkJob](../../models/components/bulkjob.md)\>**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| errors.ErrorResponse         | 400, 401, 403, 404, 409, 429 | application/json             |
| errors.APIError              | 4XX, 5XX                     | \*/\*                        |