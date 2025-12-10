# InvitationListJson

Object encapsulating relevant information about an invitation list.

## Example Usage

```typescript
import { InvitationListJson } from "@cvent/sdk/models/components";

let value: InvitationListJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "a150f1ee-6c54-4b01-90e6-d701748f0851",
  name: "Invitation List",
  locale: "en-US",
  default: true,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | The unique ID of the invitation list.                                                         | a150f1ee-6c54-4b01-90e6-d701748f0851                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the invitation list.                                                                  | Invitation List                                                                               |
| `locale`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Locale code                                                                                   | en-US                                                                                         |
| `default`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the default invitation list of an event.                                       | true                                                                                          |