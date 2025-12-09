# LeadQualificationAnswersListResponse

A JSON schema representing the response for a list of lead qualification answers.

## Example Usage

```typescript
import { LeadQualificationAnswersListResponse } from "@cvent/sdk/models/components";

let value: LeadQualificationAnswersListResponse = {
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      question: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      event: {
        id: "3db28cfc-db22-11eb-8d19-0242ac130003",
      },
      exhibitor: {
        id: "4888db54-db22-11eb-8d19-0242ac130003",
      },
      lead: {
        id: "4e74f930-db22-11eb-8d19-0242ac130003",
      },
      answers: [
        {
          type: "NA",
          value: "Choice A",
          choice: {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          },
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `data`                                                                                               | [components.LeadQualificationAnswersJson](../../models/components/leadqualificationanswersjson.md)[] | :heavy_minus_sign:                                                                                   | Collection of Lead Qualification Answers.                                                            |