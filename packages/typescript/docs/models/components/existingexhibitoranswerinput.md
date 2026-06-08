# ExistingExhibitorAnswerInput

Existing Exhibitor Answer schema

## Example Usage

```typescript
import { ExistingExhibitorAnswerInput } from "@cvent/sdk/models/components";

let value: ExistingExhibitorAnswerInput = {
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  answers: [],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [components.Uuid](../../models/components/uuid.md)                               | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `event`                                                                          | [components.Event21](../../models/components/event21.md)                         | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `exhibitor`                                                                      | [components.Exhibitor](../../models/components/exhibitor.md)                     | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `answers`                                                                        | [components.Answer2](../../models/components/answer2.md)[]                       | :heavy_check_mark:                                                               | List of answers                                                                  |