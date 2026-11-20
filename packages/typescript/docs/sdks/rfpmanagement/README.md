# RFPManagement

## Overview

RFP (Request for Proposal) management APIs for core RFP operations including CRUD operations for base RFPs.

### Available Operations

* [createRFP](#createrfp) - Create RFP
* [getRfpLeadSource](#getrfpleadsource) - Get RFP Lead Source
* [getRfpLeadSourceSection](#getrfpleadsourcesection) - Get RFP Lead Source Section
* [getRFP](#getrfp) - Get RFP
* [updateRFP](#updaterfp) - Update RFP
* [submitRFP](#submitrfp) - Submit RFP

## createRFP

Creates a new RFP with the provided details.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createRFP" method="post" path="/rfps" -->
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
  const result = await cventSDK.rfpManagement.createRFP({
    needsMeetingSpace: true,
    needsGuestRooms: false,
    description: "Planning to host company's annual event in an outdoor location.",
    dateRequirements: {
      mode: "DATE_PATTERN",
      alternateDates: [
        {
          preferred: true,
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
          endDate: new RFCDate("2016-10-15"),
          startDate: new RFCDate("2016-10-13"),
          note: "Flexible dates",
        },
      ],
      pattern: {
        note: "Flexible dates on weekends.",
        endDate: new RFCDate("2016-10-15"),
        startDate: new RFCDate("2016-10-13"),
        durationDays: 3,
        startDays: [],
      },
    },
    rfpEvent: {
      event: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      name: "friday event",
      contractSignatureLocation: "Atlanta",
      destinationsUnderConsideration: "New York",
      externalMeetingRequest: true,
      audioVisualNeeds: "Need a projector in each meeting room.",
      peakMeetingRooms: 14,
      attendeesPerDay: 500,
      referenceNumber: "XVYMP8970S",
      meetingRequestId: "50dc08af-24a9-4d01-84be-3d43133dc945",
      formatType: "IN_PERSON",
      virtualAttendeesPerDay: 2000,
      budget: 10000,
      roomRateBudget: 200,
      foodBeverageBudget: 1000,
    },
    agendaStartDate: new RFCDate("2025-10-13"),
    contact: {
      firstName: "James",
      lastName: "West",
      email: "jwest@example.com",
      address: {
        countryCode: "US",
        city: "Austin",
        regionCode: "US-AL",
      },
      commissionRate: 10.75,
      commissionApplicableTypes: [
        {
          type: "FOOD_AND_BEVERAGE",
          value: "Food and Beverage",
        },
        {
          type: "OTHER",
          value: "Spa services",
        },
      ],
      phone: "555-555-5555",
      organizationName: "Five Star Planners Inc.",
      preferredContactMethods: [
        "CVENT",
      ],
    },
    rfpEventOrganization: {
      organization: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      name: "Cvent Inc.",
      address: {
        countryCode: "US",
        city: "Austin",
        regionCode: "US-AL",
      },
    },
    decisionFactors: "Price, location, and quality of service.",
    responseDueDate: new RFCDate("2016-10-13"),
    decisionDate: new RFCDate("2016-10-13"),
    billingDetails: {
      additionalInformation: "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
      concessionsContractualInfo: "Request use of LOI or Express Agreement.",
      rebateValue: 10,
    },
    internalNote: "Don't award this RFP to the same venue as last year.",
    currencyCode: "USD",
    requiredCostItems: [
      "BREAK_AM",
      "BREAK_PM",
    ],
    hiddenCostItems: [
      "BREAK_DRINKS_ONLY",
      "BREAK_SNACKS_AND_DRINKS",
    ],
    cvbForwardLimit: 5,
    notificationRecipients: [
      {
        order: 1,
        type: "EMAIL",
        value: "johnDoe@example.com",
      },
      {
        order: 2,
        type: "ACCOUNT_USER",
        value: "de0af126-2ec2-4a61-a4ba-bc82c73604c9",
      },
      {
        order: 3,
        type: "ACCOUNT_USER_GROUP",
        value: "70de07af-24a9-4d01-84be-3d43133dc932",
      },
    ],
    sourceId: "123456",
    weddingDetails: {
      firstPartner: {
        name: "John Doe",
      },
      secondPartner: {
        name: "John Doe",
      },
    },
    packagePricingPreference: "OPTIONAL",
    venueIntegrationPreference: {
      type: "PASSKEY",
      optIn: true,
    },
    leadSource: {
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      section: {
        id: "40dc08af-24a9-4d01-84be-3d43133dc945",
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
import { rfpManagementCreateRFP } from "@cvent/sdk/funcs/rfpManagementCreateRFP.js";
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
  const res = await rfpManagementCreateRFP(cventSDK, {
    needsMeetingSpace: true,
    needsGuestRooms: false,
    description: "Planning to host company's annual event in an outdoor location.",
    dateRequirements: {
      mode: "DATE_PATTERN",
      alternateDates: [
        {
          preferred: true,
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
          endDate: new RFCDate("2016-10-15"),
          startDate: new RFCDate("2016-10-13"),
          note: "Flexible dates",
        },
      ],
      pattern: {
        note: "Flexible dates on weekends.",
        endDate: new RFCDate("2016-10-15"),
        startDate: new RFCDate("2016-10-13"),
        durationDays: 3,
        startDays: [],
      },
    },
    rfpEvent: {
      event: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      name: "friday event",
      contractSignatureLocation: "Atlanta",
      destinationsUnderConsideration: "New York",
      externalMeetingRequest: true,
      audioVisualNeeds: "Need a projector in each meeting room.",
      peakMeetingRooms: 14,
      attendeesPerDay: 500,
      referenceNumber: "XVYMP8970S",
      meetingRequestId: "50dc08af-24a9-4d01-84be-3d43133dc945",
      formatType: "IN_PERSON",
      virtualAttendeesPerDay: 2000,
      budget: 10000,
      roomRateBudget: 200,
      foodBeverageBudget: 1000,
    },
    agendaStartDate: new RFCDate("2025-10-13"),
    contact: {
      firstName: "James",
      lastName: "West",
      email: "jwest@example.com",
      address: {
        countryCode: "US",
        city: "Austin",
        regionCode: "US-AL",
      },
      commissionRate: 10.75,
      commissionApplicableTypes: [
        {
          type: "FOOD_AND_BEVERAGE",
          value: "Food and Beverage",
        },
        {
          type: "OTHER",
          value: "Spa services",
        },
      ],
      phone: "555-555-5555",
      organizationName: "Five Star Planners Inc.",
      preferredContactMethods: [
        "CVENT",
      ],
    },
    rfpEventOrganization: {
      organization: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      name: "Cvent Inc.",
      address: {
        countryCode: "US",
        city: "Austin",
        regionCode: "US-AL",
      },
    },
    decisionFactors: "Price, location, and quality of service.",
    responseDueDate: new RFCDate("2016-10-13"),
    decisionDate: new RFCDate("2016-10-13"),
    billingDetails: {
      additionalInformation: "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
      concessionsContractualInfo: "Request use of LOI or Express Agreement.",
      rebateValue: 10,
    },
    internalNote: "Don't award this RFP to the same venue as last year.",
    currencyCode: "USD",
    requiredCostItems: [
      "BREAK_AM",
      "BREAK_PM",
    ],
    hiddenCostItems: [
      "BREAK_DRINKS_ONLY",
      "BREAK_SNACKS_AND_DRINKS",
    ],
    cvbForwardLimit: 5,
    notificationRecipients: [
      {
        order: 1,
        type: "EMAIL",
        value: "johnDoe@example.com",
      },
      {
        order: 2,
        type: "ACCOUNT_USER",
        value: "de0af126-2ec2-4a61-a4ba-bc82c73604c9",
      },
      {
        order: 3,
        type: "ACCOUNT_USER_GROUP",
        value: "70de07af-24a9-4d01-84be-3d43133dc932",
      },
    ],
    sourceId: "123456",
    weddingDetails: {
      firstPartner: {
        name: "John Doe",
      },
      secondPartner: {
        name: "John Doe",
      },
    },
    packagePricingPreference: "OPTIONAL",
    venueIntegrationPreference: {
      type: "PASSKEY",
      optIn: true,
    },
    leadSource: {
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      section: {
        id: "40dc08af-24a9-4d01-84be-3d43133dc945",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpManagementCreateRFP failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.RfpRequest](../../models/components/rfprequest.md)                                                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Rfp2](../../models/components/rfp2.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 400, 401, 403, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## getRfpLeadSource

Returns details about a given lead source of an RFP. The lead source indicates the primary origin of the RFP or the supplier being added to the RFP, such as a particular software or website.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpLeadSource" method="get" path="/rfps/lead-sources/{leadSourceId}" -->
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
  const result = await cventSDK.rfpManagement.getRfpLeadSource({
    leadSourceId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpManagementGetRFPLeadSource } from "@cvent/sdk/funcs/rfpManagementGetRFPLeadSource.js";

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
  const res = await rfpManagementGetRFPLeadSource(cventSDK, {
    leadSourceId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpManagementGetRFPLeadSource failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpLeadSourceRequest](../../models/operations/getrfpleadsourcerequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpLeadSource](../../models/components/rfpleadsource.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## getRfpLeadSourceSection

Returns details about the lead source section of an RFP. The lead source section identifies the specific segment or channel within the broader lead source, such as a particular website domain, form, or integration point, where the RFP originated. This enables more granular tracking and attribution of RFPs by pinpointing the exact section within the overall lead source. See the [Lead Source](#tag/RFP-Management/operation/getRfpLeadSource) endpoint for more information about lead sources.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpLeadSourceSection" method="get" path="/rfps/lead-sources/{leadSourceId}/sections/{leadSourceSectionId}" -->
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
  const result = await cventSDK.rfpManagement.getRfpLeadSourceSection({
    leadSourceId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    leadSourceSectionId: "779934d2-f6eb-4815-bcfa-a2dd8655c164",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpManagementGetRFPLeadSourceSection } from "@cvent/sdk/funcs/rfpManagementGetRFPLeadSourceSection.js";

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
  const res = await rfpManagementGetRFPLeadSourceSection(cventSDK, {
    leadSourceId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    leadSourceSectionId: "779934d2-f6eb-4815-bcfa-a2dd8655c164",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpManagementGetRFPLeadSourceSection failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpLeadSourceSectionRequest](../../models/operations/getrfpleadsourcesectionrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpLeadSourceSection](../../models/components/rfpleadsourcesection.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## getRFP

Returns the basic details of an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRFP" method="get" path="/rfps/{rfpId}" -->
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
  const result = await cventSDK.rfpManagement.getRFP({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    expand: [
      "leadSource",
      "leadSource.section",
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
import { rfpManagementGetRFP } from "@cvent/sdk/funcs/rfpManagementGetRFP.js";

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
  const res = await rfpManagementGetRFP(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    expand: [
      "leadSource",
      "leadSource.section",
    ],
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpManagementGetRFP failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRFPRequest](../../models/operations/getrfprequest.md)                                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Rfp2](../../models/components/rfp2.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateRFP

Updates an existing RFP with the provided details.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRFP" method="put" path="/rfps/{rfpId}" -->
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
  const result = await cventSDK.rfpManagement.updateRFP({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfp: {
      needsMeetingSpace: true,
      needsGuestRooms: false,
      description: "Planning to host company's annual event in an outdoor location.",
      dateRequirements: {
        mode: "DATE_PATTERN",
        alternateDates: [
          {
            preferred: true,
            id: "50dc08af-24a9-4d01-84be-3d43133dc945",
            endDate: new RFCDate("2016-10-15"),
            startDate: new RFCDate("2016-10-13"),
            note: "Flexible dates",
          },
        ],
        pattern: {
          note: "Flexible dates on weekends.",
          endDate: new RFCDate("2016-10-15"),
          startDate: new RFCDate("2016-10-13"),
          durationDays: 3,
          startDays: [
            "MONDAY",
          ],
        },
      },
      rfpEvent: {
        event: {
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        name: "friday event",
        contractSignatureLocation: "Atlanta",
        destinationsUnderConsideration: "New York",
        externalMeetingRequest: true,
        audioVisualNeeds: "Need a projector in each meeting room.",
        peakMeetingRooms: 14,
        attendeesPerDay: 500,
        referenceNumber: "XVYMP8970S",
        meetingRequestId: "50dc08af-24a9-4d01-84be-3d43133dc945",
        formatType: "IN_PERSON",
        virtualAttendeesPerDay: 2000,
        budget: 10000,
        roomRateBudget: 200,
        foodBeverageBudget: 1000,
      },
      agendaStartDate: new RFCDate("2025-10-13"),
      contact: {
        firstName: "James",
        lastName: "West",
        email: "jwest@example.com",
        address: {
          countryCode: "US",
          city: "Austin",
          regionCode: "US-AL",
        },
        commissionRate: 10.75,
        commissionApplicableTypes: [
          {
            type: "FOOD_AND_BEVERAGE",
            value: "Food and Beverage",
          },
          {
            type: "OTHER",
            value: "Spa services",
          },
        ],
        phone: "555-555-5555",
        organizationName: "Five Star Planners Inc.",
        preferredContactMethods: [
          "CVENT",
        ],
      },
      rfpEventOrganization: {
        organization: {
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        name: "Cvent Inc.",
        address: {
          countryCode: "US",
          city: "Austin",
          regionCode: "US-AL",
        },
      },
      decisionFactors: "Price, location, and quality of service.",
      responseDueDate: new RFCDate("2016-10-13"),
      decisionDate: new RFCDate("2016-10-13"),
      billingDetails: {
        additionalInformation: "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
        concessionsContractualInfo: "Request use of LOI or Express Agreement.",
        rebateValue: 10,
      },
      internalNote: "Don't award this RFP to the same venue as last year.",
      currencyCode: "USD",
      requiredCostItems: [
        "BREAK_AM",
        "BREAK_PM",
      ],
      hiddenCostItems: [
        "BREAK_DRINKS_ONLY",
        "BREAK_SNACKS_AND_DRINKS",
      ],
      cvbForwardLimit: 5,
      notificationRecipients: [
        {
          order: 1,
          type: "EMAIL",
          value: "johnDoe@example.com",
        },
        {
          order: 2,
          type: "ACCOUNT_USER",
          value: "de0af126-2ec2-4a61-a4ba-bc82c73604c9",
        },
        {
          order: 3,
          type: "ACCOUNT_USER_GROUP",
          value: "70de07af-24a9-4d01-84be-3d43133dc932",
        },
      ],
      sourceId: "123456",
      weddingDetails: {
        firstPartner: {
          name: "John Doe",
        },
        secondPartner: {
          name: "John Doe",
        },
      },
      packagePricingPreference: "OPTIONAL",
      venueIntegrationPreference: {
        type: "PASSKEY",
        optIn: true,
      },
      id: "a3edf581-b80c-4a0b-bdcf-ab8bf5fdcd1b",
      cancellationDetails: {
        dateTime: new Date("2021-01-13T14:06:20.080Z"),
        comments: "I am cancelling my event, postponing to Q4.",
      },
      archivalDate: new Date("2021-01-13T14:06:20.080Z"),
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
import { rfpManagementUpdateRFP } from "@cvent/sdk/funcs/rfpManagementUpdateRFP.js";
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
  const res = await rfpManagementUpdateRFP(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfp: {
      needsMeetingSpace: true,
      needsGuestRooms: false,
      description: "Planning to host company's annual event in an outdoor location.",
      dateRequirements: {
        mode: "DATE_PATTERN",
        alternateDates: [
          {
            preferred: true,
            id: "50dc08af-24a9-4d01-84be-3d43133dc945",
            endDate: new RFCDate("2016-10-15"),
            startDate: new RFCDate("2016-10-13"),
            note: "Flexible dates",
          },
        ],
        pattern: {
          note: "Flexible dates on weekends.",
          endDate: new RFCDate("2016-10-15"),
          startDate: new RFCDate("2016-10-13"),
          durationDays: 3,
          startDays: [
            "MONDAY",
          ],
        },
      },
      rfpEvent: {
        event: {
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        name: "friday event",
        contractSignatureLocation: "Atlanta",
        destinationsUnderConsideration: "New York",
        externalMeetingRequest: true,
        audioVisualNeeds: "Need a projector in each meeting room.",
        peakMeetingRooms: 14,
        attendeesPerDay: 500,
        referenceNumber: "XVYMP8970S",
        meetingRequestId: "50dc08af-24a9-4d01-84be-3d43133dc945",
        formatType: "IN_PERSON",
        virtualAttendeesPerDay: 2000,
        budget: 10000,
        roomRateBudget: 200,
        foodBeverageBudget: 1000,
      },
      agendaStartDate: new RFCDate("2025-10-13"),
      contact: {
        firstName: "James",
        lastName: "West",
        email: "jwest@example.com",
        address: {
          countryCode: "US",
          city: "Austin",
          regionCode: "US-AL",
        },
        commissionRate: 10.75,
        commissionApplicableTypes: [
          {
            type: "FOOD_AND_BEVERAGE",
            value: "Food and Beverage",
          },
          {
            type: "OTHER",
            value: "Spa services",
          },
        ],
        phone: "555-555-5555",
        organizationName: "Five Star Planners Inc.",
        preferredContactMethods: [
          "CVENT",
        ],
      },
      rfpEventOrganization: {
        organization: {
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        name: "Cvent Inc.",
        address: {
          countryCode: "US",
          city: "Austin",
          regionCode: "US-AL",
        },
      },
      decisionFactors: "Price, location, and quality of service.",
      responseDueDate: new RFCDate("2016-10-13"),
      decisionDate: new RFCDate("2016-10-13"),
      billingDetails: {
        additionalInformation: "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
        concessionsContractualInfo: "Request use of LOI or Express Agreement.",
        rebateValue: 10,
      },
      internalNote: "Don't award this RFP to the same venue as last year.",
      currencyCode: "USD",
      requiredCostItems: [
        "BREAK_AM",
        "BREAK_PM",
      ],
      hiddenCostItems: [
        "BREAK_DRINKS_ONLY",
        "BREAK_SNACKS_AND_DRINKS",
      ],
      cvbForwardLimit: 5,
      notificationRecipients: [
        {
          order: 1,
          type: "EMAIL",
          value: "johnDoe@example.com",
        },
        {
          order: 2,
          type: "ACCOUNT_USER",
          value: "de0af126-2ec2-4a61-a4ba-bc82c73604c9",
        },
        {
          order: 3,
          type: "ACCOUNT_USER_GROUP",
          value: "70de07af-24a9-4d01-84be-3d43133dc932",
        },
      ],
      sourceId: "123456",
      weddingDetails: {
        firstPartner: {
          name: "John Doe",
        },
        secondPartner: {
          name: "John Doe",
        },
      },
      packagePricingPreference: "OPTIONAL",
      venueIntegrationPreference: {
        type: "PASSKEY",
        optIn: true,
      },
      id: "a3edf581-b80c-4a0b-bdcf-ab8bf5fdcd1b",
      cancellationDetails: {
        dateTime: new Date("2021-01-13T14:06:20.080Z"),
        comments: "I am cancelling my event, postponing to Q4.",
      },
      archivalDate: new Date("2021-01-13T14:06:20.080Z"),
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpManagementUpdateRFP failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRFPRequest](../../models/operations/updaterfprequest.md)                                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.Rfp2](../../models/components/rfp2.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## submitRFP

Submits an existing RFP. Transitions the RFP from draft status to active or pending status based on whether the RFP approval process is enabled.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="submitRFP" method="post" path="/rfps/{rfpId}/submit" -->
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
  const result = await cventSDK.rfpManagement.submitRFP({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpManagementSubmitRFP } from "@cvent/sdk/funcs/rfpManagementSubmitRFP.js";

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
  const res = await rfpManagementSubmitRFP(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpManagementSubmitRFP failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.SubmitRFPRequest](../../models/operations/submitrfprequest.md)                                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpWithStatus](../../models/components/rfpwithstatus.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |