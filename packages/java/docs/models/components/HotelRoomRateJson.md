# HotelRoomRateJson

Representation of a hotel room rate


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `roomNight`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The ISO 8601 date-time (in UTC) of the night for which the room has been booked.          | 2023-05-19T00:00:00                                                                       |
| `roomRate`                                                                                | *Optional\<Double>*                                                                       | :heavy_minus_sign:                                                                        | The nightly rate at which the room has been booked.                                       | 100                                                                                       |