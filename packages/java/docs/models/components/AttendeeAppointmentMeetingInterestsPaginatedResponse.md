# AttendeeAppointmentMeetingInterestsPaginatedResponse

The response for a request of appointment meeting interests, including paging information.


## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                   | [Optional\<PagingJson>](../../models/components/PagingJson.md)                                             | :heavy_minus_sign:                                                                                         | Represents pagination information for a collection of resources.                                           |
| `data`                                                                                                     | List\<[AttendeeAppointmentMeetingInterest](../../models/components/AttendeeAppointmentMeetingInterest.md)> | :heavy_minus_sign:                                                                                         | Collection of appointment meeting interests.                                                               |