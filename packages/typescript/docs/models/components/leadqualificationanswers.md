# LeadQualificationAnswers

Answers of a lead to a lead qualification question.

## Example Usage

```typescript
import { LeadQualificationAnswers } from "@cvent/sdk/models/components";

let value: LeadQualificationAnswers = {
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
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Lead qualification answer ID.                                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `question`                                                                                    | [components.Uuid](../../models/components/uuid.md)                                            | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `event`                                                                                       | [components.Event4](../../models/components/event4.md)                                        | :heavy_minus_sign:                                                                            | Associated event.                                                                             |                                                                                               |
| `exhibitor`                                                                                   | [components.Exhibitor](../../models/components/exhibitor.md)                                  | :heavy_minus_sign:                                                                            | Associated exhibitor.                                                                         |                                                                                               |
| `lead`                                                                                        | [components.Lead2](../../models/components/lead2.md)                                          | :heavy_minus_sign:                                                                            | Associated lead.                                                                              |                                                                                               |
| `answers`                                                                                     | [components.Answer12](../../models/components/answer12.md)[]                                  | :heavy_minus_sign:                                                                            | List of answers.                                                                              |                                                                                               |