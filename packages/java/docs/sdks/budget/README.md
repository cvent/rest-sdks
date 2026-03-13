# Budget

## Overview

Budget is an event feature used to organize spending and track [allocations](https://support.cvent.com/s/communityarticle/Setting-Up-Budget-Allocations). Use this API to view budget items, cards and card transactions related to the budget module.

### Available Operations

* [getAccountBudgetItems](#getaccountbudgetitems) - List Budget Items
* [getCards](#getcards) - List Cards
* [getCardTransactions](#getcardtransactions) - List Card Transactions
* [createCardTransaction](#createcardtransaction) - Create Card Transaction
* [deleteCardTransaction](#deletecardtransaction) - Delete Card Transaction
* [updateCardTransaction](#updatecardtransaction) - Update Card Transaction
* [getCurrencyConversionRate](#getcurrencyconversionrate) - List Currency Conversion Rates
* [createCurrencyConversionRate](#createcurrencyconversionrate) - Create Conversion Rate
* [updateCurrencyConversionRate](#updatecurrencyconversionrate) - Update Conversion Rate
* [deleteCurrencyConversionRate](#deletecurrencyconversionrate) - Delete Conversion Rate
* [getBudgetItems](#getbudgetitems) - List Event Budget Items
* [createBudgetItem](#createbudgetitem) - Create Budget Item
* [getBudgetAllocations](#getbudgetallocations) - List Budget Allocations
* [updateBudgetItem](#updatebudgetitem) - Update Budget Item
* [updateBudgetAllocations](#updatebudgetallocations) - Update Budget Allocations
* [deleteBudgetAllocations](#deletebudgetallocations) - Delete  Budget Allocations
* [createPayment](#createpayment) - Create Budget Payment
* [updatePayment](#updatepayment) - Update Budget Payment
* [deletePayment](#deletepayment) - Delete Budget Payment
* [answerBudgetCustomField](#answerbudgetcustomfield) - Update Budget Cstm Fld Answers
* [getPayments](#getpayments) - List Budget Payments
* [attachInvoiceToPayment](#attachinvoicetopayment) - Assign Invoice To Payment
* [getEventBudgetTotals](#geteventbudgettotals) - List Budget Totals

## getAccountBudgetItems

Gets a paginated list of budget items across all events linked to the account associated with the access token. The data can be filtered by the specified after and before date parameters, based on the last modified date, for a maximum duration of 1 year per request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountBudgetItems" method="get" path="/budget-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountBudgetItemsRequest;
import com.cvent.models.operations.GetAccountBudgetItemsResponse;
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

        GetAccountBudgetItemsRequest req = GetAccountBudgetItemsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5' and budgetVersion.id ne 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5'")
                .build();


        sdk.budget().getAccountBudgetItems()
                .callAsStream()
                .forEach((GetAccountBudgetItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountBudgetItemsRequest](../../models/operations/GetAccountBudgetItemsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountBudgetItemsResponse](../../models/operations/GetAccountBudgetItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

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
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetCardsRequest;
import com.cvent.models.operations.GetCardsResponse;
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

        GetCardsRequest req = GetCardsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'E05029A8-39F5-49DF-8450-2EB41B302421'")
                .build();


        sdk.budget().getCards()
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getCardTransactions

Gets a paginated list of card transactions associated with the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCardTransactions" method="get" path="/cards/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetCardTransactionsRequest;
import com.cvent.models.operations.GetCardTransactionsResponse;
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

        GetCardTransactionsRequest req = GetCardTransactionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'E05029A8-39F5-49DF-8450-2EB41B302421' and type ne 'Virtual' and status eq 'Active' or status eq 'Inactive'")
                .build();


        sdk.budget().getCardTransactions()
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createCardTransaction

Creates a single card transaction record.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createCardTransaction" method="post" path="/cards/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateCardTransactionResponse;
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

        CardTransactionCreate req = CardTransactionCreate.builder()
                .id("1VCAPITRAN18012023")
                .eventId("9463c74e-18c6-401a-a710-ae0f485bf959")
                .cardDescription("API Card Transaction")
                .transactionAmount(1000.87)
                .transactionDate(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                .transactionCurrency("USD")
                .transactionMerchant("API Merchant")
                .build();

        CreateCardTransactionResponse res = sdk.budget().createCardTransaction()
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteCardTransaction

Deletes a card transaction record.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCardTransaction" method="delete" path="/cards/transactions/{transactionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteCardTransactionRequest;
import com.cvent.models.operations.DeleteCardTransactionResponse;
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

        DeleteCardTransactionRequest req = DeleteCardTransactionRequest.builder()
                .transactionId("1VCAPITRAN18012023")
                .build();

        DeleteCardTransactionResponse res = sdk.budget().deleteCardTransaction()
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateCardTransaction

Updates a card transaction record.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCardTransaction" method="put" path="/cards/transactions/{transactionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateCardTransactionRequest;
import com.cvent.models.operations.UpdateCardTransactionResponse;
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

        UpdateCardTransactionResponse res = sdk.budget().updateCardTransaction()
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

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getCurrencyConversionRate

Gets a paginated list of conversion rates for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCurrencyConversionRate" method="get" path="/currencies/{currency}/conversion-rates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetCurrencyConversionRateRequest;
import com.cvent.models.operations.GetCurrencyConversionRateResponse;
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

        GetCurrencyConversionRateRequest req = GetCurrencyConversionRateRequest.builder()
                .currency("USD")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("startDate eq '2020-02-07' ")
                .build();


        sdk.budget().getCurrencyConversionRate()
                .callAsStream()
                .forEach((GetCurrencyConversionRateResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetCurrencyConversionRateRequest](../../models/operations/GetCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetCurrencyConversionRateResponse](../../models/operations/GetCurrencyConversionRateResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createCurrencyConversionRate

Create conversion rate for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createCurrencyConversionRate" method="post" path="/currencies/{currency}/conversion-rates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateCurrencyConversionRateRequest;
import com.cvent.models.operations.CreateCurrencyConversionRateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        CreateCurrencyConversionRateRequest req = CreateCurrencyConversionRateRequest.builder()
                .currency("USD")
                .currencyConversionRate(CurrencyConversionRate.builder()
                    .conversionRate(5.2)
                    .startDate(LocalDate.parse("2020-02-07"))
                    .endDate(LocalDate.parse("2020-02-08"))
                    .build())
                .build();

        CreateCurrencyConversionRateResponse res = sdk.budget().createCurrencyConversionRate()
                .request(req)
                .call();

        if (res.currencyConversionRateResponse().isPresent()) {
            System.out.println(res.currencyConversionRateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CreateCurrencyConversionRateRequest](../../models/operations/CreateCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CreateCurrencyConversionRateResponse](../../models/operations/CreateCurrencyConversionRateResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateCurrencyConversionRate

Updates a conversion rate for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCurrencyConversionRate" method="put" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateCurrencyConversionRateRequest;
import com.cvent.models.operations.UpdateCurrencyConversionRateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateCurrencyConversionRateRequest req = UpdateCurrencyConversionRateRequest.builder()
                .currency("USD")
                .conversionRateId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .currencyConversionRateRequest(CurrencyConversionRateRequest.builder()
                    .conversionRate(5.2)
                    .startDate(LocalDate.parse("2020-02-07"))
                    .id("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .endDate(LocalDate.parse("2020-02-08"))
                    .build())
                .build();

        UpdateCurrencyConversionRateResponse res = sdk.budget().updateCurrencyConversionRate()
                .request(req)
                .call();

        if (res.currencyConversionRateResponse().isPresent()) {
            System.out.println(res.currencyConversionRateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UpdateCurrencyConversionRateRequest](../../models/operations/UpdateCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UpdateCurrencyConversionRateResponse](../../models/operations/UpdateCurrencyConversionRateResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteCurrencyConversionRate

Deletes conversion rate defined for currency.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCurrencyConversionRate" method="delete" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteCurrencyConversionRateRequest;
import com.cvent.models.operations.DeleteCurrencyConversionRateResponse;
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

        DeleteCurrencyConversionRateRequest req = DeleteCurrencyConversionRateRequest.builder()
                .currency("USD")
                .conversionRateId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteCurrencyConversionRateResponse res = sdk.budget().deleteCurrencyConversionRate()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [DeleteCurrencyConversionRateRequest](../../models/operations/DeleteCurrencyConversionRateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[DeleteCurrencyConversionRateResponse](../../models/operations/DeleteCurrencyConversionRateResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBudgetItems

Gets a paginated list of budget items for event associated to the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBudgetItems" method="get" path="/events/{id}/budget-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBudgetItemsRequest;
import com.cvent.models.operations.GetBudgetItemsResponse;
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

        GetBudgetItemsRequest req = GetBudgetItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("category.name eq 'Accommodation' and status ne 'Estimated'")
                .build();


        sdk.budget().getBudgetItems()
                .callAsStream()
                .forEach((GetBudgetItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetBudgetItemsRequest](../../models/operations/GetBudgetItemsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetBudgetItemsResponse](../../models/operations/GetBudgetItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createBudgetItem

Create single Budget Item based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createBudgetItem" method="post" path="/events/{id}/budget-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateBudgetItemRequest;
import com.cvent.models.operations.CreateBudgetItemResponse;
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

        CreateBudgetItemRequest req = CreateBudgetItemRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItem(BudgetItemInput.builder()
                    .costType(BudgetCostTypeJson.FIXED)
                    .name("Airport Transportation")
                    .category(BudgetCategoryJsonInput.builder()
                        .id(3L)
                        .build())
                    .status(BudgetStatusJson.ESTIMATED)
                    .date(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                    .costIncludesTaxGratuity(true)
                    .calculateTaxOnGratuity(false)
                    .gratuityType(BudgetTaxGratuityTypeJson.PERCENTAGE)
                    .currency("USD")
                    .conversionRate(5.2)
                    .code("AIRTRP")
                    .subCategory(BudgetSubCategoryJsonInput.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .vendor(BudgetVendorJsonInput.builder()
                        .id("d64380fd-3631-43e9-aac7-bd6bb6eccf6b")
                        .build())
                    .generalLedger(GeneralLedgerJson1Input.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .costAvoidance(BudgetCostAvoidanceJson.builder()
                        .amount(99.5)
                        .description("Discounted Cost")
                        .build())
                    .internalNote("This item is inclusive of taxes.")
                    .conversionRateLocked(true)
                    .costDetail(List.of(
                        BudgetCostDetailJsonInput.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .units(5.2)
                            .cost(100.5)
                            .gratuityDetail(BudgetGratuityJsonInput.builder()
                                .gratuity(5.2)
                                .build())
                            .taxDetail(List.of(
                                BudgetTaxJsonInput.builder()
                                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                    .taxType(BudgetTaxGratuityTypeJson.PERCENTAGE)
                                    .tax(5.2)
                                    .build()))
                            .build()))
                    .associatedRegistrants(List.of(
                        BudgetAssociatedRegistrantJsonInput.builder()
                            .inviteeId("7cc5304a-9323-452f-8ae8-111cae0047b0")
                            .contactId("0c478ddc-cf11-4026-a8e5-e6a59ae1c902")
                            .build()))
                    .associatedSession("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .build())
                .build();

        CreateBudgetItemResponse res = sdk.budget().createBudgetItem()
                .request(req)
                .call();

        if (res.budgetItemResponse().isPresent()) {
            System.out.println(res.budgetItemResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateBudgetItemRequest](../../models/operations/CreateBudgetItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateBudgetItemResponse](../../models/operations/CreateBudgetItemResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBudgetAllocations

Gets a paginated list of budget allocations for all budget items within an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getBudgetAllocations" method="get" path="/events/{id}/budget-items/allocations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBudgetAllocationsRequest;
import com.cvent.models.operations.GetBudgetAllocationsResponse;
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

        GetBudgetAllocationsRequest req = GetBudgetAllocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("category.id eq 'e9ee2669-65db-46f8-872c-dbafbf9b0e92' or value lt 1000")
                .build();


        sdk.budget().getBudgetAllocations()
                .callAsStream()
                .forEach((GetBudgetAllocationsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetBudgetAllocationsRequest](../../models/operations/GetBudgetAllocationsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetBudgetAllocationsResponse](../../models/operations/GetBudgetAllocationsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateBudgetItem

Update single Budget Item based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateBudgetItem" method="put" path="/events/{id}/budget-items/{budgetItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateBudgetItemRequest;
import com.cvent.models.operations.UpdateBudgetItemResponse;
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

        UpdateBudgetItemRequest req = UpdateBudgetItemRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItem(BudgetItemInput.builder()
                    .costType(BudgetCostTypeJson.FIXED)
                    .name("Airport Transportation")
                    .category(BudgetCategoryJsonInput.builder()
                        .id(3L)
                        .build())
                    .status(BudgetStatusJson.ESTIMATED)
                    .date(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                    .costIncludesTaxGratuity(true)
                    .calculateTaxOnGratuity(false)
                    .gratuityType(BudgetTaxGratuityTypeJson.PERCENTAGE)
                    .currency("USD")
                    .conversionRate(5.2)
                    .code("AIRTRP")
                    .subCategory(BudgetSubCategoryJsonInput.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .vendor(BudgetVendorJsonInput.builder()
                        .id("d64380fd-3631-43e9-aac7-bd6bb6eccf6b")
                        .build())
                    .generalLedger(GeneralLedgerJson1Input.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .costAvoidance(BudgetCostAvoidanceJson.builder()
                        .amount(99.5)
                        .description("Discounted Cost")
                        .build())
                    .internalNote("This item is inclusive of taxes.")
                    .conversionRateLocked(true)
                    .costDetail(List.of(
                        BudgetCostDetailJsonInput.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .units(5.2)
                            .cost(100.5)
                            .gratuityDetail(BudgetGratuityJsonInput.builder()
                                .gratuity(5.2)
                                .build())
                            .taxDetail(List.of(
                                BudgetTaxJsonInput.builder()
                                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                    .taxType(BudgetTaxGratuityTypeJson.PERCENTAGE)
                                    .tax(5.2)
                                    .build()))
                            .build()))
                    .associatedRegistrants(List.of(
                        BudgetAssociatedRegistrantJsonInput.builder()
                            .inviteeId("7cc5304a-9323-452f-8ae8-111cae0047b0")
                            .contactId("0c478ddc-cf11-4026-a8e5-e6a59ae1c902")
                            .build()))
                    .associatedSession("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .build())
                .build();

        UpdateBudgetItemResponse res = sdk.budget().updateBudgetItem()
                .request(req)
                .call();

        if (res.budgetItemResponse().isPresent()) {
            System.out.println(res.budgetItemResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateBudgetItemRequest](../../models/operations/UpdateBudgetItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateBudgetItemResponse](../../models/operations/UpdateBudgetItemResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateBudgetAllocations

Bulk add or update budget allocations in a budget item. If budget allocations already exist for the budget item, they will be updated.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateBudgetAllocations" method="put" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateBudgetAllocationsRequest;
import com.cvent.models.operations.UpdateBudgetAllocationsResponse;
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

        UpdateBudgetAllocationsRequest req = UpdateBudgetAllocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetAllocationsList(BudgetAllocationsList.builder()
                    .allocateBy(BudgetAllocatebyJson.AMOUNT)
                    .allocations(List.of())
                    .build())
                .build();

        UpdateBudgetAllocationsResponse res = sdk.budget().updateBudgetAllocations()
                .request(req)
                .call();

        if (res.budgetAllocationsList().isPresent()) {
            System.out.println(res.budgetAllocationsList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateBudgetAllocationsRequest](../../models/operations/UpdateBudgetAllocationsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateBudgetAllocationsResponse](../../models/operations/UpdateBudgetAllocationsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteBudgetAllocations

Delete all budget allocations for a given budget item.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteBudgetAllocations" method="delete" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteBudgetAllocationsRequest;
import com.cvent.models.operations.DeleteBudgetAllocationsResponse;
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

        DeleteBudgetAllocationsRequest req = DeleteBudgetAllocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteBudgetAllocationsResponse res = sdk.budget().deleteBudgetAllocations()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [DeleteBudgetAllocationsRequest](../../models/operations/DeleteBudgetAllocationsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[DeleteBudgetAllocationsResponse](../../models/operations/DeleteBudgetAllocationsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createPayment

Create single payment for the budget item given in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createPayment" method="post" path="/events/{id}/budget-items/{budgetItemId}/budget-payments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreatePaymentRequest;
import com.cvent.models.operations.CreatePaymentResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        CreatePaymentRequest req = CreatePaymentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .payment(Payment.builder()
                    .name("Check Payment")
                    .currency("USD")
                    .amount(5.2)
                    .date(LocalDate.parse("2020-02-07"))
                    .referenceNumber("abc12bde")
                    .note("This payment is for admission.")
                    .type(PaymentTypeJson1.UATP)
                    .build())
                .build();

        CreatePaymentResponse res = sdk.budget().createPayment()
                .request(req)
                .call();

        if (res.paymentResponse().isPresent()) {
            System.out.println(res.paymentResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreatePaymentRequest](../../models/operations/CreatePaymentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreatePaymentResponse](../../models/operations/CreatePaymentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updatePayment

Updates a payment for a budget item.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePayment" method="put" path="/events/{id}/budget-items/{budgetItemId}/budget-payments/{paymentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdatePaymentRequest;
import com.cvent.models.operations.UpdatePaymentResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdatePaymentRequest req = UpdatePaymentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .paymentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .paymentRequest(PaymentRequest.builder()
                    .name("Check Payment")
                    .currency("USD")
                    .amount(5.2)
                    .date(LocalDate.parse("2020-02-07"))
                    .id("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .referenceNumber("abc12bde")
                    .note("This payment is for admission.")
                    .type(PaymentTypeJson1.PRIVILEGE)
                    .build())
                .build();

        UpdatePaymentResponse res = sdk.budget().updatePayment()
                .request(req)
                .call();

        if (res.paymentResponse().isPresent()) {
            System.out.println(res.paymentResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdatePaymentRequest](../../models/operations/UpdatePaymentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdatePaymentResponse](../../models/operations/UpdatePaymentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deletePayment

Deletes a budget item payment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deletePayment" method="delete" path="/events/{id}/budget-items/{budgetItemId}/budget-payments/{paymentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeletePaymentRequest;
import com.cvent.models.operations.DeletePaymentResponse;
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

        DeletePaymentRequest req = DeletePaymentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .paymentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeletePaymentResponse res = sdk.budget().deletePayment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeletePaymentRequest](../../models/operations/DeletePaymentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeletePaymentResponse](../../models/operations/DeletePaymentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## answerBudgetCustomField

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

<!-- UsageSnippet language="java" operationID="answerBudgetCustomField" method="put" path="/events/{id}/budget-items/{budgetItemId}/custom-fields/{customFieldId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AnswerBudgetCustomFieldRequest;
import com.cvent.models.operations.AnswerBudgetCustomFieldResponse;
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

        AnswerBudgetCustomFieldRequest req = AnswerBudgetCustomFieldRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customField(CustomFieldInput.builder()
                    .id("a8f94915-b3db-4fb7-8ac8-2da89a9ce3f6")
                    .value(List.of(
                        "Choice C",
                        "Choice A"))
                    .type(CustomFieldCustomFieldType.GENERAL)
                    .build())
                .build();

        AnswerBudgetCustomFieldResponse res = sdk.budget().answerBudgetCustomField()
                .request(req)
                .call();

        if (res.customField().isPresent()) {
            System.out.println(res.customField().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AnswerBudgetCustomFieldRequest](../../models/operations/AnswerBudgetCustomFieldRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AnswerBudgetCustomFieldResponse](../../models/operations/AnswerBudgetCustomFieldResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getPayments

Gets a paginated list of payments for budget items in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getPayments" method="get" path="/events/{id}/budget-payments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetPaymentsRequest;
import com.cvent.models.operations.GetPaymentsResponse;
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

        GetPaymentsRequest req = GetPaymentsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("budgetItem.id eq '2c3a755a-d440-498d-baab-30f45dae3cf5' or id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'")
                .build();


        sdk.budget().getPayments()
                .callAsStream()
                .forEach((GetPaymentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetPaymentsRequest](../../models/operations/GetPaymentsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetPaymentsResponse](../../models/operations/GetPaymentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## attachInvoiceToPayment

Assign a single invoice to a payment using the ID of file. Upload files via the <a href="#operation/uploadFile">file upload</a> endpoint.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="attachInvoiceToPayment" method="put" path="/events/{id}/budget-payments/{paymentId}/invoices/{invoiceId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AttachInvoiceToPaymentRequest;
import com.cvent.models.operations.AttachInvoiceToPaymentResponse;
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

        AttachInvoiceToPaymentRequest req = AttachInvoiceToPaymentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .paymentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .invoiceId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AttachInvoiceToPaymentResponse res = sdk.budget().attachInvoiceToPayment()
                .request(req)
                .call();

        if (res.invoiceFile().isPresent()) {
            System.out.println(res.invoiceFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AttachInvoiceToPaymentRequest](../../models/operations/AttachInvoiceToPaymentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AttachInvoiceToPaymentResponse](../../models/operations/AttachInvoiceToPaymentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventBudgetTotals

Gets a paginated list of budget totals for event associated to the account of the access token.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventBudgetTotals" method="get" path="/events/{id}/budget-totals" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventBudgetTotalsRequest;
import com.cvent.models.operations.GetEventBudgetTotalsResponse;
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

        GetEventBudgetTotalsRequest req = GetEventBudgetTotalsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("version.name eq 'Test version' and version.id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'")
                .build();


        sdk.budget().getEventBudgetTotals()
                .callAsStream()
                .forEach((GetEventBudgetTotalsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetEventBudgetTotalsRequest](../../models/operations/GetEventBudgetTotalsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetEventBudgetTotalsResponse](../../models/operations/GetEventBudgetTotalsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |