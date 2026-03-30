# Budget

## Overview

Budget is an event feature used to organize spending and track [allocations](https://support.cvent.com/s/communityarticle/Setting-Up-Budget-Allocations). Use this API to view budget items, cards and card transactions related to the budget module.

### Available Operations

* [GetAccountBudgetItems](#getaccountbudgetitems) - List Budget Items
* [GetCards](#getcards) - List Cards
* [GetCardTransactions](#getcardtransactions) - List Card Transactions
* [CreateCardTransaction](#createcardtransaction) - Create Card Transaction
* [DeleteCardTransaction](#deletecardtransaction) - Delete Card Transaction
* [UpdateCardTransaction](#updatecardtransaction) - Update Card Transaction
* [GetCurrencyConversionRate](#getcurrencyconversionrate) - List Currency Conversion Rates
* [CreateCurrencyConversionRate](#createcurrencyconversionrate) - Create Conversion Rate
* [UpdateCurrencyConversionRate](#updatecurrencyconversionrate) - Update Conversion Rate
* [DeleteCurrencyConversionRate](#deletecurrencyconversionrate) - Delete Conversion Rate
* [GetBudgetItems](#getbudgetitems) - List Event Budget Items
* [CreateBudgetItem](#createbudgetitem) - Create Budget Item
* [GetBudgetAllocations](#getbudgetallocations) - List Budget Allocations
* [UpdateBudgetItem](#updatebudgetitem) - Update Budget Item
* [UpdateBudgetAllocations](#updatebudgetallocations) - Update Budget Allocations
* [DeleteBudgetAllocations](#deletebudgetallocations) - Delete  Budget Allocations
* [CreatePayment](#createpayment) - Create Budget Payment
* [UpdatePayment](#updatepayment) - Update Budget Payment
* [DeletePayment](#deletepayment) - Delete Budget Payment
* [AnswerBudgetCustomField](#answerbudgetcustomfield) - Update Budget Cstm Fld Answers
* [GetPayments](#getpayments) - List Budget Payments
* [AttachInvoiceToPayment](#attachinvoicetopayment) - Assign Invoice To Payment
* [GetEventBudgetTotals](#geteventbudgettotals) - List Budget Totals

## GetAccountBudgetItems

Gets a paginated list of budget items across all events linked to the account associated with the access token. The data can be filtered by the specified after and before date parameters, based on the last modified date, for a maximum duration of 1 year per request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountBudgetItems" method="get" path="/budget-items" -->
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

GetAccountBudgetItemsRequest req = new GetAccountBudgetItemsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5' and budgetVersion.id ne 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5'",
};

GetAccountBudgetItemsResponse? res = await sdk.Budget.GetAccountBudgetItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountBudgetItemsRequest](../../Models/Requests/GetAccountBudgetItemsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountBudgetItemsResponse](../../Models/Requests/GetAccountBudgetItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

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

GetCardsResponse? res = await sdk.Budget.GetCardsAsync(req);

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

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetCardTransactions

Gets a paginated list of card transactions associated with the account of the access token.

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

GetCardTransactionsResponse? res = await sdk.Budget.GetCardTransactionsAsync(req);

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

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateCardTransaction

Creates a single card transaction record.

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

var res = await sdk.Budget.CreateCardTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CardTransactionCreate](../../Models/Components/CardTransactionCreate.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCardTransactionResponse](../../Models/Requests/CreateCardTransactionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteCardTransaction

Deletes a card transaction record.

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

var res = await sdk.Budget.DeleteCardTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteCardTransactionRequest](../../Models/Requests/DeleteCardTransactionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteCardTransactionResponse](../../Models/Requests/DeleteCardTransactionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateCardTransaction

Updates a card transaction record.

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

var res = await sdk.Budget.UpdateCardTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCardTransactionRequest](../../Models/Requests/UpdateCardTransactionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCardTransactionResponse](../../Models/Requests/UpdateCardTransactionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetCurrencyConversionRate

Gets a paginated list of conversion rates for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getCurrencyConversionRate" method="get" path="/currencies/{currency}/conversion-rates" -->
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

GetCurrencyConversionRateRequest req = new GetCurrencyConversionRateRequest() {
    Currency = "USD",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = "startDate eq '2020-02-07' ",
};

GetCurrencyConversionRateResponse? res = await sdk.Budget.GetCurrencyConversionRateAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetCurrencyConversionRateRequest](../../Models/Requests/GetCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetCurrencyConversionRateResponse](../../Models/Requests/GetCurrencyConversionRateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateCurrencyConversionRate

Create conversion rate for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createCurrencyConversionRate" method="post" path="/currencies/{currency}/conversion-rates" -->
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

CreateCurrencyConversionRateRequest req = new CreateCurrencyConversionRateRequest() {
    Currency = "USD",
    CurrencyConversionRate = new CurrencyConversionRate() {
        ConversionRate = 5.2D,
        StartDate = DateOnly.Parse("2020-02-07"),
        EndDate = DateOnly.Parse("2020-02-08"),
    },
};

var res = await sdk.Budget.CreateCurrencyConversionRateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateCurrencyConversionRateRequest](../../Models/Requests/CreateCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateCurrencyConversionRateResponse](../../Models/Requests/CreateCurrencyConversionRateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateCurrencyConversionRate

Updates a conversion rate for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateCurrencyConversionRate" method="put" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
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

UpdateCurrencyConversionRateRequest req = new UpdateCurrencyConversionRateRequest() {
    Currency = "USD",
    ConversionRateId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CurrencyConversionRateRequest = new CurrencyConversionRateRequest() {
        ConversionRate = 5.2D,
        StartDate = DateOnly.Parse("2020-02-07"),
        EndDate = DateOnly.Parse("2020-02-08"),
        Id = "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
};

var res = await sdk.Budget.UpdateCurrencyConversionRateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateCurrencyConversionRateRequest](../../Models/Requests/UpdateCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateCurrencyConversionRateResponse](../../Models/Requests/UpdateCurrencyConversionRateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteCurrencyConversionRate

Deletes conversion rate defined for currency.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteCurrencyConversionRate" method="delete" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
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

DeleteCurrencyConversionRateRequest req = new DeleteCurrencyConversionRateRequest() {
    Currency = "USD",
    ConversionRateId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Budget.DeleteCurrencyConversionRateAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [DeleteCurrencyConversionRateRequest](../../Models/Requests/DeleteCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[DeleteCurrencyConversionRateResponse](../../Models/Requests/DeleteCurrencyConversionRateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBudgetItems

Gets a paginated list of budget items for event associated to the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBudgetItems" method="get" path="/events/{id}/budget-items" -->
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

GetBudgetItemsRequest req = new GetBudgetItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "category.name eq 'Accommodation' and status ne 'Estimated'",
};

GetBudgetItemsResponse? res = await sdk.Budget.GetBudgetItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetBudgetItemsRequest](../../Models/Requests/GetBudgetItemsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetBudgetItemsResponse](../../Models/Requests/GetBudgetItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateBudgetItem

Create single Budget Item based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createBudgetItem" method="post" path="/events/{id}/budget-items" -->
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

CreateBudgetItemRequest req = new CreateBudgetItemRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItem = new BudgetItemInput() {
        CostType = BudgetCostTypeJson.Fixed,
        Name = "Airport Transportation",
        Code = "AIRTRP",
        Category = new BudgetCategoryJsonInput() {
            Id = 3,
        },
        SubCategory = new BudgetSubCategoryJsonInput() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Status = BudgetStatusJson.Estimated,
        Vendor = new BudgetVendorJsonInput() {
            Id = "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
        },
        Date = System.DateTime.Parse("2020-02-07T00:00:00.00Z").ToUniversalTime(),
        GeneralLedger = new GeneralLedgerJson1Input() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        CostAvoidance = new BudgetCostAvoidanceJson() {
            Amount = 99.5D,
            Description = "Discounted Cost",
        },
        CostIncludesTaxGratuity = true,
        CalculateTaxOnGratuity = false,
        GratuityType = BudgetTaxGratuityTypeJson.Percentage,
        InternalNote = "This item is inclusive of taxes.",
        Currency = "USD",
        ConversionRateLocked = true,
        ConversionRate = 5.2D,
        CostDetail = new List<BudgetCostDetailJsonInput>() {
            new BudgetCostDetailJsonInput() {
                Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                Units = 5.2D,
                Cost = 100.5D,
                GratuityDetail = new BudgetGratuityJsonInput() {
                    Gratuity = 5.2D,
                },
                TaxDetail = new List<BudgetTaxJsonInput>() {
                    new BudgetTaxJsonInput() {
                        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                        TaxType = BudgetTaxGratuityTypeJson.Percentage,
                        Tax = 5.2D,
                    },
                },
            },
        },
        AssociatedRegistrants = new List<BudgetAssociatedRegistrantJsonInput>() {
            new BudgetAssociatedRegistrantJsonInput() {
                InviteeId = "7cc5304a-9323-452f-8ae8-111cae0047b0",
                ContactId = "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
            },
        },
        AssociatedSession = "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
};

var res = await sdk.Budget.CreateBudgetItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateBudgetItemRequest](../../Models/Requests/CreateBudgetItemRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateBudgetItemResponse](../../Models/Requests/CreateBudgetItemResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBudgetAllocations

Gets a paginated list of budget allocations for all budget items within an event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBudgetAllocations" method="get" path="/events/{id}/budget-items/allocations" -->
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

GetBudgetAllocationsRequest req = new GetBudgetAllocationsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "category.id eq 'e9ee2669-65db-46f8-872c-dbafbf9b0e92' or value lt 1000",
};

GetBudgetAllocationsResponse? res = await sdk.Budget.GetBudgetAllocationsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetBudgetAllocationsRequest](../../Models/Requests/GetBudgetAllocationsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetBudgetAllocationsResponse](../../Models/Requests/GetBudgetAllocationsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateBudgetItem

Update single Budget Item based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateBudgetItem" method="put" path="/events/{id}/budget-items/{budgetItemId}" -->
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

UpdateBudgetItemRequest req = new UpdateBudgetItemRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItem = new BudgetItemInput() {
        CostType = BudgetCostTypeJson.Fixed,
        Name = "Airport Transportation",
        Code = "AIRTRP",
        Category = new BudgetCategoryJsonInput() {
            Id = 3,
        },
        SubCategory = new BudgetSubCategoryJsonInput() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Status = BudgetStatusJson.Estimated,
        Vendor = new BudgetVendorJsonInput() {
            Id = "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
        },
        Date = System.DateTime.Parse("2020-02-07T00:00:00.00Z").ToUniversalTime(),
        GeneralLedger = new GeneralLedgerJson1Input() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        CostAvoidance = new BudgetCostAvoidanceJson() {
            Amount = 99.5D,
            Description = "Discounted Cost",
        },
        CostIncludesTaxGratuity = true,
        CalculateTaxOnGratuity = false,
        GratuityType = BudgetTaxGratuityTypeJson.Percentage,
        InternalNote = "This item is inclusive of taxes.",
        Currency = "USD",
        ConversionRateLocked = true,
        ConversionRate = 5.2D,
        CostDetail = new List<BudgetCostDetailJsonInput>() {
            new BudgetCostDetailJsonInput() {
                Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                Units = 5.2D,
                Cost = 100.5D,
                GratuityDetail = new BudgetGratuityJsonInput() {
                    Gratuity = 5.2D,
                },
                TaxDetail = new List<BudgetTaxJsonInput>() {
                    new BudgetTaxJsonInput() {
                        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                        TaxType = BudgetTaxGratuityTypeJson.Percentage,
                        Tax = 5.2D,
                    },
                },
            },
        },
        AssociatedRegistrants = new List<BudgetAssociatedRegistrantJsonInput>() {
            new BudgetAssociatedRegistrantJsonInput() {
                InviteeId = "7cc5304a-9323-452f-8ae8-111cae0047b0",
                ContactId = "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
            },
        },
        AssociatedSession = "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
};

var res = await sdk.Budget.UpdateBudgetItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateBudgetItemRequest](../../Models/Requests/UpdateBudgetItemRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateBudgetItemResponse](../../Models/Requests/UpdateBudgetItemResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateBudgetAllocations

Bulk add or update budget allocations in a budget item. If budget allocations already exist for the budget item, they will be updated.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateBudgetAllocations" method="put" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
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

UpdateBudgetAllocationsRequest req = new UpdateBudgetAllocationsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetAllocationsList = new BudgetAllocationsList() {
        AllocateBy = BudgetAllocatebyJson.Amount,
        Allocations = new List<BudgetAllocationJson>() {},
    },
};

var res = await sdk.Budget.UpdateBudgetAllocationsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateBudgetAllocationsRequest](../../Models/Requests/UpdateBudgetAllocationsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateBudgetAllocationsResponse](../../Models/Requests/UpdateBudgetAllocationsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteBudgetAllocations

Delete all budget allocations for a given budget item.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteBudgetAllocations" method="delete" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
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

DeleteBudgetAllocationsRequest req = new DeleteBudgetAllocationsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Budget.DeleteBudgetAllocationsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteBudgetAllocationsRequest](../../Models/Requests/DeleteBudgetAllocationsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteBudgetAllocationsResponse](../../Models/Requests/DeleteBudgetAllocationsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreatePayment

Create single payment for the budget item given in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createPayment" method="post" path="/events/{id}/budget-items/{budgetItemId}/budget-payments" -->
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

CreatePaymentRequest req = new CreatePaymentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Payment = new Payment() {
        Name = "Check Payment",
        ReferenceNumber = "abc12bde",
        Currency = "USD",
        Amount = 5.2D,
        Date = DateOnly.Parse("2020-02-07"),
        Note = "This payment is for admission.",
        Type = PaymentTypeJson1.Uatp,
    },
};

var res = await sdk.Budget.CreatePaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreatePaymentRequest](../../Models/Requests/CreatePaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreatePaymentResponse](../../Models/Requests/CreatePaymentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdatePayment

Updates a payment for a budget item.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updatePayment" method="put" path="/events/{id}/budget-items/{budgetItemId}/budget-payments/{paymentId}" -->
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

UpdatePaymentRequest req = new UpdatePaymentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PaymentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PaymentRequest = new PaymentRequest() {
        Name = "Check Payment",
        ReferenceNumber = "abc12bde",
        Currency = "USD",
        Amount = 5.2D,
        Date = DateOnly.Parse("2020-02-07"),
        Note = "This payment is for admission.",
        Type = PaymentTypeJson1.Privilege,
        Id = "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
};

var res = await sdk.Budget.UpdatePaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdatePaymentRequest](../../Models/Requests/UpdatePaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdatePaymentResponse](../../Models/Requests/UpdatePaymentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeletePayment

Deletes a budget item payment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deletePayment" method="delete" path="/events/{id}/budget-items/{budgetItemId}/budget-payments/{paymentId}" -->
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

DeletePaymentRequest req = new DeletePaymentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PaymentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Budget.DeletePaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeletePaymentRequest](../../Models/Requests/DeletePaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeletePaymentResponse](../../Models/Requests/DeletePaymentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AnswerBudgetCustomField

Updates answers to a budget custom field using the details you provided in the body of the request. Answers must be formatted correctly according to the specific type of custom field. The available fields and their formats are listed below:
* **Open Ended Text - Date/Time**. This field type has several possible user-selected answer formats:
  - Date/Time (2022-01-01T12:00:00.000Z). Denoted by *DateTime* in the response payload.
  - Date (2022-01-01). Denoted by *Date* in the response payload.
* **Open Ended Text - One Line**. This field type has several possible user-selected answer formats:
  - General (Text). Denoted by *General* in the response payload.
  - Number (Whole numbers, 10, -10). Denoted by *Number* in the response payload.
  - Currency (Positive decimal value, 10.5). Denoted by *Currency* in the response payload.
  - Decimal (-20.5). Denoted by *Decimal* in the response payload.
  - US Phone Number (123-456-7890). Denoted by *USPhoneNumber* in the response payload.
  - Email Address (h.potterfield@test.com). Denoted by *Email* in the response payload.
* **Open Ended Text - Comment Box**. Answer format is free-text (any value). Denoted by *FreeText* in the
    response payload.
* **Choice - Single Answer (Drop-Down, Vertical, Horizontal).** Answer format is exactly one response to a
    list of user-defined choices. Denoted by *SingleSelect* in the response payload.
* **Choice - Multiple Answers (Multi-Select Box, Vertical, Horizontal).** Answer format is one or more
    responses from a list of user-defined choices. Denoted by *MultiSelect* in the response payload.

To delete a custom field answer, either omit the `value` parameter or provide an empty list of answers for the specified custom field ID.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="answerBudgetCustomField" method="put" path="/events/{id}/budget-items/{budgetItemId}/custom-fields/{customFieldId}/answers" -->
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

AnswerBudgetCustomFieldRequest req = new AnswerBudgetCustomFieldRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BudgetItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomField2 = new CustomField2Input() {
        Id = "a8f94915-b3db-4fb7-8ac8-2da89a9ce3f6",
        Type = CustomField2CustomFieldType.General,
        Value = new List<string>() {
            "Choice C",
            "Choice A",
        },
    },
};

var res = await sdk.Budget.AnswerBudgetCustomFieldAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AnswerBudgetCustomFieldRequest](../../Models/Requests/AnswerBudgetCustomFieldRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AnswerBudgetCustomFieldResponse](../../Models/Requests/AnswerBudgetCustomFieldResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetPayments

Gets a paginated list of payments for budget items in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getPayments" method="get" path="/events/{id}/budget-payments" -->
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

GetPaymentsRequest req = new GetPaymentsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = "budgetItem.id eq '2c3a755a-d440-498d-baab-30f45dae3cf5' or id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'",
};

GetPaymentsResponse? res = await sdk.Budget.GetPaymentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetPaymentsRequest](../../Models/Requests/GetPaymentsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetPaymentsResponse](../../Models/Requests/GetPaymentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AttachInvoiceToPayment

Assign a single invoice to a payment using the ID of file. Upload files via the <a href="#operation/uploadFile">file upload</a> endpoint.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="attachInvoiceToPayment" method="put" path="/events/{id}/budget-payments/{paymentId}/invoices/{invoiceId}" -->
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

AttachInvoiceToPaymentRequest req = new AttachInvoiceToPaymentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PaymentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    InvoiceId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Budget.AttachInvoiceToPaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AttachInvoiceToPaymentRequest](../../Models/Requests/AttachInvoiceToPaymentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AttachInvoiceToPaymentResponse](../../Models/Requests/AttachInvoiceToPaymentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventBudgetTotals

Gets a paginated list of budget totals for event associated to the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventBudgetTotals" method="get" path="/events/{id}/budget-totals" -->
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

GetEventBudgetTotalsRequest req = new GetEventBudgetTotalsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "version.name eq 'Test version' and version.id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'",
};

GetEventBudgetTotalsResponse? res = await sdk.Budget.GetEventBudgetTotalsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetEventBudgetTotalsRequest](../../Models/Requests/GetEventBudgetTotalsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetEventBudgetTotalsResponse](../../Models/Requests/GetEventBudgetTotalsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |