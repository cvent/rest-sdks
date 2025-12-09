# AirReservationDetailJson

Representation of an air reservation detail response.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Attendee`                                                        | [AttendeeJson4](../../Models/Components/AttendeeJson4.md)         | :heavy_minus_sign:                                                | Representation of the attendee                                    |
| `AirRequestDetails`                                               | List<[AirRequestJson](../../Models/Components/AirRequestJson.md)> | :heavy_minus_sign:                                                | List of all air request by attendee and its guest.                |