# EventCredits

## Overview

Event Credits reward attendees for participating in your events. Planners can award credits for the entire event, specific sessions, or both. You can also award credits after attendees complete surveys. Use these APIs to retrieve credit details for your attendees.

### Available Operations

* [getAttendeeCredits](#getattendeecredits) - List Attendee Event Credits

## getAttendeeCredits

Gets a paginated list of attendee event credits in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAttendeeCredits" method="get" path="/attendee-credits" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAttendeeCreditsRequest;
import com.cvent.models.operations.GetAttendeeCreditsResponse;
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

        GetAttendeeCreditsRequest req = GetAttendeeCreditsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("lastModified:DESC")
                .expand(List.of(
                    Expand1.CREDIT_TYPE))
                .filter("attendee.id eq '{UUID}'")
                .build();


        sdk.eventCredits().getAttendeeCredits()
                .callAsStream()
                .forEach((GetAttendeeCreditsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAttendeeCreditsRequest](../../models/operations/GetAttendeeCreditsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAttendeeCreditsResponse](../../models/operations/GetAttendeeCreditsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |