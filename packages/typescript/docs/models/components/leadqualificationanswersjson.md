# LeadQualificationAnswersJson

This JSON schema file represents lead qualification answers

## Example Usage

```typescript
import { LeadQualificationAnswersJson } from "@cvent/sdk/models/components";

let value: LeadQualificationAnswersJson = {
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
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Lead Qualification Answer id                                                                  | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `question`                                                                                    | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `event`                                                                                       | [components.EventJson5](../../models/components/eventjson5.md)                                | :heavy_minus_sign:                                                                            | The Associated Event.                                                                         |                                                                                               |
| `exhibitor`                                                                                   | [components.ExhibitorJson](../../models/components/exhibitorjson.md)                          | :heavy_minus_sign:                                                                            | The Associated Exhibitor.                                                                     |                                                                                               |
| `lead`                                                                                        | [components.LeadJson](../../models/components/leadjson.md)                                    | :heavy_minus_sign:                                                                            | JSON schema for the Lead object                                                               |                                                                                               |
| `answers`                                                                                     | [components.AnswerJson](../../models/components/answerjson.md)[]                              | :heavy_minus_sign:                                                                            | List of answers                                                                               |                                                                                               |