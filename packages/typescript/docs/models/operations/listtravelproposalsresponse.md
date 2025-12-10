# ListTravelProposalsResponse

## Example Usage

```typescript
import { ListTravelProposalsResponse } from "@cvent/sdk/models/operations";

let value: ListTravelProposalsResponse = {
  result: {
    paging: {
      previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
      nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
      currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
      limit: 100,
      totalCount: 2,
      links: {
        next: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        self: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        prev: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
    },
    data: [
      {
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        id: "3e2a8614-7d52-442e-8c4f-a6a18ed9ac4d",
        supplierProperty: {
          id: "a1c79ba8-9553-4fb0-80bd-66adac1b2f5d",
        },
        travelProgram: {
          id: "ddc61444-45c7-4e1d-9fdd-07713c8baf9b",
        },
        contractPeriod: 2021,
        status: "account_accepted",
        businessType: "corporate",
        format: "gbta2013",
        rejectReasonCode: "Other",
        rejectComment: "other reasons",
        submitDate: new Date("2030-02-10T00:00:00.000Z"),
        negotiationRound: 1,
        negotiationDueDate: new Date("2030-02-10T00:00:00.000Z"),
        roomNightConsumption: 100,
        bids: [
          {
            id: "1c208c0d-cf96-42ec-a2c3-7ab7a5c04825",
          },
        ],
        customQuestionAnswers: [
          {
            question: {
              id: "565ceabb-786a-4a6d-8c85-e2fccc867e88",
            },
            answer: "No.",
          },
        ],
        groupAndMeeting: {
          runOfHouseRate: {
            seasonOne10To50People: 100,
            seasonOne51To100People: 200,
            seasonTwo10To50People: 300,
            seasonTwo51To100People: 400,
            seasonThree10To50People: 500,
            seasonThree51To100People: 600,
            seasonFour10To50People: 700,
            seasonFour51To100People: 800,
            seasonFive10To50People: 900,
            seasonFive51To100People: 1000,
          },
          dayDelegateRate: {
            fullDay10To50People: 100,
            fullDay51To100People: 200,
            halfDay10To50People: 50,
            halfDay51To100People: 100,
          },
          taxAndServiceCharge: {
            taxAmount: 0,
            serviceChargeAmount: 1,
          },
          meetingRoomBasicInformation: {
            largestMeetingRoom: 1000,
            unitOfMeasurement: "sq.ft.",
            meetingRooms: 10,
          },
          amenity: {
            lcdPrice: 100,
            screenPrice: 100,
            hsiaPrice: 100,
            whatCompanyProvidesAVEquipment: "Some company",
          },
          breakOutRoom: {
            price10PersonRoom: 100,
            price25PersonRoom: 100,
          },
        },
        proposalDisposition: {
          bidDispositions: [
            {
              bid: {
                id: "1c208c0d-cf96-42ec-a2c3-7ab7a5c04825",
              },
              acceptedBidRooms: [
                {
                  propertyRoom: {
                    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                  },
                  lraRateAccepted: true,
                  nlraRateAccepted: true,
                },
              ],
            },
          ],
          groupAndMeetingAccepted: true,
        },
      },
    ],
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                 | [components.TravelProposalPaginatedResponse](../../models/components/travelproposalpaginatedresponse.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |