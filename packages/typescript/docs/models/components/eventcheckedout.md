# EventCheckedOut

An email-checked-out activity.

## Example Usage

```typescript
import { EventCheckedOut } from "@cvent/sdk/models/components";

let value: EventCheckedOut = {
  checkOut: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `event`                                                                                       | [components.ActivityDataJsonEvent3](../../models/components/activitydatajsonevent3.md)        | :heavy_minus_sign:                                                                            | The event in which this activity occurred.                                                    |                                                                                               |
| `checkOut`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an attendee checked out from an event.                            | 2020-02-03T13:00:00.000Z                                                                      |