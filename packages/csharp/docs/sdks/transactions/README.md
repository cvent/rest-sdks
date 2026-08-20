# Transactions

## Overview

Transactions represent the financial exchanges that occur within your account. Use these APIs to retrieve and manage transaction data, including charges, refunds, and adjustments associated with your events and attendees.

### Available Operations

* [GetAccountTransactions](#getaccounttransactions) - List Account Transactions
* [GetTransaction](#gettransaction) - Get Transaction
* [GetAccountTransactionItems](#getaccounttransactionitems) - List Account Transaction Items
* [GetAccountTransactionItem](#getaccounttransactionitem) - List Transaction Item

## GetAccountTransactions

Gets a paginated list of transactions in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated transaction records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountTransactions" method="get" path="/transactions" -->
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

GetAccountTransactionsRequest req = new GetAccountTransactionsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq '7e8a9c45-2f1b-4d3e-9a67-8b5c4f2e1a90' AND (paymentType eq 'Online Charge' OR paymentType eq 'Online Refund')",
};

GetAccountTransactionsResponse? res = await sdk.Transactions.GetAccountTransactionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountTransactionsRequest](../../Models/Requests/GetAccountTransactionsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountTransactionsResponse](../../Models/Requests/GetAccountTransactionsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetTransaction

Gets the transaction for a given transactionId. Newly created or updated transaction records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTransaction" method="get" path="/transactions/{transactionId}" -->
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

GetTransactionRequest req = new GetTransactionRequest() {
    TransactionId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Transactions.GetTransactionAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetTransactionRequest](../../Models/Requests/GetTransactionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetTransactionResponse](../../Models/Requests/GetTransactionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetAccountTransactionItems

Gets a paginated list of transaction items for a given transactionId in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated transaction item records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountTransactionItems" method="get" path="/transactions/{transactionId}/items" -->
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

GetAccountTransactionItemsRequest req = new GetAccountTransactionItemsRequest() {
    TransactionId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "lastModified gt '2022-04-21T17:15:48.000Z' AND (attendee.id eq '82da8c60-24f4-47d0-b6e2-429b18a4bb7c' OR attendee.id eq '034bb884-05de-4818-b9f9-5144495d5495')",
};

GetAccountTransactionItemsResponse? res = await sdk.Transactions.GetAccountTransactionItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountTransactionItemsRequest](../../Models/Requests/GetAccountTransactionItemsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountTransactionItemsResponse](../../Models/Requests/GetAccountTransactionItemsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetAccountTransactionItem

Gets a transaction item for a given transactionItemId for a given transactionId in the account. Newly created or updated transaction item records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAccountTransactionItem" method="get" path="/transactions/{transactionId}/items/{transactionItemId}" -->
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

GetAccountTransactionItemRequest req = new GetAccountTransactionItemRequest() {
    TransactionId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    TransactionItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::7f3e2a1b-c4d5-6789-efab-2345678901bc",
};

var res = await sdk.Transactions.GetAccountTransactionItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountTransactionItemRequest](../../Models/Requests/GetAccountTransactionItemRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountTransactionItemResponse](../../Models/Requests/GetAccountTransactionItemResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse11 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |