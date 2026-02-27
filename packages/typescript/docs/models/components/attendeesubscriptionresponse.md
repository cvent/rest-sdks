# AttendeeSubscriptionResponse

Response body for successful attendee subscription status update.

## Example Usage

```typescript
import { AttendeeSubscriptionResponse } from "@cvent/sdk/models/components";

let value: AttendeeSubscriptionResponse = {
  attendee: {
    id: "123e4567-e89b-12d3-a456-426614174000",
  },
  unsubscribed: true,
};
```

## Fields

| Field                                                                                                                                | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          | Example                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `attendee`                                                                                                                           | [components.AttendeeSubscriptionResponseAttendee](../../models/components/attendeesubscriptionresponseattendee.md)                   | :heavy_check_mark:                                                                                                                   | The attendee whose subscription status is being updated.                                                                             |                                                                                                                                      |
| `unsubscribed`                                                                                                                       | *boolean*                                                                                                                            | :heavy_check_mark:                                                                                                                   | The updated subscription status. True means the attendee is unsubscribed from email communications, false means they are subscribed. | true                                                                                                                                 |