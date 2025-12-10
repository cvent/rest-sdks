# BoothStaffResponse

Booth staff with an associated ID.

## Example Usage

```typescript
import { BoothStaffResponse } from "@cvent/sdk/models/components";

let value: BoothStaffResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  id: "4e0f5152-515e-11ee-be56-0242ac120002",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `attendee`                                                                                    | [components.AttendeeJson3](../../models/components/attendeejson3.md)                          | :heavy_check_mark:                                                                            | A JSON Schema for an Attendee object                                                          |                                                                                               |
| `event`                                                                                       | [components.EventJson5](../../models/components/eventjson5.md)                                | :heavy_check_mark:                                                                            | The Associated Event.                                                                         |                                                                                               |
| `exhibitor`                                                                                   | [components.ExhibitorJson](../../models/components/exhibitorjson.md)                          | :heavy_check_mark:                                                                            | The Associated Exhibitor.                                                                     |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | ID of an exhibitor booth staff member.                                                        | 4e0f5152-515e-11ee-be56-0242ac120002                                                          |