# EventRole

## Overview

Event roles are event specific permission sets for your organization's users. Use these APIs to retrieve, create, update, and delete event role assignments to your organization's users.

### Available Operations

* [listEventRoleAssignment](#listeventroleassignment) - List Event Role Assignments

## listEventRoleAssignment

Gets a paginated list of event role assignments associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listEventRoleAssignment" method="get" path="/event-roles/assignments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListEventRoleAssignmentRequest;
import com.cvent.models.operations.ListEventRoleAssignmentResponse;
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

        ListEventRoleAssignmentRequest req = ListEventRoleAssignmentRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .expand(List.of(
                    EventRoleExpand.EVENT_ROLE))
                .filter("event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and user.id eq '6807e044-993b-428c-aec8-7316f13c1b95'")
                .build();


        sdk.eventRole().listEventRoleAssignment()
                .callAsStream()
                .forEach((ListEventRoleAssignmentResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListEventRoleAssignmentRequest](../../models/operations/ListEventRoleAssignmentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListEventRoleAssignmentResponse](../../models/operations/ListEventRoleAssignmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |