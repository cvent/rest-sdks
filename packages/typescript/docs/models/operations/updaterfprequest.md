# UpdateRFPRequest

## Example Usage

```typescript
import { UpdateRFPRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateRFPRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfp: {
    needsMeetingSpace: true,
    needsGuestRooms: false,
    description:
      "Planning to host company's annual event in an outdoor location.",
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
      formatType: "HYBRID",
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
      additionalInformation:
        "Guest rooms will be a mix of IPO and RM&TX to master. Will submit rooming list with billing specified. Credit card will be provided as guarantee.",
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
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `rfpId`                                                    | *string*                                                   | :heavy_check_mark:                                         | The unique identifier of the RFP we are requesting         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                       |
| `rfp`                                                      | [components.RfpInput](../../models/components/rfpinput.md) | :heavy_check_mark:                                         | Request body for updating an RFP.                          |                                                            |