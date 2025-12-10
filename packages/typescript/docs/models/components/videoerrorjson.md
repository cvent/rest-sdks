# VideoErrorJson

This is used to denote the errors for a video entity.

## Example Usage

```typescript
import { VideoErrorJson } from "@cvent/sdk/models/components";

let value: VideoErrorJson = {
  code: 601,
  message: "Transcoding failed due to an unsupported video codec.",
};
```

## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `code`                                                                                                                                                  | [components.VideoErrorCodeJson](../../models/components/videoerrorcodejson.md)                                                                          | :heavy_check_mark:                                                                                                                                      | This is used to denote the error codes for a video entity.                                                                                              | 601                                                                                                                                                     |
| `message`                                                                                                                                               | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | Error message for the video. Message is a developer convenience never to be used in any context that needs localisation, subject to change at any time. | Transcoding failed due to an unsupported video codec.                                                                                                   |