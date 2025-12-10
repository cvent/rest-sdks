# Exhibitor

## Overview

* **Exhibitor -** An exhibitor is an organization that is sponsoring or exhibiting at your event. This API allows you to get information about your exhibitors.

* **Registration Pack -** Registration Pack provides capacities of different registration types allocated by the planner to a specific exhibitor.

* **Exhibitor Questions -** Set of questions for an exhibitor.

* **Exhibitor Answers -** Set of answers to exhibitor questions for an exhibitor.

* **Exhibitor Categories -** Set of exhibitor categories for an event. Exhibitor Categories are used in Attendee Hub and Event App to differentiate exhibitors.

* **Sponsorship Levels -** Sponsorship levels are defined by the planner. Use this API to get details of existing sponsorship levels defined within the event. To assign sponsorship levels to exhibitors, use the Exhibitor endpoints.


### Available Operations

* [GetExhibitorCategories](#getexhibitorcategories) - List Exhibitor Categories
* [CreateExhibitorCategory](#createexhibitorcategory) - Create Exhibitor Category
* [UpdateExhibitorCategory](#updateexhibitorcategory) - Update Exhibitor Category
* [DeleteExhibitorCategory](#deleteexhibitorcategory) - Delete Exhibitor Category
* [UpdateExhibitorCategoryBanner](#updateexhibitorcategorybanner) - Assign Banner to Category
* [DeleteExhibitorCategoryImage](#deleteexhibitorcategoryimage) - Delete Banner from Category
* [ListExhibitors](#listexhibitors) - List Category's Exhibitors
* [AddExhibitorToExhibitorCategory](#addexhibitortoexhibitorcategory) - Assign Exhibitor to Category
* [RemoveExhibitorFromExhibitorCategory](#removeexhibitorfromexhibitorcategory) - Delete Exhibitor from Category
* [GetExhibitorQuestions](#getexhibitorquestions) - List Exhibitor Questions
* [GetExhibitors](#getexhibitors) - List Exhibitors
* [CreateExhibitor](#createexhibitor) - Create Exhibitor
* [GetExhibitor](#getexhibitor) - Get Exhibitor
* [UpdateExhibitor](#updateexhibitor) - Update Exhibitor
* [DeleteExhibitor](#deleteexhibitor) - Delete Exhibitor
* [UpdateExhibitorBanner](#updateexhibitorbanner) - Assign Exhibitor Banner Image
* [DeleteExhibitorBanner](#deleteexhibitorbanner) - Delete Exhibitor Banner Image
* [GetExhibitorAnswers](#getexhibitoranswers) - List Exhibitor Answers
* [UpdateExhibitorAnswers](#updateexhibitoranswers) - Update Exhibitor Answers
* [ListExhibitorCategories](#listexhibitorcategories) - List Exhibitor's Categories
* [UpdateExhibitorLogo](#updateexhibitorlogo) - Assign Exhibitor Logo Image
* [DeleteExhibitorLogo](#deleteexhibitorlogo) - Delete Exhibitor Logo Image
* [GetLeadQualificationQuestions](#getleadqualificationquestions) - List Qualification Questions
* [PostRegistrationPack](#postregistrationpack) - Create Registration Pack
* [GetExhibitorRegistrationPacks](#getexhibitorregistrationpacks) - List Registration Packs
* [GetRegistrationPack](#getregistrationpack) - Get Registration Pack
* [UpdateRegistrationPack](#updateregistrationpack) - Update Registration Pack
* [DeleteRegistrationPack](#deleteregistrationpack) - Delete Registration Pack
* [GetSponsorshipLevels](#getsponsorshiplevels) - List Sponsorship Levels
* [GetSponsorshipLevel](#getsponsorshiplevel) - Get Sponsorship Level

## GetExhibitorCategories

Retrieves a paginated list of exhibitor categories associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorCategories" method="get" path="/events/{id}/exhibitor-categories" -->
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

GetExhibitorCategoriesRequest req = new GetExhibitorCategoriesRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetExhibitorCategoriesResponse? res = await sdk.Exhibitor.GetExhibitorCategoriesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetExhibitorCategoriesRequest](../../Models/Requests/GetExhibitorCategoriesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetExhibitorCategoriesResponse](../../Models/Requests/GetExhibitorCategoriesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateExhibitorCategory

Creates a single exhibitor category entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createExhibitorCategory" method="post" path="/events/{id}/exhibitor-categories" -->
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

CreateExhibitorCategoryRequest req = new CreateExhibitorCategoryRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryRequest = new ExhibitorCategoryRequest() {
        Event = new EventJson5() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Name = "Automobile",
        Description = "everything related to automobiles",
        Order = 3,
        Type = ExhibitorCategoryRequestType.Logo,
    },
};

var res = await sdk.Exhibitor.CreateExhibitorCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateExhibitorCategoryRequest](../../Models/Requests/CreateExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateExhibitorCategoryResponse](../../Models/Requests/CreateExhibitorCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorCategory

Updates data for a single exhibitor category entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorCategory" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}" -->
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

UpdateExhibitorCategoryRequest req = new UpdateExhibitorCategoryRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    ExhibitorCategoryRequest = new ExhibitorCategoryRequest() {
        Event = new EventJson5() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Name = "Automobile",
        Description = "everything related to automobiles",
        Order = 3,
        Type = ExhibitorCategoryRequestType.Logo,
    },
};

var res = await sdk.Exhibitor.UpdateExhibitorCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateExhibitorCategoryRequest](../../Models/Requests/UpdateExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateExhibitorCategoryResponse](../../Models/Requests/UpdateExhibitorCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExhibitorCategory

Deletes a single exhibitor Category entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExhibitorCategory" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}" -->
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

DeleteExhibitorCategoryRequest req = new DeleteExhibitorCategoryRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
};

var res = await sdk.Exhibitor.DeleteExhibitorCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteExhibitorCategoryRequest](../../Models/Requests/DeleteExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteExhibitorCategoryResponse](../../Models/Requests/DeleteExhibitorCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorCategoryBanner

Assign a banner image to an exhibitor category with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current banner image if one is assigned.

**Note:** For category banner images we recommend images that are 900x300 pixels and 5MiB or smaller. File types supported are : JPEG, JPG, PNG, GIF.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorCategoryBanner" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/banner-files/{fileId}" -->
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

UpdateExhibitorCategoryBannerRequest req = new UpdateExhibitorCategoryBannerRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Exhibitor.UpdateExhibitorCategoryBannerAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UpdateExhibitorCategoryBannerRequest](../../Models/Requests/UpdateExhibitorCategoryBannerRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UpdateExhibitorCategoryBannerResponse](../../Models/Requests/UpdateExhibitorCategoryBannerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExhibitorCategoryImage

Deletes an exhibitor Category banner image.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExhibitorCategoryImage" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/banner-files/{fileId}" -->
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

DeleteExhibitorCategoryImageRequest req = new DeleteExhibitorCategoryImageRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Exhibitor.DeleteExhibitorCategoryImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [DeleteExhibitorCategoryImageRequest](../../Models/Requests/DeleteExhibitorCategoryImageRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[DeleteExhibitorCategoryImageResponse](../../Models/Requests/DeleteExhibitorCategoryImageResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListExhibitors

Get a paginated list of exhibitors assigned to the provided exhibitor-category Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listExhibitors" method="get" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors" -->
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

ListExhibitorsRequest req = new ListExhibitorsRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListExhibitorsResponse? res = await sdk.Exhibitor.ListExhibitorsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListExhibitorsRequest](../../Models/Requests/ListExhibitorsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListExhibitorsResponse](../../Models/Requests/ListExhibitorsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddExhibitorToExhibitorCategory

Assign an exhibitor ID to an exhibitor-category Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addExhibitorToExhibitorCategory" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors/{exhibitorId}" -->
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

AddExhibitorToExhibitorCategoryRequest req = new AddExhibitorToExhibitorCategoryRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.AddExhibitorToExhibitorCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AddExhibitorToExhibitorCategoryRequest](../../Models/Requests/AddExhibitorToExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AddExhibitorToExhibitorCategoryResponse](../../Models/Requests/AddExhibitorToExhibitorCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## RemoveExhibitorFromExhibitorCategory

delete an exhibitor from an exhibitor-category

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="removeExhibitorFromExhibitorCategory" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors/{exhibitorId}" -->
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

RemoveExhibitorFromExhibitorCategoryRequest req = new RemoveExhibitorFromExhibitorCategoryRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorCategoryId = "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.RemoveExhibitorFromExhibitorCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [RemoveExhibitorFromExhibitorCategoryRequest](../../Models/Requests/RemoveExhibitorFromExhibitorCategoryRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[RemoveExhibitorFromExhibitorCategoryResponse](../../Models/Requests/RemoveExhibitorFromExhibitorCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitorQuestions

Gets a list of exhibitor questions for a given event id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorQuestions" method="get" path="/events/{id}/exhibitor-questions" -->
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

GetExhibitorQuestionsRequest req = new GetExhibitorQuestionsRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.GetExhibitorQuestionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetExhibitorQuestionsRequest](../../Models/Requests/GetExhibitorQuestionsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetExhibitorQuestionsResponse](../../Models/Requests/GetExhibitorQuestionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitors

Retrieves a paginated list of exhibitors associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitors" method="get" path="/events/{id}/exhibitors" -->
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

GetExhibitorsRequest req = new GetExhibitorsRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Filter = "id in ('{UUID}', '{UUID}') AND deleted eq 'true' AND hidden eq 'true'",
};

GetExhibitorsResponse? res = await sdk.Exhibitor.GetExhibitorsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetExhibitorsRequest](../../Models/Requests/GetExhibitorsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetExhibitorsResponse](../../Models/Requests/GetExhibitorsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateExhibitor

Creates a single exhibitor entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createExhibitor" method="post" path="/events/{id}/exhibitors" -->
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

CreateExhibitorRequest req = new CreateExhibitorRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorRequest = new ExhibitorRequest() {
        Event = new EventJson5() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Name = "Potterfield Harry",
        Description = "A man who sells relatively good hotdogs",
        Code = "abc123",
        SourceId = "software",
        Location = "Taj Mahal",
        Address = new ExhibitorAddressJson() {
            Address1 = "Cvent Inc.",
            Address2 = "4001 West Parmer Lane",
            City = "Austin",
            Region = "Texas",
            PostalCode = "78727",
            Country = "United States of America",
        },
        Email = "h.potterfield@test.com",
        MobilePhone = "555-555-5555",
        WorkPhone = "555-555-5555",
        OtherPhone = "555-555-5555",
        Website = "www.superhappyfuntime.com",
        ContactLinks = new ContactLinksJson2() {
            TwitterUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            FacebookUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            LinkedInUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            InstagramUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
        },
        SponsorshipLevel = new SponsorshipLevelJson() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
    },
};

var res = await sdk.Exhibitor.CreateExhibitorAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateExhibitorRequest](../../Models/Requests/CreateExhibitorRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateExhibitorResponse](../../Models/Requests/CreateExhibitorResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitor

Retrieves a single exhibitor entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitor" method="get" path="/events/{id}/exhibitors/{exhibitorId}" -->
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

GetExhibitorRequest req = new GetExhibitorRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.GetExhibitorAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetExhibitorRequest](../../Models/Requests/GetExhibitorRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetExhibitorResponse](../../Models/Requests/GetExhibitorResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitor

Updates data for a single exhibitor entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitor" method="put" path="/events/{id}/exhibitors/{exhibitorId}" -->
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

UpdateExhibitorRequest req = new UpdateExhibitorRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    ExhibitorRequest = new ExhibitorRequest() {
        Event = new EventJson5() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Name = "Potterfield Harry",
        Description = "A man who sells relatively good hotdogs",
        Code = "abc123",
        SourceId = "software",
        Location = "Taj Mahal",
        Address = new ExhibitorAddressJson() {
            Address1 = "Cvent Inc.",
            Address2 = "4001 West Parmer Lane",
            City = "Austin",
            Region = "Texas",
            PostalCode = "78727",
            Country = "United States of America",
        },
        Email = "h.potterfield@test.com",
        MobilePhone = "555-555-5555",
        WorkPhone = "555-555-5555",
        OtherPhone = "555-555-5555",
        Website = "www.superhappyfuntime.com",
        ContactLinks = new ContactLinksJson2() {
            TwitterUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            FacebookUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            LinkedInUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            InstagramUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
        },
        SponsorshipLevel = new SponsorshipLevelJson() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
    },
};

var res = await sdk.Exhibitor.UpdateExhibitorAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateExhibitorRequest](../../Models/Requests/UpdateExhibitorRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateExhibitorResponse](../../Models/Requests/UpdateExhibitorResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExhibitor

Deletes a single exhibitor entity. To be deleted, exhibitors must have no tasks, registrations, or LeadCapture licenses assigned and must not be a sponsored or featured exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExhibitor" method="delete" path="/events/{id}/exhibitors/{exhibitorId}" -->
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

DeleteExhibitorRequest req = new DeleteExhibitorRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.DeleteExhibitorAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DeleteExhibitorRequest](../../Models/Requests/DeleteExhibitorRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DeleteExhibitorResponse](../../Models/Requests/DeleteExhibitorResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorBanner

Assign a banner image to an exhibitor with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current banner image if one is assigned.

**Note:** For exhibitor profile banner images, we recommend images that are 1872x320 pixels or smaller images that have an aspect ratio of 5.85:1. File extensions supported: JPEG, JPG, PNG, GIF


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorBanner" method="put" path="/events/{id}/exhibitors/{exhibitorId}/banner-files/{fileId}" -->
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

UpdateExhibitorBannerRequest req = new UpdateExhibitorBannerRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Exhibitor.UpdateExhibitorBannerAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateExhibitorBannerRequest](../../Models/Requests/UpdateExhibitorBannerRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateExhibitorBannerResponse](../../Models/Requests/UpdateExhibitorBannerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExhibitorBanner

Deletes exhibitor banner image data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExhibitorBanner" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/banner-files/{fileId}" -->
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

DeleteExhibitorBannerRequest req = new DeleteExhibitorBannerRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Exhibitor.DeleteExhibitorBannerAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteExhibitorBannerRequest](../../Models/Requests/DeleteExhibitorBannerRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteExhibitorBannerResponse](../../Models/Requests/DeleteExhibitorBannerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitorAnswers

Gets a list of answers to exhibitor questions for a given exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorAnswers" method="get" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-answers" -->
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

GetExhibitorAnswersRequest req = new GetExhibitorAnswersRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.GetExhibitorAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetExhibitorAnswersRequest](../../Models/Requests/GetExhibitorAnswersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetExhibitorAnswersResponse](../../Models/Requests/GetExhibitorAnswersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorAnswers

Updates answers to exhibitor questions for a given exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorAnswers" method="put" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-answers" -->
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

UpdateExhibitorAnswersRequest req = new UpdateExhibitorAnswersRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    ExhibitorAnswersRequest = new ExhibitorAnswersRequest() {
        Data = new List<ExistingExhibitorAnswerJsonInput>() {
            new ExistingExhibitorAnswerJsonInput() {
                Question = new UuidJson() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                Event = new EventJson5() {
                    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
                },
                Exhibitor = new ExhibitorJson() {
                    Id = "4888db54-db22-11eb-8d19-0242ac130003",
                },
                Answers = new List<AnswerJson0>() {
                    new AnswerJson0() {
                        Type = AnswerTypeJson0.Choice,
                        Value = "Choice A",
                    },
                },
            },
        },
    },
};

var res = await sdk.Exhibitor.UpdateExhibitorAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateExhibitorAnswersRequest](../../Models/Requests/UpdateExhibitorAnswersRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateExhibitorAnswersResponse](../../Models/Requests/UpdateExhibitorAnswersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListExhibitorCategories

Get a paginated list of exhibitor-categories assigned to the provided exhibitor Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listExhibitorCategories" method="get" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-categories" -->
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

ListExhibitorCategoriesRequest req = new ListExhibitorCategoriesRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListExhibitorCategoriesResponse? res = await sdk.Exhibitor.ListExhibitorCategoriesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListExhibitorCategoriesRequest](../../Models/Requests/ListExhibitorCategoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListExhibitorCategoriesResponse](../../Models/Requests/ListExhibitorCategoriesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorLogo

Assign a logo image to an exhibitor with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current logo image if one is assigned.

**Note:**  For exhibitor profile logo images we recommend square images larger than 300x300 pixels. The file types supported are : JPEG, JPG, PNG, GIF


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorLogo" method="put" path="/events/{id}/exhibitors/{exhibitorId}/logo-files/{fileId}" -->
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

UpdateExhibitorLogoRequest req = new UpdateExhibitorLogoRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Exhibitor.UpdateExhibitorLogoAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateExhibitorLogoRequest](../../Models/Requests/UpdateExhibitorLogoRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateExhibitorLogoResponse](../../Models/Requests/UpdateExhibitorLogoResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExhibitorLogo

Deletes exhibitor logo image data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExhibitorLogo" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/logo-files/{fileId}" -->
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

DeleteExhibitorLogoRequest req = new DeleteExhibitorLogoRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Exhibitor.DeleteExhibitorLogoAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteExhibitorLogoRequest](../../Models/Requests/DeleteExhibitorLogoRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteExhibitorLogoResponse](../../Models/Requests/DeleteExhibitorLogoResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetLeadQualificationQuestions

Retrieves a list of lead qualification questions associated with a single exhibitor at the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getLeadQualificationQuestions" method="get" path="/events/{id}/exhibitors/{exhibitorId}/questions" -->
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

GetLeadQualificationQuestionsRequest req = new GetLeadQualificationQuestionsRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.GetLeadQualificationQuestionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetLeadQualificationQuestionsRequest](../../Models/Requests/GetLeadQualificationQuestionsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetLeadQualificationQuestionsResponse](../../Models/Requests/GetLeadQualificationQuestionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PostRegistrationPack

Create registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="postRegistrationPack" method="post" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs" -->
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

PostRegistrationPackRequest req = new PostRegistrationPackRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    RegistrationPackRequest = new RegistrationPackRequest() {
        Event = new EventJson5() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        Capacities = new List<CapacityJson>() {
            new CapacityJson() {
                RegistrationType = new CapacityJsonRegistrationType() {
                    Id = "923d5629-3cac-40c2-8237-34937dd93475",
                },
                ReservedCapacity = 5,
            },
        },
    },
};

var res = await sdk.Exhibitor.PostRegistrationPackAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PostRegistrationPackRequest](../../Models/Requests/PostRegistrationPackRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PostRegistrationPackResponse](../../Models/Requests/PostRegistrationPackResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 409, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitorRegistrationPacks

Retrieves registration packs associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorRegistrationPacks" method="get" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs" -->
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

GetExhibitorRegistrationPacksRequest req = new GetExhibitorRegistrationPacksRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.GetExhibitorRegistrationPacksAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetExhibitorRegistrationPacksRequest](../../Models/Requests/GetExhibitorRegistrationPacksRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetExhibitorRegistrationPacksResponse](../../Models/Requests/GetExhibitorRegistrationPacksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetRegistrationPack

Retrieves registration types allocated to an exhibitor, along with the count of registrations utilized.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRegistrationPack" method="get" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
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

GetRegistrationPackRequest req = new GetRegistrationPackRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    RegistrationPackId = "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
};

var res = await sdk.Exhibitor.GetRegistrationPackAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetRegistrationPackRequest](../../Models/Requests/GetRegistrationPackRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetRegistrationPackResponse](../../Models/Requests/GetRegistrationPackResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateRegistrationPack

Update registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRegistrationPack" method="put" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
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

UpdateRegistrationPackRequest req = new UpdateRegistrationPackRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    RegistrationPackId = "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
    RegistrationPackRequest = new RegistrationPackRequest() {
        Event = new EventJson5() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        Capacities = new List<CapacityJson>() {
            new CapacityJson() {
                RegistrationType = new CapacityJsonRegistrationType() {
                    Id = "923d5629-3cac-40c2-8237-34937dd93475",
                },
                ReservedCapacity = 5,
            },
        },
    },
};

var res = await sdk.Exhibitor.UpdateRegistrationPackAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateRegistrationPackRequest](../../Models/Requests/UpdateRegistrationPackRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateRegistrationPackResponse](../../Models/Requests/UpdateRegistrationPackResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteRegistrationPack

Delete registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteRegistrationPack" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
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

DeleteRegistrationPackRequest req = new DeleteRegistrationPackRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    RegistrationPackId = "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
};

var res = await sdk.Exhibitor.DeleteRegistrationPackAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteRegistrationPackRequest](../../Models/Requests/DeleteRegistrationPackRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteRegistrationPackResponse](../../Models/Requests/DeleteRegistrationPackResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSponsorshipLevels

Gets a list of associated sponsorship levels for a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSponsorshipLevels" method="get" path="/events/{id}/sponsorship-levels" -->
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

GetSponsorshipLevelsRequest req = new GetSponsorshipLevelsRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
};

var res = await sdk.Exhibitor.GetSponsorshipLevelsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSponsorshipLevelsRequest](../../Models/Requests/GetSponsorshipLevelsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSponsorshipLevelsResponse](../../Models/Requests/GetSponsorshipLevelsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSponsorshipLevel

Retrieves associated sponsorship level data for a single sponsorship level ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSponsorshipLevel" method="get" path="/events/{id}/sponsorship-levels/{sponsorshipLevelId}" -->
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

GetSponsorshipLevelRequest req = new GetSponsorshipLevelRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    SponsorshipLevelId = "1765848c-2a7f-48d2-85a2-6668b8e64ffb",
};

var res = await sdk.Exhibitor.GetSponsorshipLevelAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSponsorshipLevelRequest](../../Models/Requests/GetSponsorshipLevelRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSponsorshipLevelResponse](../../Models/Requests/GetSponsorshipLevelResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |