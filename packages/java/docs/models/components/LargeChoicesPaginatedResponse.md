# LargeChoicesPaginatedResponse

Response include paging and collection of choices for large choices question.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[LargeChoiceJson](../../models/components/LargeChoiceJson.md)> | :heavy_check_mark:                                                   | Collection of choices for large choices question.                    |