# AirReservationDetailJson

Representation of an air reservation detail response.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `attendee`                                                           | [Optional\<AttendeeJson4>](../../models/components/AttendeeJson4.md) | :heavy_minus_sign:                                                   | Representation of the attendee                                       |
| `airRequestDetails`                                                  | List\<[AirRequestJson](../../models/components/AirRequestJson.md)>   | :heavy_minus_sign:                                                   | List of all air request by attendee and its guest.                   |