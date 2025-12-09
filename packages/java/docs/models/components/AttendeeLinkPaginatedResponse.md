# AttendeeLinkPaginatedResponse

The response from a request to get the list of attendee links. This includes the paging object as well as the collection of attendee links.


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [PagingJson](../../models/components/PagingJson.md)                            | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | List\<[ExistingAttendeeLink](../../models/components/ExistingAttendeeLink.md)> | :heavy_check_mark:                                                             | Collection of webcast attendee links.                                          |