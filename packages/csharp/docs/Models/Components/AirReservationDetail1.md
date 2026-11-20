# AirReservationDetail1

Air request details for an attendee and any guest.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Attendee`                                                | [Attendee3](../../Models/Components/Attendee3.md)         | :heavy_minus_sign:                                        | An attendee identified by an ID.                          |
| `AirRequestDetails`                                       | List<[AirRequest](../../Models/Components/AirRequest.md)> | :heavy_minus_sign:                                        | List of all air request by attendee and its guest.        |