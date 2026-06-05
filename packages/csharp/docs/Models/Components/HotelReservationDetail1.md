# HotelReservationDetail1

Representation of a hotel reservation detail response.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `Attendee`                                                    | [Attendee3](../../Models/Components/Attendee3.md)             | :heavy_minus_sign:                                            | Representation of the attendee                                |
| `HotelRequestDetails`                                         | List<[HotelRequest](../../Models/Components/HotelRequest.md)> | :heavy_minus_sign:                                            | List of all the hotel requests by attendee and its guest.     |