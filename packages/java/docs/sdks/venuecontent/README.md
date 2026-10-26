# VenueContent

## Overview

Manage images, amenities, and nearby attractions associated with a venue.

### Available Operations

* [getVenueAmenities](#getvenueamenities) - Get Venue Amenities
* [updateVenueAmenities](#updatevenueamenities) - Update Venue Amenities
* [listVenueAttractions](#listvenueattractions) - List Venue Attractions
* [createVenueAttraction](#createvenueattraction) - Create Venue Attraction
* [getVenueAttraction](#getvenueattraction) - Get Venue Attraction
* [updateVenueAttraction](#updatevenueattraction) - Update Venue Attraction
* [deleteVenueAttraction](#deletevenueattraction) - Delete Venue Attraction
* [associateAttractionImage](#associateattractionimage) - Associate Attraction Image
* [getAttractionImages](#getattractionimages) - Get Attraction Images
* [disassociateAttractionImage](#disassociateattractionimage) - Remove Attraction Image
* [createVenueImageMetadata](#createvenueimagemetadata) - Create Venue Image Metadata
* [listVenueImagesMetadata](#listvenueimagesmetadata) - List Venue Images Metadata
* [updateVenueImageMetadata](#updatevenueimagemetadata) - Update Venue Image Metadata
* [getVenueImageMetadata](#getvenueimagemetadata) - Get Venue Image Metadata
* [associateVenueImage](#associatevenueimage) - Associate Venue Image
* [disassociateVenueImage](#disassociatevenueimage) - Remove Venue Image

## getVenueAmenities

Returns the current amenity selections for the specified venue.

Not applicable to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="java" operationID="getVenueAmenities" method="get" path="/venues/{venueId}/amenities" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetVenueAmenitiesRequest;
import com.cvent.models.operations.GetVenueAmenitiesResponse;
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

        GetVenueAmenitiesRequest req = GetVenueAmenitiesRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .build();

        GetVenueAmenitiesResponse res = sdk.venueContent().getVenueAmenities()
                .request(req)
                .call();

        if (res.existingVenueAmenities().isPresent()) {
            System.out.println(res.existingVenueAmenities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetVenueAmenitiesRequest](../../models/operations/GetVenueAmenitiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetVenueAmenitiesResponse](../../models/operations/GetVenueAmenitiesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateVenueAmenities

Updates the amenity selections for the specified venue, replacing all existing selections with those provided in the request body. Sections absent from the request body or submitted as empty arrays will have their selections cleared.

Not applicable to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueAmenities" method="put" path="/venues/{venueId}/amenities" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateVenueAmenitiesRequest;
import com.cvent.models.operations.UpdateVenueAmenitiesResponse;
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

        UpdateVenueAmenitiesRequest req = UpdateVenueAmenitiesRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .existingVenueAmenities(ExistingVenueAmenitiesInput.builder()
                    .avCapabilities(List.of(
                        VenueAmenityAvCapabilityItem.builder()
                            .amenity(VenueAmenityAVCapability.ONSITE_AV_STAFF)
                            .speed(1000L)
                            .build()))
                    .parking(List.of(
                        VenueAmenityParkingItem.builder()
                            .amenity(VenueAmenityParking.BUS_PARKING_AVAILABLE)
                            .cost(25d)
                            .build()))
                    .facilitySpaceInfo(List.of(
                        VenueAmenityFacilitySpaceItem.builder()
                            .amenity(VenueAmenityFacilitySpace.OUTDOOR_SPACE)
                            .value(5000L)
                            .build()))
                    .build())
                .build();

        UpdateVenueAmenitiesResponse res = sdk.venueContent().updateVenueAmenities()
                .request(req)
                .call();

        if (res.existingVenueAmenities().isPresent()) {
            System.out.println(res.existingVenueAmenities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateVenueAmenitiesRequest](../../models/operations/UpdateVenueAmenitiesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateVenueAmenitiesResponse](../../models/operations/UpdateVenueAmenitiesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listVenueAttractions

Returns a paginated list of attractions for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVenueAttractions" method="get" path="/venues/{venueId}/attractions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListVenueAttractionsRequest;
import com.cvent.models.operations.ListVenueAttractionsResponse;
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

        ListVenueAttractionsRequest req = ListVenueAttractionsRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.venueContent().listVenueAttractions()
                .callAsStream()
                .forEach((ListVenueAttractionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListVenueAttractionsRequest](../../models/operations/ListVenueAttractionsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListVenueAttractionsResponse](../../models/operations/ListVenueAttractionsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createVenueAttraction

Creates a new attraction for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="createVenueAttraction" method="post" path="/venues/{venueId}/attractions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateVenueAttractionRequest;
import com.cvent.models.operations.CreateVenueAttractionResponse;
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

        CreateVenueAttractionRequest req = CreateVenueAttractionRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueAttraction(VenueAttraction.builder()
                    .name("Golden Gate Bridge")
                    .description("Iconic suspension bridge, 10 minutes from the venue.")
                    .url("https://www.example.com")
                    .distance(AttractionDistance.builder()
                        .value(2L)
                        .build())
                    .address(AttractionAddress.builder()
                        .streetAddress1("Golden Gate Bridge")
                        .streetAddress2("Suite 100")
                        .city("San Francisco")
                        .zipPostalCode("94129")
                        .build())
                    .build())
                .build();

        CreateVenueAttractionResponse res = sdk.venueContent().createVenueAttraction()
                .request(req)
                .call();

        if (res.existingVenueAttraction().isPresent()) {
            System.out.println(res.existingVenueAttraction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateVenueAttractionRequest](../../models/operations/CreateVenueAttractionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateVenueAttractionResponse](../../models/operations/CreateVenueAttractionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getVenueAttraction

Retrieves the given attraction for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="getVenueAttraction" method="get" path="/venues/{venueId}/attractions/{attractionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetVenueAttractionRequest;
import com.cvent.models.operations.GetVenueAttractionResponse;
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

        GetVenueAttractionRequest req = GetVenueAttractionRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .attractionId("085d6c08-a5e1-4434-9ca4-db1193317657")
                .build();

        GetVenueAttractionResponse res = sdk.venueContent().getVenueAttraction()
                .request(req)
                .call();

        if (res.existingVenueAttraction().isPresent()) {
            System.out.println(res.existingVenueAttraction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetVenueAttractionRequest](../../models/operations/GetVenueAttractionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetVenueAttractionResponse](../../models/operations/GetVenueAttractionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateVenueAttraction

Update the given attraction for the specified venue, replacing existing attraction data.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueAttraction" method="put" path="/venues/{venueId}/attractions/{attractionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateVenueAttractionRequest;
import com.cvent.models.operations.UpdateVenueAttractionResponse;
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

        UpdateVenueAttractionRequest req = UpdateVenueAttractionRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .attractionId("e9db7203-82f8-4b3f-9e91-a8b6970ff2b4")
                .venueAttraction(VenueAttraction.builder()
                    .name("Golden Gate Bridge")
                    .description("Iconic suspension bridge, 10 minutes from the venue.")
                    .url("https://www.example.com")
                    .distance(AttractionDistance.builder()
                        .value(2L)
                        .build())
                    .address(AttractionAddress.builder()
                        .streetAddress1("Golden Gate Bridge")
                        .streetAddress2("Suite 100")
                        .city("San Francisco")
                        .zipPostalCode("94129")
                        .build())
                    .build())
                .build();

        UpdateVenueAttractionResponse res = sdk.venueContent().updateVenueAttraction()
                .request(req)
                .call();

        if (res.existingVenueAttraction().isPresent()) {
            System.out.println(res.existingVenueAttraction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateVenueAttractionRequest](../../models/operations/UpdateVenueAttractionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateVenueAttractionResponse](../../models/operations/UpdateVenueAttractionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## deleteVenueAttraction

Deletes the specified attraction for the venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteVenueAttraction" method="delete" path="/venues/{venueId}/attractions/{attractionId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DeleteVenueAttractionRequest;
import com.cvent.models.operations.DeleteVenueAttractionResponse;
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

        DeleteVenueAttractionRequest req = DeleteVenueAttractionRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .attractionId("b218badc-88e8-41bc-a93f-3c536900b825")
                .build();

        DeleteVenueAttractionResponse res = sdk.venueContent().deleteVenueAttraction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteVenueAttractionRequest](../../models/operations/DeleteVenueAttractionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteVenueAttractionResponse](../../models/operations/DeleteVenueAttractionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## associateAttractionImage

Associate a previously uploaded image with an attraction using a file UUID from the [file upload](#operation/uploadFile) endpoint. This will replace the current image if one is already associated.

**Note:** The recommended image dimensions are at least 1920 x 1080 pixels. Only JPEG images (.jpg, .jpeg) are accepted. Maximum file size is 10 MB.


### Example Usage

<!-- UsageSnippet language="java" operationID="associateAttractionImage" method="put" path="/venues/{venueId}/attractions/{attractionId}/images" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AssociateAttractionImageRequest;
import com.cvent.models.operations.AssociateAttractionImageResponse;
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

        AssociateAttractionImageRequest req = AssociateAttractionImageRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .attractionId("866bb720-507f-4df9-bdf8-ce9082764bff")
                .attractionImageAssociationRequest(AttractionImageAssociationRequest.builder()
                    .file(AttractionImageAssociationRequestFile.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .build())
                .build();

        AssociateAttractionImageResponse res = sdk.venueContent().associateAttractionImage()
                .request(req)
                .call();

        if (res.attractionImageAssociationResponse().isPresent()) {
            System.out.println(res.attractionImageAssociationResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AssociateAttractionImageRequest](../../models/operations/AssociateAttractionImageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AssociateAttractionImageResponse](../../models/operations/AssociateAttractionImageResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getAttractionImages

Retrieves the images associated with the specified attraction.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAttractionImages" method="get" path="/venues/{venueId}/attractions/{attractionId}/images" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetAttractionImagesRequest;
import com.cvent.models.operations.GetAttractionImagesResponse;
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

        GetAttractionImagesRequest req = GetAttractionImagesRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .attractionId("e43d626a-e1ba-447a-89ad-26eeea82a10a")
                .build();

        GetAttractionImagesResponse res = sdk.venueContent().getAttractionImages()
                .request(req)
                .call();

        if (res.attractionImagesResponse().isPresent()) {
            System.out.println(res.attractionImagesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAttractionImagesRequest](../../models/operations/GetAttractionImagesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAttractionImagesResponse](../../models/operations/GetAttractionImagesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## disassociateAttractionImage

Removes the association between an image and the specified attraction.

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateAttractionImage" method="delete" path="/venues/{venueId}/attractions/{attractionId}/images/{imageId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DisassociateAttractionImageRequest;
import com.cvent.models.operations.DisassociateAttractionImageResponse;
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

        DisassociateAttractionImageRequest req = DisassociateAttractionImageRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .attractionId("05151e54-493f-416f-b0c5-5ceddc83f4e2")
                .imageId("50774316-f318-4ca7-bff5-1672ac751192")
                .build();

        DisassociateAttractionImageResponse res = sdk.venueContent().disassociateAttractionImage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [DisassociateAttractionImageRequest](../../models/operations/DisassociateAttractionImageRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[DisassociateAttractionImageResponse](../../models/operations/DisassociateAttractionImageResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## createVenueImageMetadata

Create venue image metadata for the specified venue. This creates a new venue image record with the provided details such as name, description, image group, and display order. Use the [Associate Venue Image](#operation/associateVenueImage) endpoint to associate an uploaded image file to a venue.


### Example Usage

<!-- UsageSnippet language="java" operationID="createVenueImageMetadata" method="post" path="/venues/{venueId}/images-metadata" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.CreateVenueImageMetadataRequest;
import com.cvent.models.operations.CreateVenueImageMetadataResponse;
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

        CreateVenueImageMetadataRequest req = CreateVenueImageMetadataRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueImage(VenueImage.builder()
                    .name("Grand Ballroom Exterior")
                    .description("Main exterior view of the venue showing the grand entrance.")
                    .imageGroup(ImageGroup.EXTERIOR)
                    .build())
                .build();

        CreateVenueImageMetadataResponse res = sdk.venueContent().createVenueImageMetadata()
                .request(req)
                .call();

        if (res.existingVenueImage().isPresent()) {
            System.out.println(res.existingVenueImage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateVenueImageMetadataRequest](../../models/operations/CreateVenueImageMetadataRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateVenueImageMetadataResponse](../../models/operations/CreateVenueImageMetadataResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## listVenueImagesMetadata

Retrieve a paginated list of venue image metadata for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVenueImagesMetadata" method="get" path="/venues/{venueId}/images-metadata" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.ListVenueImagesMetadataRequest;
import com.cvent.models.operations.ListVenueImagesMetadataResponse;
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

        ListVenueImagesMetadataRequest req = ListVenueImagesMetadataRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();

        ListVenueImagesMetadataResponse res = sdk.venueContent().listVenueImagesMetadata()
                .request(req)
                .call();

        if (res.venueImagesMetadataOverviewResponse().isPresent()) {
            System.out.println(res.venueImagesMetadataOverviewResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListVenueImagesMetadataRequest](../../models/operations/ListVenueImagesMetadataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListVenueImagesMetadataResponse](../../models/operations/ListVenueImagesMetadataResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## updateVenueImageMetadata

Updates the metadata of an existing venue image such as name, description, image group, active status, and display order.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueImageMetadata" method="put" path="/venues/{venueId}/images-metadata/{venueImageId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.UpdateVenueImageMetadataRequest;
import com.cvent.models.operations.UpdateVenueImageMetadataResponse;
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

        UpdateVenueImageMetadataRequest req = UpdateVenueImageMetadataRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueImageId("286e2866-b443-4d09-ab0f-0fac45cc026f")
                .venueImage(VenueImage.builder()
                    .name("Grand Ballroom Exterior")
                    .description("Main exterior view of the venue showing the grand entrance.")
                    .imageGroup(ImageGroup.EXTERIOR)
                    .build())
                .build();

        UpdateVenueImageMetadataResponse res = sdk.venueContent().updateVenueImageMetadata()
                .request(req)
                .call();

        if (res.existingVenueImage().isPresent()) {
            System.out.println(res.existingVenueImage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateVenueImageMetadataRequest](../../models/operations/UpdateVenueImageMetadataRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateVenueImageMetadataResponse](../../models/operations/UpdateVenueImageMetadataResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## getVenueImageMetadata

Retrieve venue image metadata for the specified venue image.

### Example Usage

<!-- UsageSnippet language="java" operationID="getVenueImageMetadata" method="get" path="/venues/{venueId}/images-metadata/{venueImageId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.GetVenueImageMetadataRequest;
import com.cvent.models.operations.GetVenueImageMetadataResponse;
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

        GetVenueImageMetadataRequest req = GetVenueImageMetadataRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueImageId("286e2866-b443-4d09-ab0f-0fac45cc026f")
                .build();

        GetVenueImageMetadataResponse res = sdk.venueContent().getVenueImageMetadata()
                .request(req)
                .call();

        if (res.existingVenueImage().isPresent()) {
            System.out.println(res.existingVenueImage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetVenueImageMetadataRequest](../../models/operations/GetVenueImageMetadataRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetVenueImageMetadataResponse](../../models/operations/GetVenueImageMetadataResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## associateVenueImage

Associate a previously uploaded image with a venue image using a file UUID from the [file upload](#operation/uploadFile) endpoint. This will replace the current image file if one is already associated.

**Note:** The recommended image dimensions are at least 1920 x 1080 pixels. Only JPEG images (.jpg, .jpeg) are accepted. Maximum file size is 10 MB.


### Example Usage

<!-- UsageSnippet language="java" operationID="associateVenueImage" method="put" path="/venues/{venueId}/images/{venueImageId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.AssociateVenueImageRequest;
import com.cvent.models.operations.AssociateVenueImageResponse;
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

        AssociateVenueImageRequest req = AssociateVenueImageRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueImageId("286e2866-b443-4d09-ab0f-0fac45cc026f")
                .venueImageAssociationRequest(VenueImageAssociationRequest.builder()
                    .file(VenueImageAssociationRequestFile.builder()
                        .id("e0921301-7742-4354-a0d8-2a747ff66958")
                        .build())
                    .build())
                .build();

        AssociateVenueImageResponse res = sdk.venueContent().associateVenueImage()
                .request(req)
                .call();

        if (res.venueImageAssociationResponse().isPresent()) {
            System.out.println(res.venueImageAssociationResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AssociateVenueImageRequest](../../models/operations/AssociateVenueImageRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AssociateVenueImageResponse](../../models/operations/AssociateVenueImageResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 400, 401, 403, 404, 429       | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## disassociateVenueImage

Disassociates the image from the venue and deletes the venue image record.

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateVenueImage" method="delete" path="/venues/{venueId}/images/{venueImageId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse12;
import com.cvent.models.operations.DisassociateVenueImageRequest;
import com.cvent.models.operations.DisassociateVenueImageResponse;
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

        DisassociateVenueImageRequest req = DisassociateVenueImageRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueImageId("286e2866-b443-4d09-ab0f-0fac45cc026f")
                .build();

        DisassociateVenueImageResponse res = sdk.venueContent().disassociateVenueImage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DisassociateVenueImageRequest](../../models/operations/DisassociateVenueImageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DisassociateVenueImageResponse](../../models/operations/DisassociateVenueImageResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/ErrorResponse12 | 401, 403, 404, 429            | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |