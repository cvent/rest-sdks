# ExistingExhibitorAnswerJsonInput

Existing Exhibitor Answer schema

## Example Usage

```typescript
import { ExistingExhibitorAnswerJsonInput } from "@cvent/sdk/models/components";

let value: ExistingExhibitorAnswerJsonInput = {
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  answers: [
    {
      type: "Choice",
      value: "Choice A",
    },
  ],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `event`                                                                          | [components.EventJson5](../../models/components/eventjson5.md)                   | :heavy_check_mark:                                                               | The Associated Event.                                                            |
| `exhibitor`                                                                      | [components.ExhibitorJson](../../models/components/exhibitorjson.md)             | :heavy_check_mark:                                                               | The Associated Exhibitor.                                                        |
| `answers`                                                                        | [components.AnswerJson0](../../models/components/answerjson0.md)[]               | :heavy_check_mark:                                                               | List of answers                                                                  |