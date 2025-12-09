# VideoViewsPaginatedResponse

Paginated list of video views.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[VideoViewJson](../../Models/Components/VideoViewJson.md)>  | :heavy_minus_sign:                                               | List of unique video views.                                      |