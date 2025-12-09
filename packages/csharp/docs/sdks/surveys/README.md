# Surveys

## Overview

Surveys are lists of questions deployed to your contacts. Surveys can be standalone or can be associated to a Cvent event. Use these APIs to search for surveys and retrieve the associated questions and responses.

### Available Operations

* [GetAllEventSurveyResponses](#getalleventsurveyresponses) - List All Event Responses
* [GetEventSurveys](#geteventsurveys) - List Event Surveys
* [GetEventSurveyQuestions](#geteventsurveyquestions) - List Event Survey Questions
* [GetEventSurveyRespondents](#geteventsurveyrespondents) - List Event Survey Respondents
* [CreateEventSurveyRespondent](#createeventsurveyrespondent) - Create Event Survey Respondent
* [UpdateEventSurveyRespondent](#updateeventsurveyrespondent) - Update Event Survey Respondent
* [CreateEventSurveyResponses](#createeventsurveyresponses) - Create Event Survey Responses
* [GetEventSurveyResponses](#geteventsurveyresponses) - List Event Survey Responses
* [GetLargeChoices](#getlargechoices) - List Large Choices
* [GetQuestions](#getquestions) - List Questions
* [GetRespondents](#getrespondents) - List Respondents
* [GetResponses](#getresponses) - List Responses
* [GetStandardSurveys](#getstandardsurveys) - List Standalone Surveys
* [GetStandardSurveyResponses](#getstandardsurveyresponses) - List Stdl. Survey Responses
* [GetStandardSurveyEmailTemplates](#getstandardsurveyemailtemplates) - List Stdl. Survey Email Templ.
* [GetStandardSurveyQuestions](#getstandardsurveyquestions) - List Stdl. Survey Questions
* [GetStandardSurveyRespondents](#getstandardsurveyrespondents) - List Stdl. Survey Respondents
* [CreateStandardSurveyRespondent](#createstandardsurveyrespondent) - Create Stdl. Survey Respondent
* [UpdateStandardSurveyRespondent](#updatestandardsurveyrespondent) - Update Stdl. Survey Respondent
* [SendStandardSurveyEmail](#sendstandardsurveyemail) - Send Standalone Survey Email
* [CreateStandardSurveyResponses](#createstandardsurveyresponses) - Create Stdl. Survey Responses
* [UpdateStandardSurveyResponses](#updatestandardsurveyresponses) - Update Stdl. Survey Responses
* [GetSurvey](#getsurvey) - List Surveys

## GetAllEventSurveyResponses

Gets a paginated list of event survey responses for all events and surveys.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAllEventSurveyResponses" method="get" path="/events/surveys/responses" -->
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

GetAllEventSurveyResponsesRequest req = new GetAllEventSurveyResponsesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetAllEventSurveyResponsesResponse? res = await sdk.Surveys.GetAllEventSurveyResponsesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAllEventSurveyResponsesRequest](../../Models/Requests/GetAllEventSurveyResponsesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAllEventSurveyResponsesResponse](../../Models/Requests/GetAllEventSurveyResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventSurveys

Gets a paginated list of surveys (id refers to chapter id and parentId is the survey id) associated to a single event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventSurveys" method="get" path="/events/{id}/surveys" -->
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

GetEventSurveysRequest req = new GetEventSurveysRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and type eq 'Session Feedback' and sessions eq  '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or sessions eq '05ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetEventSurveysResponse? res = await sdk.Surveys.GetEventSurveysAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetEventSurveysRequest](../../Models/Requests/GetEventSurveysRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetEventSurveysResponse](../../Models/Requests/GetEventSurveysResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventSurveyQuestions

Gets a paginated list of event survey questions for a given event and survey. The <a href="#operation/getLargeChoices"> GET List Large Choices </a> endpoint returns choices for the large choice question `type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventSurveyQuestions" method="get" path="/events/{id}/surveys/{surveyId}/questions" -->
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

GetEventSurveyQuestionsRequest req = new GetEventSurveyQuestionsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetEventSurveyQuestionsResponse? res = await sdk.Surveys.GetEventSurveyQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetEventSurveyQuestionsRequest](../../Models/Requests/GetEventSurveyQuestionsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetEventSurveyQuestionsResponse](../../Models/Requests/GetEventSurveyQuestionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventSurveyRespondents

Gets a paginated list of event survey respondents for a single event and survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventSurveyRespondents" method="get" path="/events/{id}/surveys/{surveyId}/respondents" -->
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

GetEventSurveyRespondentsRequest req = new GetEventSurveyRespondentsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetEventSurveyRespondentsResponse? res = await sdk.Surveys.GetEventSurveyRespondentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetEventSurveyRespondentsRequest](../../Models/Requests/GetEventSurveyRespondentsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetEventSurveyRespondentsResponse](../../Models/Requests/GetEventSurveyRespondentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateEventSurveyRespondent

Create a respondent for an event survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createEventSurveyRespondent" method="post" path="/events/{id}/surveys/{surveyId}/respondents" -->
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

CreateEventSurveyRespondentRequest req = new CreateEventSurveyRespondentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    EventSurveyRespondent = new EventSurveyRespondentInput() {
        LocaleId = "en-US",
        RespondedThrough = RespondedThroughJson.Api,
        ReferenceId = "facebook",
        SourceId = "IN4IDS1",
        Attendee = new EventSurveyRespondentAttendee() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
    },
};

var res = await sdk.Surveys.CreateEventSurveyRespondentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateEventSurveyRespondentRequest](../../Models/Requests/CreateEventSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateEventSurveyRespondentResponse](../../Models/Requests/CreateEventSurveyRespondentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateEventSurveyRespondent

Update respondent for an event survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateEventSurveyRespondent" method="put" path="/events/{id}/surveys/{surveyId}/respondents/{respondentId}" -->
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

UpdateEventSurveyRespondentRequest req = new UpdateEventSurveyRespondentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RespondentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    EventSurveyRespondent = new EventSurveyRespondentInput() {
        LocaleId = "en-US",
        RespondedThrough = RespondedThroughJson.Api,
        ReferenceId = "facebook",
        SourceId = "IN4IDS1",
        Attendee = new EventSurveyRespondentAttendee() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
    },
};

var res = await sdk.Surveys.UpdateEventSurveyRespondentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateEventSurveyRespondentRequest](../../Models/Requests/UpdateEventSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateEventSurveyRespondentResponse](../../Models/Requests/UpdateEventSurveyRespondentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateEventSurveyResponses

Create responses for a particular respondent in an event survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createEventSurveyResponses" method="post" path="/events/{id}/surveys/{surveyId}/respondents/{respondentId}/responses" -->
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

CreateEventSurveyResponsesRequest req = new CreateEventSurveyResponsesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RespondentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    EventSurveyResponse = new EventSurveyResponseInput() {
        Question = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Answers = new List<AnswerJson1>() {
            new AnswerJson1() {
                Type = AnswerTypeJson1.ChoiceText,
                Value = "1",
                Choice = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                Category = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                SubCategory = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                Field = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
            },
        },
        Survey = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Session = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Speaker = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
    },
};

var res = await sdk.Surveys.CreateEventSurveyResponsesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateEventSurveyResponsesRequest](../../Models/Requests/CreateEventSurveyResponsesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateEventSurveyResponsesResponse](../../Models/Requests/CreateEventSurveyResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventSurveyResponses

Gets a paginated list of event survey responses for a single event and survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventSurveyResponses" method="get" path="/events/{id}/surveys/{surveyId}/responses" -->
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

GetEventSurveyResponsesRequest req = new GetEventSurveyResponsesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetEventSurveyResponsesResponse? res = await sdk.Surveys.GetEventSurveyResponsesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetEventSurveyResponsesRequest](../../Models/Requests/GetEventSurveyResponsesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetEventSurveyResponsesResponse](../../Models/Requests/GetEventSurveyResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetLargeChoices

Gets a paginated list of choices for large choice question`type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getLargeChoices" method="get" path="/large-choices" -->
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

GetLargeChoicesRequest req = new GetLargeChoicesRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetLargeChoicesResponse? res = await sdk.Surveys.GetLargeChoicesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLargeChoicesRequest](../../Models/Requests/GetLargeChoicesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLargeChoicesResponse](../../Models/Requests/GetLargeChoicesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetQuestions

Gets a paginated list of event and standalone survey questions. The <a href="#operation/getLargeChoices"> GET List Large Choices </a> endpoint returns choices for the large choice question `type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getQuestions" method="get" path="/questions" -->
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

GetQuestionsRequest req = new GetQuestionsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetQuestionsResponse? res = await sdk.Surveys.GetQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetQuestionsRequest](../../Models/Requests/GetQuestionsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetQuestionsResponse](../../Models/Requests/GetQuestionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetRespondents

Gets a paginated list of event and standalone surveys respondents.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRespondents" method="get" path="/respondents" -->
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

GetRespondentsRequest req = new GetRespondentsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetRespondentsResponse? res = await sdk.Surveys.GetRespondentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetRespondentsRequest](../../Models/Requests/GetRespondentsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetRespondentsResponse](../../Models/Requests/GetRespondentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetResponses

Gets a paginated list of event and standalone survey responses.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getResponses" method="get" path="/responses" -->
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

GetResponsesRequest req = new GetResponsesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "question.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or question.id eq '1983f506-a4a5-4a05-b3f6-ff7f7afc58f1'",
};

GetResponsesResponse? res = await sdk.Surveys.GetResponsesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetResponsesRequest](../../Models/Requests/GetResponsesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetResponsesResponse](../../Models/Requests/GetResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetStandardSurveys

Gets a paginated list of standalone surveys not associated with an event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getStandardSurveys" method="get" path="/standard-surveys" -->
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

GetStandardSurveysRequest req = new GetStandardSurveysRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "status eq 'active' and created gt '2020-12-12T11:30:37.909Z' and title eq 'Survey Demo' and code ne 'NFWHF5DW46A'",
};

GetStandardSurveysResponse? res = await sdk.Surveys.GetStandardSurveysAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetStandardSurveysRequest](../../Models/Requests/GetStandardSurveysRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetStandardSurveysResponse](../../Models/Requests/GetStandardSurveysResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetStandardSurveyResponses

Gets a paginated list of standalone survey responses.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getStandardSurveyResponses" method="get" path="/standard-surveys/responses" -->
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

GetStandardSurveyResponsesRequest req = new GetStandardSurveyResponsesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "question.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or question.id eq '1983f506-a4a5-4a05-b3f6-ff7f7afc58f1'",
};

GetStandardSurveyResponsesResponse? res = await sdk.Surveys.GetStandardSurveyResponsesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetStandardSurveyResponsesRequest](../../Models/Requests/GetStandardSurveyResponsesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetStandardSurveyResponsesResponse](../../Models/Requests/GetStandardSurveyResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetStandardSurveyEmailTemplates

Gets a paginated list of standalone survey email templates for a single survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getStandardSurveyEmailTemplates" method="get" path="/standard-surveys/{surveyId}/email-templates" -->
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

GetStandardSurveyEmailTemplatesRequest req = new GetStandardSurveyEmailTemplatesRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetStandardSurveyEmailTemplatesResponse? res = await sdk.Surveys.GetStandardSurveyEmailTemplatesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetStandardSurveyEmailTemplatesRequest](../../Models/Requests/GetStandardSurveyEmailTemplatesRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetStandardSurveyEmailTemplatesResponse](../../Models/Requests/GetStandardSurveyEmailTemplatesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetStandardSurveyQuestions

Gets a paginated list of standalone survey questions for a single standalone survey. The <a href="#operation/getLargeChoices"> GET List Large Choices </a> endpoint returns choices for the large choice question `type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getStandardSurveyQuestions" method="get" path="/standard-surveys/{surveyId}/questions" -->
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

GetStandardSurveyQuestionsRequest req = new GetStandardSurveyQuestionsRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetStandardSurveyQuestionsResponse? res = await sdk.Surveys.GetStandardSurveyQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetStandardSurveyQuestionsRequest](../../Models/Requests/GetStandardSurveyQuestionsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetStandardSurveyQuestionsResponse](../../Models/Requests/GetStandardSurveyQuestionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetStandardSurveyRespondents

Gets a paginated list of standalone survey respondents for a single standalone survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getStandardSurveyRespondents" method="get" path="/standard-surveys/{surveyId}/respondents" -->
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

GetStandardSurveyRespondentsRequest req = new GetStandardSurveyRespondentsRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetStandardSurveyRespondentsResponse? res = await sdk.Surveys.GetStandardSurveyRespondentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetStandardSurveyRespondentsRequest](../../Models/Requests/GetStandardSurveyRespondentsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetStandardSurveyRespondentsResponse](../../Models/Requests/GetStandardSurveyRespondentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateStandardSurveyRespondent

Creates a respondent for a standalone survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createStandardSurveyRespondent" method="post" path="/standard-surveys/{surveyId}/respondents" -->
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

CreateStandardSurveyRespondentRequest req = new CreateStandardSurveyRespondentRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    StandardSurveyRespondent = new StandardSurveyRespondentInput() {
        LocaleId = "en-US",
        RespondedThrough = RespondedThroughJson.Api,
        ReferenceId = "facebook",
        SourceId = "IN4IDS1",
        Contact = new StandardSurveyRespondentContact() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        Status = RespondentStatusJson.NoResponse,
        InvitationList = new InvitationListCommonJson() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        TransactionId = "TR5IDS4",
    },
};

var res = await sdk.Surveys.CreateStandardSurveyRespondentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateStandardSurveyRespondentRequest](../../Models/Requests/CreateStandardSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateStandardSurveyRespondentResponse](../../Models/Requests/CreateStandardSurveyRespondentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateStandardSurveyRespondent

Update respondent for a standalone survey.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="UpdateStandardSurveyRespondent" method="put" path="/standard-surveys/{surveyId}/respondents/{respondentId}" -->
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

UpdateStandardSurveyRespondentRequest req = new UpdateStandardSurveyRespondentRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RespondentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    StandardSurveyRespondent = new StandardSurveyRespondentInput() {
        LocaleId = "en-US",
        RespondedThrough = RespondedThroughJson.Api,
        ReferenceId = "facebook",
        SourceId = "IN4IDS1",
        Contact = new StandardSurveyRespondentContact() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        Status = RespondentStatusJson.NoResponse,
        InvitationList = new InvitationListCommonJson() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        TransactionId = "TR5IDS4",
    },
};

var res = await sdk.Surveys.UpdateStandardSurveyRespondentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateStandardSurveyRespondentRequest](../../Models/Requests/UpdateStandardSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateStandardSurveyRespondentResponse](../../Models/Requests/UpdateStandardSurveyRespondentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## SendStandardSurveyEmail

Sends standalone survey email.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="sendStandardSurveyEmail" method="post" path="/standard-surveys/{surveyId}/respondents/{respondentId}/email-templates/{emailTemplateId}/email" -->
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

SendStandardSurveyEmailRequest req = new SendStandardSurveyEmailRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RespondentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    EmailTemplateId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Surveys.SendStandardSurveyEmailAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [SendStandardSurveyEmailRequest](../../Models/Requests/SendStandardSurveyEmailRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[SendStandardSurveyEmailResponse](../../Models/Requests/SendStandardSurveyEmailResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateStandardSurveyResponses

Create responses for a particular standalone survey respondent.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createStandardSurveyResponses" method="post" path="/standard-surveys/{surveyId}/respondents/{respondentId}/responses" -->
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

CreateStandardSurveyResponsesRequest req = new CreateStandardSurveyResponsesRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RespondentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    StandardSurveyResponse = new StandardSurveyResponseInput() {
        Question = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Answers = new List<AnswerJson1>() {},
        Survey = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        LoopingChoice = new LoopingChoiceJson() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
    },
};

var res = await sdk.Surveys.CreateStandardSurveyResponsesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CreateStandardSurveyResponsesRequest](../../Models/Requests/CreateStandardSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CreateStandardSurveyResponsesResponse](../../Models/Requests/CreateStandardSurveyResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateStandardSurveyResponses

Update responses for a particular standalone survey respondent.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateStandardSurveyResponses" method="put" path="/standard-surveys/{surveyId}/respondents/{respondentId}/responses/{responseId}" -->
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

UpdateStandardSurveyResponsesRequest req = new UpdateStandardSurveyResponsesRequest() {
    SurveyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RespondentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ResponseId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    StandardSurveyResponse = new StandardSurveyResponseInput() {
        Question = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Answers = new List<AnswerJson1>() {
            new AnswerJson1() {
                Type = AnswerTypeJson1.ChoiceText,
                Value = "1",
                Choice = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                Category = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                SubCategory = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                Field = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
            },
        },
        Survey = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        LoopingChoice = new LoopingChoiceJson() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
    },
};

var res = await sdk.Surveys.UpdateStandardSurveyResponsesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UpdateStandardSurveyResponsesRequest](../../Models/Requests/UpdateStandardSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UpdateStandardSurveyResponsesResponse](../../Models/Requests/UpdateStandardSurveyResponsesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSurvey

Gets a paginated list of event and standalone surveys associated to an account.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSurvey" method="get" path="/surveys" -->
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

GetSurveyRequest req = new GetSurveyRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and type eq 'Standalone'",
};

GetSurveyResponse? res = await sdk.Surveys.GetSurveyAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetSurveyRequest](../../Models/Requests/GetSurveyRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetSurveyResponse](../../Models/Requests/GetSurveyResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |