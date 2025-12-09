# LiveStreamStatusJson

This is used to denote the status of the stream

## Example Usage

```typescript
import { LiveStreamStatusJson } from "@cvent/sdk/models/components";

let value: LiveStreamStatusJson = "Standby";
```

## Values

```typescript
"Error" | "Standby" | "Waiting" | "Processing" | "Disconnected" | "Cancelling" | "Finishing" | "Cancelled" | "Finished" | "Failed" | "Scheduled" | "Starving"
```