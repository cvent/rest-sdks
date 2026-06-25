# EventEmailsPaginatedResponse

Paginated response for the collection of emails for a specified event.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [PagingJson2](../../models/components/PagingJson2.md)              | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[EventEmailJson](../../models/components/EventEmailJson.md)> | :heavy_check_mark:                                                 | Collection of emails for a specific event.                         |