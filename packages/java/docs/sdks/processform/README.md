# ProcessForm

## Overview

Process forms automate data collection and notifications related to planning and executing events. Process form submissions are responses to a specific process form, providing data the form requests. Use these APIs to manage process form submissions in your account.

### Available Operations

* [listProcessFormSubmission](#listprocessformsubmission) - List Process Form Submissions

## listProcessFormSubmission

Gets a paginated list of process form submissions.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listProcessFormSubmission" method="get" path="/process-forms/submissions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListProcessFormSubmissionRequest;
import com.cvent.models.operations.ListProcessFormSubmissionResponse;
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

        ListProcessFormSubmissionRequest req = ListProcessFormSubmissionRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .expand(List.of(
                    ProcessFormExpand.PROCESS_FORM))
                .filter("event.id eq '775b7a6c-de7f-4dfe-8d16-966acdc0e848' and process-form.id eq '9c97eb50-9f88-4972-a603-f617fc3258dd'")
                .build();


        sdk.processForm().listProcessFormSubmission()
                .callAsStream()
                .forEach((ListProcessFormSubmissionResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListProcessFormSubmissionRequest](../../models/operations/ListProcessFormSubmissionRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListProcessFormSubmissionResponse](../../models/operations/ListProcessFormSubmissionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |