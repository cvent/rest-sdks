# AttendeeCreditsPaginatedResponse

Response containing attendee credits information.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Paging](../../models/components/Paging.md)                        | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[AttendeeCredit](../../models/components/AttendeeCredit.md)> | :heavy_check_mark:                                                 | Collection of credits assigned to attendees.                       |