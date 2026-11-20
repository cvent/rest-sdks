# RFPAdditionalDetails

## Overview

RFP additional details APIs for managing past event references and other miscellaneous RFP operations.

### Available Operations

* [listRfpPastEvents](#listrfppastevents) - List RFP Past Events
* [createRfpPastEvent](#createrfppastevent) - Create RFP Past Event
* [getRfpPastEvent](#getrfppastevent) - Get RFP Past Event
* [updateRfpPastEvent](#updaterfppastevent) - Update RFP Past Event
* [deleteRfpPastEvent](#deleterfppastevent) - Delete RFP Past Event

## listRfpPastEvents

Retrieves a list of past events associated with an RFP. These can be non-Cvent events.

### Example Usage

<!-- UsageSnippet language="java" operationID="listRfpPastEvents" method="get" path="/rfps/{rfpId}/past-events" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListRfpPastEventsRequest;
import com.cvent.models.operations.ListRfpPastEventsResponse;
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createRfpPastEvent

Adds a past event that is similar to the event associated with the specified RFP. An RFP can have at most 3 past events.

### Example Usage

<!-- UsageSnippet language="java" operationID="createRfpPastEvent" method="post" path="/rfps/{rfpId}/past-events" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateRfpPastEventRequest;
import com.cvent.models.operations.CreateRfpPastEventResponse;
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

        CreateRfpPastEventRequest req = CreateRfpPastEventRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .rfpPastEventRequest(RfpPastEventRequest.builder()
                    .venueName("Delta Inn by Supreme Hotels")
                    .city("New Delhi")
                    .stateProvince("US-AL")
                    .date("First week of January 2024")
                    .attendeeCount(500L)
                    .guestRoomsPickedUp(500L)
                    .guestRoomsBlocked(500L)
                    .foodBeverageSpend("3,000 dollars")
                    .notes("This was the 25th event hosted by Alpha Planners.")
                    .build())
                .build();

        CreateRfpPastEventResponse res = sdk.rfpAdditionalDetails().createRfpPastEvent()
                .request(req)
                .call();

        if (res.rfpPastEvent().isPresent()) {
            System.out.println(res.rfpPastEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateRfpPastEventRequest](../../models/operations/CreateRfpPastEventRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateRfpPastEventResponse](../../models/operations/CreateRfpPastEventResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getRfpPastEvent

Returns details of a past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRfpPastEvent" method="get" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetRfpPastEventRequest;
import com.cvent.models.operations.GetRfpPastEventResponse;
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

        GetRfpPastEventRequest req = GetRfpPastEventRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .pastEventId("f56a51a4-84b0-46c9-a612-716dc95a1c96")
                .build();

        GetRfpPastEventResponse res = sdk.rfpAdditionalDetails().getRfpPastEvent()
                .request(req)
                .call();

        if (res.rfpPastEvent().isPresent()) {
            System.out.println(res.rfpPastEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpPastEventRequest](../../models/operations/GetRfpPastEventRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpPastEventResponse](../../models/operations/GetRfpPastEventResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateRfpPastEvent

Updates a past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRfpPastEvent" method="put" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateRfpPastEventRequest;
import com.cvent.models.operations.UpdateRfpPastEventResponse;
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

        UpdateRfpPastEventRequest req = UpdateRfpPastEventRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .pastEventId("f56a51a4-84b0-46c9-a612-716dc95a1c96")
                .rfpPastEvent(RfpPastEvent.builder()
                    .id("db6a6dd9-3284-4936-bd7d-5242494acb03")
                    .venueName("Delta Inn by Supreme Hotels")
                    .city("New Delhi")
                    .stateProvince("US-AL")
                    .date("First week of January 2024")
                    .attendeeCount(500L)
                    .guestRoomsPickedUp(500L)
                    .guestRoomsBlocked(500L)
                    .foodBeverageSpend("3,000 dollars")
                    .notes("This was the 25th event hosted by Alpha Planners.")
                    .build())
                .build();

        UpdateRfpPastEventResponse res = sdk.rfpAdditionalDetails().updateRfpPastEvent()
                .request(req)
                .call();

        if (res.rfpPastEvent().isPresent()) {
            System.out.println(res.rfpPastEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateRfpPastEventRequest](../../models/operations/UpdateRfpPastEventRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateRfpPastEventResponse](../../models/operations/UpdateRfpPastEventResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteRfpPastEvent

Deletes the past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRfpPastEvent" method="delete" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteRfpPastEventRequest;
import com.cvent.models.operations.DeleteRfpPastEventResponse;
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

        DeleteRfpPastEventRequest req = DeleteRfpPastEventRequest.builder()
                .rfpId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .pastEventId("f56a51a4-84b0-46c9-a612-716dc95a1c96")
                .build();

        DeleteRfpPastEventResponse res = sdk.rfpAdditionalDetails().deleteRfpPastEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteRfpPastEventRequest](../../models/operations/DeleteRfpPastEventRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteRfpPastEventResponse](../../models/operations/DeleteRfpPastEventResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |