# TravelProposal

Represents travel proposals. Travel proposals are created by the travel supplier in response to a travel account's program.

## Example Usage

```typescript
import { TravelProposal } from "@cvent/sdk/models/components";

let value: TravelProposal = {
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
};
```

## Fields

| Field                                                                                                                   | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `created`                                                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                           | :heavy_minus_sign:                                                                                                      | The ISO 8601 zoned date time when this record was created.                                                              | 2017-01-02T02:00:00Z                                                                                                    |
| `createdBy`                                                                                                             | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | The identifier of the user that created this record.                                                                    | hporter                                                                                                                 |
| `lastModified`                                                                                                          | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                           | :heavy_minus_sign:                                                                                                      | The ISO 8601 zoned date time when this record was updated.                                                              | 2019-02-12T03:00:00Z                                                                                                    |
| `lastModifiedBy`                                                                                                        | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | The identifier of the user that last updated this record.                                                               | hporter                                                                                                                 |
| `id`                                                                                                                    | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | The unique ID of the travel proposal.                                                                                   | 3e2a8614-7d52-442e-8c4f-a6a18ed9ac4d                                                                                    |
| `supplierProperty`                                                                                                      | [components.SupplierProperty](../../models/components/supplierproperty.md)                                              | :heavy_minus_sign:                                                                                                      | Supplier property that the proposal is tied to.                                                                         |                                                                                                                         |
| `travelProgram`                                                                                                         | [components.TravelProposalTravelProgram](../../models/components/travelproposaltravelprogram.md)                        | :heavy_minus_sign:                                                                                                      | Travel program that the proposal is in response to.                                                                     |                                                                                                                         |
| `contractPeriod`                                                                                                        | *number*                                                                                                                | :heavy_minus_sign:                                                                                                      | Contract period of the proposal. The year the contract begins.                                                          | 2021                                                                                                                    |
| `status`                                                                                                                | [components.ProposalStatusTypeJson](../../models/components/proposalstatustypejson.md)                                  | :heavy_minus_sign:                                                                                                      | The status of the proposal                                                                                              | account_accepted                                                                                                        |
| `deleted`                                                                                                               | *boolean*                                                                                                               | :heavy_minus_sign:                                                                                                      | True indicates the proposal is deleted.                                                                                 |                                                                                                                         |
| `rateReviewStatus`                                                                                                      | [components.RateReviewStatusTypeJson](../../models/components/ratereviewstatustypejson.md)                              | :heavy_minus_sign:                                                                                                      | The rate review status of the proposal                                                                                  |                                                                                                                         |
| `businessType`                                                                                                          | [components.BusinessTypeJson](../../models/components/businesstypejson.md)                                              | :heavy_minus_sign:                                                                                                      | Business type.                                                                                                          | corporate                                                                                                               |
| `format`                                                                                                                | [components.FormatTypeJson](../../models/components/formattypejson.md)                                                  | :heavy_minus_sign:                                                                                                      | Proposal format.                                                                                                        | gbta2013                                                                                                                |
| `documentRead`                                                                                                          | *boolean*                                                                                                               | :heavy_minus_sign:                                                                                                      | True indicates the documents been read by the supply-side.                                                              |                                                                                                                         |
| `rejectReasonCode`                                                                                                      | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | Reason the reject/decline action was performed. Used for certain actions/statuses.                                      | Other                                                                                                                   |
| `rejectComment`                                                                                                         | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | Comments regarding the reasoning for the reject/decline action. This only comes into play for certain actions/statuses. | other reasons                                                                                                           |
| `submitDate`                                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                           | :heavy_minus_sign:                                                                                                      | The ISO 8601 datetime when proposal was submitted by the hotel.                                                         | 2030-02-10T00:00:00.000Z                                                                                                |
| `negotiationRound`                                                                                                      | *number*                                                                                                                | :heavy_minus_sign:                                                                                                      | The current round of negotiations.                                                                                      | 1                                                                                                                       |
| `negotiationDueDate`                                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                           | :heavy_minus_sign:                                                                                                      | The ISO 8601 datetime when the negotiation response is due.                                                             | 2030-02-10T00:00:00.000Z                                                                                                |
| `roomNightConsumption`                                                                                                  | *number*                                                                                                                | :heavy_minus_sign:                                                                                                      | Client room nights produced at property from January 1 through June 30.                                                 | 100                                                                                                                     |
| `draft`                                                                                                                 | *boolean*                                                                                                               | :heavy_minus_sign:                                                                                                      | True indicates this proposal is a draft copy that is not sent to the other party.                                       |                                                                                                                         |
| `bids`                                                                                                                  | [components.TravelProposalBidIdJson](../../models/components/travelproposalbididjson.md)[]                              | :heavy_minus_sign:                                                                                                      | Collection of bid IDs attached to the proposal.                                                                         |                                                                                                                         |
| `customQuestionAnswers`                                                                                                 | [components.CustomQuestionAnswerJson0](../../models/components/customquestionanswerjson0.md)[]                          | :heavy_minus_sign:                                                                                                      | Collection of custom questions.                                                                                         |                                                                                                                         |
| `groupAndMeeting`                                                                                                       | [components.TravelGroupAndMeetingJson](../../models/components/travelgroupandmeetingjson.md)                            | :heavy_minus_sign:                                                                                                      | Group and meeting information.                                                                                          |                                                                                                                         |
| `proposalDisposition`                                                                                                   | [components.TravelProposalDispositionJson](../../models/components/travelproposaldispositionjson.md)                    | :heavy_minus_sign:                                                                                                      | Represent proposal disposition details.                                                                                 |                                                                                                                         |