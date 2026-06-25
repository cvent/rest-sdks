# AttendeesPaginatedResponse

A paginated response containing a list of attendees who have redeemed a voucher.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Attendee2](../../models/components/Attendee2.md)>         | :heavy_check_mark:                                               | Collection of attendees who have redeemed the voucher.           |