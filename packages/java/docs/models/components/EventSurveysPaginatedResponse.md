# EventSurveysPaginatedResponse

The response from a request to get the list of event surveys.  This includes the paging object as well as the collection of surveys.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[EventSurveyJson](../../models/components/EventSurveyJson.md)> | :heavy_check_mark:                                                   | Collection of event surveys.                                         |