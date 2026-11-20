# BudgetPayments

## Overview

Budget payments record payments associated with budget items. Use these APIs to create, retrieve, update, and delete budget payments and assign invoices to payments.

### Available Operations

* [createPayment](#createpayment) - Create Budget Payment
* [updatePayment](#updatepayment) - Update Budget Payment
* [deletePayment](#deletepayment) - Delete Budget Payment
* [getPayments](#getpayments) - List Budget Payments
* [attachInvoiceToPayment](#attachinvoicetopayment) - Assign Invoice To Payment

## createPayment

Creates a single payment for the budget item in the event using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createPayment" method="post" path="/events/{id}/budget-items/{budgetItemId}/budget-payments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreatePaymentRequest;
import com.cvent.models.operations.CreatePaymentResponse;
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
                    .type(PaymentType11.UATP)
                    .build())
                .build();

        CreatePaymentResponse res = sdk.budgetPayments().createPayment()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updatePayment

Updates a payment for a budget item using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePayment" method="put" path="/events/{id}/budget-items/{budgetItemId}/budget-payments/{paymentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdatePaymentRequest;
import com.cvent.models.operations.UpdatePaymentResponse;
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
                    .type(PaymentType11.PRIVILEGE)
                    .build())
                .build();

        UpdatePaymentResponse res = sdk.budgetPayments().updatePayment()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

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
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeletePaymentRequest;
import com.cvent.models.operations.DeletePaymentResponse;
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

        DeletePaymentRequest req = DeletePaymentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .budgetItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .paymentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeletePaymentResponse res = sdk.budgetPayments().deletePayment()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 409, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getPayments

Retrieves a paginated list of payments for budget items in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getPayments" method="get" path="/events/{id}/budget-payments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetPaymentsRequest;
import com.cvent.models.operations.GetPaymentsResponse;
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

        GetPaymentsRequest req = GetPaymentsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("budgetItem.id eq '2c3a755a-d440-498d-baab-30f45dae3cf5' or id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'")
                .build();


        sdk.budgetPayments().getPayments()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## attachInvoiceToPayment

Assigns a single invoice to a payment using the file ID. Upload files through the [file upload](#operation/uploadFile) endpoint.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="attachInvoiceToPayment" method="put" path="/events/{id}/budget-payments/{paymentId}/invoices/{invoiceId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AttachInvoiceToPaymentRequest;
import com.cvent.models.operations.AttachInvoiceToPaymentResponse;
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

        AttachInvoiceToPaymentRequest req = AttachInvoiceToPaymentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .paymentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .invoiceId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AttachInvoiceToPaymentResponse res = sdk.budgetPayments().attachInvoiceToPayment()
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |