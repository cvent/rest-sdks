# HlsInputWithClipsJson

HTTP Live Streaming input and clips.

## Example Usage

```typescript
import { HlsInputWithClipsJson } from "@cvent/sdk/models/components";

let value: HlsInputWithClipsJson = {
  hlsInput: "s3://bucket/path/to/recording/video.m3u8",
  clips: [
    {
      start: "00:01:01:00",
      end: "00:05:00:00",
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `hlsInput`                                                             | *string*                                                               | :heavy_minus_sign:                                                     | Location for HTTP Live Streaming (HLS) recording.                      | s3://bucket/path/to/recording/video.m3u8                               |
| `clips`                                                                | [components.VideoClipJson](../../models/components/videoclipjson.md)[] | :heavy_minus_sign:                                                     | Clips for the HLS recording.                                           |                                                                        |