# RFPAdditionalDetails

## Overview

RFP additional details APIs for managing past event references and other miscellaneous RFP operations.

### Available Operations

* [listRfpPastEvents](#listrfppastevents) - List RFP Past Events

## listRfpPastEvents

Returns list of past events saved by the planner at the time of RFP creation. These can be non-Cvent events.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpPastEvents" method="get" path="/rfps/{rfpId}/past-events" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.ListRfpPastEventsRequest;
import com.cvent.models.operations.ListRfpPastEventsResponse;
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

        ListRfpPastEventsRequest req = ListRfpPastEventsRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        ListRfpPastEventsResponse res = sdk.rfpAdditionalDetails().listRfpPastEvents()
                .request(req)
                .call();

        if (res.rfpPastEvents().isPresent()) {
            System.out.println(res.rfpPastEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListRfpPastEventsRequest](../../models/operations/ListRfpPastEventsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListRfpPastEventsResponse](../../models/operations/ListRfpPastEventsResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 401, 403, 404, 429           | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |