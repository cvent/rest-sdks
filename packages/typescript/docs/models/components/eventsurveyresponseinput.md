# EventSurveyResponseInput

Response object for event survey respondent.

## Example Usage

```typescript
import { EventSurveyResponseInput } from "@cvent/sdk/models/components";

let value: EventSurveyResponseInput = {
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  answers: [],
  survey: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  speaker: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `answers`                                                                        | [components.AnswerJson1](../../models/components/answerjson1.md)[]               | :heavy_check_mark:                                                               | List of responded survey answers.                                                |
| `survey`                                                                         | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `session`                                                                        | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `speaker`                                                                        | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |