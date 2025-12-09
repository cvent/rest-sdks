# EventAsyncStatus

Status of an event asynchronous operation.

## Example Usage

```typescript
import { EventAsyncStatus } from "@cvent/sdk/models/components";

let value: EventAsyncStatus = {
  id: "9163c74j-67c6-401c-k710-oe0f783bf022",
  status: "Processing",
  event: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  },
};
```

## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             | Example                                                                                 |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `id`                                                                                    | *string*                                                                                | :heavy_check_mark:                                                                      | The identifier to be used to get the async status of the event being created or copied. | 9163c74j-67c6-401c-k710-oe0f783bf022                                                    |
| `status`                                                                                | [components.EventAsyncStatusStatus](../../models/components/eventasyncstatusstatus.md)  | :heavy_check_mark:                                                                      | The status of the event being created or copied.                                        | Processing                                                                              |
| `event`                                                                                 | [components.EventAsyncStatusEvent](../../models/components/eventasyncstatusevent.md)    | :heavy_minus_sign:                                                                      | The event for the operation.                                                            |                                                                                         |