# VenueContent

## Overview

Manage images, amenities, and nearby attractions associated with a venue.

### Available Operations

* [GetVenueAmenities](#getvenueamenities) - Get Venue Amenities
* [UpdateVenueAmenities](#updatevenueamenities) - Update Venue Amenities
* [ListVenueAttractions](#listvenueattractions) - List Venue Attractions
* [CreateVenueAttraction](#createvenueattraction) - Create Venue Attraction
* [GetVenueAttraction](#getvenueattraction) - Get Venue Attraction
* [UpdateVenueAttraction](#updatevenueattraction) - Update Venue Attraction
* [DeleteVenueAttraction](#deletevenueattraction) - Delete Venue Attraction
* [AssociateAttractionImage](#associateattractionimage) - Associate Attraction Image
* [GetAttractionImages](#getattractionimages) - Get Attraction Images
* [DisassociateAttractionImage](#disassociateattractionimage) - Remove Attraction Image
* [CreateVenueImageMetadata](#createvenueimagemetadata) - Create Venue Image Metadata
* [ListVenueImagesMetadata](#listvenueimagesmetadata) - List Venue Images Metadata
* [UpdateVenueImageMetadata](#updatevenueimagemetadata) - Update Venue Image Metadata
* [GetVenueImageMetadata](#getvenueimagemetadata) - Get Venue Image Metadata
* [AssociateVenueImage](#associatevenueimage) - Associate Venue Image
* [DisassociateVenueImage](#disassociatevenueimage) - Remove Venue Image

## GetVenueAmenities

Returns the current amenity selections for the specified venue.

Not applicable to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVenueAmenities" method="get" path="/venues/{venueId}/amenities" -->
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

GetVenueAmenitiesRequest req = new GetVenueAmenitiesRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
};

var res = await sdk.VenueContent.GetVenueAmenitiesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetVenueAmenitiesRequest](../../Models/Requests/GetVenueAmenitiesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetVenueAmenitiesResponse](../../Models/Requests/GetVenueAmenitiesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateVenueAmenities

Updates the amenity selections for the specified venue, replacing all existing selections with those provided in the request body. Sections absent from the request body or submitted as empty arrays will have their selections cleared.

Not applicable to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueAmenities" method="put" path="/venues/{venueId}/amenities" -->
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

UpdateVenueAmenitiesRequest req = new UpdateVenueAmenitiesRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    ExistingVenueAmenities = new ExistingVenueAmenitiesInput() {
        AvCapabilities = new List<VenueAmenityAvCapabilityItem>() {
            new VenueAmenityAvCapabilityItem() {
                Amenity = VenueAmenityAVCapability.OnsiteAvStaff,
                Speed = 1000,
            },
        },
        Parking = new List<VenueAmenityParkingItem>() {
            new VenueAmenityParkingItem() {
                Amenity = VenueAmenityParking.BusParkingAvailable,
                Cost = 25D,
            },
        },
        FacilitySpaceInfo = new List<VenueAmenityFacilitySpaceItem>() {
            new VenueAmenityFacilitySpaceItem() {
                Amenity = VenueAmenityFacilitySpace.OutdoorSpace,
                Value = 5000,
            },
        },
    },
};

var res = await sdk.VenueContent.UpdateVenueAmenitiesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateVenueAmenitiesRequest](../../Models/Requests/UpdateVenueAmenitiesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateVenueAmenitiesResponse](../../Models/Requests/UpdateVenueAmenitiesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListVenueAttractions

Returns a paginated list of attractions for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listVenueAttractions" method="get" path="/venues/{venueId}/attractions" -->
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

ListVenueAttractionsRequest req = new ListVenueAttractionsRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListVenueAttractionsResponse? res = await sdk.VenueContent.ListVenueAttractionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListVenueAttractionsRequest](../../Models/Requests/ListVenueAttractionsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListVenueAttractionsResponse](../../Models/Requests/ListVenueAttractionsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateVenueAttraction

Creates a new attraction for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createVenueAttraction" method="post" path="/venues/{venueId}/attractions" -->
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

CreateVenueAttractionRequest req = new CreateVenueAttractionRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueAttraction = new VenueAttraction() {
        Name = "Golden Gate Bridge",
        Description = "Iconic suspension bridge, 10 minutes from the venue.",
        Url = "https://www.example.com",
        Distance = new AttractionDistance() {
            Value = 2,
        },
        Address = new AttractionAddress() {
            StreetAddress1 = "Golden Gate Bridge",
            StreetAddress2 = "Suite 100",
            City = "San Francisco",
            ZipPostalCode = "94129",
        },
    },
};

var res = await sdk.VenueContent.CreateVenueAttractionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateVenueAttractionRequest](../../Models/Requests/CreateVenueAttractionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateVenueAttractionResponse](../../Models/Requests/CreateVenueAttractionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetVenueAttraction

Retrieves the given attraction for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVenueAttraction" method="get" path="/venues/{venueId}/attractions/{attractionId}" -->
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

GetVenueAttractionRequest req = new GetVenueAttractionRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    AttractionId = "085d6c08-a5e1-4434-9ca4-db1193317657",
};

var res = await sdk.VenueContent.GetVenueAttractionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetVenueAttractionRequest](../../Models/Requests/GetVenueAttractionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetVenueAttractionResponse](../../Models/Requests/GetVenueAttractionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateVenueAttraction

Update the given attraction for the specified venue, replacing existing attraction data.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueAttraction" method="put" path="/venues/{venueId}/attractions/{attractionId}" -->
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

UpdateVenueAttractionRequest req = new UpdateVenueAttractionRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    AttractionId = "e9db7203-82f8-4b3f-9e91-a8b6970ff2b4",
    VenueAttraction = new VenueAttraction() {
        Name = "Golden Gate Bridge",
        Description = "Iconic suspension bridge, 10 minutes from the venue.",
        Url = "https://www.example.com",
        Distance = new AttractionDistance() {
            Value = 2,
        },
        Address = new AttractionAddress() {
            StreetAddress1 = "Golden Gate Bridge",
            StreetAddress2 = "Suite 100",
            City = "San Francisco",
            ZipPostalCode = "94129",
        },
    },
};

var res = await sdk.VenueContent.UpdateVenueAttractionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateVenueAttractionRequest](../../Models/Requests/UpdateVenueAttractionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateVenueAttractionResponse](../../Models/Requests/UpdateVenueAttractionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteVenueAttraction

Deletes the specified attraction for the venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteVenueAttraction" method="delete" path="/venues/{venueId}/attractions/{attractionId}" -->
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

DeleteVenueAttractionRequest req = new DeleteVenueAttractionRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    AttractionId = "b218badc-88e8-41bc-a93f-3c536900b825",
};

var res = await sdk.VenueContent.DeleteVenueAttractionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteVenueAttractionRequest](../../Models/Requests/DeleteVenueAttractionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteVenueAttractionResponse](../../Models/Requests/DeleteVenueAttractionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## AssociateAttractionImage

Associate a previously uploaded image with an attraction using a file UUID from the [file upload](#operation/uploadFile) endpoint. This will replace the current image if one is already associated.

**Note:** The recommended image dimensions are at least 1920 x 1080 pixels. Only JPEG images (.jpg, .jpeg) are accepted. Maximum file size is 10 MB.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateAttractionImage" method="put" path="/venues/{venueId}/attractions/{attractionId}/images" -->
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

AssociateAttractionImageRequest req = new AssociateAttractionImageRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    AttractionId = "866bb720-507f-4df9-bdf8-ce9082764bff",
    AttractionImageAssociationRequest = new AttractionImageAssociationRequest() {
        File = new AttractionImageAssociationRequestFile() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
    },
};

var res = await sdk.VenueContent.AssociateAttractionImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AssociateAttractionImageRequest](../../Models/Requests/AssociateAttractionImageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AssociateAttractionImageResponse](../../Models/Requests/AssociateAttractionImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetAttractionImages

Retrieves the images associated with the specified attraction.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAttractionImages" method="get" path="/venues/{venueId}/attractions/{attractionId}/images" -->
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

GetAttractionImagesRequest req = new GetAttractionImagesRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    AttractionId = "e43d626a-e1ba-447a-89ad-26eeea82a10a",
};

var res = await sdk.VenueContent.GetAttractionImagesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAttractionImagesRequest](../../Models/Requests/GetAttractionImagesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAttractionImagesResponse](../../Models/Requests/GetAttractionImagesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DisassociateAttractionImage

Removes the association between an image and the specified attraction.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateAttractionImage" method="delete" path="/venues/{venueId}/attractions/{attractionId}/images/{imageId}" -->
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

DisassociateAttractionImageRequest req = new DisassociateAttractionImageRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    AttractionId = "05151e54-493f-416f-b0c5-5ceddc83f4e2",
    ImageId = "50774316-f318-4ca7-bff5-1672ac751192",
};

var res = await sdk.VenueContent.DisassociateAttractionImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [DisassociateAttractionImageRequest](../../Models/Requests/DisassociateAttractionImageRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[DisassociateAttractionImageResponse](../../Models/Requests/DisassociateAttractionImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateVenueImageMetadata

Create venue image metadata for the specified venue. This creates a new venue image record with the provided details such as name, description, image group, and display order. Use the [Associate Venue Image](#operation/associateVenueImage) endpoint to associate an uploaded image file to a venue.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="createVenueImageMetadata" method="post" path="/venues/{venueId}/images-metadata" -->
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

CreateVenueImageMetadataRequest req = new CreateVenueImageMetadataRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueImage = new VenueImage() {
        Name = "Grand Ballroom Exterior",
        Description = "Main exterior view of the venue showing the grand entrance.",
        ImageGroup = ImageGroup.Exterior,
    },
};

var res = await sdk.VenueContent.CreateVenueImageMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateVenueImageMetadataRequest](../../Models/Requests/CreateVenueImageMetadataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateVenueImageMetadataResponse](../../Models/Requests/CreateVenueImageMetadataResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListVenueImagesMetadata

Retrieve a paginated list of venue image metadata for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listVenueImagesMetadata" method="get" path="/venues/{venueId}/images-metadata" -->
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

ListVenueImagesMetadataRequest req = new ListVenueImagesMetadataRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

var res = await sdk.VenueContent.ListVenueImagesMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListVenueImagesMetadataRequest](../../Models/Requests/ListVenueImagesMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListVenueImagesMetadataResponse](../../Models/Requests/ListVenueImagesMetadataResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateVenueImageMetadata

Updates the metadata of an existing venue image such as name, description, image group, active status, and display order.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueImageMetadata" method="put" path="/venues/{venueId}/images-metadata/{venueImageId}" -->
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

UpdateVenueImageMetadataRequest req = new UpdateVenueImageMetadataRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueImageId = "286e2866-b443-4d09-ab0f-0fac45cc026f",
    VenueImage = new VenueImage() {
        Name = "Grand Ballroom Exterior",
        Description = "Main exterior view of the venue showing the grand entrance.",
        ImageGroup = ImageGroup.Exterior,
    },
};

var res = await sdk.VenueContent.UpdateVenueImageMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateVenueImageMetadataRequest](../../Models/Requests/UpdateVenueImageMetadataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateVenueImageMetadataResponse](../../Models/Requests/UpdateVenueImageMetadataResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetVenueImageMetadata

Retrieve venue image metadata for the specified venue image.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVenueImageMetadata" method="get" path="/venues/{venueId}/images-metadata/{venueImageId}" -->
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

GetVenueImageMetadataRequest req = new GetVenueImageMetadataRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueImageId = "286e2866-b443-4d09-ab0f-0fac45cc026f",
};

var res = await sdk.VenueContent.GetVenueImageMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetVenueImageMetadataRequest](../../Models/Requests/GetVenueImageMetadataRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetVenueImageMetadataResponse](../../Models/Requests/GetVenueImageMetadataResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## AssociateVenueImage

Associate a previously uploaded image with a venue image using a file UUID from the [file upload](#operation/uploadFile) endpoint. This will replace the current image file if one is already associated.

**Note:** The recommended image dimensions are at least 1920 x 1080 pixels. Only JPEG images (.jpg, .jpeg) are accepted. Maximum file size is 10 MB.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateVenueImage" method="put" path="/venues/{venueId}/images/{venueImageId}" -->
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

AssociateVenueImageRequest req = new AssociateVenueImageRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueImageId = "286e2866-b443-4d09-ab0f-0fac45cc026f",
    VenueImageAssociationRequest = new VenueImageAssociationRequest() {
        File = new VenueImageAssociationRequestFile() {
            Id = "e0921301-7742-4354-a0d8-2a747ff66958",
        },
    },
};

var res = await sdk.VenueContent.AssociateVenueImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AssociateVenueImageRequest](../../Models/Requests/AssociateVenueImageRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AssociateVenueImageResponse](../../Models/Requests/AssociateVenueImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DisassociateVenueImage

Disassociates the image from the venue and deletes the venue image record.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateVenueImage" method="delete" path="/venues/{venueId}/images/{venueImageId}" -->
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

DisassociateVenueImageRequest req = new DisassociateVenueImageRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueImageId = "286e2866-b443-4d09-ab0f-0fac45cc026f",
};

var res = await sdk.VenueContent.DisassociateVenueImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DisassociateVenueImageRequest](../../Models/Requests/DisassociateVenueImageRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DisassociateVenueImageResponse](../../Models/Requests/DisassociateVenueImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |