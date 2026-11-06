# RespondentsPaginatedResponse

Response include paging and respondents for surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[Respondent](../../Models/Components/Respondent.md)>        | :heavy_check_mark:                                               | Respondents for surveys.                                         |