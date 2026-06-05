# AirReservationDetail1

Representation of an air reservation detail response.


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `attendee`                                                   | [Optional\<Attendee3>](../../models/components/Attendee3.md) | :heavy_minus_sign:                                           | Representation of the attendee                               |
| `airRequestDetails`                                          | List\<[AirRequest](../../models/components/AirRequest.md)>   | :heavy_minus_sign:                                           | List of all air request by attendee and its guest.           |