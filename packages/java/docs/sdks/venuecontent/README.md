# VenueContent

## Overview

Manage images, amenities, and nearby attractions associated with a venue.

### Available Operations

* [createVenueImageMetadata](#createvenueimagemetadata) - Create Venue Image Metadata
* [listVenueImagesMetadata](#listvenueimagesmetadata) - List Images Metadata
* [updateVenueImageMetadata](#updatevenueimagemetadata) - Update Venue Image Metadata
* [getVenueImageMetadata](#getvenueimagemetadata) - Get Image Metadata
* [associateVenueImage](#associatevenueimage) - Associate Venue Image
* [disassociateVenueImage](#disassociatevenueimage) - Remove Venue Image

## createVenueImageMetadata

Create venue image metadata for the specified venue. This creates a new venue image record with the provided details such as name, description, image group, and display order. Use the <a href="#operation/associateVenueImage">Associate Venue Image</a> endpoint to associate an uploaded image file to a venue.


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

Associate a previously uploaded image with a venue image using a file UUID from the <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current image file if one is already associated.

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

Disassociates the image from a venue image and deletes the venue image record.

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