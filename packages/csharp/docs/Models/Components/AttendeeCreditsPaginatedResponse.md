# AttendeeCreditsPaginatedResponse

Response containing attendee credits information.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [Paging](../../Models/Components/Paging.md)                       | :heavy_check_mark:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[AttendeeCredit](../../Models/Components/AttendeeCredit.md)> | :heavy_check_mark:                                                | Collection of credits assigned to attendees.                      |