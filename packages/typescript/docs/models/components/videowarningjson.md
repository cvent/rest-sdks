# VideoWarningJson

This is used to denote the warnings for a video entity.

## Example Usage

```typescript
import { VideoWarningJson } from "@cvent/sdk/models/components";

let value: VideoWarningJson = {
  code: 700,
  message:
    "Video with ID: 5779387f-3f50-4685-8641-b25a2909845f has a bitrate of 586 kbps, which is lower than the minimum allowed bitrate of 3500 kbps.",
};
```

## Fields

| Field                                                                                                                                                     | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               | Example                                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `code`                                                                                                                                                    | [components.VideoWarningCodeJson](../../models/components/videowarningcodejson.md)                                                                        | :heavy_check_mark:                                                                                                                                        | This is used to denote the warning codes for a video entity.                                                                                              | 700                                                                                                                                                       |
| `message`                                                                                                                                                 | *string*                                                                                                                                                  | :heavy_check_mark:                                                                                                                                        | Warning message for the video. Message is a developer convenience never to be used in any context that needs localisation, subject to change at any time. | Video with ID: 5779387f-3f50-4685-8641-b25a2909845f has a bitrate of 586 kbps, which is lower than the minimum allowed bitrate of 3500 kbps.              |