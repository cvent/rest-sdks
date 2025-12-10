# Surveys

## Overview

Surveys are lists of questions deployed to your contacts. Surveys can be standalone or can be associated to a Cvent event. Use these APIs to search for surveys and retrieve the associated questions and responses.

### Available Operations

* [getAllEventSurveyResponses](#getalleventsurveyresponses) - List All Event Responses
* [getEventSurveys](#geteventsurveys) - List Event Surveys
* [getEventSurveyQuestions](#geteventsurveyquestions) - List Event Survey Questions
* [getEventSurveyRespondents](#geteventsurveyrespondents) - List Event Survey Respondents
* [createEventSurveyRespondent](#createeventsurveyrespondent) - Create Event Survey Respondent
* [updateEventSurveyRespondent](#updateeventsurveyrespondent) - Update Event Survey Respondent
* [createEventSurveyResponses](#createeventsurveyresponses) - Create Event Survey Responses
* [getEventSurveyResponses](#geteventsurveyresponses) - List Event Survey Responses
* [getLargeChoices](#getlargechoices) - List Large Choices
* [getQuestions](#getquestions) - List Questions
* [getRespondents](#getrespondents) - List Respondents
* [getResponses](#getresponses) - List Responses
* [getStandardSurveys](#getstandardsurveys) - List Standalone Surveys
* [getStandardSurveyResponses](#getstandardsurveyresponses) - List Stdl. Survey Responses
* [getStandardSurveyEmailTemplates](#getstandardsurveyemailtemplates) - List Stdl. Survey Email Templ.
* [getStandardSurveyQuestions](#getstandardsurveyquestions) - List Stdl. Survey Questions
* [getStandardSurveyRespondents](#getstandardsurveyrespondents) - List Stdl. Survey Respondents
* [createStandardSurveyRespondent](#createstandardsurveyrespondent) - Create Stdl. Survey Respondent
* [updateStandardSurveyRespondent](#updatestandardsurveyrespondent) - Update Stdl. Survey Respondent
* [sendStandardSurveyEmail](#sendstandardsurveyemail) - Send Standalone Survey Email
* [createStandardSurveyResponses](#createstandardsurveyresponses) - Create Stdl. Survey Responses
* [updateStandardSurveyResponses](#updatestandardsurveyresponses) - Update Stdl. Survey Responses
* [getSurvey](#getsurvey) - List Surveys

## getAllEventSurveyResponses

Gets a paginated list of event survey responses for all events and surveys.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllEventSurveyResponses" method="get" path="/events/surveys/responses" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAllEventSurveyResponsesRequest;
import com.cvent.models.operations.GetAllEventSurveyResponsesResponse;
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

        GetAllEventSurveyResponsesRequest req = GetAllEventSurveyResponsesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getAllEventSurveyResponses()
                .callAsStream()
                .forEach((GetAllEventSurveyResponsesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAllEventSurveyResponsesRequest](../../models/operations/GetAllEventSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAllEventSurveyResponsesResponse](../../models/operations/GetAllEventSurveyResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventSurveys

Gets a paginated list of surveys (id refers to chapter id and parentId is the survey id) associated to a single event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventSurveys" method="get" path="/events/{id}/surveys" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventSurveysRequest;
import com.cvent.models.operations.GetEventSurveysResponse;
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

        GetEventSurveysRequest req = GetEventSurveysRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and type eq 'Session Feedback' and sessions eq  '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or sessions eq '05ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getEventSurveys()
                .callAsStream()
                .forEach((GetEventSurveysResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetEventSurveysRequest](../../models/operations/GetEventSurveysRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetEventSurveysResponse](../../models/operations/GetEventSurveysResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventSurveyQuestions

Gets a paginated list of event survey questions for a given event and survey. The <a href="#operation/getLargeChoices"> GET List Large Choices </a> endpoint returns choices for the large choice question `type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventSurveyQuestions" method="get" path="/events/{id}/surveys/{surveyId}/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventSurveyQuestionsRequest;
import com.cvent.models.operations.GetEventSurveyQuestionsResponse;
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

        GetEventSurveyQuestionsRequest req = GetEventSurveyQuestionsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.surveys().getEventSurveyQuestions()
                .callAsStream()
                .forEach((GetEventSurveyQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetEventSurveyQuestionsRequest](../../models/operations/GetEventSurveyQuestionsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetEventSurveyQuestionsResponse](../../models/operations/GetEventSurveyQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventSurveyRespondents

Gets a paginated list of event survey respondents for a single event and survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventSurveyRespondents" method="get" path="/events/{id}/surveys/{surveyId}/respondents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventSurveyRespondentsRequest;
import com.cvent.models.operations.GetEventSurveyRespondentsResponse;
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

        GetEventSurveyRespondentsRequest req = GetEventSurveyRespondentsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getEventSurveyRespondents()
                .callAsStream()
                .forEach((GetEventSurveyRespondentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetEventSurveyRespondentsRequest](../../models/operations/GetEventSurveyRespondentsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetEventSurveyRespondentsResponse](../../models/operations/GetEventSurveyRespondentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createEventSurveyRespondent

Create a respondent for an event survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="createEventSurveyRespondent" method="post" path="/events/{id}/surveys/{surveyId}/respondents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateEventSurveyRespondentRequest;
import com.cvent.models.operations.CreateEventSurveyRespondentResponse;
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

        CreateEventSurveyRespondentRequest req = CreateEventSurveyRespondentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .eventSurveyRespondent(EventSurveyRespondentInput.builder()
                    .localeId("en-US")
                    .respondedThrough(RespondedThroughJson.API)
                    .referenceId("facebook")
                    .sourceId("IN4IDS1")
                    .attendee(EventSurveyRespondentAttendee.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .build())
                .build();

        CreateEventSurveyRespondentResponse res = sdk.surveys().createEventSurveyRespondent()
                .request(req)
                .call();

        if (res.eventSurveyRespondent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateEventSurveyRespondentRequest](../../models/operations/CreateEventSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateEventSurveyRespondentResponse](../../models/operations/CreateEventSurveyRespondentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateEventSurveyRespondent

Update respondent for an event survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateEventSurveyRespondent" method="put" path="/events/{id}/surveys/{surveyId}/respondents/{respondentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateEventSurveyRespondentRequest;
import com.cvent.models.operations.UpdateEventSurveyRespondentResponse;
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

        UpdateEventSurveyRespondentRequest req = UpdateEventSurveyRespondentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .respondentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .eventSurveyRespondent(EventSurveyRespondentInput.builder()
                    .localeId("en-US")
                    .respondedThrough(RespondedThroughJson.API)
                    .referenceId("facebook")
                    .sourceId("IN4IDS1")
                    .attendee(EventSurveyRespondentAttendee.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .build())
                .build();

        UpdateEventSurveyRespondentResponse res = sdk.surveys().updateEventSurveyRespondent()
                .request(req)
                .call();

        if (res.eventSurveyRespondent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateEventSurveyRespondentRequest](../../models/operations/UpdateEventSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateEventSurveyRespondentResponse](../../models/operations/UpdateEventSurveyRespondentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createEventSurveyResponses

Create responses for a particular respondent in an event survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="createEventSurveyResponses" method="post" path="/events/{id}/surveys/{surveyId}/respondents/{respondentId}/responses" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateEventSurveyResponsesRequest;
import com.cvent.models.operations.CreateEventSurveyResponsesResponse;
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

        CreateEventSurveyResponsesRequest req = CreateEventSurveyResponsesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .respondentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .eventSurveyResponse(EventSurveyResponseInput.builder()
                    .question(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .answers(List.of(
                        AnswerJson1.builder()
                            .type(AnswerTypeJson1.CHOICE_TEXT)
                            .value("1")
                            .choice(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .category(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .subCategory(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .field(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .build()))
                    .survey(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .session(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .speaker(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .build())
                .build();

        CreateEventSurveyResponsesResponse res = sdk.surveys().createEventSurveyResponses()
                .request(req)
                .call();

        if (res.eventSurveyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateEventSurveyResponsesRequest](../../models/operations/CreateEventSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateEventSurveyResponsesResponse](../../models/operations/CreateEventSurveyResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventSurveyResponses

Gets a paginated list of event survey responses for a single event and survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventSurveyResponses" method="get" path="/events/{id}/surveys/{surveyId}/responses" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventSurveyResponsesRequest;
import com.cvent.models.operations.GetEventSurveyResponsesResponse;
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

        GetEventSurveyResponsesRequest req = GetEventSurveyResponsesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getEventSurveyResponses()
                .callAsStream()
                .forEach((GetEventSurveyResponsesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetEventSurveyResponsesRequest](../../models/operations/GetEventSurveyResponsesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetEventSurveyResponsesResponse](../../models/operations/GetEventSurveyResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getLargeChoices

Gets a paginated list of choices for large choice question`type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="java" operationID="getLargeChoices" method="get" path="/large-choices" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetLargeChoicesRequest;
import com.cvent.models.operations.GetLargeChoicesResponse;
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

        GetLargeChoicesRequest req = GetLargeChoicesRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getLargeChoices()
                .callAsStream()
                .forEach((GetLargeChoicesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetLargeChoicesRequest](../../models/operations/GetLargeChoicesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetLargeChoicesResponse](../../models/operations/GetLargeChoicesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getQuestions

Gets a paginated list of event and standalone survey questions. The <a href="#operation/getLargeChoices"> GET List Large Choices </a> endpoint returns choices for the large choice question `type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="java" operationID="getQuestions" method="get" path="/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetQuestionsRequest;
import com.cvent.models.operations.GetQuestionsResponse;
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

        GetQuestionsRequest req = GetQuestionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getQuestions()
                .callAsStream()
                .forEach((GetQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetQuestionsRequest](../../models/operations/GetQuestionsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetQuestionsResponse](../../models/operations/GetQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getRespondents

Gets a paginated list of event and standalone surveys respondents.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRespondents" method="get" path="/respondents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetRespondentsRequest;
import com.cvent.models.operations.GetRespondentsResponse;
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

        GetRespondentsRequest req = GetRespondentsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getRespondents()
                .callAsStream()
                .forEach((GetRespondentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRespondentsRequest](../../models/operations/GetRespondentsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRespondentsResponse](../../models/operations/GetRespondentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getResponses

Gets a paginated list of event and standalone survey responses.

### Example Usage

<!-- UsageSnippet language="java" operationID="getResponses" method="get" path="/responses" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetResponsesRequest;
import com.cvent.models.operations.GetResponsesResponse;
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

        GetResponsesRequest req = GetResponsesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("question.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or question.id eq '1983f506-a4a5-4a05-b3f6-ff7f7afc58f1'")
                .build();


        sdk.surveys().getResponses()
                .callAsStream()
                .forEach((GetResponsesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetResponsesRequest](../../models/operations/GetResponsesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetResponsesResponse](../../models/operations/GetResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getStandardSurveys

Gets a paginated list of standalone surveys not associated with an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getStandardSurveys" method="get" path="/standard-surveys" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetStandardSurveysRequest;
import com.cvent.models.operations.GetStandardSurveysResponse;
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

        GetStandardSurveysRequest req = GetStandardSurveysRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("status eq 'active' and created gt '2020-12-12T11:30:37.909Z' and title eq 'Survey Demo' and code ne 'NFWHF5DW46A'")
                .build();


        sdk.surveys().getStandardSurveys()
                .callAsStream()
                .forEach((GetStandardSurveysResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetStandardSurveysRequest](../../models/operations/GetStandardSurveysRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetStandardSurveysResponse](../../models/operations/GetStandardSurveysResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getStandardSurveyResponses

Gets a paginated list of standalone survey responses.

### Example Usage

<!-- UsageSnippet language="java" operationID="getStandardSurveyResponses" method="get" path="/standard-surveys/responses" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetStandardSurveyResponsesRequest;
import com.cvent.models.operations.GetStandardSurveyResponsesResponse;
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

        GetStandardSurveyResponsesRequest req = GetStandardSurveyResponsesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("question.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or question.id eq '1983f506-a4a5-4a05-b3f6-ff7f7afc58f1'")
                .build();


        sdk.surveys().getStandardSurveyResponses()
                .callAsStream()
                .forEach((GetStandardSurveyResponsesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetStandardSurveyResponsesRequest](../../models/operations/GetStandardSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetStandardSurveyResponsesResponse](../../models/operations/GetStandardSurveyResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getStandardSurveyEmailTemplates

Gets a paginated list of standalone survey email templates for a single survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="getStandardSurveyEmailTemplates" method="get" path="/standard-surveys/{surveyId}/email-templates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetStandardSurveyEmailTemplatesRequest;
import com.cvent.models.operations.GetStandardSurveyEmailTemplatesResponse;
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

        GetStandardSurveyEmailTemplatesRequest req = GetStandardSurveyEmailTemplatesRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.surveys().getStandardSurveyEmailTemplates()
                .callAsStream()
                .forEach((GetStandardSurveyEmailTemplatesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetStandardSurveyEmailTemplatesRequest](../../models/operations/GetStandardSurveyEmailTemplatesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetStandardSurveyEmailTemplatesResponse](../../models/operations/GetStandardSurveyEmailTemplatesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getStandardSurveyQuestions

Gets a paginated list of standalone survey questions for a single standalone survey. The <a href="#operation/getLargeChoices"> GET List Large Choices </a> endpoint returns choices for the large choice question `type` (`LargeChoices`).

### Example Usage

<!-- UsageSnippet language="java" operationID="getStandardSurveyQuestions" method="get" path="/standard-surveys/{surveyId}/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetStandardSurveyQuestionsRequest;
import com.cvent.models.operations.GetStandardSurveyQuestionsResponse;
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

        GetStandardSurveyQuestionsRequest req = GetStandardSurveyQuestionsRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.surveys().getStandardSurveyQuestions()
                .callAsStream()
                .forEach((GetStandardSurveyQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetStandardSurveyQuestionsRequest](../../models/operations/GetStandardSurveyQuestionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetStandardSurveyQuestionsResponse](../../models/operations/GetStandardSurveyQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getStandardSurveyRespondents

Gets a paginated list of standalone survey respondents for a single standalone survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="getStandardSurveyRespondents" method="get" path="/standard-surveys/{surveyId}/respondents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetStandardSurveyRespondentsRequest;
import com.cvent.models.operations.GetStandardSurveyRespondentsResponse;
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

        GetStandardSurveyRespondentsRequest req = GetStandardSurveyRespondentsRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.surveys().getStandardSurveyRespondents()
                .callAsStream()
                .forEach((GetStandardSurveyRespondentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetStandardSurveyRespondentsRequest](../../models/operations/GetStandardSurveyRespondentsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetStandardSurveyRespondentsResponse](../../models/operations/GetStandardSurveyRespondentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createStandardSurveyRespondent

Creates a respondent for a standalone survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="createStandardSurveyRespondent" method="post" path="/standard-surveys/{surveyId}/respondents" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateStandardSurveyRespondentRequest;
import com.cvent.models.operations.CreateStandardSurveyRespondentResponse;
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

        CreateStandardSurveyRespondentRequest req = CreateStandardSurveyRespondentRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .standardSurveyRespondent(StandardSurveyRespondentInput.builder()
                    .localeId("en-US")
                    .respondedThrough(RespondedThroughJson.API)
                    .referenceId("facebook")
                    .sourceId("IN4IDS1")
                    .contact(StandardSurveyRespondentContact.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .status(RespondentStatusJson.NO_RESPONSE)
                    .invitationList(InvitationListCommonJson.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .transactionId("TR5IDS4")
                    .build())
                .build();

        CreateStandardSurveyRespondentResponse res = sdk.surveys().createStandardSurveyRespondent()
                .request(req)
                .call();

        if (res.standardSurveyRespondent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [CreateStandardSurveyRespondentRequest](../../models/operations/CreateStandardSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[CreateStandardSurveyRespondentResponse](../../models/operations/CreateStandardSurveyRespondentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateStandardSurveyRespondent

Update respondent for a standalone survey.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateStandardSurveyRespondent" method="put" path="/standard-surveys/{surveyId}/respondents/{respondentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateStandardSurveyRespondentRequest;
import com.cvent.models.operations.UpdateStandardSurveyRespondentResponse;
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

        UpdateStandardSurveyRespondentRequest req = UpdateStandardSurveyRespondentRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .respondentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .standardSurveyRespondent(StandardSurveyRespondentInput.builder()
                    .localeId("en-US")
                    .respondedThrough(RespondedThroughJson.API)
                    .referenceId("facebook")
                    .sourceId("IN4IDS1")
                    .contact(StandardSurveyRespondentContact.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .status(RespondentStatusJson.NO_RESPONSE)
                    .invitationList(InvitationListCommonJson.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .transactionId("TR5IDS4")
                    .build())
                .build();

        UpdateStandardSurveyRespondentResponse res = sdk.surveys().updateStandardSurveyRespondent()
                .request(req)
                .call();

        if (res.standardSurveyRespondent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UpdateStandardSurveyRespondentRequest](../../models/operations/UpdateStandardSurveyRespondentRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UpdateStandardSurveyRespondentResponse](../../models/operations/UpdateStandardSurveyRespondentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## sendStandardSurveyEmail

Sends standalone survey email.

### Example Usage

<!-- UsageSnippet language="java" operationID="sendStandardSurveyEmail" method="post" path="/standard-surveys/{surveyId}/respondents/{respondentId}/email-templates/{emailTemplateId}/email" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.SendStandardSurveyEmailRequest;
import com.cvent.models.operations.SendStandardSurveyEmailResponse;
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

        SendStandardSurveyEmailRequest req = SendStandardSurveyEmailRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .respondentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .emailTemplateId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        SendStandardSurveyEmailResponse res = sdk.surveys().sendStandardSurveyEmail()
                .request(req)
                .call();

        if (res.standardSurveySendEmailResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [SendStandardSurveyEmailRequest](../../models/operations/SendStandardSurveyEmailRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[SendStandardSurveyEmailResponse](../../models/operations/SendStandardSurveyEmailResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createStandardSurveyResponses

Create responses for a particular standalone survey respondent.

### Example Usage

<!-- UsageSnippet language="java" operationID="createStandardSurveyResponses" method="post" path="/standard-surveys/{surveyId}/respondents/{respondentId}/responses" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateStandardSurveyResponsesRequest;
import com.cvent.models.operations.CreateStandardSurveyResponsesResponse;
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

        CreateStandardSurveyResponsesRequest req = CreateStandardSurveyResponsesRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .respondentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .standardSurveyResponse(StandardSurveyResponseInput.builder()
                    .question(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .answers(List.of())
                    .survey(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .loopingChoice(LoopingChoiceJson.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .build())
                .build();

        CreateStandardSurveyResponsesResponse res = sdk.surveys().createStandardSurveyResponses()
                .request(req)
                .call();

        if (res.standardSurveyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateStandardSurveyResponsesRequest](../../models/operations/CreateStandardSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateStandardSurveyResponsesResponse](../../models/operations/CreateStandardSurveyResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateStandardSurveyResponses

Update responses for a particular standalone survey respondent.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateStandardSurveyResponses" method="put" path="/standard-surveys/{surveyId}/respondents/{respondentId}/responses/{responseId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateStandardSurveyResponsesRequest;
import com.cvent.models.operations.UpdateStandardSurveyResponsesResponse;
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

        UpdateStandardSurveyResponsesRequest req = UpdateStandardSurveyResponsesRequest.builder()
                .surveyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .respondentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .responseId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .standardSurveyResponse(StandardSurveyResponseInput.builder()
                    .question(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .answers(List.of(
                        AnswerJson1.builder()
                            .type(AnswerTypeJson1.CHOICE_TEXT)
                            .value("1")
                            .choice(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .category(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .subCategory(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .field(UuidJson.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .build()))
                    .survey(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .loopingChoice(LoopingChoiceJson.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .build())
                .build();

        UpdateStandardSurveyResponsesResponse res = sdk.surveys().updateStandardSurveyResponses()
                .request(req)
                .call();

        if (res.standardSurveyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateStandardSurveyResponsesRequest](../../models/operations/UpdateStandardSurveyResponsesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateStandardSurveyResponsesResponse](../../models/operations/UpdateStandardSurveyResponsesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSurvey

Gets a paginated list of event and standalone surveys associated to an account.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSurvey" method="get" path="/surveys" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSurveyRequest;
import com.cvent.models.operations.GetSurveyResponse;
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

        GetSurveyRequest req = GetSurveyRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and type eq 'Standalone'")
                .build();


        sdk.surveys().getSurvey()
                .callAsStream()
                .forEach((GetSurveyResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetSurveyRequest](../../models/operations/GetSurveyRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetSurveyResponse](../../models/operations/GetSurveyResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |