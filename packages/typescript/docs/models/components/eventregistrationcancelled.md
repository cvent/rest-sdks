# EventRegistrationCancelled

An event-registered activity.

## Example Usage

```typescript
import { EventRegistrationCancelled } from "@cvent/sdk/models/components";

let value: EventRegistrationCancelled = {
  status: "Accepted",
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `event`                                                                        | [components.ActivityDataEvent5](../../models/components/activitydataevent5.md) | :heavy_minus_sign:                                                             | The event in which this activity occurred.                                     |                                                                                |
| `status`                                                                       | [components.AttendeeStatus](../../models/components/attendeestatus.md)         | :heavy_minus_sign:                                                             | This is used to denote the status of an attendee.                              | Accepted                                                                       |