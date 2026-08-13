# EventPaginatedResponse

Represents a paginated collection of event objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[EventJson2](../../Models/Components/EventJson2.md)>        | :heavy_check_mark:                                               | A collection of event objects.                                   |