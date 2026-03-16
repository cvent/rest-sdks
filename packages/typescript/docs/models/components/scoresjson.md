# ScoresJson

Insight score and ranking.

## Example Usage

```typescript
import { ScoresJson } from "@cvent/sdk/models/components";

let value: ScoresJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  attendee: {},
  event: {
    id: "04cb6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  points: 45,
  rank: 10,
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `created`                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)  | :heavy_minus_sign:                                                                             | The ISO 8601 zoned date time when this record was created.                                     | 2017-01-02T02:00:00Z                                                                           |
| `createdBy`                                                                                    | *string*                                                                                       | :heavy_minus_sign:                                                                             | The identifier of the user that created this record.                                           | hporter                                                                                        |
| `lastModified`                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)  | :heavy_minus_sign:                                                                             | The ISO 8601 zoned date time when this record was updated.                                     | 2019-02-12T03:00:00Z                                                                           |
| `lastModifiedBy`                                                                               | *string*                                                                                       | :heavy_minus_sign:                                                                             | The identifier of the user that last updated this record.                                      | hporter                                                                                        |
| `attendee`                                                                                     | [components.ScoresJsonAttendee](../../models/components/scoresjsonattendee.md)                 | :heavy_check_mark:                                                                             | The attendee with points in this engagement score.                                             |                                                                                                |
| `event`                                                                                        | [components.EventJson9](../../models/components/eventjson9.md)                                 | :heavy_check_mark:                                                                             | An event reference used in attendee insights to identify the event context for engagement data |                                                                                                |
| `points`                                                                                       | *number*                                                                                       | :heavy_minus_sign:                                                                             | The number of points earned by an attendee in this engagement score.                           | 45                                                                                             |
| `rank`                                                                                         | *number*                                                                                       | :heavy_minus_sign:                                                                             | Attendees rank amongst other attendees in terms of points scored.                              | 10                                                                                             |