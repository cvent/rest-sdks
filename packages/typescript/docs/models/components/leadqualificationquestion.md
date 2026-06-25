# LeadQualificationQuestion

A JSON schema representing a Lead Qualification Question model

## Example Usage

```typescript
import { LeadQualificationQuestion } from "@cvent/sdk/models/components";

let value: LeadQualificationQuestion = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  code: "cult",
  choices: [
    {
      text: "Choice 1",
      label: "Choice A",
    },
  ],
  notApplicableAnswer: {
    text: "Not Applicable or Other",
  },
  otherAnswers: {
    text: "Not Applicable or Other",
  },
  required: true,
  text: "Is there a business need?",
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `created`                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)        | :heavy_minus_sign:                                                                                   | The ISO 8601 zoned date time when this record was created.                                           | 2017-01-02T02:00:00Z                                                                                 |
| `createdBy`                                                                                          | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The identifier of the user that created this record.                                                 | hporter                                                                                              |
| `lastModified`                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)        | :heavy_minus_sign:                                                                                   | The ISO 8601 zoned date time when this record was updated.                                           | 2019-02-12T03:00:00Z                                                                                 |
| `lastModifiedBy`                                                                                     | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The identifier of the user that last updated this record.                                            | hporter                                                                                              |
| `id`                                                                                                 | *string*                                                                                             | :heavy_minus_sign:                                                                                   | Lead Qualification Question id                                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                 |
| `event`                                                                                              | [components.Event3](../../models/components/event3.md)                                               | :heavy_minus_sign:                                                                                   | The Associated Event.                                                                                |                                                                                                      |
| `exhibitor`                                                                                          | [components.Exhibitor](../../models/components/exhibitor.md)                                         | :heavy_minus_sign:                                                                                   | The Associated Exhibitor.                                                                            |                                                                                                      |
| `type`                                                                                               | [components.LeadQualificationQuestionType](../../models/components/leadqualificationquestiontype.md) | :heavy_minus_sign:                                                                                   | Type of question                                                                                     |                                                                                                      |
| `code`                                                                                               | *string*                                                                                             | :heavy_minus_sign:                                                                                   | question code                                                                                        | cult                                                                                                 |
| `choices`                                                                                            | [components.Choice1](../../models/components/choice1.md)[]                                           | :heavy_minus_sign:                                                                                   | List of available choices for the question                                                           |                                                                                                      |
| `notApplicableAnswer`                                                                                | [components.AdditionalChoice1](../../models/components/additionalchoice1.md)                         | :heavy_minus_sign:                                                                                   | Contains text of additional choice                                                                   |                                                                                                      |
| `otherAnswers`                                                                                       | [components.AdditionalChoice1](../../models/components/additionalchoice1.md)                         | :heavy_minus_sign:                                                                                   | Contains text of additional choice                                                                   |                                                                                                      |
| `required`                                                                                           | *boolean*                                                                                            | :heavy_minus_sign:                                                                                   | A boolean indicating whether the question is mandatory or not                                        | true                                                                                                 |
| `text`                                                                                               | *string*                                                                                             | :heavy_minus_sign:                                                                                   | text of the question                                                                                 | Is there a business need?                                                                            |