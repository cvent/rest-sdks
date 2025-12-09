# EventCheckedIn

An email-checked-in activity.

## Example Usage

```typescript
import { EventCheckedIn } from "@cvent/sdk/models/components";

let value: EventCheckedIn = {
  checkedIn: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `event`                                                                                       | [components.ActivityDataJsonEvent2](../../models/components/activitydatajsonevent2.md)        | :heavy_minus_sign:                                                                            | The event in which this activity occurred.                                                    |                                                                                               |
| `checkedIn`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an attendee checked in to an event.                               | 2020-02-03T13:00:00.000Z                                                                      |