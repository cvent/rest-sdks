# EventSurveysPaginatedResponse

The response from a request to get the list of event surveys.  This includes the paging object as well as the collection of surveys.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[EventSurveyJson](../../Models/Components/EventSurveyJson.md)> | :heavy_check_mark:                                                  | Collection of event surveys.                                        |