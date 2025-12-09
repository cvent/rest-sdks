# EventAsyncResponse

Asynchronous event operation job details.

## Example Usage

```typescript
import { EventAsyncResponse } from "@cvent/sdk/models/components";

let value: EventAsyncResponse = {
  id: "9163c74j-67c6-401c-k710-oe0f783bf022",
  status: "Processing",
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `id`                                                                                       | *string*                                                                                   | :heavy_check_mark:                                                                         | The identifier to be used to get the async status of the event being created or copied.    | 9163c74j-67c6-401c-k710-oe0f783bf022                                                       |
| `status`                                                                                   | [components.EventAsyncResponseStatus](../../models/components/eventasyncresponsestatus.md) | :heavy_check_mark:                                                                         | The status of the event being created or copied.                                           | Processing                                                                                 |