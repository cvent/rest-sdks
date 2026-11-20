# AirReservationDetail1

Air request details for an attendee and any guest.


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `attendee`                                                   | [Optional\<Attendee3>](../../models/components/Attendee3.md) | :heavy_minus_sign:                                           | An attendee identified by an ID.                             |
| `airRequestDetails`                                          | List\<[AirRequest](../../models/components/AirRequest.md)>   | :heavy_minus_sign:                                           | List of all air request by attendee and its guest.           |