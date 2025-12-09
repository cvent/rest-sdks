# ExhibitorAnswersResponse

A response object containing a list of exhibitor question answers.

## Example Usage

```typescript
import { ExhibitorAnswersResponse } from "@cvent/sdk/models/components";

let value: ExhibitorAnswersResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
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
      id: "06d2bfce-1793-11ec-9621-0242ac130002",
    },
  ],
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `data`                                                                                             | [components.ExistingExhibitorAnswerJson](../../models/components/existingexhibitoranswerjson.md)[] | :heavy_minus_sign:                                                                                 | List of answers for all exhibitor questions.                                                       |