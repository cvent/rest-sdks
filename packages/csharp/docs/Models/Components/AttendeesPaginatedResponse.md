# AttendeesPaginatedResponse

A paginated response containing a list of attendees who have redeemed a voucher.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[Attendee2](../../Models/Components/Attendee2.md)>          | :heavy_check_mark:                                               | Collection of attendees who have redeemed the voucher.           |