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

<!-- UsageSnippet language="java" operationID="createBulkJob" method="post" path="/bulk-jobs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateBulkJobResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

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

        BulkJobWithDataInput req = BulkJobWithDataInput.builder()
                .url("/contacts/{id}")
                .operation(BulkJobWithDataOperation.PUT)
                .description("Q1 Contact Import")
                .headers(Map.ofEntries(
                    Map.entry("header1", "header1Value"),
                    Map.entry("header2", "header2Value")))
                .queryParams(Map.ofEntries(
                    Map.entry("param1", "param1Value"),
                    Map.entry("param2", "param2Value")))
                .data(List.of(
                    BulkDataPropertyJson.builder()
                        .dataRecord(Map.ofEntries(
                            Map.entry("event", BulkDataRecordJson.builder()
                                .build()),
                            Map.entry("title", BulkDataRecordJson.builder()
                                .build()),
                            Map.entry("start", BulkDataRecordJson.builder()
                                .build()),
                            Map.entry("end", BulkDataRecordJson.builder()
                                .build()),
                            Map.entry("status", BulkDataRecordJson.builder()
                                .build())))
                        .pathParams(Map.ofEntries(
                            Map.entry("id", "11111111-0dc3-487b-953e-86d6abbdf7d3")))
                        .queryParams(Map.ofEntries(
                            Map.entry("param1", "param1Value"),
                            Map.entry("param2", "param2Value")))
                        .headers(Map.ofEntries(
                            Map.entry("header1", "header1Value"),
                            Map.entry("header2", "header2Value")))
                        .build()))
                .build();

        CreateBulkJobResponse res = sdk.bulk().createBulkJob()
                .request(req)
                .call();

        if (res.bulkJobWithData().isPresent()) {
            System.out.println(res.bulkJobWithData().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [BulkJobWithDataInput](../../models/shared/BulkJobWithDataInput.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateBulkJobResponse](../../models/operations/CreateBulkJobResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBulkJobById

Gets a bulk job by its identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="getBulkJobById" method="get" path="/bulk-jobs/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBulkJobByIdRequest;
import com.cvent.models.operations.GetBulkJobByIdResponse;
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

        GetBulkJobByIdRequest req = GetBulkJobByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetBulkJobByIdResponse res = sdk.bulk().getBulkJobById()
                .request(req)
                .call();

        if (res.bulkJob().isPresent()) {
            System.out.println(res.bulkJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetBulkJobByIdRequest](../../models/operations/GetBulkJobByIdRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetBulkJobByIdResponse](../../models/operations/GetBulkJobByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## cancelBulkJob

Cancels the bulk job. The job will stop processing after it finishes processing its current batch, if any.

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelBulkJob" method="post" path="/bulk-jobs/{id}/cancel" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CancelBulkJobRequest;
import com.cvent.models.operations.CancelBulkJobResponse;
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

        CancelBulkJobRequest req = CancelBulkJobRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        CancelBulkJobResponse res = sdk.bulk().cancelBulkJob()
                .request(req)
                .call();

        if (res.bulkJob().isPresent()) {
            System.out.println(res.bulkJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CancelBulkJobRequest](../../models/operations/CancelBulkJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CancelBulkJobResponse](../../models/operations/CancelBulkJobResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## uploadBulkJobData

This will upload data to be processed by a bulk job. There is a limit on the number of records that
can be uploaded per call and this endpoint can be called multiple times before starting a job run.

Note: there is a maximum _total_ number of 50,000 records that can be uploaded for a job.
If you have a need for a greater limit, this can be increased for your account (up to a hard limit of 150,000)
by contacting Cvent support.


### Example Usage

<!-- UsageSnippet language="java" operationID="uploadBulkJobData" method="post" path="/bulk-jobs/{id}/data" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UploadBulkJobDataRequest;
import com.cvent.models.operations.UploadBulkJobDataResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

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

        UploadBulkJobDataRequest req = UploadBulkJobDataRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .bulkData(BulkData.builder()
                    .data(List.of(
                        BulkDataPropertyJson.builder()
                            .dataRecord(Map.ofEntries(
                                Map.entry("event", BulkDataRecordJson.builder()
                                    .build()),
                                Map.entry("title", BulkDataRecordJson.builder()
                                    .build()),
                                Map.entry("start", BulkDataRecordJson.builder()
                                    .build()),
                                Map.entry("end", BulkDataRecordJson.builder()
                                    .build()),
                                Map.entry("status", BulkDataRecordJson.builder()
                                    .build())))
                            .pathParams(Map.ofEntries(
                                Map.entry("id", "11111111-0dc3-487b-953e-86d6abbdf7d3")))
                            .queryParams(Map.ofEntries(
                                Map.entry("param1", "param1Value"),
                                Map.entry("param2", "param2Value")))
                            .headers(Map.ofEntries(
                                Map.entry("header1", "header1Value"),
                                Map.entry("header2", "header2Value")))
                            .build()))
                    .build())
                .build();

        UploadBulkJobDataResponse res = sdk.bulk().uploadBulkJobData()
                .request(req)
                .call();

        if (res.bulkDataUploadResponse().isPresent()) {
            System.out.println(res.bulkDataUploadResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UploadBulkJobDataRequest](../../models/operations/UploadBulkJobDataRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UploadBulkJobDataResponse](../../models/operations/UploadBulkJobDataResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 409, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## listBulkJobResult

Used to list the results of a bulk Job.

### Example Usage

<!-- UsageSnippet language="java" operationID="listBulkJobResult" method="get" path="/bulk-jobs/{id}/results" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListBulkJobResultRequest;
import com.cvent.models.operations.ListBulkJobResultResponse;
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

        ListBulkJobResultRequest req = ListBulkJobResultRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("failed eq \"true\"")
                .build();


        sdk.bulk().listBulkJobResult()
                .callAsStream()
                .forEach((ListBulkJobResultResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListBulkJobResultRequest](../../models/operations/ListBulkJobResultRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListBulkJobResultResponse](../../models/operations/ListBulkJobResultResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## runBulkJob

Begins the processing of data uploaded in a bulk job.

 **Note**: You can have a maximum of two bulk jobs running concurrently.

### Example Usage

<!-- UsageSnippet language="java" operationID="runBulkJob" method="post" path="/bulk-jobs/{id}/run" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.RunBulkJobRequest;
import com.cvent.models.operations.RunBulkJobResponse;
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

        RunBulkJobRequest req = RunBulkJobRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        RunBulkJobResponse res = sdk.bulk().runBulkJob()
                .request(req)
                .call();

        if (res.bulkJob().isPresent()) {
            System.out.println(res.bulkJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [RunBulkJobRequest](../../models/operations/RunBulkJobRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[RunBulkJobResponse](../../models/operations/RunBulkJobResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 409, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |