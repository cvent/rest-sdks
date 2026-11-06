# DateRequirements1

Date requirements for the event.

## Example Usage

```typescript
import { DateRequirements1 } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: DateRequirements1 = {
  mode: "DATE_PATTERN",
  alternateDates: [
    {
      preferred: true,
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      endDate: new RFCDate("2016-10-13"),
      startDate: new RFCDate("2016-10-15"),
      note: "Flexible dates",
    },
  ],
  pattern: {
    note: "Flexible dates on weekends.",
    endDate: new RFCDate("2016-10-15"),
    startDate: new RFCDate("2016-10-13"),
    durationDays: 3,
    startDays: [],
    generatedDates: [
      {
        preferred: true,
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
        endDate: new RFCDate("2016-10-13"),
        startDate: new RFCDate("2016-10-15"),
        note: "Flexible dates",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                         | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `mode`                                                                                                        | [components.RfpDateMode](../../models/components/rfpdatemode.md)                                              | :heavy_check_mark:                                                                                            | RfpDateMode                                                                                                   |
| `alternateDates`                                                                                              | [components.Dates1](../../models/components/dates1.md)[]                                                      | :heavy_minus_sign:                                                                                            | List of dates for the event. Can be used to provide set of alternate event dates when mode is ALTERNATE_DATE. |
| `pattern`                                                                                                     | [components.DatePattern1](../../models/components/datepattern1.md)                                            | :heavy_minus_sign:                                                                                            | Date pattern for days on which event can occur. Used when dateMode is DATE_PATTERN.                           |
| `availabilityRangeRequired`                                                                                   | *boolean*                                                                                                     | :heavy_minus_sign:                                                                                            | True indicates that the event requires a range of availability dates.                                         |