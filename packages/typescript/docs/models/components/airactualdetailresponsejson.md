# AirActualDetailResponseJson

Representation of an air actual detail response.

## Example Usage

```typescript
import { AirActualDetailResponseJson } from "@cvent/sdk/models/components";

let value: AirActualDetailResponseJson = {
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  airActualDetails: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      airActualId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      requesterId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      status: "SUBMITTED",
      requesterType: "Contact",
      name: "John Doe",
      confirmationNumber: "123-456-XYZ",
      totalAmount: 500,
      currencyCode: "USD",
      note: "Additional note here.",
      recordLocatorGDS: "ABC123",
      noteGDS: "GDS note.",
      flightDetail: [
        {
          airline: "Emirates",
          flightNumber: "EK 516",
          origin: "Delhi - Indira Gandhi Intl - (DEL)",
          originCode: "DEL",
          destination: "New York - John F Kennedy Intl - (JFK)",
          destinationCode: "JFK",
          departing: new Date("2023-05-19T00:00:00"),
          arriving: new Date("2023-05-19T00:00:00"),
          seatNumber: "21A",
          ticketClass: "coach",
          flightConfirmationNumber: "123-456-XYZ",
          flightGDSRecordLocator: "ABC123",
          journeySegment: "LeavingEvent",
        },
      ],
      airActualAnswers: [
        {
          question: {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          },
          value: [
            "1234",
          ],
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `attendee`                                                             | [components.AttendeeJson4](../../models/components/attendeejson4.md)   | :heavy_minus_sign:                                                     | Representation of the attendee                                         |
| `airActualDetails`                                                     | [components.AirActualJson](../../models/components/airactualjson.md)[] | :heavy_minus_sign:                                                     | List of air actual details for the attendee and its guest.             |