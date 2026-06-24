# VideoSource

Source of video.

## Example Usage

```typescript
import { VideoSource } from "@cvent/sdk/models/components";

let value: VideoSource = {
  id: "VD134567",
  status: "Active",
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *string*                                                                     | :heavy_minus_sign:                                                           | The id of a video in the external system                                     | VD134567                                                                     |
| `status`                                                                     | [components.VideoSourceStatus](../../models/components/videosourcestatus.md) | :heavy_minus_sign:                                                           | Denotes the status of the video in the third-party system.                   | Active                                                                       |