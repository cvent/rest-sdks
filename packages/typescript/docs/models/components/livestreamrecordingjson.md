# LiveStreamRecordingJson

Provides information about the livestream's recording

## Example Usage

```typescript
import { LiveStreamRecordingJson } from "@cvent/sdk/models/components";

let value: LiveStreamRecordingJson = {
  id: "62989518f9294e19b2f7e184e8141d72",
  status: "finished",
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `id`                                                                                                 | *string*                                                                                             | :heavy_minus_sign:                                                                                   | Unique ID of the live stream recording job.                                                          | 62989518f9294e19b2f7e184e8141d72                                                                     |
| `status`                                                                                             | [components.LiveStreamRecordingStatusJson](../../models/components/livestreamrecordingstatusjson.md) | :heavy_minus_sign:                                                                                   | This is used to denote the status of the live stream recording job                                   | finished                                                                                             |