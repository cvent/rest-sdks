# TravelSuppliers

## Overview

The Travel Supplier APIs provide access to Cvent data related to hotels, apartments, and other travel providers. This includes information related to properties, and sleeping rooms.

### Available Operations

* [PropertyApiListBrands](#propertyapilistbrands) - List Supplier Brands
* [PropertyApiGetBrand](#propertyapigetbrand) - Get Supplier Brand
* [PropertyApiListChains](#propertyapilistchains) - List Supplier Chains
* [PropertyApiGetChain](#propertyapigetchain) - Get Supplier Chain
* [PropertyApiListProperties](#propertyapilistproperties) - List Supplier Properties
* [PropertyApiGetProperty](#propertyapigetproperty) - Get Supplier Property
* [BtApiGetPropertyRooms](#btapigetpropertyrooms) - List Supplier Property Rooms
* [PropertyApiGetPropertyRoom](#propertyapigetpropertyroom) - Get Supplier Property Room

## PropertyApiListBrands

Gets a paginated list of supplier brands.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiListBrands" method="get" path="/travel-suppliers/brands" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

PropertyApiListBrandsRequest req = new PropertyApiListBrandsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "name eq AB",
};

PropertyApiListBrandsResponse? res = await sdk.TravelSuppliers.PropertyApiListBrandsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PropertyApiListBrandsRequest](../../Models/Requests/PropertyApiListBrandsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PropertyApiListBrandsResponse](../../Models/Requests/PropertyApiListBrandsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PropertyApiGetBrand

Get a supplier brand by brand code.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiGetBrand" method="get" path="/travel-suppliers/brands/{brandId}" -->
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

PropertyApiGetBrandRequest req = new PropertyApiGetBrandRequest() {
    BrandId = "NorthernHotels",
};

var res = await sdk.TravelSuppliers.PropertyApiGetBrandAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PropertyApiGetBrandRequest](../../Models/Requests/PropertyApiGetBrandRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PropertyApiGetBrandResponse](../../Models/Requests/PropertyApiGetBrandResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PropertyApiListChains

Gets a paginated list of supplier chains.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiListChains" method="get" path="/travel-suppliers/chains" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

PropertyApiListChainsRequest req = new PropertyApiListChainsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "code eq NH",
};

PropertyApiListChainsResponse? res = await sdk.TravelSuppliers.PropertyApiListChainsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PropertyApiListChainsRequest](../../Models/Requests/PropertyApiListChainsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PropertyApiListChainsResponse](../../Models/Requests/PropertyApiListChainsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PropertyApiGetChain

Get a supplier chain by chain ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiGetChain" method="get" path="/travel-suppliers/chains/{chainId}" -->
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

PropertyApiGetChainRequest req = new PropertyApiGetChainRequest() {
    ChainId = "0ab9e863-a748-457f-81cd-f294ff66f5e6",
};

var res = await sdk.TravelSuppliers.PropertyApiGetChainAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PropertyApiGetChainRequest](../../Models/Requests/PropertyApiGetChainRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PropertyApiGetChainResponse](../../Models/Requests/PropertyApiGetChainResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PropertyApiListProperties

Gets a paginated list of supplier properties.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiListProperties" method="get" path="/travel-suppliers/properties" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

PropertyApiListPropertiesRequest req = new PropertyApiListPropertiesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "code eq ABC123",
};

PropertyApiListPropertiesResponse? res = await sdk.TravelSuppliers.PropertyApiListPropertiesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PropertyApiListPropertiesRequest](../../Models/Requests/PropertyApiListPropertiesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PropertyApiListPropertiesResponse](../../Models/Requests/PropertyApiListPropertiesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PropertyApiGetProperty

Get a supplier property by ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiGetProperty" method="get" path="/travel-suppliers/properties/{propertyId}" -->
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

PropertyApiGetPropertyRequest req = new PropertyApiGetPropertyRequest() {
    PropertyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.TravelSuppliers.PropertyApiGetPropertyAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PropertyApiGetPropertyRequest](../../Models/Requests/PropertyApiGetPropertyRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PropertyApiGetPropertyResponse](../../Models/Requests/PropertyApiGetPropertyResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## BtApiGetPropertyRooms

Gets a paginated list of supplier property rooms.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="BtApiGetPropertyRooms" method="get" path="/travel-suppliers/property-rooms" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

BtApiGetPropertyRoomsRequest req = new BtApiGetPropertyRoomsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "code eq dlx",
};

BtApiGetPropertyRoomsResponse? res = await sdk.TravelSuppliers.BtApiGetPropertyRoomsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [BtApiGetPropertyRoomsRequest](../../Models/Requests/BtApiGetPropertyRoomsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[BtApiGetPropertyRoomsResponse](../../Models/Requests/BtApiGetPropertyRoomsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PropertyApiGetPropertyRoom

Read supplier property room data by room ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="PropertyApiGetPropertyRoom" method="get" path="/travel-suppliers/property-rooms/{roomId}" -->
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

PropertyApiGetPropertyRoomRequest req = new PropertyApiGetPropertyRoomRequest() {
    RoomId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.TravelSuppliers.PropertyApiGetPropertyRoomAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PropertyApiGetPropertyRoomRequest](../../Models/Requests/PropertyApiGetPropertyRoomRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PropertyApiGetPropertyRoomResponse](../../Models/Requests/PropertyApiGetPropertyRoomResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |