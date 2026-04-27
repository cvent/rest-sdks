# DateRequirementsJson0

Date requirements for the event.

## Example Usage

```typescript
import { DateRequirementsJson0 } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: DateRequirementsJson0 = {
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
| `mode`                                                                                                        | [components.RfpDateModeJson0](../../models/components/rfpdatemodejson0.md)                                    | :heavy_check_mark:                                                                                            | Way of specifying dates for the event.                                                                        |
| `alternateDates`                                                                                              | [components.DatesJson0](../../models/components/datesjson0.md)[]                                              | :heavy_minus_sign:                                                                                            | List of dates for the event. Can be used to provide set of alternate event dates when mode is ALTERNATE_DATE. |
| `pattern`                                                                                                     | [components.DatePatternJson0](../../models/components/datepatternjson0.md)                                    | :heavy_minus_sign:                                                                                            | Date pattern for days on which event can occur. Used when dateMode is DATE_PATTERN.                           |
| `availabilityRangeRequired`                                                                                   | *boolean*                                                                                                     | :heavy_minus_sign:                                                                                            | True indicates that the event requires a range of availability dates.                                         |