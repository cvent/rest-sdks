# ExistingAudienceSegment

Details of an audience segment.

## Example Usage

```typescript
import { ExistingAudienceSegment } from "@cvent/sdk/models/components";

let value: ExistingAudienceSegment = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "f8a930fa-1f3e-4d75-93d3-597aa6a321ea",
  },
  name: "VIP Attendees",
  description: "A group of VIP attendees.",
  id: "27c6bdc0-58c4-4d3c-b4be-4f57dbaa77b3",
  deleted: true,
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `created`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)    | :heavy_minus_sign:                                                                               | The ISO 8601 zoned date time when this record was created.                                       | 2017-01-02T02:00:00Z                                                                             |
| `createdBy`                                                                                      | *string*                                                                                         | :heavy_minus_sign:                                                                               | The identifier of the user that created this record.                                             | hporter                                                                                          |
| `lastModified`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)    | :heavy_minus_sign:                                                                               | The ISO 8601 zoned date time when this record was updated.                                       | 2019-02-12T03:00:00Z                                                                             |
| `lastModifiedBy`                                                                                 | *string*                                                                                         | :heavy_minus_sign:                                                                               | The identifier of the user that last updated this record.                                        | hporter                                                                                          |
| `event`                                                                                          | [components.Event3](../../models/components/event3.md)                                           | :heavy_check_mark:                                                                               | Represents an event by its ID.                                                                   |                                                                                                  |
| `name`                                                                                           | *string*                                                                                         | :heavy_check_mark:                                                                               | Name of the audience segment. Must be unique in the event where the segment exists.              | VIP Attendees                                                                                    |
| `description`                                                                                    | *string*                                                                                         | :heavy_minus_sign:                                                                               | Additional text about the audience segment.                                                      | A group of VIP attendees.                                                                        |
| `id`                                                                                             | *string*                                                                                         | :heavy_minus_sign:                                                                               | Audience segment ID.                                                                             | 27c6bdc0-58c4-4d3c-b4be-4f57dbaa77b3                                                             |
| `creationType`                                                                                   | [components.AudienceSegmentCreationType](../../models/components/audiencesegmentcreationtype.md) | :heavy_minus_sign:                                                                               | Creation type of the audience segment.                                                           | MANUAL                                                                                           |
| `deleted`                                                                                        | *boolean*                                                                                        | :heavy_minus_sign:                                                                               | Boolean representing whether segment is deleted or not.                                          | true                                                                                             |