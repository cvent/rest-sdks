# AirReservationDetail1

Representation of an air reservation detail response.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Attendee`                                                | [Attendee3](../../Models/Components/Attendee3.md)         | :heavy_minus_sign:                                        | Representation of the attendee                            |
| `AirRequestDetails`                                       | List<[AirRequest](../../Models/Components/AirRequest.md)> | :heavy_minus_sign:                                        | List of all air request by attendee and its guest.        |