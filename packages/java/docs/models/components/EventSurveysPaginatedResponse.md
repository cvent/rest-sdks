# EventSurveysPaginatedResponse

The response from a request to get the list of event surveys.  This includes the paging object as well as the collection of surveys.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[EventSurvey](../../models/components/EventSurvey.md)>     | :heavy_check_mark:                                               | Collection of event surveys.                                     |