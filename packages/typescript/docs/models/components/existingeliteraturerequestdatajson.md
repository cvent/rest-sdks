# ExistingEliteratureRequestDataJson

A JSON Schema for an existing e-literature request data for a lead.

## Example Usage

```typescript
import { ExistingEliteratureRequestDataJson } from "@cvent/sdk/models/components";

let value: ExistingEliteratureRequestDataJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  lead: {
    id: "4e74f930-db22-11eb-8d19-0242ac130003",
  },
  documents: [],
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.EventJson6](../../models/components/eventjson6.md)                                | :heavy_check_mark:                                                                            | The Associated Event.                                                                         |                                                                                               |
| `exhibitor`                                                                                   | [components.ExhibitorJson](../../models/components/exhibitorjson.md)                          | :heavy_check_mark:                                                                            | The Associated Exhibitor.                                                                     |                                                                                               |
| `lead`                                                                                        | [components.LeadJson](../../models/components/leadjson.md)                                    | :heavy_check_mark:                                                                            | JSON schema for the Lead object                                                               |                                                                                               |
| `documents`                                                                                   | [components.EliteratureDocumentJson](../../models/components/eliteraturedocumentjson.md)[]    | :heavy_check_mark:                                                                            | Collection of E-literature documents sent to lead.                                            |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Request identifier                                                                            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |