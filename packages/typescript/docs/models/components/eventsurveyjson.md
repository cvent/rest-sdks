# EventSurveyJson

An event survey.

## Example Usage

```typescript
import { EventSurveyJson } from "@cvent/sdk/models/components";

let value: EventSurveyJson = {
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
  type: "Session Feedback",
  availableTo: "Session Registrants",
  audienceType: "Attendee",
  sessionMatch: "Only certain sessions",
  sessions: [
    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    "05ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  ],
  parentId: "9463c74e-18c6-401a-a710-ae0f485bf059",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `created`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)    | :heavy_minus_sign:                                                                               | The ISO 8601 zoned date time when this record was created.                                       | 2017-01-02T02:00:00Z                                                                             |
| `createdBy`                                                                                      | *string*                                                                                         | :heavy_minus_sign:                                                                               | The identifier of the user that created this record.                                             | hporter                                                                                          |
| `lastModified`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)    | :heavy_minus_sign:                                                                               | The ISO 8601 zoned date time when this record was updated.                                       | 2019-02-12T03:00:00Z                                                                             |
| `lastModifiedBy`                                                                                 | *string*                                                                                         | :heavy_minus_sign:                                                                               | The identifier of the user that last updated this record.                                        | hporter                                                                                          |
| `id`                                                                                             | *string*                                                                                         | :heavy_minus_sign:                                                                               | Id of the survey or Id of the chapter in case of event survey                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `title`                                                                                          | *string*                                                                                         | :heavy_minus_sign:                                                                               | Title of the survey or Title of the chapter in case of event survey                              | Demo Survey                                                                                      |
| `code`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | Survey Code or Chapter Code in case of event survey                                              | NDOU2RDQH5Q                                                                                      |
| `timezone`                                                                                       | *string*                                                                                         | :heavy_minus_sign:                                                                               | Timezone of the survey                                                                           | America/New_York                                                                                 |
| `author`                                                                                         | [components.SurveyAuthorJson](../../models/components/surveyauthorjson.md)                       | :heavy_minus_sign:                                                                               | Author of the survey                                                                             |                                                                                                  |
| `description`                                                                                    | *string*                                                                                         | :heavy_minus_sign:                                                                               | Survey description                                                                               | This is a test survey                                                                            |
| `closeAfter`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)    | :heavy_minus_sign:                                                                               | The survey will be closed after this ISO 8601 formatted date and time.                           | 2022-02-01T23:59:00.00Z                                                                          |
| `type`                                                                                           | [components.EventSurveyTypeJson](../../models/components/eventsurveytypejson.md)                 | :heavy_minus_sign:                                                                               | This is used to denote the different survey types.                                               | Session Feedback                                                                                 |
| `availableTo`                                                                                    | [components.EventSurveyAvailabilityJson](../../models/components/eventsurveyavailabilityjson.md) | :heavy_minus_sign:                                                                               | Describes the availability of the event survey                                                   | Session Registrants                                                                              |
| `audienceType`                                                                                   | [components.EventSurveyAudienceTypeJson](../../models/components/eventsurveyaudiencetypejson.md) | :heavy_minus_sign:                                                                               | Audience types of event surveys                                                                  | Attendee                                                                                         |
| `sessionMatch`                                                                                   | [components.EventSurveySessionMatchJson](../../models/components/eventsurveysessionmatchjson.md) | :heavy_minus_sign:                                                                               | What is the criteria of adding sessions to a event survey                                        | Only certain sessions                                                                            |
| `sessions`                                                                                       | *string*[]                                                                                       | :heavy_minus_sign:                                                                               | Associated session ids of the survey, this can also be null                                      | [<br/>"04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",<br/>"05ca6ae2-0dc3-487b-953e-86d6abbdf7d3"<br/>]   |
| `parentId`                                                                                       | *string*                                                                                         | :heavy_minus_sign:                                                                               | Id of the parent survey                                                                          | 9463c74e-18c6-401a-a710-ae0f485bf059                                                             |