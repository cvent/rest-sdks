# BudgetCards

## Overview

Budget cards and their transactions support payment activity associated with an account. Use these APIs to retrieve budget cards and create, retrieve, update, and delete card transactions.

### Available Operations

* [getCards](#getcards) - List Cards
* [getCardTransactions](#getcardtransactions) - List Card Transactions
* [createCardTransaction](#createcardtransaction) - Create Card Transaction
* [deleteCardTransaction](#deletecardtransaction) - Delete Card Transaction
* [updateCardTransaction](#updatecardtransaction) - Update Card Transaction

## getCards

Gets a paginated list of payment cards associated to the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCards" method="get" path="/cards" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetCardsRequest;
import com.cvent.models.operations.GetCardsResponse;
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

        GetCardsRequest req = GetCardsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'E05029A8-39F5-49DF-8450-2EB41B302421'")
                .build();


        sdk.budgetCards().getCards()
                .callAsStream()
                .forEach((GetCardsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetCardsRequest](../../models/operations/GetCardsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetCardsResponse](../../models/operations/GetCardsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getCardTransactions

Retrieves a paginated list of card transactions for your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCardTransactions" method="get" path="/cards/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetCardTransactionsRequest;
import com.cvent.models.operations.GetCardTransactionsResponse;
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

        GetCardTransactionsRequest req = GetCardTransactionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'E05029A8-39F5-49DF-8450-2EB41B302421' and type ne 'Virtual' and status eq 'Active' or status eq 'Inactive'")
                .build();


        sdk.budgetCards().getCardTransactions()
                .callAsStream()
                .forEach((GetCardTransactionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetCardTransactionsRequest](../../models/operations/GetCardTransactionsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetCardTransactionsResponse](../../models/operations/GetCardTransactionsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createCardTransaction

Creates a single card transaction record using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createCardTransaction" method="post" path="/cards/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateCardTransactionResponse;
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

        CardTransactionCreate req = CardTransactionCreate.builder()
                .id("1VCAPITRAN18012023")
                .eventId("9463c74e-18c6-401a-a710-ae0f485bf959")
                .cardDescription("API Card Transaction")
                .transactionAmount(1000.87)
                .transactionDate(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                .transactionCurrency("USD")
                .transactionMerchant("API Merchant")
                .build();

        CreateCardTransactionResponse res = sdk.budgetCards().createCardTransaction()
                .request(req)
                .call();

        if (res.cardTransactionCreateResponse().isPresent()) {
            System.out.println(res.cardTransactionCreateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CardTransactionCreate](../../models/shared/CardTransactionCreate.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateCardTransactionResponse](../../models/operations/CreateCardTransactionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteCardTransaction

Deletes a card transaction.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCardTransaction" method="delete" path="/cards/transactions/{transactionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteCardTransactionRequest;
import com.cvent.models.operations.DeleteCardTransactionResponse;
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

        DeleteCardTransactionRequest req = DeleteCardTransactionRequest.builder()
                .transactionId("1VCAPITRAN18012023")
                .build();

        DeleteCardTransactionResponse res = sdk.budgetCards().deleteCardTransaction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteCardTransactionRequest](../../models/operations/DeleteCardTransactionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteCardTransactionResponse](../../models/operations/DeleteCardTransactionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 409, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateCardTransaction

Updates a card transaction using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCardTransaction" method="put" path="/cards/transactions/{transactionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateCardTransactionRequest;
import com.cvent.models.operations.UpdateCardTransactionResponse;
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

        UpdateCardTransactionRequest req = UpdateCardTransactionRequest.builder()
                .transactionId("1VCAPITRAN18012023")
                .cardTransactionUpdate(CardTransactionUpdate.builder()
                    .id("1VCAPITRAN18012023")
                    .eventId("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .cardDescription("API Card Transaction")
                    .transactionAmount(1000.87)
                    .transactionDate(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                    .transactionCurrency("USD")
                    .transactionMerchant("API Merchant")
                    .build())
                .build();

        UpdateCardTransactionResponse res = sdk.budgetCards().updateCardTransaction()
                .request(req)
                .call();

        if (res.cardTransactionCreateResponse().isPresent()) {
            System.out.println(res.cardTransactionCreateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateCardTransactionRequest](../../models/operations/UpdateCardTransactionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateCardTransactionResponse](../../models/operations/UpdateCardTransactionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |