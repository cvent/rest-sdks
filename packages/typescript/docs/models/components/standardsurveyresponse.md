# StandardSurveyResponse

A standard survey response.

## Example Usage

```typescript
import { StandardSurveyResponse } from "@cvent/sdk/models/components";

let value: StandardSurveyResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  respondent: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  answers: [
    {
      type: "ChoiceText",
      value: "1",
      choice: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      category: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      subCategory: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      field: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
    },
  ],
  survey: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  loopingChoice: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
};
```

## Fields

| Field                                                                                                                                                                   | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             | Example                                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `created`                                                                                                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                                           | :heavy_minus_sign:                                                                                                                                                      | The ISO 8601 zoned date time when this record was created.                                                                                                              | 2017-01-02T02:00:00Z                                                                                                                                                    |
| `createdBy`                                                                                                                                                             | *string*                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                      | The identifier of the user that created this record.                                                                                                                    | hporter                                                                                                                                                                 |
| `lastModified`                                                                                                                                                          | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                                           | :heavy_minus_sign:                                                                                                                                                      | The ISO 8601 zoned date time when this record was updated.                                                                                                              | 2019-02-12T03:00:00Z                                                                                                                                                    |
| `lastModifiedBy`                                                                                                                                                        | *string*                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                      | The identifier of the user that last updated this record.                                                                                                               | hporter                                                                                                                                                                 |
| `id`                                                                                                                                                                    | *string*                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                      | Response ID                                                                                                                                                             |                                                                                                                                                                         |
| `respondent`                                                                                                                                                            | [components.StandardSurveyResponseUUID](../../models/components/standardsurveyresponseuuid.md)                                                                          | :heavy_minus_sign:                                                                                                                                                      | N/A                                                                                                                                                                     |                                                                                                                                                                         |
| `question`                                                                                                                                                              | [components.UuidJson](../../models/components/uuidjson.md)                                                                                                              | :heavy_check_mark:                                                                                                                                                      | The reference to the related entity. Contains only the ID of the related entity.                                                                                        |                                                                                                                                                                         |
| `answers`                                                                                                                                                               | [components.AnswerJson1](../../models/components/answerjson1.md)[]                                                                                                      | :heavy_check_mark:                                                                                                                                                      | List of responded survey answers.                                                                                                                                       |                                                                                                                                                                         |
| ~~`score`~~                                                                                                                                                             | *number*                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible.<br/><br/>Answer score (This property is not supported). | 20                                                                                                                                                                      |
| `survey`                                                                                                                                                                | [components.UuidJson](../../models/components/uuidjson.md)                                                                                                              | :heavy_minus_sign:                                                                                                                                                      | The reference to the related entity. Contains only the ID of the related entity.                                                                                        |                                                                                                                                                                         |
| `loopingChoice`                                                                                                                                                         | [components.LoopingChoiceJson](../../models/components/loopingchoicejson.md)                                                                                            | :heavy_minus_sign:                                                                                                                                                      | Loop Choice is the choice for which the chapter is looped. Questions in the looping chapter get repeated once for each choice selected in the parent question           |                                                                                                                                                                         |