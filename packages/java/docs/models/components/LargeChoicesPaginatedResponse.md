# LargeChoicesPaginatedResponse

Response include paging and collection of choices for large choices question.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[LargeChoice](../../models/components/LargeChoice.md)>     | :heavy_check_mark:                                               | Collection of choices for large choices question.                |