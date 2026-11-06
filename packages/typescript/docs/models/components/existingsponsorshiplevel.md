# ExistingSponsorshipLevel

Sponsorship level with an ID.

## Example Usage

```typescript
import { ExistingSponsorshipLevel } from "@cvent/sdk/models/components";

let value: ExistingSponsorshipLevel = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  name: "Silver",
  id: "1765848c-2a7f-48d2-85a2-6668b8e64ffb",
  rank: 3,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.Event4](../../models/components/event4.md)                                        | :heavy_check_mark:                                                                            | Associated event.                                                                             |                                                                                               |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | Name of the sponsorship level.                                                                | Silver                                                                                        |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Sponsorship level ID.                                                                         | 1765848c-2a7f-48d2-85a2-6668b8e64ffb                                                          |
| `rank`                                                                                        | *number*                                                                                      | :heavy_minus_sign:                                                                            | Order in which the sponsors appear in a list.                                                 | 3                                                                                             |