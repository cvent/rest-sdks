# EventPaginatedResponse

Represents a paginated collection of event objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Event1](../../models/components/Event1.md)>               | :heavy_check_mark:                                               | A collection of event objects.                                   |