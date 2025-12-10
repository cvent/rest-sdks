# ProcessForm

## Overview

Process forms automate data collection and notifications related to planning and executing events. Process form submissions are responses to a specific process form, providing data the form requests. Use these APIs to manage process form submissions in your account.

### Available Operations

* [ListProcessFormSubmission](#listprocessformsubmission) - List Process Form Submissions

## ListProcessFormSubmission

Gets a paginated list of process form submissions.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listProcessFormSubmission" method="get" path="/process-forms/submissions" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListProcessFormSubmissionRequest req = new ListProcessFormSubmissionRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Expand = new List<ProcessFormExpand>() {
        ProcessFormExpand.ProcessForm,
    },
    Filter = "event.id eq '775b7a6c-de7f-4dfe-8d16-966acdc0e848' and process-form.id eq '9c97eb50-9f88-4972-a603-f617fc3258dd'",
};

ListProcessFormSubmissionResponse? res = await sdk.ProcessForm.ListProcessFormSubmissionAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListProcessFormSubmissionRequest](../../Models/Requests/ListProcessFormSubmissionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListProcessFormSubmissionResponse](../../Models/Requests/ListProcessFormSubmissionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |