# ExhibitorQuestionsResponse

A response containing a list of all questions for exhibitors.

## Example Usage

```typescript
import { ExhibitorQuestionsResponse } from "@cvent/sdk/models/components";

let value: ExhibitorQuestionsResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      text: "Is there a business need?",
      code: "A001",
      type: "SingleChoice",
      required: true,
      choices: [
        {
          text: "Choice 1",
        },
      ],
      notApplicableAnswer: {
        text: "Not Applicable or Other",
      },
      otherAnswer: {
        text: "Not Applicable or Other",
      },
      answerFormat: "RadioButton",
      answerLimits: {
        minSelections: 1,
        maxSelections: 10,
      },
      defaultToCurrentDate: true,
      id: "f7c01518-1792-11ec-9621-0242ac130002",
    },
  ],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `data`                                                                                         | [components.ExistingExhibitorQuestion](../../models/components/existingexhibitorquestion.md)[] | :heavy_minus_sign:                                                                             | List of all questions for exhibitors.                                                          |