# LeadQualificationQuestionsListResponse

A response containing a list of lead qualification questions.

## Example Usage

```typescript
import { LeadQualificationQuestionsListResponse } from "@cvent/sdk/models/components";

let value: LeadQualificationQuestionsListResponse = {
  data: [
    {
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
    },
  ],
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `data`                                                                                                 | [components.LeadQualificationQuestionJson](../../models/components/leadqualificationquestionjson.md)[] | :heavy_minus_sign:                                                                                     | Collection of lead qualification questions.                                                            |