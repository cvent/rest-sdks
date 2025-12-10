# UpdateReservationSyncRequest

## Example Usage

```typescript
import { UpdateReservationSyncRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateReservationSyncRequest = {
  reservationId: "327S856H",
  newReservation: {
    attendeeType: {
      id: 34549966,
    },
    roomType: {
      id: 11549984,
    },
    splitFolio: false,
    numberOfAdults: 2,
    numberOfChildren: 1,
    guests: [
      {
        arrival: new RFCDate("2020-03-05"),
        departure: new RFCDate("2020-03-07"),
        firstName: "Gustav",
        lastName: "Schultz",
        middleName: "Al",
        title: "Dr.",
        position: "manager",
        company: "Test Inc",
        homeFax: "9785674321",
        email: "guest@cvent.com",
        homePhone: "(231)-213-1222",
        workPhone: "(231)-213-1222",
        homeAddress: {
          address1: "West St. 1",
          address2: "Apt. 16",
          city: "Austin",
          region: "Texas",
          regionCode: "TX",
          postalCode: "23452AB",
          country: "United States of America",
          countryCode: "US",
        },
        paymentInfo: {
          fullName: "Gustav Schultz",
          address: {
            address1: "West St. 1",
            address2: "Apt. 16",
            city: "Austin",
            region: "Texas",
            regionCode: "TX",
            postalCode: "23452AB",
            country: "United States of America",
            countryCode: "US",
          },
          phone: "(231)213-1222",
          other: {
            amount: 0,
            paymentDate: new RFCDate("2021-12-31"),
            referenceItem: "Reference Item",
            checkNumber: "Check Num",
            received: false,
            note: "No Comment",
          },
          creditCard: {
            paymentToken: "1234567890",
          },
        },
        primary: true,
        locale: "es-DO",
      },
    ],
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
    },
    modifiers: {
      allowWaitList: true,
    },
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `reservationId`                                                        | *string*                                                               | :heavy_check_mark:                                                     | Cvent Passkey confirmation number.                                     | 327S856H                                                               |
| `newReservation`                                                       | [components.NewReservation](../../models/components/newreservation.md) | :heavy_check_mark:                                                     | Updated reservation data.                                              |                                                                        |