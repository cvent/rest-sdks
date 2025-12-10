# CreateTextTrackRequest

## Example Usage

```typescript
import { CreateTextTrackRequest } from "@cvent/sdk/models/operations";

let value: CreateTextTrackRequest = {
  videoId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  videoTextTrack: {
    video: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    label: "English",
    language: "en-US",
    kind: "subtitles",
    status: "Started",
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `videoId`                                                              | *string*                                                               | :heavy_check_mark:                                                     | The identifier of a video.                                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                   |
| `videoTextTrack`                                                       | [components.VideoTextTrack](../../models/components/videotexttrack.md) | :heavy_check_mark:                                                     | N/A                                                                    |                                                                        |