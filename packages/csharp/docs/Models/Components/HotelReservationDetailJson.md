# HotelReservationDetailJson

Representation of a hotel reservation detail response.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Attendee`                                                            | [AttendeeJson4](../../Models/Components/AttendeeJson4.md)             | :heavy_minus_sign:                                                    | Representation of the attendee                                        |
| `HotelRequestDetails`                                                 | List<[HotelRequestJson](../../Models/Components/HotelRequestJson.md)> | :heavy_minus_sign:                                                    | List of all the hotel requests by attendee and its guest.             |