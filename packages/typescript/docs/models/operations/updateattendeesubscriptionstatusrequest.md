# UpdateAttendeeSubscriptionStatusRequest

## Example Usage

```typescript
import { UpdateAttendeeSubscriptionStatusRequest } from "@cvent/sdk/models/operations";

let value: UpdateAttendeeSubscriptionStatusRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  attendeeSubscriptionRequest: {
    unsubscribed: true,
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | The unique ID of an attendee.                                                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `attendeeSubscriptionRequest`                                                                    | [components.AttendeeSubscriptionRequest](../../models/components/attendeesubscriptionrequest.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |                                                                                                  |