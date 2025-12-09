# AttendeeAppointmentMeetingInterestsPaginatedResponse

The response for a request of appointment meeting interests, including paging information.


## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                                       | :heavy_minus_sign:                                                                                        | Represents pagination information for a collection of resources.                                          |
| `Data`                                                                                                    | List<[AttendeeAppointmentMeetingInterest](../../Models/Components/AttendeeAppointmentMeetingInterest.md)> | :heavy_minus_sign:                                                                                        | Collection of appointment meeting interests.                                                              |