# AvailableNightJson

Night availability details.

## Example Usage

```typescript
import { AvailableNightJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: AvailableNightJson = {
  hotel: {
    id: 49543342,
  },
  roomType: {
    id: 11549984,
  },
  attendeeType: {
    id: 34549966,
    name: "Staff",
    codes: [
      "PEWATT0524317",
    ],
  },
  date: new RFCDate("2025-03-25"),
  quantity: 130,
  roomRate: 150,
  displayRate: 150,
  additionalGuestFees: [
    {
      guestCount: 2,
      fee: 20,
    },
  ],
  taxStructure: {
    disclosureStatement:
      "Total room charges will include all room fees and taxes (Subject to change).",
    items: [],
  },
  currency: "USD",
  maxGuests: 2,
  minLengthOfStay: 1,
  hideRate: false,
  waitListEnabled: false,
};
```

## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `hotel`                                                                                                     | [components.HotelIdJson](../../models/components/hotelidjson.md)                                            | :heavy_check_mark:                                                                                          | Contains unique ID of the hotel.                                                                            |                                                                                                             |
| `roomType`                                                                                                  | [components.RoomTypeIdJson](../../models/components/roomtypeidjson.md)                                      | :heavy_check_mark:                                                                                          | Contains unique ID of the room type.                                                                        |                                                                                                             |
| `attendeeType`                                                                                              | [components.AttendeeTypeJson](../../models/components/attendeetypejson.md)                                  | :heavy_check_mark:                                                                                          | Attendee type details.                                                                                      |                                                                                                             |
| `date`                                                                                                      | [RFCDate](../../types/rfcdate.md)                                                                           | :heavy_check_mark:                                                                                          | Date the rooms are available.                                                                               | 2025-03-25                                                                                                  |
| `quantity`                                                                                                  | *number*                                                                                                    | :heavy_check_mark:                                                                                          | Number of rooms available.                                                                                  | 130                                                                                                         |
| `roomRate`                                                                                                  | *number*                                                                                                    | :heavy_check_mark:                                                                                          | Cost of room per night booked.                                                                              | 150                                                                                                         |
| `displayRate`                                                                                               | *number*                                                                                                    | :heavy_minus_sign:                                                                                          | The room rate displayed to guests, which includes any fees configured to display in the hotel tax settings. | 150                                                                                                         |
| `additionalGuestFees`                                                                                       | [components.AdditionalGuestFeesJson](../../models/components/additionalguestfeesjson.md)[]                  | :heavy_minus_sign:                                                                                          | List of additional guest fees.                                                                              |                                                                                                             |
| `taxStructure`                                                                                              | [components.TaxStructureJson](../../models/components/taxstructurejson.md)                                  | :heavy_minus_sign:                                                                                          | Details about taxes and fees applicable to a room.                                                          |                                                                                                             |
| `currency`                                                                                                  | *string*                                                                                                    | :heavy_check_mark:                                                                                          | ISO 4217 currency code.                                                                                     | USD                                                                                                         |
| `maxGuests`                                                                                                 | *number*                                                                                                    | :heavy_minus_sign:                                                                                          | Maximum number of guests the room can accommodate.                                                          | 2                                                                                                           |
| `minLengthOfStay`                                                                                           | *number*                                                                                                    | :heavy_check_mark:                                                                                          | Minimum number of nights required for a stay.                                                               | 1                                                                                                           |
| `hideRate`                                                                                                  | *boolean*                                                                                                   | :heavy_check_mark:                                                                                          | True indicates the cost of the room is hidden from attendees on the booking site.                           | false                                                                                                       |
| `waitListEnabled`                                                                                           | *boolean*                                                                                                   | :heavy_check_mark:                                                                                          | True indicates a waitlist is enabled for this night.                                                        | false                                                                                                       |