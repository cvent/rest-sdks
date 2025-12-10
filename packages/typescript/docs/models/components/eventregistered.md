# EventRegistered

An event-registered activity.

## Example Usage

```typescript
import { EventRegistered } from "@cvent/sdk/models/components";

let value: EventRegistered = {
  status: "Accepted",
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `event`                                                                                | [components.ActivityDataJsonEvent7](../../models/components/activitydatajsonevent7.md) | :heavy_minus_sign:                                                                     | The event in which this activity occurred.                                             |                                                                                        |
| `status`                                                                               | [components.AttendeeStatusJson](../../models/components/attendeestatusjson.md)         | :heavy_minus_sign:                                                                     | This is used to denote the status of an attendee.                                      | Accepted                                                                               |