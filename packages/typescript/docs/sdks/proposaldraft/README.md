# ProposalDraft

## Overview

Beta - All APIs are in Beta. Proposal Drafts are editable copies of proposals. This API allows you to edit proposal data privately before publishing.

### Available Operations

* [createProposalDraft](#createproposaldraft) - Beta - Create Proposal Draft

## createProposalDraft

Creates a new proposal draft.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createProposalDraft" method="post" path="/proposal-drafts" -->
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
  const result = await cventSDK.proposalDraft.createProposalDraft({
    scpTemplateId: "a633b01c-e461-4cc2-8c66-8ae036115658",
    supplierSummary: {
      supplier: {
        type: "VENUE",
      },
    },
    rfpSummary: {
      id: "385b9a4c-3f00-4b67-99ca-8dddc82a95b5",
    },
    eventSummary: {
      id: "bedc1f8e-f68b-40cf-b901-487e407f637a",
    },
    statusSummary: {
      reason: "Other",
      comment: "Not as per requirement",
    },
    introduction: "Let us design the day of your dreams at our property.",
    commissionableBid: true,
    commissionRate: 10.12,
    name: "Proposal for Royal Bank of Spain.",
    blockCode: "ABDCFD-234535-3535",
    proposalDates: [
      {
        startDate: new RFCDate("2021-01-13"),
        endDate: new RFCDate("2021-01-13"),
      },
    ],
    sleepingRooms: [
      {
        checkInDate: new RFCDate("2021-01-13"),
        checkOutDate: new RFCDate("2021-01-13"),
        peakRoomNights: 2,
        totalRoomNights: 200,
        lowestRate: 140,
        maximumRate: 200,
        lowestAverageDailyRate: 140,
        highestAverageDailyRate: 200,
        totalRoomCost: 300,
        budgetedRoomRate: 135,
        lowestAvailableRoomCount: 10,
        highestAvailableRoomCount: 10,
        notes: "Premier Suite not available for the selected dates.",
        sleepingRoomBlocks: [
          {
            date: new RFCDate("2021-01-13"),
            quantity: 20,
            rate: 150,
          },
        ],
      },
    ],
    aggregatedCost: {
      totalFoodAndBeverageCost: 396.56,
      totalMiscCost: 644.96,
    },
    estimatedCost: {
      guestRoom: 100,
      meetingRoom: 10,
      foodAndBeverage: 100,
      foodAndBeverageMinimum: 10,
      notes: "Estimated cost includes taxes.",
    },
    contacts: [
      {
        firstName: "Saurabh",
        lastName: "Sachdeva",
        organizationWebsite: "www.cvent.com",
        organization: "Cvent",
        title: "Co-founder",
        email: "saurabhsachdeva@xyz.com",
        countryCode: "1",
        phone: "198752236",
        fax: "2487234567",
        mobile: "2487649053",
        streetAddress1: "299 ABC Street",
        streetAddress2: "Unit 1A",
        streetAddress3: "Seattle, Washington",
        city: "Seattle",
        postalCode: "110079",
        notes: "Available between 8am - 5pm.",
      },
    ],
    plannerContacts: [
      {
        firstName: "Saurabh",
        lastName: "Sachdeva",
        organizationWebsite: "www.cvent.com",
        organization: "Cvent",
        title: "Co-founder",
        email: "saurabhsachdeva@xyz.com",
        countryCode: "1",
        phone: "198752236",
        fax: "2487234567",
        mobile: "2487649053",
        streetAddress1: "299 ABC Street",
        streetAddress2: "Unit 1A",
        streetAddress3: "Seattle, Washington",
        city: "Seattle",
        postalCode: "110079",
        notes: "Available between 8am - 5pm.",
      },
    ],
    meetingRoom: {
      notes: "This meeting room has the best audio quality.",
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
import { proposalDraftCreateProposalDraft } from "@cvent/sdk/funcs/proposalDraftCreateProposalDraft.js";
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
  const res = await proposalDraftCreateProposalDraft(cventSDK, {
    scpTemplateId: "a633b01c-e461-4cc2-8c66-8ae036115658",
    supplierSummary: {
      supplier: {
        type: "VENUE",
      },
    },
    rfpSummary: {
      id: "385b9a4c-3f00-4b67-99ca-8dddc82a95b5",
    },
    eventSummary: {
      id: "bedc1f8e-f68b-40cf-b901-487e407f637a",
    },
    statusSummary: {
      reason: "Other",
      comment: "Not as per requirement",
    },
    introduction: "Let us design the day of your dreams at our property.",
    commissionableBid: true,
    commissionRate: 10.12,
    name: "Proposal for Royal Bank of Spain.",
    blockCode: "ABDCFD-234535-3535",
    proposalDates: [
      {
        startDate: new RFCDate("2021-01-13"),
        endDate: new RFCDate("2021-01-13"),
      },
    ],
    sleepingRooms: [
      {
        checkInDate: new RFCDate("2021-01-13"),
        checkOutDate: new RFCDate("2021-01-13"),
        peakRoomNights: 2,
        totalRoomNights: 200,
        lowestRate: 140,
        maximumRate: 200,
        lowestAverageDailyRate: 140,
        highestAverageDailyRate: 200,
        totalRoomCost: 300,
        budgetedRoomRate: 135,
        lowestAvailableRoomCount: 10,
        highestAvailableRoomCount: 10,
        notes: "Premier Suite not available for the selected dates.",
        sleepingRoomBlocks: [
          {
            date: new RFCDate("2021-01-13"),
            quantity: 20,
            rate: 150,
          },
        ],
      },
    ],
    aggregatedCost: {
      totalFoodAndBeverageCost: 396.56,
      totalMiscCost: 644.96,
    },
    estimatedCost: {
      guestRoom: 100,
      meetingRoom: 10,
      foodAndBeverage: 100,
      foodAndBeverageMinimum: 10,
      notes: "Estimated cost includes taxes.",
    },
    contacts: [
      {
        firstName: "Saurabh",
        lastName: "Sachdeva",
        organizationWebsite: "www.cvent.com",
        organization: "Cvent",
        title: "Co-founder",
        email: "saurabhsachdeva@xyz.com",
        countryCode: "1",
        phone: "198752236",
        fax: "2487234567",
        mobile: "2487649053",
        streetAddress1: "299 ABC Street",
        streetAddress2: "Unit 1A",
        streetAddress3: "Seattle, Washington",
        city: "Seattle",
        postalCode: "110079",
        notes: "Available between 8am - 5pm.",
      },
    ],
    plannerContacts: [
      {
        firstName: "Saurabh",
        lastName: "Sachdeva",
        organizationWebsite: "www.cvent.com",
        organization: "Cvent",
        title: "Co-founder",
        email: "saurabhsachdeva@xyz.com",
        countryCode: "1",
        phone: "198752236",
        fax: "2487234567",
        mobile: "2487649053",
        streetAddress1: "299 ABC Street",
        streetAddress2: "Unit 1A",
        streetAddress3: "Seattle, Washington",
        city: "Seattle",
        postalCode: "110079",
        notes: "Available between 8am - 5pm.",
      },
    ],
    meetingRoom: {
      notes: "This meeting room has the best audio quality.",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("proposalDraftCreateProposalDraft failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.ProposalRequest](../../models/components/proposalrequest.md)                                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.CreateProposalDraftResponse](../../models/operations/createproposaldraftresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |