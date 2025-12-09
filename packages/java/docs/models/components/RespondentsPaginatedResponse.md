# RespondentsPaginatedResponse

Response include paging and respondents for surveys


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [PagingJson](../../models/components/PagingJson.md)                | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[RespondentJson](../../models/components/RespondentJson.md)> | :heavy_check_mark:                                                 | Respondents for surveys.                                           |