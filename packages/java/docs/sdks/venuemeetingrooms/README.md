# VenueMeetingRooms

## Overview

Manage meeting rooms for a venue, including creating and updating room details, configuring capacities and amenities, and associating images.

### Available Operations

* [createMeetingRoom](#createmeetingroom) - Create Meeting Room
* [listMeetingRoomsOverviews](#listmeetingroomsoverviews) - List Meeting Rooms Overviews
* [updateMeetingRoom](#updatemeetingroom) - Update Meeting Room
* [patchMeetingRoom](#patchmeetingroom) - Patch Meeting Room
* [getMeetingRoomOverview](#getmeetingroomoverview) - Get Meeting Room Overview

## createMeetingRoom

Create a new meeting room for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="createMeetingRoom" method="post" path="/venues/{venueId}/meeting-rooms" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.CreateMeetingRoomRequest;
import com.cvent.models.operations.CreateMeetingRoomResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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

        CreateMeetingRoomRequest req = CreateMeetingRoomRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .meetingRoom(MeetingRoom.builder()
                    .name("Grand Ballroom")
                    .dimensions(MeetingRoomDimensions.builder()
                        .totalSpace(AreaMeasurement.builder()
                            .value(1500d)
                            .unit(AreaMeasurementUnit.SQUARE_FEET)
                            .build())
                        .ceilingHeight(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .length(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .width(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .build())
                    .description("Large conference space with natural lighting")
                    .displayOrder(1L)
                    .externalSourceId("EXT-123")
                    .rates(MeetingRoomRates.builder()
                        .moveIn(MeetingRoomRate.builder()
                            .value(500d)
                            .applicationType(RateApplicationType.PER_DAY)
                            .build())
                        .moveOut(MeetingRoomRate.builder()
                            .value(500d)
                            .applicationType(RateApplicationType.PER_DAY)
                            .build())
                        .event(MeetingRoomRate.builder()
                            .value(500d)
                            .applicationType(RateApplicationType.PER_DAY)
                            .build())
                        .build())
                    .capacities(MeetingRoomCapacities.builder()
                        .exhibits(List.of(
                            MeetingRoomExhibitCapacity.builder()
                                .layoutType(ExhibitLayoutType.BOOTH10X10)
                                .maxExhibits(50L)
                                .build()))
                        .seating(List.of(
                            MeetingRoomSeatingCapacity.builder()
                                .layoutType(SeatingLayoutType.THEATER)
                                .maxAttendees(250L)
                                .build()))
                        .build())
                    .amenities(List.of(
                        MeetingRoomAmenity.PROJECTOR))
                    .build())
                .build();

        CreateMeetingRoomResponse res = sdk.venueMeetingRooms().createMeetingRoom()
                .request(req)
                .call();

        if (res.existingMeetingRoom().isPresent()) {
            System.out.println(res.existingMeetingRoom().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateMeetingRoomRequest](../../models/operations/CreateMeetingRoomRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateMeetingRoomResponse](../../models/operations/CreateMeetingRoomResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listMeetingRoomsOverviews

Retrieve a paginated list of meeting room overviews for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="listMeetingRoomsOverviews" method="get" path="/venues/{venueId}/meeting-rooms/overviews" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.ListMeetingRoomsOverviewsRequest;
import com.cvent.models.operations.ListMeetingRoomsOverviewsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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

        ListMeetingRoomsOverviewsRequest req = ListMeetingRoomsOverviewsRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("hiddenOnProfile eq 'false'")
                .build();

        ListMeetingRoomsOverviewsResponse res = sdk.venueMeetingRooms().listMeetingRoomsOverviews()
                .request(req)
                .call();

        if (res.meetingRoomsOverviewResponse().isPresent()) {
            System.out.println(res.meetingRoomsOverviewResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListMeetingRoomsOverviewsRequest](../../models/operations/ListMeetingRoomsOverviewsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListMeetingRoomsOverviewsResponse](../../models/operations/ListMeetingRoomsOverviewsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateMeetingRoom

Update a meeting room for the specified venue, replacing the existing meeting room data.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMeetingRoom" method="put" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.UpdateMeetingRoomRequest;
import com.cvent.models.operations.UpdateMeetingRoomResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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

        UpdateMeetingRoomRequest req = UpdateMeetingRoomRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .meetingRoomId("2344f9ab-537e-412f-ad6d-264fedbf17a6")
                .existingMeetingRoom(ExistingMeetingRoomInput.builder()
                    .name("Grand Ballroom")
                    .dimensions(ExistingMeetingRoomDimensions.builder()
                        .totalSpace(AreaMeasurement.builder()
                            .value(1500d)
                            .unit(AreaMeasurementUnit.SQUARE_FEET)
                            .build())
                        .ceilingHeight(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .length(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .width(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .build())
                    .description("Large conference space with natural lighting")
                    .displayOrder(1L)
                    .externalSourceId("EXT-123")
                    .rates(ExistingMeetingRoomRates.builder()
                        .moveIn(MeetingRoomRate.builder()
                            .value(500d)
                            .applicationType(RateApplicationType.PER_DAY)
                            .build())
                        .moveOut(MeetingRoomRate.builder()
                            .value(500d)
                            .applicationType(RateApplicationType.PER_DAY)
                            .build())
                        .event(MeetingRoomRate.builder()
                            .value(500d)
                            .applicationType(RateApplicationType.PER_DAY)
                            .build())
                        .build())
                    .capacities(MeetingRoomCapacities.builder()
                        .exhibits(List.of(
                            MeetingRoomExhibitCapacity.builder()
                                .layoutType(ExhibitLayoutType.BOOTH10X10)
                                .maxExhibits(50L)
                                .build()))
                        .seating(List.of(
                            MeetingRoomSeatingCapacity.builder()
                                .layoutType(SeatingLayoutType.THEATER)
                                .maxAttendees(250L)
                                .build()))
                        .build())
                    .amenities(List.of(
                        MeetingRoomAmenity.PROJECTOR))
                    .build())
                .build();

        UpdateMeetingRoomResponse res = sdk.venueMeetingRooms().updateMeetingRoom()
                .request(req)
                .call();

        if (res.existingMeetingRoom().isPresent()) {
            System.out.println(res.existingMeetingRoom().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateMeetingRoomRequest](../../models/operations/UpdateMeetingRoomRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateMeetingRoomResponse](../../models/operations/UpdateMeetingRoomResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## patchMeetingRoom

Partially update a meeting room for the specified venue.

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- **Arrays (`capacities`, `amenities`) are treated as full replacements** — the entire array is replaced, not merged.
- All changes are applied atomically.


### Example Usage

<!-- UsageSnippet language="java" operationID="patchMeetingRoom" method="patch" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.PatchMeetingRoomRequest;
import com.cvent.models.operations.PatchMeetingRoomResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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

        PatchMeetingRoomRequest req = PatchMeetingRoomRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .meetingRoomId("2a12f958-0ac4-4665-9210-449812da553a")
                .patchMeetingRoom(PatchMeetingRoom.builder()
                    .name("Grand Ballroom")
                    .description("Large conference space with natural lighting")
                    .dimensions(PatchMeetingRoomDimensions.builder()
                        .totalSpace(AreaMeasurement.builder()
                            .value(1500d)
                            .unit(AreaMeasurementUnit.SQUARE_FEET)
                            .build())
                        .ceilingHeight(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .length(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .width(Dimension.builder()
                            .value(12.5)
                            .unit(DimensionUnit.FEET)
                            .build())
                        .build())
                    .displayOrder(1L)
                    .externalSourceId("EXT-RM-12345")
                    .rates(null)
                    .capacities(null)
                    .amenities(List.of(
                        MeetingRoomAmenity.PROJECTOR))
                    .hiddenOnProfile(false)
                    .build())
                .build();

        PatchMeetingRoomResponse res = sdk.venueMeetingRooms().patchMeetingRoom()
                .request(req)
                .call();

        if (res.patchMeetingRoom().isPresent()) {
            System.out.println(res.patchMeetingRoom().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchMeetingRoomRequest](../../models/operations/PatchMeetingRoomRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchMeetingRoomResponse](../../models/operations/PatchMeetingRoomResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getMeetingRoomOverview

Retrieve an overview of a specific meeting room for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMeetingRoomOverview" method="get" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}/overview" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse11;
import com.cvent.models.operations.GetMeetingRoomOverviewRequest;
import com.cvent.models.operations.GetMeetingRoomOverviewResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse11, Exception {

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

        GetMeetingRoomOverviewRequest req = GetMeetingRoomOverviewRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .meetingRoomId("081078e3-8a73-49c6-b757-a3d52dbc2cc8")
                .build();

        GetMeetingRoomOverviewResponse res = sdk.venueMeetingRooms().getMeetingRoomOverview()
                .request(req)
                .call();

        if (res.meetingRoomOverview().isPresent()) {
            System.out.println(res.meetingRoomOverview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetMeetingRoomOverviewRequest](../../models/operations/GetMeetingRoomOverviewRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetMeetingRoomOverviewResponse](../../models/operations/GetMeetingRoomOverviewResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse11 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |