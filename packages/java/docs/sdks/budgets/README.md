# Budgets

## Overview

Budget items and related configuration include planned expenses, [allocations](https://support.cvent.com/s/communityarticle/Setting-Up-Budget-Allocations), totals, custom fields, vendors, and currency conversion rates. Use these APIs to manage budget planning data and related account information.

### Available Operations

* [getAccountBudgetItems](#getaccountbudgetitems) - List Budget Items
* [getAccountVendors](#getaccountvendors) - List Account Vendors
* [getCurrencyConversionRate](#getcurrencyconversionrate) - List Currency Conversion Rates
* [createCurrencyConversionRate](#createcurrencyconversionrate) - Create Conversion Rate
* [updateCurrencyConversionRate](#updatecurrencyconversionrate) - Update Conversion Rate
* [deleteCurrencyConversionRate](#deletecurrencyconversionrate) - Delete Conversion Rate
* [getBudgetItems](#getbudgetitems) - List Event Budget Items
* [createBudgetItem](#createbudgetitem) - Create Budget Item
* [getBudgetAllocations](#getbudgetallocations) - List Budget Allocations
* [updateBudgetItem](#updatebudgetitem) - Update Budget Item
* [updateBudgetAllocations](#updatebudgetallocations) - Update Budget Allocations
* [deleteBudgetAllocations](#deletebudgetallocations) - Delete Budget Allocations
* [answerBudgetCustomField](#answerbudgetcustomfield) - Update Custom Field Answers
* [getEventBudgetTotals](#geteventbudgettotals) - List Budget Totals

## getAccountBudgetItems

Retrieves a paginated list of budget items across all events in your account. You can filter the data by the specified after and before date parameters, based on the last modified date, for a maximum duration of one year per request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountBudgetItems" method="get" path="/budget-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountBudgetItemsRequest;
import com.cvent.models.operations.GetAccountBudgetItemsResponse;
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

        GetAccountBudgetItemsRequest req = GetAccountBudgetItemsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5' and budgetVersion.id ne 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5'")
                .build();


        sdk.budgets().getAccountBudgetItems()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAccountVendors

Retrieves a paginated list of account-level budget vendors configured in Admin > Budget > Vendors for your account. Event-scoped vendors and CSN-only vendors are not included.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountVendors" method="get" path="/budget-vendors" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAccountVendorsRequest;
import com.cvent.models.operations.GetAccountVendorsResponse;
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

        GetAccountVendorsRequest req = GetAccountVendorsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("active eq true and id eq '5b5a6e5c-1234-4af5-9d1f-9bcb9e7c1234' and lastModified ge '2025-01-01T00:00:00Z'")
                .build();


        sdk.budgets().getAccountVendors()
                .callAsStream()
                .forEach((GetAccountVendorsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAccountVendorsRequest](../../models/operations/GetAccountVendorsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAccountVendorsResponse](../../models/operations/GetAccountVendorsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getCurrencyConversionRate

Retrieves a paginated list of conversion rates for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCurrencyConversionRate" method="get" path="/currencies/{currency}/conversion-rates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetCurrencyConversionRateRequest;
import com.cvent.models.operations.GetCurrencyConversionRateResponse;
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

        GetCurrencyConversionRateRequest req = GetCurrencyConversionRateRequest.builder()
                .currency("USD")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("startDate eq '2020-02-07' ")
                .build();


        sdk.budgets().getCurrencyConversionRate()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createCurrencyConversionRate

Creates a conversion rate for a currency in an account using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createCurrencyConversionRate" method="post" path="/currencies/{currency}/conversion-rates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateCurrencyConversionRateRequest;
import com.cvent.models.operations.CreateCurrencyConversionRateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        CreateCurrencyConversionRateRequest req = CreateCurrencyConversionRateRequest.builder()
                .currency("USD")
                .currencyConversionRate(CurrencyConversionRate.builder()
                    .conversionRate(5.2)
                    .startDate(LocalDate.parse("2020-02-07"))
                    .endDate(LocalDate.parse("2020-02-08"))
                    .build())
                .build();

        CreateCurrencyConversionRateResponse res = sdk.budgets().createCurrencyConversionRate()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateCurrencyConversionRate

Updates a conversion rate for a currency in an account using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCurrencyConversionRate" method="put" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateCurrencyConversionRateRequest;
import com.cvent.models.operations.UpdateCurrencyConversionRateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateCurrencyConversionRateResponse res = sdk.budgets().updateCurrencyConversionRate()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteCurrencyConversionRate

Deletes a conversion rate defined for a currency.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCurrencyConversionRate" method="delete" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteCurrencyConversionRateRequest;
import com.cvent.models.operations.DeleteCurrencyConversionRateResponse;
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

        DeleteCurrencyConversionRateRequest req = DeleteCurrencyConversionRateRequest.builder()
                .currency("USD")
                .conversionRateId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteCurrencyConversionRateResponse res = sdk.budgets().deleteCurrencyConversionRate()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getBudgetItems

Retrieves a paginated list of budget items for an event in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBudgetItems" method="get" path="/events/{id}/budget-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetBudgetItemsRequest;
import com.cvent.models.operations.GetBudgetItemsResponse;
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

        GetBudgetItemsRequest req = GetBudgetItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("category.name eq 'Accommodation' and status ne 'Estimated'")
                .build();


        sdk.budgets().getBudgetItems()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createBudgetItem

Creates a single budget item using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createBudgetItem" method="post" path="/events/{id}/budget-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateBudgetItemRequest;
import com.cvent.models.operations.CreateBudgetItemResponse;
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

        CreateBudgetItemRequest req = CreateBudgetItemRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItem(BudgetItemInput.builder()
                    .costType(BudgetCostType.FIXED)
                    .name("Airport Transportation")
                    .category(BudgetCategoryInput.builder()
                        .id(3L)
                        .build())
                    .status(BudgetStatus.ESTIMATED)
                    .date(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                    .costIncludesTaxGratuity(true)
                    .calculateTaxOnGratuity(false)
                    .gratuityType(BudgetTaxGratuityType.PERCENTAGE)
                    .currency("USD")
                    .conversionRate(5.2)
                    .code("AIRTRP")
                    .subCategory(BudgetSubCategoryInput.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .vendor(BudgetVendorInput.builder()
                        .id("d64380fd-3631-43e9-aac7-bd6bb6eccf6b")
                        .build())
                    .generalLedger(GeneralLedger1Input.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .costAvoidance(BudgetCostAvoidance.builder()
                        .amount(99.5)
                        .description("Discounted Cost")
                        .build())
                    .internalNote("This item is inclusive of taxes.")
                    .conversionRateLocked(true)
                    .costDetail(List.of(
                        BudgetCostDetail1Input.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .units(5.2)
                            .cost(100.5)
                            .gratuityDetail(BudgetGratuityInput.builder()
                                .gratuity(5.2)
                                .build())
                            .taxDetail(List.of(
                                BudgetTaxInput.builder()
                                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                    .taxType(BudgetTaxGratuityType.PERCENTAGE)
                                    .tax(5.2)
                                    .build()))
                            .build()))
                    .associatedRegistrants(List.of(
                        BudgetAssociatedRegistrantInput.builder()
                            .inviteeId("7cc5304a-9323-452f-8ae8-111cae0047b0")
                            .contactId("0c478ddc-cf11-4026-a8e5-e6a59ae1c902")
                            .build()))
                    .associatedSession("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .build())
                .build();

        CreateBudgetItemResponse res = sdk.budgets().createBudgetItem()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getBudgetAllocations

Retrieves a paginated list of budget allocations for all budget items within an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getBudgetAllocations" method="get" path="/events/{id}/budget-items/allocations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetBudgetAllocationsRequest;
import com.cvent.models.operations.GetBudgetAllocationsResponse;
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

        GetBudgetAllocationsRequest req = GetBudgetAllocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("category.id eq 'e9ee2669-65db-46f8-872c-dbafbf9b0e92' or value lt 1000")
                .build();


        sdk.budgets().getBudgetAllocations()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateBudgetItem

Updates a single budget item using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateBudgetItem" method="put" path="/events/{id}/budget-items/{budgetItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateBudgetItemRequest;
import com.cvent.models.operations.UpdateBudgetItemResponse;
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

        UpdateBudgetItemRequest req = UpdateBudgetItemRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItem(BudgetItemInput.builder()
                    .costType(BudgetCostType.FIXED)
                    .name("Airport Transportation")
                    .category(BudgetCategoryInput.builder()
                        .id(3L)
                        .build())
                    .status(BudgetStatus.ESTIMATED)
                    .date(OffsetDateTime.parse("2020-02-07T00:00:00.00Z"))
                    .costIncludesTaxGratuity(true)
                    .calculateTaxOnGratuity(false)
                    .gratuityType(BudgetTaxGratuityType.PERCENTAGE)
                    .currency("USD")
                    .conversionRate(5.2)
                    .code("AIRTRP")
                    .subCategory(BudgetSubCategoryInput.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .vendor(BudgetVendorInput.builder()
                        .id("d64380fd-3631-43e9-aac7-bd6bb6eccf6b")
                        .build())
                    .generalLedger(GeneralLedger1Input.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .costAvoidance(BudgetCostAvoidance.builder()
                        .amount(99.5)
                        .description("Discounted Cost")
                        .build())
                    .internalNote("This item is inclusive of taxes.")
                    .conversionRateLocked(true)
                    .costDetail(List.of(
                        BudgetCostDetail1Input.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .units(5.2)
                            .cost(100.5)
                            .gratuityDetail(BudgetGratuityInput.builder()
                                .gratuity(5.2)
                                .build())
                            .taxDetail(List.of(
                                BudgetTaxInput.builder()
                                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                    .taxType(BudgetTaxGratuityType.PERCENTAGE)
                                    .tax(5.2)
                                    .build()))
                            .build()))
                    .associatedRegistrants(List.of(
                        BudgetAssociatedRegistrantInput.builder()
                            .inviteeId("7cc5304a-9323-452f-8ae8-111cae0047b0")
                            .contactId("0c478ddc-cf11-4026-a8e5-e6a59ae1c902")
                            .build()))
                    .associatedSession("9463c74e-18c6-401a-a710-ae0f485bf959")
                    .build())
                .build();

        UpdateBudgetItemResponse res = sdk.budgets().updateBudgetItem()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateBudgetAllocations

Bulk add or update budget allocations in a budget item. If budget allocations already exist for the budget item, they will be updated.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateBudgetAllocations" method="put" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateBudgetAllocationsRequest;
import com.cvent.models.operations.UpdateBudgetAllocationsResponse;
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

        UpdateBudgetAllocationsRequest req = UpdateBudgetAllocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetAllocationsList(BudgetAllocationsList.builder()
                    .allocateBy(AllocateBy.AMOUNT)
                    .allocations(List.of())
                    .build())
                .build();

        UpdateBudgetAllocationsResponse res = sdk.budgets().updateBudgetAllocations()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteBudgetAllocations

Deletes all budget allocations for a budget item.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteBudgetAllocations" method="delete" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteBudgetAllocationsRequest;
import com.cvent.models.operations.DeleteBudgetAllocationsResponse;
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

        DeleteBudgetAllocationsRequest req = DeleteBudgetAllocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteBudgetAllocationsResponse res = sdk.budgets().deleteBudgetAllocations()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 409, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

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
  - Email Address (h.potterfield@example.com). Denoted by *Email* in the response payload.
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
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AnswerBudgetCustomFieldRequest;
import com.cvent.models.operations.AnswerBudgetCustomFieldResponse;
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

        AnswerBudgetCustomFieldResponse res = sdk.budgets().answerBudgetCustomField()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getEventBudgetTotals

Retrieves a paginated list of budget totals for an event in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventBudgetTotals" method="get" path="/events/{id}/budget-totals" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetEventBudgetTotalsRequest;
import com.cvent.models.operations.GetEventBudgetTotalsResponse;
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

        GetEventBudgetTotalsRequest req = GetEventBudgetTotalsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("version.name eq 'Test version' and version.id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'")
                .build();


        sdk.budgets().getEventBudgetTotals()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |