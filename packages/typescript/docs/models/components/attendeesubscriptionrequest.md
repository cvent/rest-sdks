# AttendeeSubscriptionRequest

Request body for updating an attendee's email subscription status.

## Example Usage

```typescript
import { AttendeeSubscriptionRequest } from "@cvent/sdk/models/components";

let value: AttendeeSubscriptionRequest = {
  unsubscribed: true,
};
```

## Fields

| Field                                                                                                                                        | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  | Example                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `unsubscribed`                                                                                                                               | *boolean*                                                                                                                                    | :heavy_check_mark:                                                                                                                           | The subscription status to set. True means the attendee will be unsubscribed from email communications, false means they will be subscribed. | true                                                                                                                                         |