# RespondentsPaginatedResponse

Response include paging and respondents for surveys


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson](../../Models/Components/PagingJson.md)               | :heavy_check_mark:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[RespondentJson](../../Models/Components/RespondentJson.md)> | :heavy_check_mark:                                                | Respondents for surveys.                                          |