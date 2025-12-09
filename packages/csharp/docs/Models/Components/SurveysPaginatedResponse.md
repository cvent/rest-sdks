# SurveysPaginatedResponse

The response from a request to get the list of surveys. This includes the paging object as well as the collection of surveys.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[SurveyJson](../../Models/Components/SurveyJson.md)>        | :heavy_check_mark:                                               | Collection of surveys.                                           |