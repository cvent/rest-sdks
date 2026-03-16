# ExhibitorContent

## Overview

Exhibitor Content operations for an exhibitor. This API allows you to upload & get exhibitor content data such as files, weblinks.


### Available Operations

* [ListExhibitorFiles](#listexhibitorfiles) - List Exhibitor Files
* [GetExhibitorFile](#getexhibitorfile) - Get Exhibitor File
* [UpdateExhibitorFile](#updateexhibitorfile) - Associate Exhibitor File
* [DisassociateExhibitorFile](#disassociateexhibitorfile) - Disassociate Exhibitor File
* [ListExhibitorWeblinks](#listexhibitorweblinks) - List Exhibitor Weblinks
* [CreateExhibitorWeblink](#createexhibitorweblink) - Create Exhibitor Weblink
* [GetExhibitorWeblink](#getexhibitorweblink) - Get Exhibitor Weblink
* [UpdateExhibitorWeblink](#updateexhibitorweblink) - Update Exhibitor Weblink
* [DeleteExhibitorWeblink](#deleteexhibitorweblink) - Delete Exhibitor Weblink

## ListExhibitorFiles

Retrieves a list of files associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listExhibitorFiles" method="get" path="/events/{id}/exhibitors/{exhibitorId}/files" -->
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

ListExhibitorFilesRequest req = new ListExhibitorFilesRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.ExhibitorContent.ListExhibitorFilesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListExhibitorFilesRequest](../../Models/Requests/ListExhibitorFilesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListExhibitorFilesResponse](../../Models/Requests/ListExhibitorFilesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitorFile

Get a single file for an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorFile" method="get" path="/events/{id}/exhibitors/{exhibitorId}/files/{fileId}" -->
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

GetExhibitorFileRequest req = new GetExhibitorFileRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.ExhibitorContent.GetExhibitorFileAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetExhibitorFileRequest](../../Models/Requests/GetExhibitorFileRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetExhibitorFileResponse](../../Models/Requests/GetExhibitorFileResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorFile

Associate a file to an exhibitor using a file ID taken from the <a href="#operation/uploadFile">file upload</a> endpoint.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorFile" method="put" path="/events/{id}/exhibitors/{exhibitorId}/files/{fileId}" -->
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

UpdateExhibitorFileRequest req = new UpdateExhibitorFileRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    File = new FileInput() {
        Event = new EventJson6() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        DisplayName = "Marketing Page",
        Order = 3,
    },
};

var res = await sdk.ExhibitorContent.UpdateExhibitorFileAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateExhibitorFileRequest](../../Models/Requests/UpdateExhibitorFileRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateExhibitorFileResponse](../../Models/Requests/UpdateExhibitorFileResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 422, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DisassociateExhibitorFile

Disassociate a single file from an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateExhibitorFile" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/files/{fileId}" -->
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

DisassociateExhibitorFileRequest req = new DisassociateExhibitorFileRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.ExhibitorContent.DisassociateExhibitorFileAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DisassociateExhibitorFileRequest](../../Models/Requests/DisassociateExhibitorFileRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DisassociateExhibitorFileResponse](../../Models/Requests/DisassociateExhibitorFileResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListExhibitorWeblinks

Retrieves a list of content weblinks associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listExhibitorWeblinks" method="get" path="/events/{id}/exhibitors/{exhibitorId}/weblinks" -->
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

ListExhibitorWeblinksRequest req = new ListExhibitorWeblinksRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.ExhibitorContent.ListExhibitorWeblinksAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListExhibitorWeblinksRequest](../../Models/Requests/ListExhibitorWeblinksRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListExhibitorWeblinksResponse](../../Models/Requests/ListExhibitorWeblinksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateExhibitorWeblink

Creates a single content weblink for an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createExhibitorWeblink" method="post" path="/events/{id}/exhibitors/{exhibitorId}/weblinks" -->
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

CreateExhibitorWeblinkRequest req = new CreateExhibitorWeblinkRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    Weblink = new Weblink() {
        Event = new EventJson6() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        Name = "Marketing Page",
        Url = "http://www.example.com",
        Order = 3,
    },
};

var res = await sdk.ExhibitorContent.CreateExhibitorWeblinkAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateExhibitorWeblinkRequest](../../Models/Requests/CreateExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateExhibitorWeblinkResponse](../../Models/Requests/CreateExhibitorWeblinkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 422, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitorWeblink

Retrieves a single content weblink for an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorWeblink" method="get" path="/events/{id}/exhibitors/{exhibitorId}/weblinks/{weblinkId}" -->
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

GetExhibitorWeblinkRequest req = new GetExhibitorWeblinkRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    WeblinkId = "4d44b9e4-8c1a-403d-a20a-0b981f539935",
};

var res = await sdk.ExhibitorContent.GetExhibitorWeblinkAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetExhibitorWeblinkRequest](../../Models/Requests/GetExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetExhibitorWeblinkResponse](../../Models/Requests/GetExhibitorWeblinkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorWeblink

Updates content weblink data in an event for a given exhibitor ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorWeblink" method="put" path="/events/{id}/exhibitors/{exhibitorId}/weblinks/{weblinkId}" -->
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

UpdateExhibitorWeblinkRequest req = new UpdateExhibitorWeblinkRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    WeblinkId = "4d44b9e4-8c1a-403d-a20a-0b981f539935",
    Weblink = new Weblink() {
        Event = new EventJson6() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        Name = "Marketing Page",
        Url = "http://www.example.com",
        Order = 3,
    },
};

var res = await sdk.ExhibitorContent.UpdateExhibitorWeblinkAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateExhibitorWeblinkRequest](../../Models/Requests/UpdateExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateExhibitorWeblinkResponse](../../Models/Requests/UpdateExhibitorWeblinkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 422, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExhibitorWeblink

Deletes a single exhibitor content weblink.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExhibitorWeblink" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/weblinks/{weblinkId}" -->
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

DeleteExhibitorWeblinkRequest req = new DeleteExhibitorWeblinkRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    WeblinkId = "4d44b9e4-8c1a-403d-a20a-0b981f539935",
};

var res = await sdk.ExhibitorContent.DeleteExhibitorWeblinkAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteExhibitorWeblinkRequest](../../Models/Requests/DeleteExhibitorWeblinkRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteExhibitorWeblinkResponse](../../Models/Requests/DeleteExhibitorWeblinkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |