# HotelReservationDetail1

Hotel request details for an attendee and any guest.


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `attendee`                                                     | [Optional\<Attendee3>](../../models/components/Attendee3.md)   | :heavy_minus_sign:                                             | An attendee identified by an ID.                               |
| `hotelRequestDetails`                                          | List\<[HotelRequest](../../models/components/HotelRequest.md)> | :heavy_minus_sign:                                             | List of all the hotel requests by attendee and its guest.      |