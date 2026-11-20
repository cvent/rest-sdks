# HotelReservationDetail1

Hotel request details for an attendee and any guest.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `Attendee`                                                    | [Attendee3](../../Models/Components/Attendee3.md)             | :heavy_minus_sign:                                            | An attendee identified by an ID.                              |
| `HotelRequestDetails`                                         | List<[HotelRequest](../../Models/Components/HotelRequest.md)> | :heavy_minus_sign:                                            | List of all the hotel requests by attendee and its guest.     |