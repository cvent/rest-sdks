# BudgetPayments

## Overview

Budget payments record payments associated with budget items. Use these APIs to create, retrieve, update, and delete budget payments and assign invoices to payments.

### Available Operations

* [CreatePayment](#createpayment) - Create Budget Payment
* [UpdatePayment](#updatepayment) - Update Budget Payment
* [DeletePayment](#deletepayment) - Delete Budget Payment
* [GetPayments](#getpayments) - List Budget Payments
* [AttachInvoiceToPayment](#attachinvoicetopayment) - Assign Invoice To Payment

## CreatePayment

Creates a single payment for the budget item in the event using the values provided in the request body.

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
        Type = PaymentType11.Uatp,
    },
};

var res = await sdk.BudgetPayments.CreatePaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreatePaymentRequest](../../Models/Requests/CreatePaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreatePaymentResponse](../../Models/Requests/CreatePaymentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdatePayment

Updates a payment for a budget item using the details provided in the body of the request.

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
        Type = PaymentType11.Privilege,
        Id = "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
};

var res = await sdk.BudgetPayments.UpdatePaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdatePaymentRequest](../../Models/Requests/UpdatePaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdatePaymentResponse](../../Models/Requests/UpdatePaymentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

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

var res = await sdk.BudgetPayments.DeletePaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeletePaymentRequest](../../Models/Requests/DeletePaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeletePaymentResponse](../../Models/Requests/DeletePaymentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 409, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetPayments

Retrieves a paginated list of payments for budget items in an event.

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

GetPaymentsResponse? res = await sdk.BudgetPayments.GetPaymentsAsync(req);

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

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## AttachInvoiceToPayment

Assigns a single invoice to a payment using the file ID. Upload files through the [file upload](#operation/uploadFile) endpoint.

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

var res = await sdk.BudgetPayments.AttachInvoiceToPaymentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AttachInvoiceToPaymentRequest](../../Models/Requests/AttachInvoiceToPaymentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AttachInvoiceToPaymentResponse](../../Models/Requests/AttachInvoiceToPaymentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |