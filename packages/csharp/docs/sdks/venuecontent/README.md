# VenueContent

## Overview

Manage images, amenities, and nearby attractions associated with a venue.

### Available Operations

* [CreateVenueImageMetadata](#createvenueimagemetadata) - Create Venue Image Metadata
* [ListVenueImagesMetadata](#listvenueimagesmetadata) - List Images Metadata
* [UpdateVenueImageMetadata](#updatevenueimagemetadata) - Update Venue Image Metadata
* [GetVenueImageMetadata](#getvenueimagemetadata) - Get Image Metadata
* [AssociateVenueImage](#associatevenueimage) - Associate Venue Image
* [DisassociateVenueImage](#disassociatevenueimage) - Remove Venue Image

## CreateVenueImageMetadata

Create venue image metadata for the specified venue. This creates a new venue image record with the provided details such as name, description, image group, and display order. Use the <a href="#operation/associateVenueImage">Associate Venue Image</a> endpoint to associate an uploaded image file to a venue.


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

Associate a previously uploaded image with a venue image using a file UUID from the <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current image file if one is already associated.

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

Disassociates the image from a venue image and deletes the venue image record.

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