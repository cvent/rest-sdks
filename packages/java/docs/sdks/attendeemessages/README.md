# AttendeeMessages

## Overview

These APIs retrieve and manage attendee messages—communications exchanged between attendees within channels. Channels are virtual spaces created for one-on-one or group conversations, allowing attendees to communicate directly or in groups during an event.

### Available Operations

* [getAttendeeMessagesMembers](#getattendeemessagesmembers) - Get Messaging Members

## getAttendeeMessagesMembers

When attendee initiates a chat with other attendee(s), a channel is created for attendees to communicate over.
This endpoint is used to retrieve the members of these channels using channel ids to filter the results.
The results will include all the channel members; even the ones that left the channel at some point.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAttendeeMessagesMembers" method="get" path="/events/{eventId}/attendee-messages/members" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAttendeeMessagesMembersRequest;
import com.cvent.models.operations.GetAttendeeMessagesMembersResponse;
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

        GetAttendeeMessagesMembersRequest req = GetAttendeeMessagesMembersRequest.builder()
                .eventId("eeeeb4b4-d132-4db4-aaa7-5ec58efd65c8")
                .filter("<value>")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.attendeeMessages().getAttendeeMessagesMembers()
                .callAsStream()
                .forEach((GetAttendeeMessagesMembersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAttendeeMessagesMembersRequest](../../models/operations/GetAttendeeMessagesMembersRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAttendeeMessagesMembersResponse](../../models/operations/GetAttendeeMessagesMembersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |