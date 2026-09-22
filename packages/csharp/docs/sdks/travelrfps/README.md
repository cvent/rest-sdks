# TravelRFPs

## Overview

The Travel RFP APIs provide access to travel programs and proposals. A travel program
represents a request for proposal (RFP) that defines the specific travel needs and
requirements of a travel account. The travel account solicits hotels and other travel
suppliers to respond to the program with proposals, which provide detailed
information on rates and amenities.'


### Available Operations

* [ListTravelPrograms](#listtravelprograms) - List Travel Programs
* [ListTravelProgramsQuestions](#listtravelprogramsquestions) - List Travel Programs Questions
* [GetTravelProgram](#gettravelprogram) - Get Travel Program
* [ListTravelProgramQuestions](#listtravelprogramquestions) - List Travel Program Questions
* [GetTravelProgramQuestion](#gettravelprogramquestion) - Get Travel Program Question
* [ListTravelProposals](#listtravelproposals) - List Travel Proposals
* [ListTravelProposalBids](#listtravelproposalbids) - List Travel Proposal Bids
* [GetTravelProposalBid](#gettravelproposalbid) - Get Travel Proposal Bid
* [ListTravelBuyerProposalBids](#listtravelbuyerproposalbids) - List Buyer Proposal Bids
* [GetTravelBuyerProposalBid](#gettravelbuyerproposalbid) - Get Buyer Proposal Bid
* [ListTravelProposalStaticContent](#listtravelproposalstaticcontent) - List Static Contents
* [GetTravelProposal](#gettravelproposal) - Get Travel Proposal
* [GetTravelProposalStaticContent](#gettravelproposalstaticcontent) - Get Static Content

## ListTravelPrograms

Returns a paginated list of travel programs based on the specified filters.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelPrograms" method="get" path="/travel-programs" -->
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

ListTravelProgramsRequest req = new ListTravelProgramsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "travelAccount.id eq 3c74daaf-11af-4b43-9a4e-ed3ec60f9bd3",
};

ListTravelProgramsResponse? res = await sdk.TravelRFPs.ListTravelProgramsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListTravelProgramsRequest](../../Models/Requests/ListTravelProgramsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListTravelProgramsResponse](../../Models/Requests/ListTravelProgramsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListTravelProgramsQuestions

Returns a paginated list of travel programs questions.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelProgramsQuestions" method="get" path="/travel-programs/questions" -->
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

ListTravelProgramsQuestionsRequest req = new ListTravelProgramsQuestionsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListTravelProgramsQuestionsResponse? res = await sdk.TravelRFPs.ListTravelProgramsQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListTravelProgramsQuestionsRequest](../../Models/Requests/ListTravelProgramsQuestionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListTravelProgramsQuestionsResponse](../../Models/Requests/ListTravelProgramsQuestionsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTravelProgram

Returns the details of a single travel program based on the specified program ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTravelProgram" method="get" path="/travel-programs/{programId}" -->
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

GetTravelProgramRequest req = new GetTravelProgramRequest() {
    ProgramId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.TravelRFPs.GetTravelProgramAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTravelProgramRequest](../../Models/Requests/GetTravelProgramRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetTravelProgramResponse](../../Models/Requests/GetTravelProgramResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListTravelProgramQuestions

Returns a paginated list of travel program questions.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelProgramQuestions" method="get" path="/travel-programs/{programId}/questions" -->
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

ListTravelProgramQuestionsRequest req = new ListTravelProgramQuestionsRequest() {
    ProgramId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListTravelProgramQuestionsResponse? res = await sdk.TravelRFPs.ListTravelProgramQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListTravelProgramQuestionsRequest](../../Models/Requests/ListTravelProgramQuestionsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListTravelProgramQuestionsResponse](../../Models/Requests/ListTravelProgramQuestionsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTravelProgramQuestion

Returns the details of a single question based on the specified program and question ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTravelProgramQuestion" method="get" path="/travel-programs/{programId}/questions/{questionId}" -->
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

GetTravelProgramQuestionRequest req = new GetTravelProgramQuestionRequest() {
    ProgramId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    QuestionId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.TravelRFPs.GetTravelProgramQuestionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetTravelProgramQuestionRequest](../../Models/Requests/GetTravelProgramQuestionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetTravelProgramQuestionResponse](../../Models/Requests/GetTravelProgramQuestionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListTravelProposals

Get a paginated list of travel proposal details.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelProposals" method="get" path="/travel-proposals" -->
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

ListTravelProposalsRequest req = new ListTravelProposalsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "travelProgram.id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
};

ListTravelProposalsResponse? res = await sdk.TravelRFPs.ListTravelProposalsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListTravelProposalsRequest](../../Models/Requests/ListTravelProposalsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListTravelProposalsResponse](../../Models/Requests/ListTravelProposalsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListTravelProposalBids

Get a paginated list of travel proposal bids.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelProposalBids" method="get" path="/travel-proposals/bids" -->
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

ListTravelProposalBidsRequest req = new ListTravelProposalBidsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "proposal.id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
};

ListTravelProposalBidsResponse? res = await sdk.TravelRFPs.ListTravelProposalBidsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListTravelProposalBidsRequest](../../Models/Requests/ListTravelProposalBidsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListTravelProposalBidsResponse](../../Models/Requests/ListTravelProposalBidsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTravelProposalBid

Gets a travel proposal bid for the given travel proposal bid ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="GetTravelProposalBid" method="get" path="/travel-proposals/bids/{travelProposalBidId}" -->
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

GetTravelProposalBidRequest req = new GetTravelProposalBidRequest() {
    TravelProposalBidId = "413c5cc2-cb77-4082-9131-bab73fde5834",
};

var res = await sdk.TravelRFPs.GetTravelProposalBidAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetTravelProposalBidRequest](../../Models/Requests/GetTravelProposalBidRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetTravelProposalBidResponse](../../Models/Requests/GetTravelProposalBidResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListTravelBuyerProposalBids

Get a paginated list of travel buyer proposal bids.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelBuyerProposalBids" method="get" path="/travel-proposals/buyer-bids" -->
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

ListTravelBuyerProposalBidsRequest req = new ListTravelBuyerProposalBidsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "proposal.id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
};

ListTravelBuyerProposalBidsResponse? res = await sdk.TravelRFPs.ListTravelBuyerProposalBidsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListTravelBuyerProposalBidsRequest](../../Models/Requests/ListTravelBuyerProposalBidsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListTravelBuyerProposalBidsResponse](../../Models/Requests/ListTravelBuyerProposalBidsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTravelBuyerProposalBid

Gets a travel buyer proposal bid for the given travel buyer proposal bid ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="GetTravelBuyerProposalBid" method="get" path="/travel-proposals/buyer-bids/{travelProposalBidId}" -->
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

GetTravelBuyerProposalBidRequest req = new GetTravelBuyerProposalBidRequest() {
    TravelProposalBidId = "413c5cc2-cb77-4082-9131-bab73fde5834",
};

var res = await sdk.TravelRFPs.GetTravelBuyerProposalBidAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetTravelBuyerProposalBidRequest](../../Models/Requests/GetTravelBuyerProposalBidRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetTravelBuyerProposalBidResponse](../../Models/Requests/GetTravelBuyerProposalBidResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListTravelProposalStaticContent

Gets a paginated list of proposal static content across multiple proposals.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelProposalStaticContent" method="get" path="/travel-proposals/static-contents" -->
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

ListTravelProposalStaticContentRequest req = new ListTravelProposalStaticContentRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "travelProposal.id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
};

ListTravelProposalStaticContentResponse? res = await sdk.TravelRFPs.ListTravelProposalStaticContentAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ListTravelProposalStaticContentRequest](../../Models/Requests/ListTravelProposalStaticContentRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ListTravelProposalStaticContentResponse](../../Models/Requests/ListTravelProposalStaticContentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTravelProposal

Gets a travel proposal for the given travel proposal ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="GetTravelProposal" method="get" path="/travel-proposals/{travelProposalId}" -->
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

GetTravelProposalRequest req = new GetTravelProposalRequest() {
    TravelProposalId = "413c5cc2-cb77-4082-9131-bab73fde5834",
};

var res = await sdk.TravelRFPs.GetTravelProposalAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetTravelProposalRequest](../../Models/Requests/GetTravelProposalRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetTravelProposalResponse](../../Models/Requests/GetTravelProposalResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTravelProposalStaticContent

Retrieves static content for a specific proposal as a list of field-value pairs with sequence ordering.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="GetTravelProposalStaticContent" method="get" path="/travel-proposals/{travelProposalId}/static-content" -->
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

GetTravelProposalStaticContentRequest req = new GetTravelProposalStaticContentRequest() {
    TravelProposalId = "413c5cc2-cb77-4082-9131-bab73fde5834",
};

var res = await sdk.TravelRFPs.GetTravelProposalStaticContentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetTravelProposalStaticContentRequest](../../Models/Requests/GetTravelProposalStaticContentRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetTravelProposalStaticContentResponse](../../Models/Requests/GetTravelProposalStaticContentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |