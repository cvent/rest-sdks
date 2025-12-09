# TravelAccounts

## Overview

The travel account, or corporation that represents the demand-side of travel RFPs.

### Available Operations

* [ListTravelAccounts](#listtravelaccounts) - List Travel Accounts
* [ListSupplierAccounts](#listsupplieraccounts) - List Supplier Accounts
* [GetTravelAccount](#gettravelaccount) - Get Travel Account
* [GetSupplierAccount](#getsupplieraccount) - Get Supplier Account

## ListTravelAccounts

Gets a paginated list of travel accounts.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListTravelAccounts" method="get" path="/travel-accounts" -->
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

ListTravelAccountsRequest req = new ListTravelAccountsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "name eq ABC123",
};

ListTravelAccountsResponse? res = await sdk.TravelAccounts.ListTravelAccountsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListTravelAccountsRequest](../../Models/Requests/ListTravelAccountsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListTravelAccountsResponse](../../Models/Requests/ListTravelAccountsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSupplierAccounts

Gets a paginated list of supplier travel accounts.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="ListSupplierAccounts" method="get" path="/travel-accounts/supplier-accounts" -->
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

ListSupplierAccountsRequest req = new ListSupplierAccountsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "name eq ABC123",
};

ListSupplierAccountsResponse? res = await sdk.TravelAccounts.ListSupplierAccountsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListSupplierAccountsRequest](../../Models/Requests/ListSupplierAccountsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListSupplierAccountsResponse](../../Models/Requests/ListSupplierAccountsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetTravelAccount

Returns the details of a single travel account based on the specified travel account ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTravelAccount" method="get" path="/travel-accounts/{travelAccountId}" -->
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

GetTravelAccountRequest req = new GetTravelAccountRequest() {
    TravelAccountId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.TravelAccounts.GetTravelAccountAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTravelAccountRequest](../../Models/Requests/GetTravelAccountRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetTravelAccountResponse](../../Models/Requests/GetTravelAccountResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSupplierAccount

Returns the details of a single supplied travel account based on the specified travel account ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSupplierAccount" method="get" path="/travel-accounts/{travelAccountId}/supplier-accounts" -->
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

GetSupplierAccountRequest req = new GetSupplierAccountRequest() {
    TravelAccountId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.TravelAccounts.GetSupplierAccountAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetSupplierAccountRequest](../../Models/Requests/GetSupplierAccountRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetSupplierAccountResponse](../../Models/Requests/GetSupplierAccountResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |