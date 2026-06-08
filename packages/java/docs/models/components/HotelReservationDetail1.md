# HotelReservationDetail1

Representation of a hotel reservation detail response.


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `attendee`                                                     | [Optional\<Attendee3>](../../models/components/Attendee3.md)   | :heavy_minus_sign:                                             | Representation of the attendee                                 |
| `hotelRequestDetails`                                          | List\<[HotelRequest](../../models/components/HotelRequest.md)> | :heavy_minus_sign:                                             | List of all the hotel requests by attendee and its guest.      |