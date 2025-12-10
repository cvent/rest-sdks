# CreateProposalDraftResponse

## Example Usage

```typescript
import { CreateProposalDraftResponse } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: CreateProposalDraftResponse = {
  headers: {
    "key": [],
    "key1": [
      "<value 1>",
      "<value 2>",
    ],
  },
  result: {
    created: new Date("2017-01-02T02:00:00Z"),
    createdBy: "hporter",
    lastModified: new Date("2019-02-12T03:00:00Z"),
    lastModifiedBy: "hporter",
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
    transaction: {
      id: "cf5fd2cc-3d09-11ee-be56-0242ac120002",
      time: new Date("2023-02-12T03:00:00Z"),
    },
    id: "cf5fd2cc-3d09-11ee-be56-0242ac120002",
    proposalCode: "P230810-G7T9DR",
    version: 1,
    lastSubmittedTime: new Date("2023-02-12T03:00:00Z"),
    responseReason: "BOOKED_ANOTHER_VENUE_DESTINATION",
    responseDetails: "The location is far from the event venue.",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `headers`                                                                  | Record<string, *string*[]>                                                 | :heavy_check_mark:                                                         | N/A                                                                        |
| `result`                                                                   | [components.ProposalResponse](../../models/components/proposalresponse.md) | :heavy_check_mark:                                                         | N/A                                                                        |