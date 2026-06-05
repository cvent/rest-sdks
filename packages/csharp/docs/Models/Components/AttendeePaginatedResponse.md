# AttendeePaginatedResponse

The response from a request to get the list of attendees. This includes the paging object as well as the collection of attendees.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[Attendee1](../../Models/Components/Attendee1.md)>          | :heavy_check_mark:                                               | Collection of attendees.                                         |