# StandardSurveyEmailTemplatesPaginatedResponse

Response include paging and collection of email templates of a particular standard survey


## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `paging`                                                                                             | [PagingJson](../../models/components/PagingJson.md)                                                  | :heavy_check_mark:                                                                                   | Represents pagination information for a collection of resources.                                     |
| `data`                                                                                               | List\<[StandardSurveyEmailTemplateJson](../../models/components/StandardSurveyEmailTemplateJson.md)> | :heavy_check_mark:                                                                                   | Collection of standard survey email templates                                                        |