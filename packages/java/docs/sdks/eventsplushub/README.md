# EventsPlusHub

## Overview

An Events+ Hub persists basic information needed to assign an owner and optionally customize the public presentation.

### Available Operations

* [listHubs](#listhubs) - List Events+ Hubs
* [getHubMembers](#gethubmembers) - Get Events+ Hub Members

## listHubs

Get a paginated list of all Events+ hubs associated with your account. Each Events+ hub returned contains owner and theme information as well as the current status.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHubs" method="get" path="/hubs" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListHubsRequest;
import com.cvent.models.operations.ListHubsResponse;
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

        ListHubsRequest req = ListHubsRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (id eq '16322408-bae8-4b29-a559-702d2023e13a')")
                .build();


        sdk.eventsPlusHub().listHubs()
                .callAsStream()
                .forEach((ListHubsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListHubsRequest](../../models/operations/ListHubsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListHubsResponse](../../models/operations/ListHubsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHubMembers

Fetches a list of members associated with a particular Events+ hub.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHubMembers" method="get" path="/hubs/{hubId}/members" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHubMembersRequest;
import com.cvent.models.operations.GetHubMembersResponse;
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

        GetHubMembersRequest req = GetHubMembersRequest.builder()
                .hubId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(firstName contains 'tim') and (lastName contains 'wood')")
                .sort("firstName:ASC,lastName:ASC")
                .build();


        sdk.eventsPlusHub().getHubMembers()
                .callAsStream()
                .forEach((GetHubMembersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetHubMembersRequest](../../models/operations/GetHubMembersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetHubMembersResponse](../../models/operations/GetHubMembersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |