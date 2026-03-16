# TravelSuppliers

## Overview

The Travel Supplier APIs provide access to Cvent data related to hotels, apartments, and other travel providers. This includes information related to properties, and sleeping rooms.

### Available Operations

* [propertyApiListBrands](#propertyapilistbrands) - List Supplier Brands
* [propertyApiGetBrand](#propertyapigetbrand) - Get Supplier Brand
* [propertyApiListChains](#propertyapilistchains) - List Supplier Chains
* [propertyApiGetChain](#propertyapigetchain) - Get Supplier Chain
* [propertyApiListProperties](#propertyapilistproperties) - List Supplier Properties
* [propertyApiGetProperty](#propertyapigetproperty) - Get Supplier Property
* [btApiGetPropertyRooms](#btapigetpropertyrooms) - List Supplier Property Rooms
* [propertyApiGetPropertyRoom](#propertyapigetpropertyroom) - Get Supplier Property Room

## propertyApiListBrands

Gets a paginated list of supplier brands.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiListBrands" method="get" path="/travel-suppliers/brands" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiListBrandsRequest;
import com.cvent.models.operations.PropertyApiListBrandsResponse;
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

        PropertyApiListBrandsRequest req = PropertyApiListBrandsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("name eq AB")
                .build();


        sdk.travelSuppliers().propertyApiListBrands()
                .callAsStream()
                .forEach((PropertyApiListBrandsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PropertyApiListBrandsRequest](../../models/operations/PropertyApiListBrandsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PropertyApiListBrandsResponse](../../models/operations/PropertyApiListBrandsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## propertyApiGetBrand

Get a supplier brand by brand code.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiGetBrand" method="get" path="/travel-suppliers/brands/{brandId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiGetBrandRequest;
import com.cvent.models.operations.PropertyApiGetBrandResponse;
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

        PropertyApiGetBrandRequest req = PropertyApiGetBrandRequest.builder()
                .brandId("NorthernHotels")
                .build();

        PropertyApiGetBrandResponse res = sdk.travelSuppliers().propertyApiGetBrand()
                .request(req)
                .call();

        if (res.brand().isPresent()) {
            System.out.println(res.brand().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PropertyApiGetBrandRequest](../../models/operations/PropertyApiGetBrandRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PropertyApiGetBrandResponse](../../models/operations/PropertyApiGetBrandResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## propertyApiListChains

Gets a paginated list of supplier chains.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiListChains" method="get" path="/travel-suppliers/chains" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiListChainsRequest;
import com.cvent.models.operations.PropertyApiListChainsResponse;
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

        PropertyApiListChainsRequest req = PropertyApiListChainsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("code eq NH")
                .build();


        sdk.travelSuppliers().propertyApiListChains()
                .callAsStream()
                .forEach((PropertyApiListChainsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PropertyApiListChainsRequest](../../models/operations/PropertyApiListChainsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PropertyApiListChainsResponse](../../models/operations/PropertyApiListChainsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## propertyApiGetChain

Get a supplier chain by chain ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiGetChain" method="get" path="/travel-suppliers/chains/{chainId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiGetChainRequest;
import com.cvent.models.operations.PropertyApiGetChainResponse;
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

        PropertyApiGetChainRequest req = PropertyApiGetChainRequest.builder()
                .chainId("0ab9e863-a748-457f-81cd-f294ff66f5e6")
                .build();

        PropertyApiGetChainResponse res = sdk.travelSuppliers().propertyApiGetChain()
                .request(req)
                .call();

        if (res.chain().isPresent()) {
            System.out.println(res.chain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PropertyApiGetChainRequest](../../models/operations/PropertyApiGetChainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PropertyApiGetChainResponse](../../models/operations/PropertyApiGetChainResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## propertyApiListProperties

Gets a paginated list of supplier properties.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiListProperties" method="get" path="/travel-suppliers/properties" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiListPropertiesRequest;
import com.cvent.models.operations.PropertyApiListPropertiesResponse;
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

        PropertyApiListPropertiesRequest req = PropertyApiListPropertiesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("code eq ABC123")
                .build();


        sdk.travelSuppliers().propertyApiListProperties()
                .callAsStream()
                .forEach((PropertyApiListPropertiesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PropertyApiListPropertiesRequest](../../models/operations/PropertyApiListPropertiesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PropertyApiListPropertiesResponse](../../models/operations/PropertyApiListPropertiesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## propertyApiGetProperty

Get a supplier property by ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiGetProperty" method="get" path="/travel-suppliers/properties/{propertyId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiGetPropertyRequest;
import com.cvent.models.operations.PropertyApiGetPropertyResponse;
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

        PropertyApiGetPropertyRequest req = PropertyApiGetPropertyRequest.builder()
                .propertyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        PropertyApiGetPropertyResponse res = sdk.travelSuppliers().propertyApiGetProperty()
                .request(req)
                .call();

        if (res.property().isPresent()) {
            System.out.println(res.property().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PropertyApiGetPropertyRequest](../../models/operations/PropertyApiGetPropertyRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PropertyApiGetPropertyResponse](../../models/operations/PropertyApiGetPropertyResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## btApiGetPropertyRooms

Gets a paginated list of supplier property rooms.

### Example Usage

<!-- UsageSnippet language="java" operationID="BtApiGetPropertyRooms" method="get" path="/travel-suppliers/property-rooms" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.BtApiGetPropertyRoomsRequest;
import com.cvent.models.operations.BtApiGetPropertyRoomsResponse;
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

        BtApiGetPropertyRoomsRequest req = BtApiGetPropertyRoomsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("code eq dlx")
                .build();


        sdk.travelSuppliers().btApiGetPropertyRooms()
                .callAsStream()
                .forEach((BtApiGetPropertyRoomsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [BtApiGetPropertyRoomsRequest](../../models/operations/BtApiGetPropertyRoomsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[BtApiGetPropertyRoomsResponse](../../models/operations/BtApiGetPropertyRoomsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## propertyApiGetPropertyRoom

Read supplier property room data by room ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="PropertyApiGetPropertyRoom" method="get" path="/travel-suppliers/property-rooms/{roomId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PropertyApiGetPropertyRoomRequest;
import com.cvent.models.operations.PropertyApiGetPropertyRoomResponse;
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

        PropertyApiGetPropertyRoomRequest req = PropertyApiGetPropertyRoomRequest.builder()
                .roomId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        PropertyApiGetPropertyRoomResponse res = sdk.travelSuppliers().propertyApiGetPropertyRoom()
                .request(req)
                .call();

        if (res.propertyRoom().isPresent()) {
            System.out.println(res.propertyRoom().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PropertyApiGetPropertyRoomRequest](../../models/operations/PropertyApiGetPropertyRoomRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PropertyApiGetPropertyRoomResponse](../../models/operations/PropertyApiGetPropertyRoomResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |