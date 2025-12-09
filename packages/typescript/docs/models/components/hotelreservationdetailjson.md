# HotelReservationDetailJson

Representation of a hotel reservation detail response.

## Example Usage

```typescript
import { HotelReservationDetailJson } from "@cvent/sdk/models/components";

let value: HotelReservationDetailJson = {
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  hotelRequestDetails: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      hotelRequestId: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      requesterId: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      requesterType: "Contact",
      requesterFirstName: "John",
      requesterLastName: "Doe",
      hotelName: "Fairmont Chicago",
      hotelCode: "6BNMSHJFSRP",
      roomName: "Deluxe Room",
      roomCode: "6BNMSHJFSR",
      quantity: 1,
      roommateRequested: "Will Doe",
      specialRequest: "Please provide early check-in.",
      rewardsCode: "ROYALTY",
      checkinDate: new Date("2023-05-19T00:00:00"),
      checkoutDate: new Date("2023-05-20T00:00:00"),
      status: "SUBMITTED",
      confirmationNumber: "CONFIRM_123",
      gender: "Male",
      totalAmount: 500,
      currencyCode: "USD",
      roomTaxBillingInstructions: "tax instructions",
      incidentalBillingInstructions: "billing instructions",
      plannerMemo: "Planner's notes here.",
      earliestShoulderDate: new Date("2023-05-19T00:00:00"),
      latestShoulderDate: new Date("2023-05-19T00:00:00"),
      roomTaxBillingExceptions: "exceptions noted here.",
      incidentalBillingExceptions: "exceptions noted here.",
      hotelAddress: {
        address1: "Cvent Inc.",
        address2: "4001 West Parmer Lane",
        address3: "PO Box 123",
        city: "Austin",
        countryCode: "US",
        postalCode: "78727",
        region: "Texas",
        regionCode: "TX",
        country: "United States of America",
      },
      hotelRoomRates: [
        {
          roomNight: new Date("2023-05-19T00:00:00"),
          roomRate: 100,
        },
      ],
      hotelRequestAnswers: [
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

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `attendee`                                                                   | [components.AttendeeJson4](../../models/components/attendeejson4.md)         | :heavy_minus_sign:                                                           | Representation of the attendee                                               |
| `hotelRequestDetails`                                                        | [components.HotelRequestJson](../../models/components/hotelrequestjson.md)[] | :heavy_minus_sign:                                                           | List of all the hotel requests by attendee and its guest.                    |