# VenueMeetingRooms

## Overview

Manage meeting rooms for a venue, including creating and updating room details, configuring capacities and amenities, and associating images.

### Available Operations

* [CreateMeetingRoom](#createmeetingroom) - Create Meeting Room
* [ListMeetingRoomsOverviews](#listmeetingroomsoverviews) - List Meeting Rooms Overviews
* [UpdateMeetingRoom](#updatemeetingroom) - Update Meeting Room
* [PatchMeetingRoom](#patchmeetingroom) - Patch Meeting Room
* [AssociateMeetingRoomImage](#associatemeetingroomimage) - Associate Meeting Room Image
* [ListMeetingRoomImages](#listmeetingroomimages) - List Meeting Room Images
* [DisassociateMeetingRoomImage](#disassociatemeetingroomimage) - Remove Meeting Room Image
* [GetMeetingRoomOverview](#getmeetingroomoverview) - Get Meeting Room Overview

## CreateMeetingRoom

Create a new meeting room for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createMeetingRoom" method="post" path="/venues/{venueId}/meeting-rooms" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CreateMeetingRoomRequest req = new CreateMeetingRoomRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoom = new MeetingRoomInput() {
        Name = "Grand Ballroom",
        Description = "Large conference space with natural lighting",
        Dimensions = new MeetingRoomDimensions() {
            TotalSpace = new AreaMeasurement() {
                Value = 1500D,
                Unit = AreaMeasurementUnit.SquareFeet,
            },
            CeilingHeight = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
            Length = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
            Width = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
        },
        DisplayOrder = 1,
        ExternalSourceId = "EXT-123",
        Rates = new MeetingRoomRates() {
            MoveIn = new MeetingRoomRate() {
                Value = 500D,
                ApplicationType = RateApplicationType.PerDay,
            },
            MoveOut = new MeetingRoomRate() {
                Value = 500D,
                ApplicationType = RateApplicationType.PerDay,
            },
            Event = new MeetingRoomRate() {
                Value = 500D,
                ApplicationType = RateApplicationType.PerDay,
            },
        },
        Capacities = new MeetingRoomCapacities() {
            Exhibits = new List<MeetingRoomExhibitCapacity>() {
                new MeetingRoomExhibitCapacity() {
                    LayoutType = ExhibitLayoutType.Booth10x10,
                    MaxExhibits = 50,
                },
            },
            Seating = new List<MeetingRoomSeatingCapacity>() {
                new MeetingRoomSeatingCapacity() {
                    LayoutType = SeatingLayoutType.Theater,
                    MaxAttendees = 250,
                },
            },
        },
        Amenities = new List<MeetingRoomAmenity>() {
            MeetingRoomAmenity.Projector,
        },
    },
};

var res = await sdk.VenueMeetingRooms.CreateMeetingRoomAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateMeetingRoomRequest](../../Models/Requests/CreateMeetingRoomRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateMeetingRoomResponse](../../Models/Requests/CreateMeetingRoomResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListMeetingRoomsOverviews

Retrieve a paginated list of meeting room overviews for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listMeetingRoomsOverviews" method="get" path="/venues/{venueId}/meeting-rooms/overviews" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListMeetingRoomsOverviewsRequest req = new ListMeetingRoomsOverviewsRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "hiddenOnProfile eq 'false'",
};

var res = await sdk.VenueMeetingRooms.ListMeetingRoomsOverviewsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListMeetingRoomsOverviewsRequest](../../Models/Requests/ListMeetingRoomsOverviewsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListMeetingRoomsOverviewsResponse](../../Models/Requests/ListMeetingRoomsOverviewsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateMeetingRoom

Update a meeting room for the specified venue, replacing the existing meeting room data.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateMeetingRoom" method="put" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UpdateMeetingRoomRequest req = new UpdateMeetingRoomRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoomId = "2344f9ab-537e-412f-ad6d-264fedbf17a6",
    ExistingMeetingRoom = new ExistingMeetingRoomInput() {
        Name = "Grand Ballroom",
        Description = "Large conference space with natural lighting",
        Dimensions = new ExistingMeetingRoomDimensions() {
            TotalSpace = new AreaMeasurement() {
                Value = 1500D,
                Unit = AreaMeasurementUnit.SquareFeet,
            },
            CeilingHeight = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
            Length = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
            Width = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
        },
        DisplayOrder = 1,
        ExternalSourceId = "EXT-123",
        Rates = new ExistingMeetingRoomRates() {
            MoveIn = new MeetingRoomRate() {
                Value = 500D,
                ApplicationType = RateApplicationType.PerDay,
            },
            MoveOut = new MeetingRoomRate() {
                Value = 500D,
                ApplicationType = RateApplicationType.PerDay,
            },
            Event = new MeetingRoomRate() {
                Value = 500D,
                ApplicationType = RateApplicationType.PerDay,
            },
        },
        Capacities = new MeetingRoomCapacities() {
            Exhibits = new List<MeetingRoomExhibitCapacity>() {
                new MeetingRoomExhibitCapacity() {
                    LayoutType = ExhibitLayoutType.Booth10x10,
                    MaxExhibits = 50,
                },
            },
            Seating = new List<MeetingRoomSeatingCapacity>() {
                new MeetingRoomSeatingCapacity() {
                    LayoutType = SeatingLayoutType.Theater,
                    MaxAttendees = 250,
                },
            },
        },
        Amenities = new List<MeetingRoomAmenity>() {
            MeetingRoomAmenity.Projector,
        },
    },
};

var res = await sdk.VenueMeetingRooms.UpdateMeetingRoomAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateMeetingRoomRequest](../../Models/Requests/UpdateMeetingRoomRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateMeetingRoomResponse](../../Models/Requests/UpdateMeetingRoomResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## PatchMeetingRoom

Partially update a meeting room for the specified venue.

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- **Arrays (`capacities`, `amenities`) are treated as full replacements** — the entire array is replaced, not merged.
- All changes are applied atomically.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="patchMeetingRoom" method="patch" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

PatchMeetingRoomRequest req = new PatchMeetingRoomRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoomId = "2a12f958-0ac4-4665-9210-449812da553a",
    PatchMeetingRoom = new PatchMeetingRoom() {
        Name = "Grand Ballroom",
        Description = "Large conference space with natural lighting",
        Dimensions = new PatchMeetingRoomDimensions() {
            TotalSpace = new AreaMeasurement() {
                Value = 1500D,
                Unit = AreaMeasurementUnit.SquareFeet,
            },
            CeilingHeight = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
            Length = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
            Width = new Dimension() {
                Value = 12.5D,
                Unit = DimensionUnit.Feet,
            },
        },
        DisplayOrder = 1,
        ExternalSourceId = "EXT-RM-12345",
        Rates = null,
        Capacities = null,
        Amenities = new List<MeetingRoomAmenity>() {
            MeetingRoomAmenity.Projector,
        },
        HiddenOnProfile = false,
    },
};

var res = await sdk.VenueMeetingRooms.PatchMeetingRoomAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchMeetingRoomRequest](../../Models/Requests/PatchMeetingRoomRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchMeetingRoomResponse](../../Models/Requests/PatchMeetingRoomResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## AssociateMeetingRoomImage

Associate a previously uploaded image with a meeting room using a file UUID from the <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current image if one is already associated.

**Note:** The recommended image dimensions are at least 1920 x 1080 pixels. Only JPEG images (.jpg, .jpeg) are accepted. Maximum file size is 10 MB.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateMeetingRoomImage" method="put" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}/images" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

AssociateMeetingRoomImageRequest req = new AssociateMeetingRoomImageRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoomId = "00944672-3602-4b8e-aea3-cb1278b2d143",
    MeetingRoomImageAssociationRequest = new MeetingRoomImageAssociationRequest() {
        File = new MeetingRoomImageAssociationRequestFile() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
    },
};

var res = await sdk.VenueMeetingRooms.AssociateMeetingRoomImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AssociateMeetingRoomImageRequest](../../Models/Requests/AssociateMeetingRoomImageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AssociateMeetingRoomImageResponse](../../Models/Requests/AssociateMeetingRoomImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListMeetingRoomImages

Retrieves the images associated with a meeting room. Each meeting room has at most one image.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listMeetingRoomImages" method="get" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}/images" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListMeetingRoomImagesRequest req = new ListMeetingRoomImagesRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoomId = "880546b3-292e-4a70-95a5-3afae3e3f759",
};

var res = await sdk.VenueMeetingRooms.ListMeetingRoomImagesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListMeetingRoomImagesRequest](../../Models/Requests/ListMeetingRoomImagesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListMeetingRoomImagesResponse](../../Models/Requests/ListMeetingRoomImagesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DisassociateMeetingRoomImage

Disassociates the current image from a meeting room.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateMeetingRoomImage" method="delete" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}/images/{imageId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

DisassociateMeetingRoomImageRequest req = new DisassociateMeetingRoomImageRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoomId = "13e75adc-1d1b-4598-b520-f17774484472",
    ImageId = "e5b29ab7-8c63-446c-9663-66202b0d037f",
};

var res = await sdk.VenueMeetingRooms.DisassociateMeetingRoomImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [DisassociateMeetingRoomImageRequest](../../Models/Requests/DisassociateMeetingRoomImageRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[DisassociateMeetingRoomImageResponse](../../Models/Requests/DisassociateMeetingRoomImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetMeetingRoomOverview

Retrieve an overview of a specific meeting room for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getMeetingRoomOverview" method="get" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}/overview" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetMeetingRoomOverviewRequest req = new GetMeetingRoomOverviewRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    MeetingRoomId = "081078e3-8a73-49c6-b757-a3d52dbc2cc8",
};

var res = await sdk.VenueMeetingRooms.GetMeetingRoomOverviewAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetMeetingRoomOverviewRequest](../../Models/Requests/GetMeetingRoomOverviewRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetMeetingRoomOverviewResponse](../../Models/Requests/GetMeetingRoomOverviewResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |