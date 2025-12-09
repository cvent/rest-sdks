# VideoSourceJson

Source of video.

## Example Usage

```typescript
import { VideoSourceJson } from "@cvent/sdk/models/components";

let value: VideoSourceJson = {
  id: "VD134567",
  status: "Active",
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_minus_sign:                                                                   | The id of a video in the external system                                             | VD134567                                                                             |
| `status`                                                                             | [components.VideoSourceJsonStatus](../../models/components/videosourcejsonstatus.md) | :heavy_minus_sign:                                                                   | Denotes the status of the video in the third-party system.                           | Active                                                                               |