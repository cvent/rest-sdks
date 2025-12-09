# TravelRFPs

## Overview

The Travel RFP APIs provide access to travel programs and proposals. A travel program
represents a request for proposal (RFP) that defines the specific travel needs and
requirements of a travel account. The travel account solicits hotels and other travel
suppliers to respond to the program with proposals, which provide detailed
information on rates and amenities.'


### Available Operations

* [listTravelPrograms](#listtravelprograms) - List Travel Programs
* [listTravelProgramsQuestions](#listtravelprogramsquestions) - List Travel Programs Questions
* [getTravelProgram](#gettravelprogram) - Get Travel Program
* [listTravelProgramQuestions](#listtravelprogramquestions) - List Travel Program Questions
* [getTravelProgramQuestion](#gettravelprogramquestion) - Get Travel Program Question
* [listTravelProposals](#listtravelproposals) - List Travel Proposals
* [listTravelProposalBids](#listtravelproposalbids) - List Travel Proposal Bids
* [getTravelProposalBid](#gettravelproposalbid) - Get Travel Proposal Bid
* [getTravelProposal](#gettravelproposal) - Get Travel Proposal

## listTravelPrograms

Returns a paginated list of travel programs based on the specified filters.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTravelPrograms" method="get" path="/travel-programs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTravelProgramsRequest;
import com.cvent.models.operations.ListTravelProgramsResponse;
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

        ListTravelProgramsRequest req = ListTravelProgramsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("travelAccount.id eq 3c74daaf-11af-4b43-9a4e-ed3ec60f9bd3")
                .build();


        sdk.travelRFPs().listTravelPrograms()
                .callAsStream()
                .forEach((ListTravelProgramsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListTravelProgramsRequest](../../models/operations/ListTravelProgramsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListTravelProgramsResponse](../../models/operations/ListTravelProgramsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listTravelProgramsQuestions

Returns a paginated list of travel programs questions.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTravelProgramsQuestions" method="get" path="/travel-programs/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTravelProgramsQuestionsRequest;
import com.cvent.models.operations.ListTravelProgramsQuestionsResponse;
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

        ListTravelProgramsQuestionsRequest req = ListTravelProgramsQuestionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.travelRFPs().listTravelProgramsQuestions()
                .callAsStream()
                .forEach((ListTravelProgramsQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListTravelProgramsQuestionsRequest](../../models/operations/ListTravelProgramsQuestionsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListTravelProgramsQuestionsResponse](../../models/operations/ListTravelProgramsQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTravelProgram

Returns the details of a single travel program based on the specified program ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTravelProgram" method="get" path="/travel-programs/{programId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTravelProgramRequest;
import com.cvent.models.operations.GetTravelProgramResponse;
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

        GetTravelProgramRequest req = GetTravelProgramRequest.builder()
                .programId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetTravelProgramResponse res = sdk.travelRFPs().getTravelProgram()
                .request(req)
                .call();

        if (res.travelProgram().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetTravelProgramRequest](../../models/operations/GetTravelProgramRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetTravelProgramResponse](../../models/operations/GetTravelProgramResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listTravelProgramQuestions

Returns a paginated list of travel program questions.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTravelProgramQuestions" method="get" path="/travel-programs/{programId}/questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTravelProgramQuestionsRequest;
import com.cvent.models.operations.ListTravelProgramQuestionsResponse;
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

        ListTravelProgramQuestionsRequest req = ListTravelProgramQuestionsRequest.builder()
                .programId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.travelRFPs().listTravelProgramQuestions()
                .callAsStream()
                .forEach((ListTravelProgramQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListTravelProgramQuestionsRequest](../../models/operations/ListTravelProgramQuestionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListTravelProgramQuestionsResponse](../../models/operations/ListTravelProgramQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTravelProgramQuestion

Returns the details of a single question based on the specified program and question ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTravelProgramQuestion" method="get" path="/travel-programs/{programId}/questions/{questionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTravelProgramQuestionRequest;
import com.cvent.models.operations.GetTravelProgramQuestionResponse;
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

        GetTravelProgramQuestionRequest req = GetTravelProgramQuestionRequest.builder()
                .programId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .questionId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetTravelProgramQuestionResponse res = sdk.travelRFPs().getTravelProgramQuestion()
                .request(req)
                .call();

        if (res.question().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetTravelProgramQuestionRequest](../../models/operations/GetTravelProgramQuestionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetTravelProgramQuestionResponse](../../models/operations/GetTravelProgramQuestionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listTravelProposals

Get a paginated list of travel proposal details.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTravelProposals" method="get" path="/travel-proposals" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTravelProposalsRequest;
import com.cvent.models.operations.ListTravelProposalsResponse;
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

        ListTravelProposalsRequest req = ListTravelProposalsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("travelProgram.id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'")
                .build();


        sdk.travelRFPs().listTravelProposals()
                .callAsStream()
                .forEach((ListTravelProposalsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListTravelProposalsRequest](../../models/operations/ListTravelProposalsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListTravelProposalsResponse](../../models/operations/ListTravelProposalsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listTravelProposalBids

Get a paginated list of travel proposal bids.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTravelProposalBids" method="get" path="/travel-proposals/bids" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTravelProposalBidsRequest;
import com.cvent.models.operations.ListTravelProposalBidsResponse;
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

        ListTravelProposalBidsRequest req = ListTravelProposalBidsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("proposal.id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'")
                .build();


        sdk.travelRFPs().listTravelProposalBids()
                .callAsStream()
                .forEach((ListTravelProposalBidsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListTravelProposalBidsRequest](../../models/operations/ListTravelProposalBidsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListTravelProposalBidsResponse](../../models/operations/ListTravelProposalBidsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTravelProposalBid

Gets a travel proposal bid for the given travel proposal bid ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetTravelProposalBid" method="get" path="/travel-proposals/bids/{travelProposalBidId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTravelProposalBidRequest;
import com.cvent.models.operations.GetTravelProposalBidResponse;
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

        GetTravelProposalBidRequest req = GetTravelProposalBidRequest.builder()
                .travelProposalBidId("413c5cc2-cb77-4082-9131-bab73fde5834")
                .build();

        GetTravelProposalBidResponse res = sdk.travelRFPs().getTravelProposalBid()
                .request(req)
                .call();

        if (res.travelProposalBid().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetTravelProposalBidRequest](../../models/operations/GetTravelProposalBidRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetTravelProposalBidResponse](../../models/operations/GetTravelProposalBidResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTravelProposal

Gets a travel proposal for the given travel proposal ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetTravelProposal" method="get" path="/travel-proposals/{travelProposalId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTravelProposalRequest;
import com.cvent.models.operations.GetTravelProposalResponse;
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

        GetTravelProposalRequest req = GetTravelProposalRequest.builder()
                .travelProposalId("413c5cc2-cb77-4082-9131-bab73fde5834")
                .build();

        GetTravelProposalResponse res = sdk.travelRFPs().getTravelProposal()
                .request(req)
                .call();

        if (res.travelProposal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetTravelProposalRequest](../../models/operations/GetTravelProposalRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetTravelProposalResponse](../../models/operations/GetTravelProposalResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |