# RfpAgendaItemScheduleJson

Schedule information for an RFP agenda item.

## Example Usage

```typescript
import { RfpAgendaItemScheduleJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: RfpAgendaItemScheduleJson = {
  dayNumber: 1,
  date: new RFCDate("2021-07-03"),
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `dayNumber`                                                            | *number*                                                               | :heavy_check_mark:                                                     | Day number relative to start of event on which the agenda item occurs. | 1                                                                      |
| `date`                                                                 | [RFCDate](../../types/rfcdate.md)                                      | :heavy_minus_sign:                                                     | The ISO 8601 date of the agenda item.                                  | 2021-07-03                                                             |