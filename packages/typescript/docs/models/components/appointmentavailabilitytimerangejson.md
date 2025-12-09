# AppointmentAvailabilityTimeRangeJson

Time range for an appointment availability.

## Example Usage

```typescript
import { AppointmentAvailabilityTimeRangeJson } from "@cvent/sdk/models/components";

let value: AppointmentAvailabilityTimeRangeJson = {
  start: "2020-04-01T19:00:00.000",
  end: "2020-04-01T20:00:00.000",
  type: "AVAILABLE",
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `start`                                                                                                  | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | The ISO 8601 formatted start datetime of the time range, in the event's timezone.                        | 2020-04-01T19:00:00.000                                                                                  |
| `end`                                                                                                    | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | The ISO 8601 formatted end datetime of the time range, in the event's timezone.                          | 2020-04-01T20:00:00.000                                                                                  |
| `type`                                                                                                   | [components.AppointmentAvailabilityTypeJson](../../models/components/appointmentavailabilitytypejson.md) | :heavy_minus_sign:                                                                                       | Denotes whether an availability time range represents when an attendee is available or unavailable.      | AVAILABLE                                                                                                |