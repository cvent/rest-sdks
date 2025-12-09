# HotelReservationDetailJson

Representation of a hotel reservation detail response.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `attendee`                                                             | [Optional\<AttendeeJson4>](../../models/components/AttendeeJson4.md)   | :heavy_minus_sign:                                                     | Representation of the attendee                                         |
| `hotelRequestDetails`                                                  | List\<[HotelRequestJson](../../models/components/HotelRequestJson.md)> | :heavy_minus_sign:                                                     | List of all the hotel requests by attendee and its guest.              |