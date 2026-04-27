# DatePatternJson0

Date pattern for days on which event can occur. Used when dateMode is DATE_PATTERN.

## Example Usage

```typescript
import { DatePatternJson0 } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: DatePatternJson0 = {
  note: "Flexible dates on weekends.",
  endDate: new RFCDate("2016-10-15"),
  startDate: new RFCDate("2016-10-13"),
  durationDays: 3,
  startDays: [
    "MONDAY",
  ],
  generatedDates: [
    {
      preferred: true,
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      endDate: new RFCDate("2016-10-13"),
      startDate: new RFCDate("2016-10-15"),
      note: "Flexible dates",
    },
  ],
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `note`                                                                   | *string*                                                                 | :heavy_minus_sign:                                                       | Note along with date pattern requirements.                               | Flexible dates on weekends.                                              |
| `endDate`                                                                | [RFCDate](../../types/rfcdate.md)                                        | :heavy_check_mark:                                                       | The ISO 8601 end date of the event.                                      | 2016-10-15                                                               |
| `startDate`                                                              | [RFCDate](../../types/rfcdate.md)                                        | :heavy_check_mark:                                                       | The ISO 8601 start date of the event.                                    | 2016-10-13                                                               |
| `durationDays`                                                           | *number*                                                                 | :heavy_check_mark:                                                       | Number of days the event will go on.                                     | 3                                                                        |
| `startDays`                                                              | [components.DayOfWeekJson0](../../models/components/dayofweekjson0.md)[] | :heavy_check_mark:                                                       | Days of the week when event can start.                                   |                                                                          |
| `generatedDates`                                                         | [components.DatesJson0](../../models/components/datesjson0.md)[]         | :heavy_minus_sign:                                                       | List of dates generated based on the date pattern.                       |                                                                          |