# SessionSegment

Represents a mapping between a session and an audience segment, which is used to enforce session visibility to only those in certain audience segments.

## Example Usage

```typescript
import { SessionSegment } from "@cvent/sdk/models/components";

let value: SessionSegment = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
  event: {
    id: "78842378-5d83-11ee-8c99-0242ac120002",
  },
  session: {
    id: "78842aee-5d83-11ee-8c99-0242ac120002",
  },
  segment: {
    id: "788426ac-5d83-11ee-8c99-0242ac120002",
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | ID of the session segment.                                                                    | 38db6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `event`                                                                                       | [components.EventLiteJson1](../../models/components/eventlitejson1.md)                        | :heavy_check_mark:                                                                            | The related event object.                                                                     |                                                                                               |
| `session`                                                                                     | [components.SessionLiteJson1](../../models/components/sessionlitejson1.md)                    | :heavy_check_mark:                                                                            | The related session object.                                                                   |                                                                                               |
| `segment`                                                                                     | [components.SegmentLiteJson](../../models/components/segmentlitejson.md)                      | :heavy_check_mark:                                                                            | The audience segment associated with the session.                                             |                                                                                               |
| `active`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the session segment is active.                                                 | true                                                                                          |