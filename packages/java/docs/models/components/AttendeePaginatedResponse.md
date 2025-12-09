# AttendeePaginatedResponse

The response from a request to get the list of attendees. This includes the paging object as well as the collection of attendees.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Attendee](../../models/components/Attendee.md)>           | :heavy_check_mark:                                               | Collection of attendees.                                         |