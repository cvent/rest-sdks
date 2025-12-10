# AttendeeActivitiesPaginatedResponse

The response from a request to get the list of attendee activities. This includes the paging object as well as the collection of attendee activities.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ActivityJson](../../models/components/ActivityJson.md)>   | :heavy_check_mark:                                               | Collection of attendee activities.                               |