# StandardSurveysPaginatedResponse

The response from a request to get the list of standard surveys. This includes the paging object as well as the collection of surveys.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [Paging](../../Models/Components/Paging.md)                       | :heavy_check_mark:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[StandardSurvey](../../Models/Components/StandardSurvey.md)> | :heavy_check_mark:                                                | Collection of standard surveys.                                   |