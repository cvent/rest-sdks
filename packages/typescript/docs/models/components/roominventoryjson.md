# RoomInventoryJson

Room inventory details for single night.

## Example Usage

```typescript
import { RoomInventoryJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: RoomInventoryJson = {
  hideRates: false,
  rate: {
    base: 150,
    currency: "USD",
  },
  originalBlock: 100,
  currentBlock: 150,
  pickup: 50,
  finalPickup: 45,
  maxGuests: 2,
  minLengthOfStay: 1,
  waitListRequests: 1,
  available: 30,
  housingEvent: {
    id: 69121314,
  },
  hotel: {
    id: 49543342,
  },
  roomType: {
    id: 11549984,
  },
  date: new RFCDate("2024-12-01"),
  freeSell: 80,
  unassigned: 20,
  allocation: [
    {
      hideRates: false,
      rate: {
        base: 150,
        currency: "USD",
      },
      originalBlock: 100,
      currentBlock: 150,
      pickup: 50,
      finalPickup: 45,
      maxGuests: 2,
      minLengthOfStay: 1,
      waitListRequests: 1,
      available: 30,
      attendeeType: {
        id: 34549966,
      },
      openForReservation: true,
      freeSellEnabled: true,
      sellHighestRate: false,
      waitListEnabled: false,
      guaranteed: true,
      arrivals: 10,
    },
  ],
};
```

## Fields

| Field                                                                                                                                                           | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     | Example                                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `hideRates`                                                                                                                                                     | *boolean*                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                              | Indicates if rates are hidden on booking site for this night.                                                                                                   | false                                                                                                                                                           |
| `rate`                                                                                                                                                          | [components.NightRateJson](../../models/components/nightratejson.md)                                                                                            | :heavy_check_mark:                                                                                                                                              | Rate details for single night.                                                                                                                                  |                                                                                                                                                                 |
| `originalBlock`                                                                                                                                                 | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Number of inventory blocked on event creation.                                                                                                                  | 100                                                                                                                                                             |
| `currentBlock`                                                                                                                                                  | *number*                                                                                                                                                        | :heavy_check_mark:                                                                                                                                              | Current inventory number.                                                                                                                                       | 150                                                                                                                                                             |
| `pickup`                                                                                                                                                        | *number*                                                                                                                                                        | :heavy_check_mark:                                                                                                                                              | Number of rooms sold.                                                                                                                                           | 50                                                                                                                                                              |
| `finalPickup`                                                                                                                                                   | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Reported number of sold rooms.                                                                                                                                  | 45                                                                                                                                                              |
| `maxGuests`                                                                                                                                                     | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Maximum number of guests the room can accommodate.                                                                                                              | 2                                                                                                                                                               |
| `minLengthOfStay`                                                                                                                                               | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Minimum number nights of stay when starting from this night.                                                                                                    | 1                                                                                                                                                               |
| `waitListRequests`                                                                                                                                              | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Number of reservations in wait list.                                                                                                                            | 1                                                                                                                                                               |
| `available`                                                                                                                                                     | *number*                                                                                                                                                        | :heavy_check_mark:                                                                                                                                              | Number of unsold rooms.                                                                                                                                         | 30                                                                                                                                                              |
| `housingEvent`                                                                                                                                                  | [components.HousingEventIdJson](../../models/components/housingeventidjson.md)                                                                                  | :heavy_check_mark:                                                                                                                                              | Contains unique ID of the housing event.                                                                                                                        |                                                                                                                                                                 |
| `hotel`                                                                                                                                                         | [components.HotelIdJson](../../models/components/hotelidjson.md)                                                                                                | :heavy_check_mark:                                                                                                                                              | Contains unique ID of the hotel.                                                                                                                                |                                                                                                                                                                 |
| `roomType`                                                                                                                                                      | [components.RoomIdJson](../../models/components/roomidjson.md)                                                                                                  | :heavy_check_mark:                                                                                                                                              | Contains unique ID of the room.                                                                                                                                 |                                                                                                                                                                 |
| `date`                                                                                                                                                          | [RFCDate](../../types/rfcdate.md)                                                                                                                               | :heavy_check_mark:                                                                                                                                              | Inventory date.                                                                                                                                                 | 2024-12-01                                                                                                                                                      |
| `freeSell`                                                                                                                                                      | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Number of inventory that can be sold to any attendee type.                                                                                                      | 80                                                                                                                                                              |
| `unassigned`                                                                                                                                                    | *number*                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                              | Number of unassigned inventory. Inventory left in unassigned will not be sold until allocated to an attendee type or marked for free-sell to any attendee type. | 20                                                                                                                                                              |
| `allocation`                                                                                                                                                    | [components.AttendeeInventoryJson](../../models/components/attendeeinventoryjson.md)[]                                                                          | :heavy_minus_sign:                                                                                                                                              | Inventory allocation by attendee type.                                                                                                                          |                                                                                                                                                                 |