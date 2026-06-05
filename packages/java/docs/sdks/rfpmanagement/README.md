# RFPManagement

## Overview

RFP (Request for Proposal) management APIs for core RFP operations including CRUD operations for base RFPs.

### Available Operations

* [getRfpLeadSource](#getrfpleadsource) - Get RFP Lead Source
* [getRfpLeadSourceSection](#getrfpleadsourcesection) - Get RFP Lead Source Section
* [getRFP](#getrfp) - Get RFP

## getRfpLeadSource

Returns details about a given lead source of an RFP. The lead source indicates the primary origin of the RFP or the supplier being added to the RFP, such as a particular software or website.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpLeadSource" method="get" path="/rfps/lead-sources/{leadSourceId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.GetRfpLeadSourceRequest;
import com.cvent.models.operations.GetRfpLeadSourceResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        GetRfpLeadSourceRequest req = GetRfpLeadSourceRequest.builder()
                .leadSourceId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetRfpLeadSourceResponse res = sdk.rfpManagement().getRfpLeadSource()
                .request(req)
                .call();

        if (res.rfpLeadSource().isPresent()) {
            System.out.println(res.rfpLeadSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRfpLeadSourceRequest](../../models/operations/GetRfpLeadSourceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRfpLeadSourceResponse](../../models/operations/GetRfpLeadSourceResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 401, 403, 404, 429           | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## getRfpLeadSourceSection

Returns details about the lead source section of an RFP. The lead source section identifies the specific segment or channel within the broader lead source, such as a particular website domain, form, or integration point, where the RFP originated. This enables more granular tracking and attribution of RFPs by pinpointing the exact section within the overall lead source. See the [Lead Source](#tag/RFP-Management/operation/getRfpLeadSource) endpoint for more information about lead sources.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpLeadSourceSection" method="get" path="/rfps/lead-sources/{leadSourceId}/sections/{leadSourceSectionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.GetRfpLeadSourceSectionRequest;
import com.cvent.models.operations.GetRfpLeadSourceSectionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        GetRfpLeadSourceSectionRequest req = GetRfpLeadSourceSectionRequest.builder()
                .leadSourceId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .leadSourceSectionId("779934d2-f6eb-4815-bcfa-a2dd8655c164")
                .build();

        GetRfpLeadSourceSectionResponse res = sdk.rfpManagement().getRfpLeadSourceSection()
                .request(req)
                .call();

        if (res.rfpLeadSourceSection().isPresent()) {
            System.out.println(res.rfpLeadSourceSection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetRfpLeadSourceSectionRequest](../../models/operations/GetRfpLeadSourceSectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetRfpLeadSourceSectionResponse](../../models/operations/GetRfpLeadSourceSectionResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 401, 403, 404, 429           | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## getRFP

Returns basic details of the given RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRFP" method="get" path="/rfps/{rfpId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.GetRFPRequest;
import com.cvent.models.operations.GetRFPResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        GetRFPRequest req = GetRFPRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .expand(List.of(
                    LeadSourceExpand.LEAD_SOURCE,
                    LeadSourceExpand.LEAD_SOURCE_SECTION))
                .build();

        GetRFPResponse res = sdk.rfpManagement().getRFP()
                .request(req)
                .call();

        if (res.rfp().isPresent()) {
            System.out.println(res.rfp().get());
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetRFPRequest](../../models/operations/GetRFPRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetRFPResponse](../../models/operations/GetRFPResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400, 401, 403, 404, 429      | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |