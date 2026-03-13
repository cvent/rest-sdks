# TravelAccounts

## Overview

The travel account, or corporation that represents the demand-side of travel RFPs.

### Available Operations

* [listTravelAccounts](#listtravelaccounts) - List Travel Accounts
* [listSupplierAccounts](#listsupplieraccounts) - List Supplier Accounts
* [getTravelAccount](#gettravelaccount) - Get Travel Account
* [getSupplierAccount](#getsupplieraccount) - Get Supplier Account

## listTravelAccounts

Gets a paginated list of travel accounts.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTravelAccounts" method="get" path="/travel-accounts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListTravelAccountsRequest;
import com.cvent.models.operations.ListTravelAccountsResponse;
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

        ListTravelAccountsRequest req = ListTravelAccountsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("name eq ABC123")
                .build();


        sdk.travelAccounts().listTravelAccounts()
                .callAsStream()
                .forEach((ListTravelAccountsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListTravelAccountsRequest](../../models/operations/ListTravelAccountsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListTravelAccountsResponse](../../models/operations/ListTravelAccountsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSupplierAccounts

Gets a paginated list of supplier travel accounts.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListSupplierAccounts" method="get" path="/travel-accounts/supplier-accounts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSupplierAccountsRequest;
import com.cvent.models.operations.ListSupplierAccountsResponse;
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

        ListSupplierAccountsRequest req = ListSupplierAccountsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("name eq ABC123")
                .build();


        sdk.travelAccounts().listSupplierAccounts()
                .callAsStream()
                .forEach((ListSupplierAccountsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSupplierAccountsRequest](../../models/operations/ListSupplierAccountsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSupplierAccountsResponse](../../models/operations/ListSupplierAccountsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTravelAccount

Returns the details of a single travel account based on the specified travel account ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTravelAccount" method="get" path="/travel-accounts/{travelAccountId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTravelAccountRequest;
import com.cvent.models.operations.GetTravelAccountResponse;
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

        GetTravelAccountRequest req = GetTravelAccountRequest.builder()
                .travelAccountId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetTravelAccountResponse res = sdk.travelAccounts().getTravelAccount()
                .request(req)
                .call();

        if (res.travelAccount().isPresent()) {
            System.out.println(res.travelAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetTravelAccountRequest](../../models/operations/GetTravelAccountRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetTravelAccountResponse](../../models/operations/GetTravelAccountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getSupplierAccount

Returns the details of a single supplied travel account based on the specified travel account ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSupplierAccount" method="get" path="/travel-accounts/{travelAccountId}/supplier-accounts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetSupplierAccountRequest;
import com.cvent.models.operations.GetSupplierAccountResponse;
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

        GetSupplierAccountRequest req = GetSupplierAccountRequest.builder()
                .travelAccountId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetSupplierAccountResponse res = sdk.travelAccounts().getSupplierAccount()
                .request(req)
                .call();

        if (res.travelAccountSupplierAccount().isPresent()) {
            System.out.println(res.travelAccountSupplierAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSupplierAccountRequest](../../models/operations/GetSupplierAccountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSupplierAccountResponse](../../models/operations/GetSupplierAccountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |