# EventRole

## Overview

Event roles are event specific permission sets for your organization's users. Use these APIs to retrieve, create, update, and delete event role assignments to your organization's users.

### Available Operations

* [listEventRoleAssignment](#listeventroleassignment) - List Event Role Assignments
* [createEventRoleAssignment](#createeventroleassignment) - Assign Event Role
* [deleteEventRoleAssignment](#deleteeventroleassignment) - Unassign Event Role

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
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListEventRoleAssignmentRequest;
import com.cvent.models.operations.ListEventRoleAssignmentResponse;
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

        ListEventRoleAssignmentRequest req = ListEventRoleAssignmentRequest.builder()
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createEventRoleAssignment

Assigns an event role to an account user or a no-login user for an event, using the details in the request body.

The optional `notification` object applies to both `ACCOUNT_USER` and `NO_LOGIN_USER`. If you omit the object,
omit `sendNotification`, or set it to `false`, the service sends no notification and still returns `201`.
When `sendNotification` is `true`, the service queues a notification email to the assignee after the assignment succeeds.

For a `NO_LOGIN_USER`, the service finds the user by `id` when it is sent, or else by `email`:
- If `id` and `email` are both sent and the email does not match that user, the service returns `400`.
- If no no-login user in the account has the email, the service returns `404`.
- If more than one no-login user in the account has the email, the service returns `409`. Send `id` instead.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage: accountUserWithNotification

<!-- UsageSnippet language="java" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="accountUserWithNotification" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.errors.EventRoleAssignmentNotificationFailureResponseException;
import com.cvent.models.operations.CreateEventRoleAssignmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, EventRoleAssignmentNotificationFailureResponseException, Exception {

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

        EventRoleAssignmentCreate req = EventRoleAssignmentCreate.builder()
                .event(EventRoleAssignmentCreateEvent.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .eventRole(EventRoleAssignmentCreateEventRole.builder()
                    .id("2b1a3bba-84b2-46f4-bddb-4b4a44442dcc")
                    .build())
                .user(EventRoleAssignmentUserUnion.of(EventRoleAssignmentAccountUser.builder()
                    .type(EventRoleAssignmentAccountUserType.ACCOUNT_USER)
                    .id("7c9e6679-7425-40de-944b-e07fc1f90ae7")
                    .build()))
                .notification(EventRoleAssignmentNotification.builder()
                    .sendNotification(true)
                    .build())
                .build();

        CreateEventRoleAssignmentResponse res = sdk.eventRole().createEventRoleAssignment()
                .request(req)
                .call();

        if (res.eventRoleAssignment().isPresent()) {
            System.out.println(res.eventRoleAssignment().get());
        }
    }
}
```
### Example Usage: accountUserWithoutNotification

<!-- UsageSnippet language="java" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="accountUserWithoutNotification" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.errors.EventRoleAssignmentNotificationFailureResponseException;
import com.cvent.models.operations.CreateEventRoleAssignmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, EventRoleAssignmentNotificationFailureResponseException, Exception {

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

        EventRoleAssignmentCreate req = EventRoleAssignmentCreate.builder()
                .event(EventRoleAssignmentCreateEvent.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .eventRole(EventRoleAssignmentCreateEventRole.builder()
                    .id("2b1a3bba-84b2-46f4-bddb-4b4a44442dcc")
                    .build())
                .user(EventRoleAssignmentUserUnion.of(EventRoleAssignmentAccountUser.builder()
                    .type(EventRoleAssignmentAccountUserType.ACCOUNT_USER)
                    .id("7c9e6679-7425-40de-944b-e07fc1f90ae7")
                    .build()))
                .notification(EventRoleAssignmentNotification.builder()
                    .sendNotification(false)
                    .build())
                .build();

        CreateEventRoleAssignmentResponse res = sdk.eventRole().createEventRoleAssignment()
                .request(req)
                .call();

        if (res.eventRoleAssignment().isPresent()) {
            System.out.println(res.eventRoleAssignment().get());
        }
    }
}
```
### Example Usage: noLoginUserByEmail

<!-- UsageSnippet language="java" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="noLoginUserByEmail" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.errors.EventRoleAssignmentNotificationFailureResponseException;
import com.cvent.models.operations.CreateEventRoleAssignmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, EventRoleAssignmentNotificationFailureResponseException, Exception {

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

        EventRoleAssignmentCreate req = EventRoleAssignmentCreate.builder()
                .event(EventRoleAssignmentCreateEvent.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .eventRole(EventRoleAssignmentCreateEventRole.builder()
                    .id("2b1a3bba-84b2-46f4-bddb-4b4a44442dcc")
                    .build())
                .user(EventRoleAssignmentUserUnion.of(EventRoleAssignmentNoLoginUser.of(IdentifiedByEmail.builder()
                    .type(EventRoleAssignmentNoLoginUserType2.NO_LOGIN_USER)
                    .email("reviewer@example.com")
                    .build())))
                .build();

        CreateEventRoleAssignmentResponse res = sdk.eventRole().createEventRoleAssignment()
                .request(req)
                .call();

        if (res.eventRoleAssignment().isPresent()) {
            System.out.println(res.eventRoleAssignment().get());
        }
    }
}
```
### Example Usage: noLoginUserByIdWithNotification

<!-- UsageSnippet language="java" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="noLoginUserByIdWithNotification" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.errors.EventRoleAssignmentNotificationFailureResponseException;
import com.cvent.models.operations.CreateEventRoleAssignmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse12, EventRoleAssignmentNotificationFailureResponseException, Exception {

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

        EventRoleAssignmentCreate req = EventRoleAssignmentCreate.builder()
                .event(EventRoleAssignmentCreateEvent.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .eventRole(EventRoleAssignmentCreateEventRole.builder()
                    .id("2b1a3bba-84b2-46f4-bddb-4b4a44442dcc")
                    .build())
                .user(EventRoleAssignmentUserUnion.of(EventRoleAssignmentNoLoginUser.of(IdentifiedByID.builder()
                    .type(EventRoleAssignmentNoLoginUserType1.NO_LOGIN_USER)
                    .id("9f1b2c3d-4e5f-4a6b-8c7d-0e1f2a3b4c5d")
                    .email("reviewer@example.com")
                    .build())))
                .notification(EventRoleAssignmentNotification.builder()
                    .sendNotification(true)
                    .build())
                .build();

        CreateEventRoleAssignmentResponse res = sdk.eventRole().createEventRoleAssignment()
                .request(req)
                .call();

        if (res.eventRoleAssignment().isPresent()) {
            System.out.println(res.eventRoleAssignment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [EventRoleAssignmentCreate](../../models/shared/EventRoleAssignmentCreate.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateEventRoleAssignmentResponse](../../models/operations/CreateEventRoleAssignmentResponse.md)**

### Errors

| Error Type                                                            | Status Code                                                           | Content Type                                                          |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| models/errors/ErrorResponse12                                         | 400, 401, 403, 404, 409, 429                                          | application/json                                                      |
| models/errors/EventRoleAssignmentNotificationFailureResponseException | 503                                                                   | application/json                                                      |
| models/errors/APIException                                            | 4XX, 5XX                                                              | \*/\*                                                                 |

## deleteEventRoleAssignment

Deletes an event role assignment identified by its composite assignment ID.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteEventRoleAssignment" method="delete" path="/event-roles/assignments/{assignmentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteEventRoleAssignmentRequest;
import com.cvent.models.operations.DeleteEventRoleAssignmentResponse;
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

        DeleteEventRoleAssignmentRequest req = DeleteEventRoleAssignmentRequest.builder()
                .assignmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::2b1a3bba-84b2-46f4-bddb-4b4a44442dcc::6807e044-993b-428c-aec8-7316f13c1b95")
                .build();

        DeleteEventRoleAssignmentResponse res = sdk.eventRole().deleteEventRoleAssignment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DeleteEventRoleAssignmentRequest](../../models/operations/DeleteEventRoleAssignmentRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DeleteEventRoleAssignmentResponse](../../models/operations/DeleteEventRoleAssignmentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |