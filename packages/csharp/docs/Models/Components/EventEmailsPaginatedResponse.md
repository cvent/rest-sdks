# EventEmailsPaginatedResponse

Paginated response for the collection of emails for a specified event.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson25](../../Models/Components/PagingJson25.md)           | :heavy_check_mark:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[EventEmailJson](../../Models/Components/EventEmailJson.md)> | :heavy_check_mark:                                                | Collection of emails for a specific event.                        |