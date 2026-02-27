# StandardSurveyJson

A standard survey.

## Example Usage

```typescript
import { StandardSurveyJson } from "@cvent/sdk/models/components";

let value: StandardSurveyJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  title: "Demo Survey",
  code: "NDOU2RDQH5Q",
  timezone: "America/New_York",
  author: {
    firstName: "Vivek",
    lastName: "Singh",
    company: "Cvent",
    title: "Sales Manager",
    email: "dummyemail@cvent.com",
  },
  description: "This is a test survey",
  closeAfter: new Date("2022-02-01T23:59:00.00Z"),
  responseCount: 10,
  status: "Active",
  archiveAfter: new Date("2022-05-07T12:00:00.00Z"),
  customFields: [
    {
      id: "bd57aeda-3483-4bcf-886e-c976e9f4454a",
      name: "What is a your favorite color?",
      code: "FAVORITE_COLOR_CODE",
      type: "Choice - Multiple Answers",
      values: [
        "Green",
        "Blue",
      ],
    },
  ],
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Id of the survey or Id of the chapter in case of event survey                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `title`                                                                                       | *string*                                                                                      | :heavy_minus_sign:                                                                            | Title of the survey or Title of the chapter in case of event survey                           | Demo Survey                                                                                   |
| `code`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Survey Code or Chapter Code in case of event survey                                           | NDOU2RDQH5Q                                                                                   |
| `timezone`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Timezone of the survey                                                                        | America/New_York                                                                              |
| `author`                                                                                      | [components.SurveyAuthorJson](../../models/components/surveyauthorjson.md)                    | :heavy_minus_sign:                                                                            | Author of the survey                                                                          |                                                                                               |
| `description`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Survey description                                                                            | This is a test survey                                                                         |
| `closeAfter`                                                                                  | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The survey will be closed after this ISO 8601 formatted date and time.                        | 2022-02-01T23:59:00.00Z                                                                       |
| `responseCount`                                                                               | *number*                                                                                      | :heavy_minus_sign:                                                                            | The count of responses.                                                                       | 10                                                                                            |
| `status`                                                                                      | [components.SurveyStatusJson](../../models/components/surveystatusjson.md)                    | :heavy_minus_sign:                                                                            | Survey Status                                                                                 | Active                                                                                        |
| `archiveAfter`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The survey will be archived after this ISO 8601 formatted date and time.                      | 2022-05-07T12:00:00.00Z                                                                       |
| `customFields`                                                                                | [components.CustomFieldJson4](../../models/components/customfieldjson4.md)[]                  | :heavy_minus_sign:                                                                            | Collection of survey custom fields.                                                           |                                                                                               |