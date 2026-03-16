# StandardSurveyQuestionJson

A standard survey question.

## Example Usage

```typescript
import { StandardSurveyQuestionJson } from "@cvent/sdk/models/components";

let value: StandardSurveyQuestionJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  text: "Field value",
  shortText: "Category 1 Reporting value",
  htmlText: "Question Html",
  code: "4l6x",
  type: "SingleChoice",
  choices: [
    {
      text: "Field value",
      shortText: "Category 1 Reporting value",
      label: "Choice A",
    },
  ],
  categories: [
    {
      text: "Field value",
      shortText: "Category 1 Reporting value",
      required: true,
    },
  ],
  subCategories: [
    {
      text: "Field value",
      shortText: "Category 1 Reporting value",
    },
  ],
  notApplicableAnswer: {
    text: "N/A or Other",
    shortText: "N/A or Other Reporting value",
  },
  otherAnswer: {
    text: "N/A or Other",
    shortText: "N/A or Other Reporting value",
  },
  comments: "Comments Text",
  required: true,
  fields: [
    {
      text: "Field value",
      shortText: "Category 1 Reporting value",
      type: "SingleChoice",
      choices: [
        {
          text: "Field value",
          shortText: "Category 1 Reporting value",
          label: "Choice A",
        },
      ],
      notApplicableAnswer: {
        text: "N/A or Other",
        shortText: "N/A or Other Reporting value",
      },
      otherAnswer: {
        text: "N/A or Other",
        shortText: "N/A or Other Reporting value",
      },
      required: true,
    },
  ],
  maxScore: 20,
  totalSum: 45,
  survey: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  chapter: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Text field ID.                                                                                |                                                                                               |
| `text`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | text Value of the Field                                                                       | Field value                                                                                   |
| `shortText`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | Reporting value of the Category, Its like a custom abbreviation                               | Category 1 Reporting value                                                                    |
| `htmlText`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Html of the question                                                                          | Question Html                                                                                 |
| `code`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Question Code                                                                                 | 4l6x                                                                                          |
| `type`                                                                                        | [components.QuestionTypeJson2](../../models/components/questiontypejson2.md)                  | :heavy_minus_sign:                                                                            | Question Type.                                                                                | SingleChoice                                                                                  |
| `choices`                                                                                     | [components.ChoiceJson3](../../models/components/choicejson3.md)[]                            | :heavy_minus_sign:                                                                            | List of choices for the question.                                                             |                                                                                               |
| `categories`                                                                                  | [components.CategoryJson2](../../models/components/categoryjson2.md)[]                        | :heavy_minus_sign:                                                                            | List of categories for the question.                                                          |                                                                                               |
| `subCategories`                                                                               | [components.TextFieldJson1](../../models/components/textfieldjson1.md)[]                      | :heavy_minus_sign:                                                                            | List of sub categories for matrix side-by-side questions                                      |                                                                                               |
| `notApplicableAnswer`                                                                         | [components.AdditionalChoiceJson](../../models/components/additionalchoicejson.md)            | :heavy_minus_sign:                                                                            | Contains text of additional choice i.e N/A choice or otherAnswer choice                       |                                                                                               |
| `otherAnswer`                                                                                 | [components.AdditionalChoiceJson](../../models/components/additionalchoicejson.md)            | :heavy_minus_sign:                                                                            | Contains text of additional choice i.e N/A choice or otherAnswer choice                       |                                                                                               |
| `comments`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Text Value of Comments Input box placeholder                                                  | Comments Text                                                                                 |
| `required`                                                                                    | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Is this a mandatory question                                                                  | true                                                                                          |
| `fields`                                                                                      | [components.FieldJson5](../../models/components/fieldjson5.md)[]                              | :heavy_minus_sign:                                                                            | List of fields for form/matrix questions                                                      |                                                                                               |
| `maxScore`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | Max possible score                                                                            | 20                                                                                            |
| `totalSum`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | Total configured sum of all choices for number allocation question                            | 45                                                                                            |
| `survey`                                                                                      | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `chapter`                                                                                     | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |