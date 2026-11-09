# LargeChoicesPaginatedResponse

Response include paging and collection of choices for large choices question.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[LargeChoice](../../Models/Components/LargeChoice.md)>      | :heavy_check_mark:                                               | Collection of choices for large choices question.                |