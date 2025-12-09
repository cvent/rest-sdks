# Contacts

## Overview

A contact is a record in your account’s address book that represents an individual. The data stored within these records includes personal information, group memberships, and historical data on event attendance.  Contact APIs will allow you to get contact information, track updates to contact information, and create contacts.

### Available Operations

* [createContactGroup](#createcontactgroup) - Create Contact Group
* [listContactGroups](#listcontactgroups) - List Contact Groups
* [getContactGroupById](#getcontactgroupbyid) - Get Contact Group
* [updateContactGroup](#updatecontactgroup) - Update Contact Group
* [deleteContactGroup](#deletecontactgroup) - Delete Contact Group
* [getContactIdsByContactGroup](#getcontactidsbycontactgroup) - Get Ids in Contact Group
* [addContactToContactGroup](#addcontacttocontactgroup) - Add Contact To Group
* [removeContactFromContactGroup](#removecontactfromcontactgroup) - Remove Contact From Group
* [listContactTypes](#listcontacttypes) - List Contact Types
* [listContacts](#listcontacts) - List Contacts
* [updateContacts](#updatecontacts) - Update Contacts
* [patchContacts](#patchcontacts) - Patch Contacts
* [createContacts](#createcontacts) - Create Contacts
* [listContactsPostFilters](#listcontactspostfilters) - List Contacts
* [getContactObfuscationStatusById](#getcontactobfuscationstatusbyid) - Get Obfuscation Status
* [getChangeHistoryForASpecificContact](#getchangehistoryforaspecificcontact) - Get Contact Change History
* [getContactById](#getcontactbyid) - Get Contact
* [updateContactById](#updatecontactbyid) - Update Contact
* [patchContactById](#patchcontactbyid) - Patch Contact
* [deleteContactById](#deletecontactbyid) - Delete Contact
* [updateContactCustomFieldAnswers](#updatecontactcustomfieldanswers) - Update Custom Field Answers
* [mergeContacts](#mergecontacts) - Merge Contacts
* [obfuscateContactById](#obfuscatecontactbyid) - Obfuscate a Contact
* [deleteContactProfileImage](#deletecontactprofileimage) - Delete Contact Profile Picture
* [assignContactProfileImage](#assigncontactprofileimage) - Assign Contact Profile Picture
* [getContactRelationshipsById](#getcontactrelationshipsbyid) - Get Related Contact Ids
* [createContactRelationship](#createcontactrelationship) - Add Contact Relationship
* [deleteContactRelationship](#deletecontactrelationship) - Delete Contact Relationship

## createContactGroup

Create a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createContactGroup" method="post" path="/contact-groups" -->
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
  const result = await cventSDK.contacts.createContactGroup({
    name: "group name",
    shortDescription: "short description",
    description: "long description",
    distributionListInfo: {
      internalNote: "Sample distribution list internal note",
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
import { contactsCreateContactGroup } from "@cvent/sdk/funcs/contactsCreateContactGroup.js";

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
  const res = await contactsCreateContactGroup(cventSDK, {
    name: "group name",
    shortDescription: "short description",
    description: "long description",
    distributionListInfo: {
      internalNote: "Sample distribution list internal note",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsCreateContactGroup failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.ContactGroupInput](../../models/components/contactgroupinput.md)                                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactGroup](../../models/components/contactgroup.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## listContactGroups

Gets a paginated list of contact groups

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listContactGroups" method="get" path="/contact-groups" -->
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
  const result = await cventSDK.contacts.listContactGroups({
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "name eq 'groupName' and type eq 'STANDARD'",
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
import { contactsListContactGroups } from "@cvent/sdk/funcs/contactsListContactGroups.js";

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
  const res = await contactsListContactGroups(cventSDK, {
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "name eq 'groupName' and type eq 'STANDARD'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsListContactGroups failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListContactGroupsRequest](../../models/operations/listcontactgroupsrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListContactGroupsResponse](../../models/operations/listcontactgroupsresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getContactGroupById

Get a single contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getContactGroupById" method="get" path="/contact-groups/{id}" -->
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
  const result = await cventSDK.contacts.getContactGroupById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsGetContactGroupById } from "@cvent/sdk/funcs/contactsGetContactGroupById.js";

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
  const res = await contactsGetContactGroupById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsGetContactGroupById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetContactGroupByIdRequest](../../models/operations/getcontactgroupbyidrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactGroup](../../models/components/contactgroup.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateContactGroup

Update a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateContactGroup" method="put" path="/contact-groups/{id}" -->
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
  const result = await cventSDK.contacts.updateContactGroup({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactGroup: {
      name: "group name",
      shortDescription: "short description",
      description: "long description",
      distributionListInfo: {
        internalNote: "Sample distribution list internal note",
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
import { contactsUpdateContactGroup } from "@cvent/sdk/funcs/contactsUpdateContactGroup.js";

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
  const res = await contactsUpdateContactGroup(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactGroup: {
      name: "group name",
      shortDescription: "short description",
      description: "long description",
      distributionListInfo: {
        internalNote: "Sample distribution list internal note",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsUpdateContactGroup failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateContactGroupRequest](../../models/operations/updatecontactgrouprequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactGroup](../../models/components/contactgroup.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteContactGroup

Delete a contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteContactGroup" method="delete" path="/contact-groups/{id}" -->
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
  await cventSDK.contacts.deleteContactGroup({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsDeleteContactGroup } from "@cvent/sdk/funcs/contactsDeleteContactGroup.js";

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
  const res = await contactsDeleteContactGroup(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsDeleteContactGroup failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteContactGroupRequest](../../models/operations/deletecontactgrouprequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## getContactIdsByContactGroup

Get all contact ids in a single contact group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getContactIdsByContactGroup" method="get" path="/contact-groups/{id}/contacts" -->
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
  const result = await cventSDK.contacts.getContactIdsByContactGroup({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
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
import { contactsGetContactIdsByContactGroup } from "@cvent/sdk/funcs/contactsGetContactIdsByContactGroup.js";

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
  const res = await contactsGetContactIdsByContactGroup(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsGetContactIdsByContactGroup failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetContactIdsByContactGroupRequest](../../models/operations/getcontactidsbycontactgrouprequest.md)                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetContactIdsByContactGroupResponse](../../models/operations/getcontactidsbycontactgroupresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## addContactToContactGroup

Adds a single Contact to a single Contact Group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="addContactToContactGroup" method="put" path="/contact-groups/{id}/contacts/{contactId}" -->
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
  await cventSDK.contacts.addContactToContactGroup({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsAddContactToContactGroup } from "@cvent/sdk/funcs/contactsAddContactToContactGroup.js";

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
  const res = await contactsAddContactToContactGroup(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsAddContactToContactGroup failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.AddContactToContactGroupRequest](../../models/operations/addcontacttocontactgrouprequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## removeContactFromContactGroup

Removes a single Contact from a single Contact Group

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="removeContactFromContactGroup" method="delete" path="/contact-groups/{id}/contacts/{contactId}" -->
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
  await cventSDK.contacts.removeContactFromContactGroup({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsRemoveContactFromContactGroup } from "@cvent/sdk/funcs/contactsRemoveContactFromContactGroup.js";

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
  const res = await contactsRemoveContactFromContactGroup(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsRemoveContactFromContactGroup failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.RemoveContactFromContactGroupRequest](../../models/operations/removecontactfromcontactgrouprequest.md)                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## listContactTypes

Gets a paginated list of contact types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listContactTypes" method="get" path="/contact-types" -->
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
  const result = await cventSDK.contacts.listContactTypes({
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "name eq 'groupType'",
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
import { contactsListContactTypes } from "@cvent/sdk/funcs/contactsListContactTypes.js";

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
  const res = await contactsListContactTypes(cventSDK, {
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "name eq 'groupType'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsListContactTypes failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListContactTypesRequest](../../models/operations/listcontacttypesrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListContactTypesResponse](../../models/operations/listcontacttypesresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## listContacts

Gets a paginated list of Contacts.

For information on reading secure contact fields, see the description of
<a href="#operation/getContactById">GET Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listContacts" method="get" path="/contacts" -->
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
  const result = await cventSDK.contacts.listContacts({
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "firstName eq 'John' or lastName eq 'Anderson'",
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
import { contactsListContacts } from "@cvent/sdk/funcs/contactsListContacts.js";

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
  const res = await contactsListContacts(cventSDK, {
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "firstName eq 'John' or lastName eq 'Anderson'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsListContacts failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListContactsRequest](../../models/operations/listcontactsrequest.md)                                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListContactsResponse](../../models/operations/listcontactsresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateContacts

Updates a list of contacts based on the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
For information on updating secure contact fields, see the description of <a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateContacts" method="put" path="/contacts" -->
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
  const result = await cventSDK.contacts.updateContacts([]);

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsUpdateContacts } from "@cvent/sdk/funcs/contactsUpdateContacts.js";

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
  const res = await contactsUpdateContacts(cventSDK, []);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsUpdateContacts failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.ContactUpdate[]](../../models/.md)                                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactBulkItemJson[]](../../models/.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## patchContacts

Updates a list of contacts based on the values provided only, keeping the existing values intact for every contact.

For information on PATCH behavior, see the description of
<a href="#operation/patchContactById">PATCH Contact</a>.

For information on updating secure contact fields, see the description of
<a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="patchContacts" method="patch" path="/contacts" -->
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
  const result = await cventSDK.contacts.patchContacts([
    {
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      designation: "CPA",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
      },
      primaryAddressType: "Home",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {},
      npi: "5555555555",
      passport: {
        number: "123456789",
        countryCode: "GB",
      },
      nationalIdentificationNumber: "123456789",
      headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography: "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
      id: "6287f5c1-9d7f-4f15-9ffe-ca2cb290964c",
    },
  ]);

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsPatchContacts } from "@cvent/sdk/funcs/contactsPatchContacts.js";

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
  const res = await contactsPatchContacts(cventSDK, [
    {
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      designation: "CPA",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
      },
      primaryAddressType: "Home",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {},
      npi: "5555555555",
      passport: {
        number: "123456789",
        countryCode: "GB",
      },
      nationalIdentificationNumber: "123456789",
      headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography: "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
      id: "6287f5c1-9d7f-4f15-9ffe-ca2cb290964c",
    },
  ]);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsPatchContacts failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.ContactPatch[]](../../models/.md)                                                                                                                                  | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactBulkItemJson[]](../../models/.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## createContacts

Creates a list of contacts based on the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
For information on creating contacts with secure contact fields, see the description of <a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createContacts" method="post" path="/contacts" -->
```typescript
import { CventSDK } from "@cvent/sdk";
import { RFCDate } from "@cvent/sdk/types";

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
  const result = await cventSDK.contacts.createContacts({
    upsert: true,
    requestBody: [
      {
        firstName: "Henry",
        lastName: "Potterfield",
        middleName: "A",
        nickname: "Harry",
        email: "h.potterfield@test.com",
        ccEmail: "h.porter@tesing.com",
        gender: "Male",
        company: "Cvent Inc.",
        designation: "CPA",
        title: "Event Planner",
        type: {
          id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
        },
        primaryAddressType: "Home",
        homeAddress: {
          address1: "Cvent Inc.",
          address2: "4001 West Parmer Lane",
          address3: "PO Box 123",
          city: "Austin",
          countryCode: "US",
          postalCode: "78727",
          regionCode: "TX",
        },
        homePhone: "555-555-5555",
        homeFax: "555-555-5555",
        workAddress: {
          address1: "Cvent Inc.",
          address2: "4001 West Parmer Lane",
          address3: "PO Box 123",
          city: "Austin",
          countryCode: "US",
          postalCode: "78727",
          regionCode: "TX",
        },
        workPhone: "555-555-5555",
        workFax: "555-555-5555",
        sourceId: "system-a-00000000-0000-0000-0000-000000000000",
        mobilePhone: "555-555-5555",
        prefix: "Mr.",
        pager: "555-555-5555",
        optOut: {},
        npi: "5555555555",
        links: {
          twitterUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          facebookUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          linkedInUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
        },
        dateOfBirth: new RFCDate("1990-01-01"),
        passport: {
          number: "123456789",
          countryCode: "GB",
        },
        socialSecurityNumber: "123-45-6789",
        nationalIdentificationNumber: "123456789",
        headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
        personalWebsite: "https://www.example.com",
        biography: "I am a marketing professional with experience in event planning and brand strategy.",
        pronouns: "he/him/she/her/they/them",
      },
    ],
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsCreateContacts } from "@cvent/sdk/funcs/contactsCreateContacts.js";
import { RFCDate } from "@cvent/sdk/types";

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
  const res = await contactsCreateContacts(cventSDK, {
    upsert: true,
    requestBody: [
      {
        firstName: "Henry",
        lastName: "Potterfield",
        middleName: "A",
        nickname: "Harry",
        email: "h.potterfield@test.com",
        ccEmail: "h.porter@tesing.com",
        gender: "Male",
        company: "Cvent Inc.",
        designation: "CPA",
        title: "Event Planner",
        type: {
          id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
        },
        primaryAddressType: "Home",
        homeAddress: {
          address1: "Cvent Inc.",
          address2: "4001 West Parmer Lane",
          address3: "PO Box 123",
          city: "Austin",
          countryCode: "US",
          postalCode: "78727",
          regionCode: "TX",
        },
        homePhone: "555-555-5555",
        homeFax: "555-555-5555",
        workAddress: {
          address1: "Cvent Inc.",
          address2: "4001 West Parmer Lane",
          address3: "PO Box 123",
          city: "Austin",
          countryCode: "US",
          postalCode: "78727",
          regionCode: "TX",
        },
        workPhone: "555-555-5555",
        workFax: "555-555-5555",
        sourceId: "system-a-00000000-0000-0000-0000-000000000000",
        mobilePhone: "555-555-5555",
        prefix: "Mr.",
        pager: "555-555-5555",
        optOut: {},
        npi: "5555555555",
        links: {
          twitterUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          facebookUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          linkedInUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
        },
        dateOfBirth: new RFCDate("1990-01-01"),
        passport: {
          number: "123456789",
          countryCode: "GB",
        },
        socialSecurityNumber: "123-45-6789",
        nationalIdentificationNumber: "123456789",
        headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
        personalWebsite: "https://www.example.com",
        biography: "I am a marketing professional with experience in event planning and brand strategy.",
        pronouns: "he/him/she/her/they/them",
      },
    ],
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsCreateContacts failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateContactsRequest](../../models/operations/createcontactsrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactBulkItemJson[]](../../models/.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## listContactsPostFilters

Gets a paginated list of Contacts by sending a filter in the body of the request. This method will return the same data as the GET List Contacts but allows for longer filters.
For information on reading secure contact fields, see the description of  <a href="#operation/getContactById">GET Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listContactsPostFilters" method="post" path="/contacts/filter" -->
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
  const result = await cventSDK.contacts.listContactsPostFilters({
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: {
      filter: "firstName eq 'John' or lastName eq 'Anderson'",
    },
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
import { contactsListContactsPostFilters } from "@cvent/sdk/funcs/contactsListContactsPostFilters.js";

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
  const res = await contactsListContactsPostFilters(cventSDK, {
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: {
      filter: "firstName eq 'John' or lastName eq 'Anderson'",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsListContactsPostFilters failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListContactsPostFiltersRequest](../../models/operations/listcontactspostfiltersrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListContactsPostFiltersResponse](../../models/operations/listcontactspostfiltersresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getContactObfuscationStatusById

Get the obfuscation status of a contact by the Obfuscate ID provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getContactObfuscationStatusById" method="get" path="/contacts/obfuscate/{obfuscateId}/status" -->
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
  const result = await cventSDK.contacts.getContactObfuscationStatusById({
    obfuscateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsGetContactObfuscationStatusById } from "@cvent/sdk/funcs/contactsGetContactObfuscationStatusById.js";

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
  const res = await contactsGetContactObfuscationStatusById(cventSDK, {
    obfuscateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsGetContactObfuscationStatusById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetContactObfuscationStatusByIdRequest](../../models/operations/getcontactobfuscationstatusbyidrequest.md)                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactObfuscationStatus](../../models/components/contactobfuscationstatus.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getChangeHistoryForASpecificContact

Get the change history for a specific contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getChangeHistoryForASpecificContact" method="get" path="/contacts/{contactId}/history" -->
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
  const result = await cventSDK.contacts.getChangeHistoryForASpecificContact({
    contactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    before: new Date("2017-01-02T02:00:00Z"),
    after: new Date("2017-01-02T02:00:00Z"),
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
import { contactsGetChangeHistoryForASpecificContact } from "@cvent/sdk/funcs/contactsGetChangeHistoryForASpecificContact.js";

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
  const res = await contactsGetChangeHistoryForASpecificContact(cventSDK, {
    contactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    before: new Date("2017-01-02T02:00:00Z"),
    after: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsGetChangeHistoryForASpecificContact failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetChangeHistoryForASpecificContactRequest](../../models/operations/getchangehistoryforaspecificcontactrequest.md)                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetChangeHistoryForASpecificContactResponse](../../models/operations/getchangehistoryforaspecificcontactresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getContactById

Get a single contact.

When reading a contact, the following secure contact fields are only returned when
also providing the `event/contacts:read-sensitive` scope:
  * socialSecurityNumber
  * passportNumber
  * nationalIdentificationNumber
  * dateOfBirth


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getContactById" method="get" path="/contacts/{id}" -->
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
  const result = await cventSDK.contacts.getContactById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsGetContactById } from "@cvent/sdk/funcs/contactsGetContactById.js";

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
  const res = await contactsGetContactById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsGetContactById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetContactByIdRequest](../../models/operations/getcontactbyidrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Contact](../../models/components/contact.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateContactById

Updates a contact based on contact ID and the values provided in the request body. If you're changing  [de-duplication fields](https://support.cvent.com/s/communityarticle/Allowing-Multiple-People-to-Use-the-Same-Email-Address),  the new values must be unique in your account.
When writing a contact, the following secure contact fields are only written when also providing the  `event/contacts:write-sensitive` scope:
  * socialSecurityNumber
  * passportNumber
  * nationalIdentificationNumber
  * dateOfBirth


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateContactById" method="put" path="/contacts/{id}" -->
```typescript
import { CventSDK } from "@cvent/sdk";
import { RFCDate } from "@cvent/sdk/types";

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
  const result = await cventSDK.contacts.updateContactById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactUpdate: {
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      gender: "Male",
      company: "Cvent Inc.",
      designation: "CPA",
      title: "Event Planner",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
      },
      primaryAddressType: "Home",
      homeAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      homePhone: "555-555-5555",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {},
      npi: "5555555555",
      links: {
        twitterUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        facebookUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        linkedInUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
      dateOfBirth: new RFCDate("1990-01-01"),
      passport: {
        number: "123456789",
        countryCode: "GB",
      },
      socialSecurityNumber: "123-45-6789",
      nationalIdentificationNumber: "123456789",
      headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography: "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
      id: "35072f36-7cef-4254-82ae-1b411ba42d5f",
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
import { contactsUpdateContactById } from "@cvent/sdk/funcs/contactsUpdateContactById.js";
import { RFCDate } from "@cvent/sdk/types";

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
  const res = await contactsUpdateContactById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactUpdate: {
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      gender: "Male",
      company: "Cvent Inc.",
      designation: "CPA",
      title: "Event Planner",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
      },
      primaryAddressType: "Home",
      homeAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      homePhone: "555-555-5555",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {},
      npi: "5555555555",
      links: {
        twitterUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        facebookUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        linkedInUrl: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
      dateOfBirth: new RFCDate("1990-01-01"),
      passport: {
        number: "123456789",
        countryCode: "GB",
      },
      socialSecurityNumber: "123-45-6789",
      nationalIdentificationNumber: "123456789",
      headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography: "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
      id: "35072f36-7cef-4254-82ae-1b411ba42d5f",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsUpdateContactById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateContactByIdRequest](../../models/operations/updatecontactbyidrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Contact](../../models/components/contact.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## patchContactById

Updates a part of a contact based on the given contactId.

To update a field, pass the value to be updated. To delete a field, set the field to null. Fields not passed in the request body will remain unchanged.

For information on updating secure contact fields, see the description of
<a href="#operation/updateContactById">PUT Contact</a>.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="patchContactById" method="patch" path="/contacts/{id}" -->
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
  const result = await cventSDK.contacts.patchContactById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactPatch: {
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      designation: "CPA",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
      },
      primaryAddressType: "Home",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {},
      npi: "5555555555",
      passport: {
        number: "123456789",
        countryCode: "GB",
      },
      nationalIdentificationNumber: "123456789",
      headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography: "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
      id: "07460b8e-b91c-45c8-8cff-780165752daa",
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
import { contactsPatchContactById } from "@cvent/sdk/funcs/contactsPatchContactById.js";

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
  const res = await contactsPatchContactById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactPatch: {
      firstName: "Henry",
      lastName: "Potterfield",
      middleName: "A",
      nickname: "Harry",
      email: "h.potterfield@test.com",
      ccEmail: "h.porter@tesing.com",
      designation: "CPA",
      type: {
        id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
      },
      primaryAddressType: "Home",
      homeFax: "555-555-5555",
      workAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        regionCode: "TX",
      },
      workPhone: "555-555-5555",
      workFax: "555-555-5555",
      sourceId: "system-a-00000000-0000-0000-0000-000000000000",
      mobilePhone: "555-555-5555",
      prefix: "Mr.",
      pager: "555-555-5555",
      optOut: {},
      npi: "5555555555",
      passport: {
        number: "123456789",
        countryCode: "GB",
      },
      nationalIdentificationNumber: "123456789",
      headline: "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
      personalWebsite: "https://www.example.com",
      biography: "I am a marketing professional with experience in event planning and brand strategy.",
      pronouns: "he/him/she/her/they/them",
      id: "07460b8e-b91c-45c8-8cff-780165752daa",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsPatchContactById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PatchContactByIdRequest](../../models/operations/patchcontactbyidrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Contact](../../models/components/contact.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteContactById

Deletes a contact from the address book but does not remove the contact from events.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteContactById" method="delete" path="/contacts/{id}" -->
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
  await cventSDK.contacts.deleteContactById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsDeleteContactById } from "@cvent/sdk/funcs/contactsDeleteContactById.js";

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
  const res = await contactsDeleteContactById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsDeleteContactById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteContactByIdRequest](../../models/operations/deletecontactbyidrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## updateContactCustomFieldAnswers

Update custom field answers for a single custom field and single contact

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateContactCustomFieldAnswers" method="put" path="/contacts/{id}/custom-fields/{customFieldId}/answers" -->
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
  const result = await cventSDK.contacts.updateContactCustomFieldAnswers({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customField: {
      id: "2900aa71-b025-4a43-ab99-825a225ac215",
      type: "General",
      value: [
        "Choice C",
        "Choice A",
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
import { contactsUpdateContactCustomFieldAnswers } from "@cvent/sdk/funcs/contactsUpdateContactCustomFieldAnswers.js";

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
  const res = await contactsUpdateContactCustomFieldAnswers(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customField: {
      id: "2900aa71-b025-4a43-ab99-825a225ac215",
      type: "General",
      value: [
        "Choice C",
        "Choice A",
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsUpdateContactCustomFieldAnswers failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateContactCustomFieldAnswersRequest](../../models/operations/updatecontactcustomfieldanswersrequest.md)                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.CustomField](../../models/components/customfield.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## mergeContacts

Merges two or three contacts into a single contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="mergeContacts" method="post" path="/contacts/{id}/merge" -->
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
  const result = await cventSDK.contacts.mergeContacts({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactMerge: {
      secondaryContacts: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      conflictResolution: {
        contactFields: [
          {
            fieldName: "firstName",
            contactId: "a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2",
          },
        ],
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
import { contactsMergeContacts } from "@cvent/sdk/funcs/contactsMergeContacts.js";

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
  const res = await contactsMergeContacts(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactMerge: {
      secondaryContacts: [
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      ],
      conflictResolution: {
        contactFields: [
          {
            fieldName: "firstName",
            contactId: "a45a3341-d30f-4bd9-bfd8-fbcdae37f0f2",
          },
        ],
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsMergeContacts failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.MergeContactsRequest](../../models/operations/mergecontactsrequest.md)                                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Contact](../../models/components/contact.md)\>**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| errors.ErrorResponse         | 400, 401, 403, 404, 409, 429 | application/json             |
| errors.APIError              | 4XX, 5XX                     | \*/\*                        |

## obfuscateContactById

Initiate obfuscation of a contact based on the given ID. Verify the status of the obfuscation using
[Get Obfuscation Status](#operation/getContactObfuscationStatusById). Once this process succeeds, all
the data for the contact will be obfuscated and will no longer be retrievable. See the
[Obfuscation User Guide](https://developers.cvent.com/docs/rest-api/guides/obfuscation-guide) for
more details.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="obfuscateContactById" method="post" path="/contacts/{id}/obfuscate" -->
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
  const result = await cventSDK.contacts.obfuscateContactById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsObfuscateContactById } from "@cvent/sdk/funcs/contactsObfuscateContactById.js";

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
  const res = await contactsObfuscateContactById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsObfuscateContactById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ObfuscateContactByIdRequest](../../models/operations/obfuscatecontactbyidrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ObfuscateContactByIdResponse](../../models/operations/obfuscatecontactbyidresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 401, 403, 404, 409, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteContactProfileImage

Deletes the profile picture of the given contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteContactProfileImage" method="delete" path="/contacts/{id}/profile-images" -->
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
  await cventSDK.contacts.deleteContactProfileImage({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsDeleteContactProfileImage } from "@cvent/sdk/funcs/contactsDeleteContactProfileImage.js";

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
  const res = await contactsDeleteContactProfileImage(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsDeleteContactProfileImage failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteContactProfileImageRequest](../../models/operations/deletecontactprofileimagerequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## assignContactProfileImage

Assign a profile picture to a contact with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current profile picture if one is assigned.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="assignContactProfileImage" method="put" path="/contacts/{id}/profile-images" -->
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
  const result = await cventSDK.contacts.assignContactProfileImage({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactFile: {
      file: {},
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
import { contactsAssignContactProfileImage } from "@cvent/sdk/funcs/contactsAssignContactProfileImage.js";

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
  const res = await contactsAssignContactProfileImage(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    contactFile: {
      file: {},
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("contactsAssignContactProfileImage failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.AssignContactProfileImageRequest](../../models/operations/assigncontactprofileimagerequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ContactFile](../../models/components/contactfile.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getContactRelationshipsById

Get all contact Ids related to the provided contact.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getContactRelationshipsById" method="get" path="/contacts/{id}/related-contacts" -->
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
  const result = await cventSDK.contacts.getContactRelationshipsById({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
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
import { contactsGetContactRelationshipsById } from "@cvent/sdk/funcs/contactsGetContactRelationshipsById.js";

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
  const res = await contactsGetContactRelationshipsById(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("contactsGetContactRelationshipsById failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetContactRelationshipsByIdRequest](../../models/operations/getcontactrelationshipsbyidrequest.md)                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetContactRelationshipsByIdResponse](../../models/operations/getcontactrelationshipsbyidresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createContactRelationship

Adds a single contact relationship between the two contact Ids provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createContactRelationship" method="put" path="/contacts/{id}/related-contacts/{relatedContactId}" -->
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
  await cventSDK.contacts.createContactRelationship({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    relatedContactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsCreateContactRelationship } from "@cvent/sdk/funcs/contactsCreateContactRelationship.js";

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
  const res = await contactsCreateContactRelationship(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    relatedContactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsCreateContactRelationship failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateContactRelationshipRequest](../../models/operations/createcontactrelationshiprequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## deleteContactRelationship

Deletes a single contact relationship between the two contact Ids provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteContactRelationship" method="delete" path="/contacts/{id}/related-contacts/{relatedContactId}" -->
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
  await cventSDK.contacts.deleteContactRelationship({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    relatedContactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { contactsDeleteContactRelationship } from "@cvent/sdk/funcs/contactsDeleteContactRelationship.js";

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
  const res = await contactsDeleteContactRelationship(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    relatedContactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("contactsDeleteContactRelationship failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteContactRelationshipRequest](../../models/operations/deletecontactrelationshiprequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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