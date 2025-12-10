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

* [CreateBulkJob](#createbulkjob) - Create Bulk Job
* [GetBulkJobById](#getbulkjobbyid) - Get Bulk Job
* [CancelBulkJob](#cancelbulkjob) - Cancel Bulk Job
* [UploadBulkJobData](#uploadbulkjobdata) - Upload Bulk Job Data
* [ListBulkJobResult](#listbulkjobresult) - List Bulk Job Result
* [RunBulkJob](#runbulkjob) - Run Bulk Job

## CreateBulkJob

Creates a bulk job.

**Note:** When creating a bulk job you can optionally include the data in the create request.
If data is supplied the job will be started and there is no need to call the [run bulk job](#operation/runBulkJob) endpoint.
If data is NOT supplied then the [upload bulk job data](#operation/uploadBulkJobData) endpoint can be called
to upload data and then using [run bulk job](#operation/runBulkJob).
In addition, if data is supplied and your account has reached its limit for concurrently running bulk jobs,
the job will not be created.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="createBulkJob" method="post" path="/bulk-jobs" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

BulkJobWithDataInput req = new BulkJobWithDataInput() {
    Description = "Q1 Contact Import",
    Url = "/contacts/{id}",
    Operation = BulkJobWithDataOperation.Put,
    Headers = new Dictionary<string, string>() {
        { "header1", "header1Value" },
        { "header2", "header2Value" },
    },
    QueryParams = new Dictionary<string, string>() {
        { "param1", "param1Value" },
        { "param2", "param2Value" },
    },
    Data = new List<BulkDataPropertyJson>() {
        new BulkDataPropertyJson() {
            PathParams = new Dictionary<string, string>() {
                { "id", "11111111-0dc3-487b-953e-86d6abbdf7d3" },
            },
            QueryParams = new Dictionary<string, string>() {
                { "param1", "param1Value" },
                { "param2", "param2Value" },
            },
            Headers = new Dictionary<string, string>() {
                { "header1", "header1Value" },
                { "header2", "header2Value" },
            },
            DataRecord = new Dictionary<string, BulkDataRecordJson>() {
                { "start", new BulkDataRecordJson() {} },
                { "end", new BulkDataRecordJson() {} },
                { "status", new BulkDataRecordJson() {} },
                { "event", new BulkDataRecordJson() {} },
                { "title", new BulkDataRecordJson() {} },
            },
        },
    },
};

var res = await sdk.Bulk.CreateBulkJobAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [BulkJobWithDataInput](../../Models/Components/BulkJobWithDataInput.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateBulkJobResponse](../../Models/Requests/CreateBulkJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBulkJobById

Gets a bulk job by its identifier.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBulkJobById" method="get" path="/bulk-jobs/{id}" -->
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

GetBulkJobByIdRequest req = new GetBulkJobByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Bulk.GetBulkJobByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetBulkJobByIdRequest](../../Models/Requests/GetBulkJobByIdRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetBulkJobByIdResponse](../../Models/Requests/GetBulkJobByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CancelBulkJob

Cancels the bulk job. The job will stop processing after it finishes processing its current batch, if any.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="cancelBulkJob" method="post" path="/bulk-jobs/{id}/cancel" -->
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

CancelBulkJobRequest req = new CancelBulkJobRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Bulk.CancelBulkJobAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CancelBulkJobRequest](../../Models/Requests/CancelBulkJobRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CancelBulkJobResponse](../../Models/Requests/CancelBulkJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UploadBulkJobData

This will upload data to be processed by a bulk job. There is a limit on the number of records that
can be uploaded per call and this endpoint can be called multiple times before starting a job run.

Note: there is a maximum _total_ number of 50,000 records that can be uploaded for a job.
If you have a need for a greater limit, this can be increased for your account (up to a hard limit of 150,000)
by contacting Cvent support.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="uploadBulkJobData" method="post" path="/bulk-jobs/{id}/data" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UploadBulkJobDataRequest req = new UploadBulkJobDataRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BulkData = new BulkData() {
        Data = new List<BulkDataPropertyJson>() {
            new BulkDataPropertyJson() {
                PathParams = new Dictionary<string, string>() {
                    { "id", "11111111-0dc3-487b-953e-86d6abbdf7d3" },
                },
                QueryParams = new Dictionary<string, string>() {
                    { "param2", "param2Value" },
                    { "param1", "param1Value" },
                },
                Headers = new Dictionary<string, string>() {
                    { "header1", "header1Value" },
                    { "header2", "header2Value" },
                },
                DataRecord = new Dictionary<string, BulkDataRecordJson>() {
                    { "event", new BulkDataRecordJson() {} },
                    { "title", new BulkDataRecordJson() {} },
                    { "start", new BulkDataRecordJson() {} },
                    { "end", new BulkDataRecordJson() {} },
                    { "status", new BulkDataRecordJson() {} },
                },
            },
        },
    },
};

var res = await sdk.Bulk.UploadBulkJobDataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UploadBulkJobDataRequest](../../Models/Requests/UploadBulkJobDataRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UploadBulkJobDataResponse](../../Models/Requests/UploadBulkJobDataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 409, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListBulkJobResult

Used to list the results of a bulk Job.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listBulkJobResult" method="get" path="/bulk-jobs/{id}/results" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListBulkJobResultRequest req = new ListBulkJobResultRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "failed eq \"true\"",
};

ListBulkJobResultResponse? res = await sdk.Bulk.ListBulkJobResultAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListBulkJobResultRequest](../../Models/Requests/ListBulkJobResultRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListBulkJobResultResponse](../../Models/Requests/ListBulkJobResultResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## RunBulkJob

Begins the processing of data uploaded in a bulk job.

 **Note**: You can have a maximum of two bulk jobs running concurrently.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="runBulkJob" method="post" path="/bulk-jobs/{id}/run" -->
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

RunBulkJobRequest req = new RunBulkJobRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Bulk.RunBulkJobAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [RunBulkJobRequest](../../Models/Requests/RunBulkJobRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[RunBulkJobResponse](../../Models/Requests/RunBulkJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 409, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |