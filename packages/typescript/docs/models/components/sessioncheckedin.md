# SessionCheckedIn

A session checked-in activity.

## Example Usage

```typescript
import { SessionCheckedIn } from "@cvent/sdk/models/components";

let value: SessionCheckedIn = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  checkedIn: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `session`                                                                                     | [components.SessionActivity1](../../models/components/sessionactivity1.md)                    | :heavy_minus_sign:                                                                            | The activity session.                                                                         |                                                                                               |
| `checkedIn`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an attendee checked in to a session.                              | 2020-02-03T13:00:00.000Z                                                                      |