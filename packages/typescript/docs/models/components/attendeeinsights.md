# AttendeeInsights

Attendee insights.

## Example Usage

```typescript
import { AttendeeInsights } from "@cvent/sdk/models/components";

let value: AttendeeInsights = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "3f1b949b-2f69-42e2-b205-3780f9a76eaf",
  name: "General Interest",
  description: "A score to capture engagement for general attendees.",
  event: {
    id: "04cb6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  default: false,
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `created`                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)  | :heavy_minus_sign:                                                                             | The ISO 8601 zoned date time when this record was created.                                     | 2017-01-02T02:00:00Z                                                                           |
| `createdBy`                                                                                    | *string*                                                                                       | :heavy_minus_sign:                                                                             | The identifier of the user that created this record.                                           | hporter                                                                                        |
| `lastModified`                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)  | :heavy_minus_sign:                                                                             | The ISO 8601 zoned date time when this record was updated.                                     | 2019-02-12T03:00:00Z                                                                           |
| `lastModifiedBy`                                                                               | *string*                                                                                       | :heavy_minus_sign:                                                                             | The identifier of the user that last updated this record.                                      | hporter                                                                                        |
| `id`                                                                                           | *string*                                                                                       | :heavy_check_mark:                                                                             | The identifier of the engagement score.                                                        | 3f1b949b-2f69-42e2-b205-3780f9a76eaf                                                           |
| `name`                                                                                         | *string*                                                                                       | :heavy_check_mark:                                                                             | Name of the engagement score.                                                                  | General Interest                                                                               |
| `description`                                                                                  | *string*                                                                                       | :heavy_minus_sign:                                                                             | Description of the engagement score.                                                           | A score to capture engagement for general attendees.                                           |
| `event`                                                                                        | [components.EventJson9](../../models/components/eventjson9.md)                                 | :heavy_check_mark:                                                                             | An event reference used in attendee insights to identify the event context for engagement data |                                                                                                |
| `default`                                                                                      | *boolean*                                                                                      | :heavy_check_mark:                                                                             | True indicates this is the default engagement score in the event.                              | false                                                                                          |