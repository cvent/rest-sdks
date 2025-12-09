# ExistingExhibitorAnswerJson

Existing Exhibitor Answer schema

## Example Usage

```typescript
import { ExistingExhibitorAnswerJson } from "@cvent/sdk/models/components";

let value: ExistingExhibitorAnswerJson = {
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
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `question`                                                                                    | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_check_mark:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `event`                                                                                       | [components.EventJson5](../../models/components/eventjson5.md)                                | :heavy_check_mark:                                                                            | The Associated Event.                                                                         |                                                                                               |
| `exhibitor`                                                                                   | [components.ExhibitorJson](../../models/components/exhibitorjson.md)                          | :heavy_check_mark:                                                                            | The Associated Exhibitor.                                                                     |                                                                                               |
| `answers`                                                                                     | [components.AnswerJson0](../../models/components/answerjson0.md)[]                            | :heavy_check_mark:                                                                            | List of answers                                                                               |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | Exhibitor Answer id                                                                           | 06d2bfce-1793-11ec-9621-0242ac130002                                                          |