# LiveStreamRecordingStatusJson

This is used to denote the status of the live stream recording job

## Example Usage

```typescript
import { LiveStreamRecordingStatusJson } from "@cvent/sdk/models/components";

let value: LiveStreamRecordingStatusJson = "finished";
```

## Values

```typescript
"error" | "waiting" | "waiting_finish_live" | "processing" | "cancelling" | "cancelled" | "finished" | "failed" | "creating_asset"
```