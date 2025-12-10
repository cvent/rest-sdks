# ScheduleJson

A scheduled action.

## Example Usage

```typescript
import { ScheduleJson } from "@cvent/sdk/models/components";

let value: ScheduleJson = {
  scheduledExecution: new Date("2024-03-05T09:00:00Z"),
  action: "activate",
};
```

## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                              | *string*                                                                                                                          | :heavy_minus_sign:                                                                                                                | Unique ID of the scheduled task.                                                                                                  |                                                                                                                                   |
| `scheduledExecution`                                                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                     | :heavy_minus_sign:                                                                                                                | The ISO 8601 zoned date time when the session will be moved to the next stage: provisioning, activation, deactivation or archival | 2024-03-05T09:00:00Z                                                                                                              |
| `action`                                                                                                                          | [components.ScheduleActionJson](../../models/components/scheduleactionjson.md)                                                    | :heavy_minus_sign:                                                                                                                | This is used to denote the action to perform with the scheduled task                                                              | activate                                                                                                                          |