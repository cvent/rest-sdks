# RFPSuppliers

## Overview

Suppliers are the venues and service providers that receive and respond to RFPs. Use these APIs to manage supplier associations, view recipient history, and create award details.

### Available Operations

* [listRfpRecipientsHistory](#listrfprecipientshistory) - List RFP Recipients History
* [getRfpSuppliers](#getrfpsuppliers) - List RFP Suppliers
* [getRfpSupplier](#getrfpsupplier) - Get RFP Supplier
* [associateRfpSupplier](#associaterfpsupplier) - Associate Supplier to RFP
* [disassociateRfpSupplier](#disassociaterfpsupplier) - Disassociate RFP Supplier

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

## getRfpSupplier

Returns details of a specific supplier associated with an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpSupplier" method="get" path="/rfps/{rfpId}/suppliers/{supplierId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpSupplierRequest;
import com.cvent.models.operations.GetRfpSupplierResponse;
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

        GetRfpSupplierRequest req = GetRfpSupplierRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .supplierId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .expand(List.of(
                    LeadSourceExpand.LEAD_SOURCE,
                    LeadSourceExpand.LEAD_SOURCE_SECTION))
                .build();

        GetRfpSupplierResponse res = sdk.rfpSuppliers().getRfpSupplier()
                .request(req)
                .call();

        if (res.rfpSupplier().isPresent()) {
            System.out.println(res.rfpSupplier().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRfpSupplierRequest](../../models/operations/GetRfpSupplierRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRfpSupplierResponse](../../models/operations/GetRfpSupplierResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## associateRfpSupplier

Associates a given supplier to an RFP.

Lead source: only `leadSource.section.id` is used; `leadSource.id` is ignored. If you omit the section, Cvent sets the default section. A caller can send only the default section. Another section is rejected with 400.

If the supplier is already associated with the RFP, only the `promotion` in the request is applied. The rest of the existing association, including its lead source, is left unchanged.


### Example Usage

<!-- UsageSnippet language="java" operationID="associateRfpSupplier" method="put" path="/rfps/{rfpId}/suppliers/{supplierId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AssociateRfpSupplierRequest;
import com.cvent.models.operations.AssociateRfpSupplierResponse;
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

        AssociateRfpSupplierRequest req = AssociateRfpSupplierRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .supplierId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpSupplier(RfpSupplierInput.builder()
                    .leadSource(RfpSupplierLeadSource.builder()
                        .id("50dc08af-24a9-4d01-84be-3d43133dc945")
                        .section(LeadSourceSection.builder()
                            .id("40dc08af-24a9-4d01-84be-3d43133dc945")
                            .build())
                        .build())
                    .promotion(Promotion.builder()
                        .id("41cc09af-61a0-5e21-942e-2d41232dc923")
                        .build())
                    .build())
                .build();

        AssociateRfpSupplierResponse res = sdk.rfpSuppliers().associateRfpSupplier()
                .request(req)
                .call();

        if (res.rfpSupplier().isPresent()) {
            System.out.println(res.rfpSupplier().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AssociateRfpSupplierRequest](../../models/operations/AssociateRfpSupplierRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AssociateRfpSupplierResponse](../../models/operations/AssociateRfpSupplierResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## disassociateRfpSupplier

Disassociates the specified supplier from an RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateRfpSupplier" method="delete" path="/rfps/{rfpId}/suppliers/{supplierId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DisassociateRfpSupplierRequest;
import com.cvent.models.operations.DisassociateRfpSupplierResponse;
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

        DisassociateRfpSupplierRequest req = DisassociateRfpSupplierRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .supplierId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DisassociateRfpSupplierResponse res = sdk.rfpSuppliers().disassociateRfpSupplier()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [DisassociateRfpSupplierRequest](../../models/operations/DisassociateRfpSupplierRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[DisassociateRfpSupplierResponse](../../models/operations/DisassociateRfpSupplierResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |