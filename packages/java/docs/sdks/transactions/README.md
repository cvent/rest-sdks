# Transactions

## Overview

Transactions represent the financial exchanges that occur within your account. Use these APIs to retrieve and manage transaction data, including charges, refunds, and adjustments associated with your events and attendees.

### Available Operations

* [getAccountTransactions](#getaccounttransactions) - List Account Transactions
* [getTransaction](#gettransaction) - Get Transaction
* [getAccountTransactionItems](#getaccounttransactionitems) - List Account Transaction Items
* [getAccountTransactionItem](#getaccounttransactionitem) - List Transaction Item

## getAccountTransactions

Gets a paginated list of transactions in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated transaction records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountTransactions" method="get" path="/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountTransactionsRequest;
import com.cvent.models.operations.GetAccountTransactionsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        GetAccountTransactionsRequest req = GetAccountTransactionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq '7e8a9c45-2f1b-4d3e-9a67-8b5c4f2e1a90' AND (paymentType eq 'Online Charge' OR paymentType eq 'Online Refund')")
                .build();


        sdk.transactions().getAccountTransactions()
                .callAsStream()
                .forEach((GetAccountTransactionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetAccountTransactionsRequest](../../models/operations/GetAccountTransactionsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetAccountTransactionsResponse](../../models/operations/GetAccountTransactionsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getTransaction

Gets the transaction for a given transactionId. Newly created or updated transaction records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getTransaction" method="get" path="/transactions/{transactionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetTransactionRequest;
import com.cvent.models.operations.GetTransactionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        GetTransactionRequest req = GetTransactionRequest.builder()
                .transactionId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetTransactionResponse res = sdk.transactions().getTransaction()
                .request(req)
                .call();

        if (res.transactionDetailResponse().isPresent()) {
            System.out.println(res.transactionDetailResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTransactionRequest](../../models/operations/GetTransactionRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountTransactionItems

Gets a paginated list of transaction items for a given transactionId in the account. Results are returned in ascending `lastModified` order, with a stable internal tie-breaker applied to guarantee a deterministic total order across pages. Ordering is not client-configurable. Newly created or updated transaction item records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountTransactionItems" method="get" path="/transactions/{transactionId}/items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountTransactionItemsRequest;
import com.cvent.models.operations.GetAccountTransactionItemsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        GetAccountTransactionItemsRequest req = GetAccountTransactionItemsRequest.builder()
                .transactionId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("lastModified gt '2022-04-21T17:15:48.000Z' AND (attendee.id eq '82da8c60-24f4-47d0-b6e2-429b18a4bb7c' OR attendee.id eq '034bb884-05de-4818-b9f9-5144495d5495')")
                .build();


        sdk.transactions().getAccountTransactionItems()
                .callAsStream()
                .forEach((GetAccountTransactionItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountTransactionItemsRequest](../../models/operations/GetAccountTransactionItemsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountTransactionItemsResponse](../../models/operations/GetAccountTransactionItemsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountTransactionItem

Gets a transaction item for a given transactionItemId for a given transactionId in the account. Newly created or updated transaction item records might not appear immediately in query results.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountTransactionItem" method="get" path="/transactions/{transactionId}/items/{transactionItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountTransactionItemRequest;
import com.cvent.models.operations.GetAccountTransactionItemResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, Exception {

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

        GetAccountTransactionItemRequest req = GetAccountTransactionItemRequest.builder()
                .transactionId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .transactionItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::7f3e2a1b-c4d5-6789-efab-2345678901bc")
                .build();

        GetAccountTransactionItemResponse res = sdk.transactions().getAccountTransactionItem()
                .request(req)
                .call();

        if (res.transactionItemAccountResponse().isPresent()) {
            System.out.println(res.transactionItemAccountResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountTransactionItemRequest](../../models/operations/GetAccountTransactionItemRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountTransactionItemResponse](../../models/operations/GetAccountTransactionItemResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |