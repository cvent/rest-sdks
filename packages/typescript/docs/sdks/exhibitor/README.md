# Exhibitor

## Overview

* **Exhibitor -** An exhibitor is an organization that is sponsoring or exhibiting at your event. This API allows you to get information about your exhibitors.

* **Registration Pack -** Registration Pack provides capacities of different registration types allocated by the planner to a specific exhibitor.

* **Exhibitor Questions -** Set of questions for an exhibitor.

* **Exhibitor Answers -** Set of answers to exhibitor questions for an exhibitor.

* **Exhibitor Categories -** Set of exhibitor categories for an event. Exhibitor Categories are used in Attendee Hub and Event App to differentiate exhibitors.

* **Sponsorship Levels -** Sponsorship levels are defined by the planner. Use this API to get details of existing sponsorship levels defined within the event. To assign sponsorship levels to exhibitors, use the Exhibitor endpoints.


### Available Operations

* [getExhibitorCategories](#getexhibitorcategories) - List Exhibitor Categories
* [createExhibitorCategory](#createexhibitorcategory) - Create Exhibitor Category
* [updateExhibitorCategory](#updateexhibitorcategory) - Update Exhibitor Category
* [deleteExhibitorCategory](#deleteexhibitorcategory) - Delete Exhibitor Category
* [updateExhibitorCategoryBanner](#updateexhibitorcategorybanner) - Assign Banner to Category
* [deleteExhibitorCategoryImage](#deleteexhibitorcategoryimage) - Delete Banner from Category
* [listExhibitors](#listexhibitors) - List Category's Exhibitors
* [addExhibitorToExhibitorCategory](#addexhibitortoexhibitorcategory) - Assign Exhibitor to Category
* [removeExhibitorFromExhibitorCategory](#removeexhibitorfromexhibitorcategory) - Delete Exhibitor from Category
* [getExhibitorQuestions](#getexhibitorquestions) - List Exhibitor Questions
* [getExhibitors](#getexhibitors) - List Exhibitors
* [createExhibitor](#createexhibitor) - Create Exhibitor
* [getExhibitor](#getexhibitor) - Get Exhibitor
* [updateExhibitor](#updateexhibitor) - Update Exhibitor
* [deleteExhibitor](#deleteexhibitor) - Delete Exhibitor
* [updateExhibitorBanner](#updateexhibitorbanner) - Assign Exhibitor Banner Image
* [deleteExhibitorBanner](#deleteexhibitorbanner) - Delete Exhibitor Banner Image
* [getExhibitorAnswers](#getexhibitoranswers) - List Exhibitor Answers
* [updateExhibitorAnswers](#updateexhibitoranswers) - Update Exhibitor Answers
* [listExhibitorCategories](#listexhibitorcategories) - List Exhibitor's Categories
* [updateExhibitorLogo](#updateexhibitorlogo) - Assign Exhibitor Logo Image
* [deleteExhibitorLogo](#deleteexhibitorlogo) - Delete Exhibitor Logo Image
* [getLeadQualificationQuestions](#getleadqualificationquestions) - List Qualification Questions
* [postRegistrationPack](#postregistrationpack) - Create Registration Pack
* [getExhibitorRegistrationPacks](#getexhibitorregistrationpacks) - List Registration Packs
* [getRegistrationPack](#getregistrationpack) - Get Registration Pack
* [updateRegistrationPack](#updateregistrationpack) - Update Registration Pack
* [deleteRegistrationPack](#deleteregistrationpack) - Delete Registration Pack
* [getSponsorshipLevels](#getsponsorshiplevels) - List Sponsorship Levels
* [getSponsorshipLevel](#getsponsorshiplevel) - Get Sponsorship Level

## getExhibitorCategories

Retrieves a paginated list of exhibitor categories associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getExhibitorCategories" method="get" path="/events/{id}/exhibitor-categories" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getExhibitorCategories({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetExhibitorCategories } from "@cvent/sdk/funcs/exhibitorGetExhibitorCategories.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetExhibitorCategories(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("exhibitorGetExhibitorCategories failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetExhibitorCategoriesRequest](../../models/operations/getexhibitorcategoriesrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetExhibitorCategoriesResponse](../../models/operations/getexhibitorcategoriesresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createExhibitorCategory

Creates a single exhibitor category entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createExhibitorCategory" method="post" path="/events/{id}/exhibitor-categories" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.createExhibitorCategory({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Automobile",
      description: "everything related to automobiles",
      order: 3,
      type: "LOGO",
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorCreateExhibitorCategory } from "@cvent/sdk/funcs/exhibitorCreateExhibitorCategory.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorCreateExhibitorCategory(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Automobile",
      description: "everything related to automobiles",
      order: 3,
      type: "LOGO",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorCreateExhibitorCategory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateExhibitorCategoryRequest](../../models/operations/createexhibitorcategoryrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorCategoryResponse](../../models/components/exhibitorcategoryresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateExhibitorCategory

Updates data for a single exhibitor category entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateExhibitorCategory" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateExhibitorCategory({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    exhibitorCategoryRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Automobile",
      description: "everything related to automobiles",
      order: 3,
      type: "LOGO",
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateExhibitorCategory } from "@cvent/sdk/funcs/exhibitorUpdateExhibitorCategory.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateExhibitorCategory(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    exhibitorCategoryRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Automobile",
      description: "everything related to automobiles",
      order: 3,
      type: "LOGO",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateExhibitorCategory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateExhibitorCategoryRequest](../../models/operations/updateexhibitorcategoryrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorCategoryResponse](../../models/components/exhibitorcategoryresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteExhibitorCategory

Deletes a single exhibitor Category entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteExhibitorCategory" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.deleteExhibitorCategory({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorDeleteExhibitorCategory } from "@cvent/sdk/funcs/exhibitorDeleteExhibitorCategory.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorDeleteExhibitorCategory(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorDeleteExhibitorCategory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteExhibitorCategoryRequest](../../models/operations/deleteexhibitorcategoryrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateExhibitorCategoryBanner

Assign a banner image to an exhibitor category with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current banner image if one is assigned.

**Note:** For category banner images we recommend images that are 900x300 pixels and 5MiB or smaller. File types supported are : JPEG, JPG, PNG, GIF.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateExhibitorCategoryBanner" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/banner-files/{fileId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateExhibitorCategoryBanner({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateExhibitorCategoryBanner } from "@cvent/sdk/funcs/exhibitorUpdateExhibitorCategoryBanner.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateExhibitorCategoryBanner(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateExhibitorCategoryBanner failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateExhibitorCategoryBannerRequest](../../models/operations/updateexhibitorcategorybannerrequest.md)                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorCategoryBannerFile](../../models/components/exhibitorcategorybannerfile.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteExhibitorCategoryImage

Deletes an exhibitor Category banner image.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteExhibitorCategoryImage" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/banner-files/{fileId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.deleteExhibitorCategoryImage({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorDeleteExhibitorCategoryImage } from "@cvent/sdk/funcs/exhibitorDeleteExhibitorCategoryImage.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorDeleteExhibitorCategoryImage(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorDeleteExhibitorCategoryImage failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteExhibitorCategoryImageRequest](../../models/operations/deleteexhibitorcategoryimagerequest.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## listExhibitors

Get a paginated list of exhibitors assigned to the provided exhibitor-category Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listExhibitors" method="get" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.listExhibitors({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorListExhibitors } from "@cvent/sdk/funcs/exhibitorListExhibitors.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorListExhibitors(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("exhibitorListExhibitors failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListExhibitorsRequest](../../models/operations/listexhibitorsrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListExhibitorsResponse](../../models/operations/listexhibitorsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## addExhibitorToExhibitorCategory

Assign an exhibitor ID to an exhibitor-category Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="addExhibitorToExhibitorCategory" method="put" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors/{exhibitorId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.addExhibitorToExhibitorCategory({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorAddExhibitorToExhibitorCategory } from "@cvent/sdk/funcs/exhibitorAddExhibitorToExhibitorCategory.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorAddExhibitorToExhibitorCategory(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorAddExhibitorToExhibitorCategory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.AddExhibitorToExhibitorCategoryRequest](../../models/operations/addexhibitortoexhibitorcategoryrequest.md)                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## removeExhibitorFromExhibitorCategory

delete an exhibitor from an exhibitor-category

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="removeExhibitorFromExhibitorCategory" method="delete" path="/events/{id}/exhibitor-categories/{exhibitorCategoryId}/exhibitors/{exhibitorId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.removeExhibitorFromExhibitorCategory({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorRemoveExhibitorFromExhibitorCategory } from "@cvent/sdk/funcs/exhibitorRemoveExhibitorFromExhibitorCategory.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorRemoveExhibitorFromExhibitorCategory(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorCategoryId: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorRemoveExhibitorFromExhibitorCategory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.RemoveExhibitorFromExhibitorCategoryRequest](../../models/operations/removeexhibitorfromexhibitorcategoryrequest.md)                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getExhibitorQuestions

Gets a list of exhibitor questions for a given event id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getExhibitorQuestions" method="get" path="/events/{id}/exhibitor-questions" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getExhibitorQuestions({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetExhibitorQuestions } from "@cvent/sdk/funcs/exhibitorGetExhibitorQuestions.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetExhibitorQuestions(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetExhibitorQuestions failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetExhibitorQuestionsRequest](../../models/operations/getexhibitorquestionsrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorQuestionsResponse](../../models/components/exhibitorquestionsresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getExhibitors

Retrieves a paginated list of exhibitors associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getExhibitors" method="get" path="/events/{id}/exhibitors" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getExhibitors({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    before: new Date("2017-01-02T02:00:00Z"),
    after: new Date("2017-01-02T02:00:00Z"),
    filter: "id in ('{UUID}', '{UUID}') AND deleted eq 'true' AND hidden eq 'true'",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetExhibitors } from "@cvent/sdk/funcs/exhibitorGetExhibitors.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetExhibitors(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    before: new Date("2017-01-02T02:00:00Z"),
    after: new Date("2017-01-02T02:00:00Z"),
    filter: "id in ('{UUID}', '{UUID}') AND deleted eq 'true' AND hidden eq 'true'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("exhibitorGetExhibitors failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetExhibitorsRequest](../../models/operations/getexhibitorsrequest.md)                                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetExhibitorsResponse](../../models/operations/getexhibitorsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createExhibitor

Creates a single exhibitor entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createExhibitor" method="post" path="/events/{id}/exhibitors" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.createExhibitor({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Potterfield Harry",
      description: "A man who sells relatively good hotdogs",
      code: "abc123",
      sourceId: "software",
      location: "Taj Mahal",
      address: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        city: "Austin",
        region: "Texas",
        postalCode: "78727",
        country: "United States of America",
      },
      email: "h.potterfield@test.com",
      mobilePhone: "555-555-5555",
      workPhone: "555-555-5555",
      otherPhone: "555-555-5555",
      website: "www.superhappyfuntime.com",
      contactLinks: {
        twitterUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        facebookUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        linkedInUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        instagramUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
      sponsorshipLevel: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorCreateExhibitor } from "@cvent/sdk/funcs/exhibitorCreateExhibitor.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorCreateExhibitor(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Potterfield Harry",
      description: "A man who sells relatively good hotdogs",
      code: "abc123",
      sourceId: "software",
      location: "Taj Mahal",
      address: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        city: "Austin",
        region: "Texas",
        postalCode: "78727",
        country: "United States of America",
      },
      email: "h.potterfield@test.com",
      mobilePhone: "555-555-5555",
      workPhone: "555-555-5555",
      otherPhone: "555-555-5555",
      website: "www.superhappyfuntime.com",
      contactLinks: {
        twitterUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        facebookUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        linkedInUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        instagramUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
      sponsorshipLevel: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorCreateExhibitor failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateExhibitorRequest](../../models/operations/createexhibitorrequest.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorResponse](../../models/components/exhibitorresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getExhibitor

Retrieves a single exhibitor entity for an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getExhibitor" method="get" path="/events/{id}/exhibitors/{exhibitorId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getExhibitor({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetExhibitor } from "@cvent/sdk/funcs/exhibitorGetExhibitor.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetExhibitor(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetExhibitor failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetExhibitorRequest](../../models/operations/getexhibitorrequest.md)                                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorResponse](../../models/components/exhibitorresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateExhibitor

Updates data for a single exhibitor entity.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateExhibitor" method="put" path="/events/{id}/exhibitors/{exhibitorId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateExhibitor({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    exhibitorRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Potterfield Harry",
      description: "A man who sells relatively good hotdogs",
      code: "abc123",
      sourceId: "software",
      location: "Taj Mahal",
      address: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        city: "Austin",
        region: "Texas",
        postalCode: "78727",
        country: "United States of America",
      },
      email: "h.potterfield@test.com",
      mobilePhone: "555-555-5555",
      workPhone: "555-555-5555",
      otherPhone: "555-555-5555",
      website: "www.superhappyfuntime.com",
      contactLinks: {
        twitterUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        facebookUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        linkedInUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        instagramUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
      sponsorshipLevel: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateExhibitor } from "@cvent/sdk/funcs/exhibitorUpdateExhibitor.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateExhibitor(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    exhibitorRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      name: "Potterfield Harry",
      description: "A man who sells relatively good hotdogs",
      code: "abc123",
      sourceId: "software",
      location: "Taj Mahal",
      address: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        city: "Austin",
        region: "Texas",
        postalCode: "78727",
        country: "United States of America",
      },
      email: "h.potterfield@test.com",
      mobilePhone: "555-555-5555",
      workPhone: "555-555-5555",
      otherPhone: "555-555-5555",
      website: "www.superhappyfuntime.com",
      contactLinks: {
        twitterUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        facebookUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        linkedInUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        instagramUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
      sponsorshipLevel: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateExhibitor failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateExhibitorRequest](../../models/operations/updateexhibitorrequest.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorResponse](../../models/components/exhibitorresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteExhibitor

Deletes a single exhibitor entity. To be deleted, exhibitors must have no tasks, registrations, or LeadCapture licenses assigned and must not be a sponsored or featured exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteExhibitor" method="delete" path="/events/{id}/exhibitors/{exhibitorId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.deleteExhibitor({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorDeleteExhibitor } from "@cvent/sdk/funcs/exhibitorDeleteExhibitor.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorDeleteExhibitor(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorDeleteExhibitor failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteExhibitorRequest](../../models/operations/deleteexhibitorrequest.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateExhibitorBanner

Assign a banner image to an exhibitor with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current banner image if one is assigned.

**Note:** For exhibitor profile banner images, we recommend images that are 1872x320 pixels or smaller images that have an aspect ratio of 5.85:1. File extensions supported: JPEG, JPG, PNG, GIF


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateExhibitorBanner" method="put" path="/events/{id}/exhibitors/{exhibitorId}/banner-files/{fileId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateExhibitorBanner({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateExhibitorBanner } from "@cvent/sdk/funcs/exhibitorUpdateExhibitorBanner.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateExhibitorBanner(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateExhibitorBanner failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateExhibitorBannerRequest](../../models/operations/updateexhibitorbannerrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorBannerLogoFile](../../models/components/exhibitorbannerlogofile.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteExhibitorBanner

Deletes exhibitor banner image data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteExhibitorBanner" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/banner-files/{fileId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.deleteExhibitorBanner({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorDeleteExhibitorBanner } from "@cvent/sdk/funcs/exhibitorDeleteExhibitorBanner.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorDeleteExhibitorBanner(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorDeleteExhibitorBanner failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteExhibitorBannerRequest](../../models/operations/deleteexhibitorbannerrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getExhibitorAnswers

Gets a list of answers to exhibitor questions for a given exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getExhibitorAnswers" method="get" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-answers" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getExhibitorAnswers({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetExhibitorAnswers } from "@cvent/sdk/funcs/exhibitorGetExhibitorAnswers.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetExhibitorAnswers(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetExhibitorAnswers failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetExhibitorAnswersRequest](../../models/operations/getexhibitoranswersrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorAnswersResponse](../../models/components/exhibitoranswersresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateExhibitorAnswers

Updates answers to exhibitor questions for a given exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateExhibitorAnswers" method="put" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-answers" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateExhibitorAnswers({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    exhibitorAnswersRequest: {
      data: [
        {
          question: {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          },
          event: {
            id: "3db28cfc-db22-11eb-8d19-0242ac130003",
          },
          exhibitor: {
            id: "4888db54-db22-11eb-8d19-0242ac130003",
          },
          answers: [
            {
              type: "Choice",
              value: "Choice A",
            },
          ],
        },
      ],
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateExhibitorAnswers } from "@cvent/sdk/funcs/exhibitorUpdateExhibitorAnswers.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateExhibitorAnswers(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    exhibitorAnswersRequest: {
      data: [
        {
          question: {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          },
          event: {
            id: "3db28cfc-db22-11eb-8d19-0242ac130003",
          },
          exhibitor: {
            id: "4888db54-db22-11eb-8d19-0242ac130003",
          },
          answers: [
            {
              type: "Choice",
              value: "Choice A",
            },
          ],
        },
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateExhibitorAnswers failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateExhibitorAnswersRequest](../../models/operations/updateexhibitoranswersrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorAnswersResponse](../../models/components/exhibitoranswersresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## listExhibitorCategories

Get a paginated list of exhibitor-categories assigned to the provided exhibitor Id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listExhibitorCategories" method="get" path="/events/{id}/exhibitors/{exhibitorId}/exhibitor-categories" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.listExhibitorCategories({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorListExhibitorCategories } from "@cvent/sdk/funcs/exhibitorListExhibitorCategories.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorListExhibitorCategories(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("exhibitorListExhibitorCategories failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListExhibitorCategoriesRequest](../../models/operations/listexhibitorcategoriesrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListExhibitorCategoriesResponse](../../models/operations/listexhibitorcategoriesresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateExhibitorLogo

Assign a logo image to an exhibitor with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current logo image if one is assigned.

**Note:**  For exhibitor profile logo images we recommend square images larger than 300x300 pixels. The file types supported are : JPEG, JPG, PNG, GIF


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateExhibitorLogo" method="put" path="/events/{id}/exhibitors/{exhibitorId}/logo-files/{fileId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateExhibitorLogo({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateExhibitorLogo } from "@cvent/sdk/funcs/exhibitorUpdateExhibitorLogo.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateExhibitorLogo(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateExhibitorLogo failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateExhibitorLogoRequest](../../models/operations/updateexhibitorlogorequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorBannerLogoFile](../../models/components/exhibitorbannerlogofile.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteExhibitorLogo

Deletes exhibitor logo image data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteExhibitorLogo" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/logo-files/{fileId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.deleteExhibitorLogo({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorDeleteExhibitorLogo } from "@cvent/sdk/funcs/exhibitorDeleteExhibitorLogo.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorDeleteExhibitorLogo(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    fileId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorDeleteExhibitorLogo failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteExhibitorLogoRequest](../../models/operations/deleteexhibitorlogorequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getLeadQualificationQuestions

Retrieves a list of lead qualification questions associated with a single exhibitor at the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getLeadQualificationQuestions" method="get" path="/events/{id}/exhibitors/{exhibitorId}/questions" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getLeadQualificationQuestions({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetLeadQualificationQuestions } from "@cvent/sdk/funcs/exhibitorGetLeadQualificationQuestions.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetLeadQualificationQuestions(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetLeadQualificationQuestions failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetLeadQualificationQuestionsRequest](../../models/operations/getleadqualificationquestionsrequest.md)                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.LeadQualificationQuestionsListResponse](../../models/components/leadqualificationquestionslistresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## postRegistrationPack

Create registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="postRegistrationPack" method="post" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.postRegistrationPack({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      capacities: [
        {
          registrationType: {
            id: "923d5629-3cac-40c2-8237-34937dd93475",
          },
          reservedCapacity: 5,
        },
      ],
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorPostRegistrationPack } from "@cvent/sdk/funcs/exhibitorPostRegistrationPack.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorPostRegistrationPack(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      capacities: [
        {
          registrationType: {
            id: "923d5629-3cac-40c2-8237-34937dd93475",
          },
          reservedCapacity: 5,
        },
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorPostRegistrationPack failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PostRegistrationPackRequest](../../models/operations/postregistrationpackrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RegistrationPackResponse](../../models/components/registrationpackresponse.md)\>**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| errors.ErrorResponse         | 400, 401, 403, 404, 409, 429 | application/json             |
| errors.APIError              | 4XX, 5XX                     | \*/\*                        |

## getExhibitorRegistrationPacks

Retrieves registration packs associated with an exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getExhibitorRegistrationPacks" method="get" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getExhibitorRegistrationPacks({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetExhibitorRegistrationPacks } from "@cvent/sdk/funcs/exhibitorGetExhibitorRegistrationPacks.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetExhibitorRegistrationPacks(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetExhibitorRegistrationPacks failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetExhibitorRegistrationPacksRequest](../../models/operations/getexhibitorregistrationpacksrequest.md)                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExhibitorRegistrationPackListResponse](../../models/components/exhibitorregistrationpacklistresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getRegistrationPack

Retrieves registration types allocated to an exhibitor, along with the count of registrations utilized.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRegistrationPack" method="get" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getRegistrationPack({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetRegistrationPack } from "@cvent/sdk/funcs/exhibitorGetRegistrationPack.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetRegistrationPack(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetRegistrationPack failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRegistrationPackRequest](../../models/operations/getregistrationpackrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RegistrationPackResponse](../../models/components/registrationpackresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateRegistrationPack

Update registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRegistrationPack" method="put" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.updateRegistrationPack({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
    registrationPackRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      capacities: [
        {
          registrationType: {
            id: "923d5629-3cac-40c2-8237-34937dd93475",
          },
          reservedCapacity: 5,
        },
      ],
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorUpdateRegistrationPack } from "@cvent/sdk/funcs/exhibitorUpdateRegistrationPack.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorUpdateRegistrationPack(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
    registrationPackRequest: {
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      capacities: [
        {
          registrationType: {
            id: "923d5629-3cac-40c2-8237-34937dd93475",
          },
          reservedCapacity: 5,
        },
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorUpdateRegistrationPack failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRegistrationPackRequest](../../models/operations/updateregistrationpackrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RegistrationPackResponse](../../models/components/registrationpackresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteRegistrationPack

Delete registration pack for an exhibitor

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteRegistrationPack" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/registration-packs/{registrationPackId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  await cventSDK.exhibitor.deleteRegistrationPack({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorDeleteRegistrationPack } from "@cvent/sdk/funcs/exhibitorDeleteRegistrationPack.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorDeleteRegistrationPack(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    exhibitorId: "4888db54-db22-11eb-8d19-0242ac130003",
    registrationPackId: "50f4f0df-0c2d-4e6b-8e68-e1413b6917f5",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("exhibitorDeleteRegistrationPack failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteRegistrationPackRequest](../../models/operations/deleteregistrationpackrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 401, 403, 404, 409, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getSponsorshipLevels

Gets a list of associated sponsorship levels for a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getSponsorshipLevels" method="get" path="/events/{id}/sponsorship-levels" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getSponsorshipLevels({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetSponsorshipLevels } from "@cvent/sdk/funcs/exhibitorGetSponsorshipLevels.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetSponsorshipLevels(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetSponsorshipLevels failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetSponsorshipLevelsRequest](../../models/operations/getsponsorshiplevelsrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.SponsorshipLevelListResponse](../../models/components/sponsorshiplevellistresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getSponsorshipLevel

Retrieves associated sponsorship level data for a single sponsorship level ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getSponsorshipLevel" method="get" path="/events/{id}/sponsorship-levels/{sponsorshipLevelId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.exhibitor.getSponsorshipLevel({
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    sponsorshipLevelId: "1765848c-2a7f-48d2-85a2-6668b8e64ffb",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { exhibitorGetSponsorshipLevel } from "@cvent/sdk/funcs/exhibitorGetSponsorshipLevel.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await exhibitorGetSponsorshipLevel(cventSDK, {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
    sponsorshipLevelId: "1765848c-2a7f-48d2-85a2-6668b8e64ffb",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("exhibitorGetSponsorshipLevel failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetSponsorshipLevelRequest](../../models/operations/getsponsorshiplevelrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingSponsorshipLevel](../../models/components/existingsponsorshiplevel.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |