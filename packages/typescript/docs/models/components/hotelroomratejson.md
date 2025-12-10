# HotelRoomRateJson

Representation of a hotel room rate

## Example Usage

```typescript
import { HotelRoomRateJson } from "@cvent/sdk/models/components";

let value: HotelRoomRateJson = {
  roomNight: new Date("2023-05-19T00:00:00"),
  roomRate: 100,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `roomNight`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 date-time (in UTC) of the night for which the room has been booked.              | 2023-05-19T00:00:00                                                                           |
| `roomRate`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | The nightly rate at which the room has been booked.                                           | 100                                                                                           |