# ReservationRequestInput

Contains information about reservation request record.

## Example Usage

```typescript
import { ReservationRequestInput } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ReservationRequestInput = {
  sourceId: "Ext ack number",
  attendeeTypeCode: "MVFBES0320484",
  locale: "es-DO",
  housingEvent: {
    id: 69121314,
  },
  attendeeType: {
    id: 34549966,
  },
  roomType: {
    id: 11549984,
  },
  hotel: {
    id: 49543342,
  },
  sendAcknowledgement: true,
  splitFolio: false,
  redirectURL: "https://cvent.com",
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
      },
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
};
```

## Fields

| Field                                                                                                                                                                                                                     | Type                                                                                                                                                                                                                      | Required                                                                                                                                                                                                                  | Description                                                                                                                                                                                                               | Example                                                                                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sourceId`                                                                                                                                                                                                                | *string*                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | Optional ID field you can use to attach ID's from your system to a reservation.                                                                                                                                           | Ext ack number                                                                                                                                                                                                            |
| `attendeeTypeCode`                                                                                                                                                                                                        | *string*                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | Attendee Type Code. If attendeeType is also included, the ID is used and this code is ignored.                                                                                                                            | MVFBES0320484                                                                                                                                                                                                             |
| `locale`                                                                                                                                                                                                                  | *string*                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | Locale code in IETF language tag format.                                                                                                                                                                                  | es-DO                                                                                                                                                                                                                     |
| `housingEvent`                                                                                                                                                                                                            | [components.HousingEventIdJson](../../models/components/housingeventidjson.md)                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                        | Contains unique ID of the housing event.                                                                                                                                                                                  |                                                                                                                                                                                                                           |
| ~~`block`~~                                                                                                                                                                                                               | [components.ReservationRequestBlock](../../models/components/reservationrequestblock.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible.<br/><br/>Information about room block. DEPRECATED - use combination of attendeeType and roomType instead. |                                                                                                                                                                                                                           |
| `attendeeType`                                                                                                                                                                                                            | [components.AttendeeTypeIdJson](../../models/components/attendeetypeidjson.md)                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                        | Contains the unique ID of the attendee type.                                                                                                                                                                              |                                                                                                                                                                                                                           |
| `roomType`                                                                                                                                                                                                                | [components.RoomTypeIdJson](../../models/components/roomtypeidjson.md)                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                        | Contains unique ID of the room type.                                                                                                                                                                                      |                                                                                                                                                                                                                           |
| `hotel`                                                                                                                                                                                                                   | [components.HotelIdJson](../../models/components/hotelidjson.md)                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                        | Contains unique ID of the hotel.                                                                                                                                                                                          |                                                                                                                                                                                                                           |
| `sendAcknowledgement`                                                                                                                                                                                                     | *boolean*                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                        | True indicates the system will send email acknowledgement after reservation creation.                                                                                                                                     | true                                                                                                                                                                                                                      |
| `splitFolio`                                                                                                                                                                                                              | *boolean*                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                        | True indicates if each guest should have own payment.                                                                                                                                                                     | false                                                                                                                                                                                                                     |
| `redirectURL`                                                                                                                                                                                                             | *string*                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | URL used to redirect a guest to another site after they create or update their reservation (commonly, back to the registration event).                                                                                    | https://cvent.com                                                                                                                                                                                                         |
| `guests`                                                                                                                                                                                                                  | [components.GuestJson](../../models/components/guestjson.md)[]                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                        | Guests information.                                                                                                                                                                                                       |                                                                                                                                                                                                                           |
| `customFields`                                                                                                                                                                                                            | [components.CustomFieldsJson](../../models/components/customfieldsjson.md)                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                        | Custom fields.                                                                                                                                                                                                            | {<br/>"customField1": "CustomField1",<br/>"customField2": "CustomField2",<br/>"customField3": "CustomField3",<br/>"customField4": "CustomField4",<br/>"customField5": "CustomField5",<br/>"customField6": "CustomField6"<br/>} |
| `accessible`                                                                                                                                                                                                              | *boolean*                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                        | True indicates this reservation request is for an accessible room.                                                                                                                                                        | false                                                                                                                                                                                                                     |
| `specialRequest`                                                                                                                                                                                                          | *string*                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | Special requests for room.                                                                                                                                                                                                | Double bed                                                                                                                                                                                                                |
| `rewardProgram`                                                                                                                                                                                                           | [components.RewardProgramJson](../../models/components/rewardprogramjson.md)                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                        | Represents reward program information.                                                                                                                                                                                    |                                                                                                                                                                                                                           |
| `membershipId`                                                                                                                                                                                                            | *string*                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                        | Reward program membership number.                                                                                                                                                                                         | 1154example                                                                                                                                                                                                               |
| `travelDetails`                                                                                                                                                                                                           | [components.TravelDetailsJson](../../models/components/traveldetailsjson.md)                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                        | Common object that holds travel details information.                                                                                                                                                                      |                                                                                                                                                                                                                           |