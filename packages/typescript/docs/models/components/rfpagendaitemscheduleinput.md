# RfpAgendaItemScheduleInput

Schedule information for an RFP agenda item.

## Example Usage

```typescript
import { RfpAgendaItemScheduleInput } from "@cvent/sdk/models/components";

let value: RfpAgendaItemScheduleInput = {
  dayNumber: 1,
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `dayNumber`                                                            | *number*                                                               | :heavy_check_mark:                                                     | Day number relative to start of event on which the agenda item occurs. | 1                                                                      |