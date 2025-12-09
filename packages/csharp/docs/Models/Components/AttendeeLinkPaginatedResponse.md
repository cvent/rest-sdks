# AttendeeLinkPaginatedResponse

The response from a request to get the list of attendee links. This includes the paging object as well as the collection of attendee links.


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Paging`                                                                      | [PagingJson](../../Models/Components/PagingJson.md)                           | :heavy_check_mark:                                                            | Represents pagination information for a collection of resources.              |
| `Data`                                                                        | List<[ExistingAttendeeLink](../../Models/Components/ExistingAttendeeLink.md)> | :heavy_check_mark:                                                            | Collection of webcast attendee links.                                         |