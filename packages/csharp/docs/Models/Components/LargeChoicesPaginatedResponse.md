# LargeChoicesPaginatedResponse

Response include paging and collection of choices for large choices question.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[LargeChoiceJson](../../Models/Components/LargeChoiceJson.md)> | :heavy_check_mark:                                                  | Collection of choices for large choices question.                   |