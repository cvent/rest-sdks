# AttendeeInsightsStats

Attendee insights statistics.

## Example Usage

```typescript
import { AttendeeInsightsStats } from "@cvent/sdk/models/components";

let value: AttendeeInsightsStats = {
  averageAttendeeScore: 120,
  attendeeCount: 200,
  activityCount: 3000,
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `averageAttendeeScore`                                         | *number*                                                       | :heavy_minus_sign:                                             | Average engagement score across all attendees.                 | 120                                                            |
| `attendeeCount`                                                | *number*                                                       | :heavy_minus_sign:                                             | Count of attendees who've participated in an engagement score. | 200                                                            |
| `activityCount`                                                | *number*                                                       | :heavy_minus_sign:                                             | Count of all activities included in an engagement score.       | 3000                                                           |