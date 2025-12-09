# ExhibitorAnswersRequest

An object representing the request for exhibitor answers.

## Example Usage

```typescript
import { ExhibitorAnswersRequest } from "@cvent/sdk/models/components";

let value: ExhibitorAnswersRequest = {
  data: [
    {
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
    },
  ],
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `data`                                                                                                       | [components.ExistingExhibitorAnswerJsonInput](../../models/components/existingexhibitoranswerjsoninput.md)[] | :heavy_minus_sign:                                                                                           | List of answers for all exhibitor questions.                                                                 |