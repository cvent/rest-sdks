# ReservationsPaginatedResponse

Details list about existing reservations.

## Example Usage

```typescript
import { ReservationsPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ReservationsPaginatedResponse = {
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
      id: "327RVMXT",
      confirmationNumber: "327RVMXT",
      hotelConfirmationNumber: "442173430305",
      reservationRequest: {
        id: "D6A63423-G796",
        externalId: "1239350605",
      },
      attendeeTypeCode: "MVFBES0320484",
      attendeeType: {
        id: 34549966,
      },
      roomType: {
        id: 11549984,
        name: "King",
      },
      splitFolio: false,
      startDate: new Date("2024-12-01T00:00:00Z"),
      endDate: new Date("2024-12-06T00:00:00Z"),
      numberOfAdults: 2,
      numberOfChildren: 1,
      nights: [
        {
          stayDate: new RFCDate("2024-12-01"),
          status: "confirmed",
          hideRates: false,
          rate: {
            base: 150,
            currency: "USD",
            additionalGuestFees: [
              {
                guestCount: 2,
                fee: 20,
              },
            ],
            displayRate: 150,
          },
        },
      ],
      guests: [],
      customFields: {
        customField1: "CustomField1",
        customField2: "CustomField2",
        customField3: "CustomField3",
        customField4: "CustomField4",
        customField5: "CustomField5",
        customField6: "CustomField6",
      },
      accessible: false,
      specialRequest: "Double bed",
      cancelled: new Date("2024-12-01T00:00:00Z"),
      rewardProgram: {
        id: 10000,
        name: "Test name",
      },
      membershipId: "1154example",
      travelDetails: {
        arrival: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        departure: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        additionalInformation: "Additional Information",
      },
      housingEvent: {
        id: 69121314,
      },
      hotel: {
        id: 49543342,
        name: "Northern Hotel",
      },
      totalCharges: {
        amountBeforeTax: 750,
        taxes: 50,
        totalGuestFees: 50,
        totalAddons: 30,
        amountAfterTax: 800,
        totalAmount: 830,
        currency: "USD",
      },
      bookingSite: {
        href:
          "https://book.passkey.com/entry?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7ImVudHJ5IjoiUkVHSVNUUkFUSU9OIiwicGFyYW1zIjpbeyJuYW1lIjoiYnJpZGdlSWQiLCJ2YWx1ZSI6IlQ3VFdNTEhQLUdFNEQifV19fQ.7sH1gO_1Aambk-SRRlO2c7ac2DOpqLmCB-zsxB71q_A",
      },
      callCenter: {
        href:
          "https://manage.passkey.com/Login?src=api&redirect=ccbridge&regacknumber=WODS7LK4-GA8C",
      },
      bookingContact: {
        id: "323CZK3H",
      },
      addOns: [
        {
          id: 43454324455,
          name: "Fresh Towels",
          rate: {
            base: 15,
            currency: "USD",
          },
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [components.PagingJson](../../models/components/pagingjson.md)                     | :heavy_minus_sign:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | [components.ExistingReservation](../../models/components/existingreservation.md)[] | :heavy_minus_sign:                                                                 | List of reservation details.                                                       |