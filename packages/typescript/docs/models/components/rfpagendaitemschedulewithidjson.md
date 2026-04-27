# RfpAgendaItemScheduleWithIdJson

Contains RFP specific agenda items schedule information with agenda item id.

## Example Usage

```typescript
import { RfpAgendaItemScheduleWithIdJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: RfpAgendaItemScheduleWithIdJson = {
  dayNumber: 1,
  date: new RFCDate("2021-07-03"),
  id: "50dc08af-24a9-4d01-84be-3d43133dc945",
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `dayNumber`                                                            | *number*                                                               | :heavy_check_mark:                                                     | Day number relative to start of event on which the agenda item occurs. | 1                                                                      |
| `date`                                                                 | [RFCDate](../../types/rfcdate.md)                                      | :heavy_minus_sign:                                                     | The ISO 8601 date of the agenda item.                                  | 2021-07-03                                                             |
| `id`                                                                   | *string*                                                               | :heavy_minus_sign:                                                     | Unique ID of the agenda item.                                          | 50dc08af-24a9-4d01-84be-3d43133dc945                                   |