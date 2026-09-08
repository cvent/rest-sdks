# RFPSuppliers

## Overview

Suppliers are the venues and service providers that receive and respond to RFPs. Use these APIs to manage supplier associations, view recipient history, and create award details.

### Available Operations

* [listRfpRecipientsHistory](#listrfprecipientshistory) - List RFP Recipients History
* [getRfpSuppliers](#getrfpsuppliers) - List RFP Suppliers

## listRfpRecipientsHistory

Returns the paginated list of logs of all the recipients that were copied on an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpRecipientsHistory" method="get" path="/rfps/{rfpId}/recipients/history" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpRecipientsHistoryRequest;
import com.cvent.models.operations.ListRfpRecipientsHistoryResponse;
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

        ListRfpRecipientsHistoryRequest req = ListRfpRecipientsHistoryRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac')")
                .build();


        sdk.rfpSuppliers().listRfpRecipientsHistory()
                .callAsStream()
                .forEach((ListRfpRecipientsHistoryResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListRfpRecipientsHistoryRequest](../../models/operations/ListRfpRecipientsHistoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListRfpRecipientsHistoryResponse](../../models/operations/ListRfpRecipientsHistoryResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpSuppliers

Returns the paginated list of suppliers associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpSuppliers" method="get" path="/rfps/{rfpId}/suppliers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpSuppliersRequest;
import com.cvent.models.operations.GetRfpSuppliersResponse;
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

        GetRfpSuppliersRequest req = GetRfpSuppliersRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac')")
                .expand(List.of(
                    LeadSourceExpand.LEAD_SOURCE,
                    LeadSourceExpand.LEAD_SOURCE_SECTION))
                .build();


        sdk.rfpSuppliers().getRfpSuppliers()
                .callAsStream()
                .forEach((GetRfpSuppliersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpSuppliersRequest](../../models/operations/GetRfpSuppliersRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpSuppliersResponse](../../models/operations/GetRfpSuppliersResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |