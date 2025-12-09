# StandardSurveyResponseInput

A standard survey response.

## Example Usage

```typescript
import { StandardSurveyResponseInput } from "@cvent/sdk/models/components";

let value: StandardSurveyResponseInput = {
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

| Field                                                                                                                                                         | Type                                                                                                                                                          | Required                                                                                                                                                      | Description                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `question`                                                                                                                                                    | [components.UuidJson](../../models/components/uuidjson.md)                                                                                                    | :heavy_check_mark:                                                                                                                                            | The reference to the related entity. Contains only the ID of the related entity.                                                                              |
| `answers`                                                                                                                                                     | [components.AnswerJson1](../../models/components/answerjson1.md)[]                                                                                            | :heavy_check_mark:                                                                                                                                            | List of responded survey answers.                                                                                                                             |
| `survey`                                                                                                                                                      | [components.UuidJson](../../models/components/uuidjson.md)                                                                                                    | :heavy_minus_sign:                                                                                                                                            | The reference to the related entity. Contains only the ID of the related entity.                                                                              |
| `loopingChoice`                                                                                                                                               | [components.LoopingChoiceJson](../../models/components/loopingchoicejson.md)                                                                                  | :heavy_minus_sign:                                                                                                                                            | Loop Choice is the choice for which the chapter is looped. Questions in the looping chapter get repeated once for each choice selected in the parent question |