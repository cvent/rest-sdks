# HotelRoomRateJson

Representation of a hotel room rate


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `RoomNight`                                                                           | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_minus_sign:                                                                    | The ISO 8601 date-time (in UTC) of the night for which the room has been booked.      | 2023-05-19T00:00:00                                                                   |
| `RoomRate`                                                                            | *double*                                                                              | :heavy_minus_sign:                                                                    | The nightly rate at which the room has been booked.                                   | 100                                                                                   |