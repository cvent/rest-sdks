# SessionCheckedOut

A session checked-Out activity.

## Example Usage

```typescript
import { SessionCheckedOut } from "@cvent/sdk/models/components";

let value: SessionCheckedOut = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  checkOut: new Date("2020-02-03T13:00:00.000Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `session`                                                                                     | [components.SessionActivity2](../../models/components/sessionactivity2.md)                    | :heavy_minus_sign:                                                                            | The activity session.                                                                         |                                                                                               |
| `checkOut`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time when an attendee checked out from a session.                           | 2020-02-03T13:00:00.000Z                                                                      |