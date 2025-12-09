# LiveStreamJson

A webcast Live Stream.

## Example Usage

```typescript
import { LiveStreamJson } from "@cvent/sdk/models/components";

let value: LiveStreamJson = {
  id: "stream1256wet",
  url: "https://cvent.zoom.us/j/7566652259",
  key: "145asa16ZS78",
  status: "Standby",
  session: {
    id: "st-1A2b3c4D5e6F78ghij9Klmn",
  },
  page: "https://cvent.zoom.aspx/j/7566652259",
  recording: {
    id: "62989518f9294e19b2f7e184e8141d72",
    status: "finished",
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `id`                                                                                     | *string*                                                                                 | :heavy_minus_sign:                                                                       | Unique ID of the stream.                                                                 | stream1256wet                                                                            |
| `url`                                                                                    | *string*                                                                                 | :heavy_minus_sign:                                                                       | A RTMP url of the stream.                                                                | https://cvent.zoom.us/j/7566652259                                                       |
| `key`                                                                                    | *string*                                                                                 | :heavy_minus_sign:                                                                       | Access key of the stream.                                                                | 145asa16ZS78                                                                             |
| `status`                                                                                 | [components.LiveStreamStatusJson](../../models/components/livestreamstatusjson.md)       | :heavy_minus_sign:                                                                       | This is used to denote the status of the stream                                          | Standby                                                                                  |
| `session`                                                                                | [components.LiveStreamSessionJson](../../models/components/livestreamsessionjson.md)     | :heavy_minus_sign:                                                                       | Provides information about the livestream's current streaming session                    |                                                                                          |
| `page`                                                                                   | *string*                                                                                 | :heavy_minus_sign:                                                                       | A url of the page where live stream to be streamed.                                      | https://cvent.zoom.aspx/j/7566652259                                                     |
| `recording`                                                                              | [components.LiveStreamRecordingJson](../../models/components/livestreamrecordingjson.md) | :heavy_minus_sign:                                                                       | Provides information about the livestream's recording                                    |                                                                                          |