# ScoresPaginatedResponse

Paginated collection of score objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ScoresJson](../../Models/Components/ScoresJson.md)>        | :heavy_check_mark:                                               | Collection of score objects.                                     |