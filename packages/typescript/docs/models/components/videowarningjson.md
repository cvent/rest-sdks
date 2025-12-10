# VideoWarningJson

This is used to denote the warnings for a video entity.

## Example Usage

```typescript
import { VideoWarningJson } from "@cvent/sdk/models/components";

let value: VideoWarningJson = {
  code: 700,
  message: "Input video is scaled down to 1080p resolution.",
};
```

## Fields

| Field                                                                                                                                                     | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               | Example                                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `code`                                                                                                                                                    | [components.VideoWarningCodeJson](../../models/components/videowarningcodejson.md)                                                                        | :heavy_check_mark:                                                                                                                                        | This is used to denote the warning codes for a video entity.                                                                                              | 700                                                                                                                                                       |
| `message`                                                                                                                                                 | *string*                                                                                                                                                  | :heavy_check_mark:                                                                                                                                        | Warning message for the video. Message is a developer convenience never to be used in any context that needs localisation, subject to change at any time. | Input video is scaled down to 1080p resolution.                                                                                                           |