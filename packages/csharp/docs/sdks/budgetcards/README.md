# BudgetCards

## Overview

Budget cards and their transactions support payment activity associated with an account. Use these APIs to retrieve budget cards and create, retrieve, update, and delete card transactions.

### Available Operations

* [GetCards](#getcards) - List Cards
* [GetCardTransactions](#getcardtransactions) - List Card Transactions
* [CreateCardTransaction](#createcardtransaction) - Create Card Transaction
* [DeleteCardTransaction](#deletecardtransaction) - Delete Card Transaction
* [UpdateCardTransaction](#updatecardtransaction) - Update Card Transaction

## GetCards

Gets a paginated list of payment cards associated to the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getCards" method="get" path="/cards" -->
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

GetCardsRequest req = new GetCardsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq 'E05029A8-39F5-49DF-8450-2EB41B302421'",
};

GetCardsResponse? res = await sdk.BudgetCards.GetCardsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetCardsRequest](../../Models/Requests/GetCardsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetCardsResponse](../../Models/Requests/GetCardsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetCardTransactions

Retrieves a paginated list of card transactions for your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getCardTransactions" method="get" path="/cards/transactions" -->
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

GetCardTransactionsRequest req = new GetCardTransactionsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq 'E05029A8-39F5-49DF-8450-2EB41B302421' and type ne 'Virtual' and status eq 'Active' or status eq 'Inactive'",
};

GetCardTransactionsResponse? res = await sdk.BudgetCards.GetCardTransactionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCardTransactionsRequest](../../Models/Requests/GetCardTransactionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCardTransactionsResponse](../../Models/Requests/GetCardTransactionsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateCardTransaction

Creates a single card transaction record using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createCardTransaction" method="post" path="/cards/transactions" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CardTransactionCreate req = new CardTransactionCreate() {
    Id = "1VCAPITRAN18012023",
    EventId = "9463c74e-18c6-401a-a710-ae0f485bf959",
    CardDescription = "API Card Transaction",
    TransactionAmount = 1000.87D,
    TransactionDate = System.DateTime.Parse("2020-02-07T00:00:00.00Z").ToUniversalTime(),
    TransactionCurrency = "USD",
    TransactionMerchant = "API Merchant",
};

var res = await sdk.BudgetCards.CreateCardTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CardTransactionCreate](../../Models/Components/CardTransactionCreate.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCardTransactionResponse](../../Models/Requests/CreateCardTransactionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteCardTransaction

Deletes a card transaction.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteCardTransaction" method="delete" path="/cards/transactions/{transactionId}" -->
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

DeleteCardTransactionRequest req = new DeleteCardTransactionRequest() {
    TransactionId = "1VCAPITRAN18012023",
};

var res = await sdk.BudgetCards.DeleteCardTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteCardTransactionRequest](../../Models/Requests/DeleteCardTransactionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteCardTransactionResponse](../../Models/Requests/DeleteCardTransactionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 409, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateCardTransaction

Updates a card transaction using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateCardTransaction" method="put" path="/cards/transactions/{transactionId}" -->
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

UpdateCardTransactionRequest req = new UpdateCardTransactionRequest() {
    TransactionId = "1VCAPITRAN18012023",
    CardTransactionUpdate = new CardTransactionUpdate() {
        Id = "1VCAPITRAN18012023",
        EventId = "9463c74e-18c6-401a-a710-ae0f485bf959",
        CardDescription = "API Card Transaction",
        TransactionAmount = 1000.87D,
        TransactionDate = System.DateTime.Parse("2020-02-07T00:00:00.00Z").ToUniversalTime(),
        TransactionCurrency = "USD",
        TransactionMerchant = "API Merchant",
    },
};

var res = await sdk.BudgetCards.UpdateCardTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCardTransactionRequest](../../Models/Requests/UpdateCardTransactionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCardTransactionResponse](../../Models/Requests/UpdateCardTransactionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |