# AirReservationDetailJson

Representation of an air reservation detail response.

## Example Usage

```typescript
import { AirReservationDetailJson } from "@cvent/sdk/models/components";

let value: AirReservationDetailJson = {
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  airRequestDetails: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      airRequestId: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      requesterId: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      requesterType: "Contact",
      requesterFirstName: "John",
      requesterMiddleName: "Frances",
      requesterLastName: "Doe",
      requesterSuffix: "Jr.",
      fullName: "John Doe",
      redressNumber: "1234567",
      knownTravelerNumber: "1234567",
      outgoingLeg: {
        origin: "Delhi - Indira Gandhi Intl - (DEL)",
        destination: "Dubai - International (DXB)",
        date: new Date("2023-05-19T00:00:00"),
        time: "Morning",
      },
      incomingLeg: {
        origin: "Delhi - Indira Gandhi Intl - (DEL)",
        destination: "Dubai - International (DXB)",
        date: new Date("2023-05-19T00:00:00"),
        time: "Morning",
      },
      ticketType: "Economy/Coach",
      foodPreference: "Please provide vegetarian meal.",
      specialRequest: "Please provide blanket",
      airlinePreference: [
        {
          airlineName: "Emirates",
          rewardsCode: "REWARDS_ONE",
        },
      ],
      ageCategory: "Adult",
      status: "SUBMITTED",
      dateOfBirth: "1980-03-04",
      gender: "Male",
      plannerMemo: "Some planner related text.",
      airRequestAnswers: [
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

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `attendee`                                                               | [components.AttendeeJson4](../../models/components/attendeejson4.md)     | :heavy_minus_sign:                                                       | Representation of the attendee                                           |
| `airRequestDetails`                                                      | [components.AirRequestJson](../../models/components/airrequestjson.md)[] | :heavy_minus_sign:                                                       | List of all air request by attendee and its guest.                       |