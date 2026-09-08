# Day

Day contains a date and a counter

## Example Usage

```typescript
import { Day } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: Day = {
  dayNumber: 1,
  date: new RFCDate("2021-07-03"),
};
```

## Fields

| Field                             | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `dayNumber`                       | *number*                          | :heavy_minus_sign:                | Counter for number of Days        | 1                                 |
| `date`                            | [RFCDate](../../types/rfcdate.md) | :heavy_minus_sign:                | The ISO 8601 date of the booking  | 2021-07-03                        |