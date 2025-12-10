# EventWaitlisted

An event-registered activity.

## Example Usage

```typescript
import { EventWaitlisted } from "@cvent/sdk/models/components";

let value: EventWaitlisted = {
  status: "Accepted",
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `event`                                                                                | [components.ActivityDataJsonEvent9](../../models/components/activitydatajsonevent9.md) | :heavy_minus_sign:                                                                     | The event in which this activity occurred.                                             |                                                                                        |
| `status`                                                                               | [components.AttendeeStatusJson](../../models/components/attendeestatusjson.md)         | :heavy_minus_sign:                                                                     | This is used to denote the status of an attendee.                                      | Accepted                                                                               |