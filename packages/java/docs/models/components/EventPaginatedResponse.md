# EventPaginatedResponse

Represents a paginated collection of event objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[EventJson2](../../models/components/EventJson2.md)>       | :heavy_check_mark:                                               | A collection of event objects.                                   |