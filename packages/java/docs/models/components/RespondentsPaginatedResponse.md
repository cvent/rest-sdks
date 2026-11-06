# RespondentsPaginatedResponse

Response include paging and respondents for surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Respondent](../../models/components/Respondent.md)>       | :heavy_check_mark:                                               | Respondents for surveys.                                         |