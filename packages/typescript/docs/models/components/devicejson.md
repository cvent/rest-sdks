# ~~DeviceJson~~

The device details used to watched a video. This field has been deprecated.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { DeviceJson } from "@cvent/sdk/models/components";

let value: DeviceJson = {
  id: "CA1.b4c5061e36fa60ebc5aad0ccea95f900b34794ecad49e965eaa94f7c534dec83",
  operatingSystem: "Mac OS",
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `id`                                                                                   | *string*                                                                               | :heavy_minus_sign:                                                                     | The unique ID of the device the viewer used to watch the video.                        | CA1.b4c5061e36fa60ebc5aad0ccea95f900b34794ecad49e965eaa94f7c534dec83                   |
| `type`                                                                                 | [components.DeviceTypeJson](../../models/components/devicetypejson.md)                 | :heavy_minus_sign:                                                                     | The device used to watch the video. Videos can be viewed on desktop, mobile or tablet. |                                                                                        |
| `operatingSystem`                                                                      | *string*                                                                               | :heavy_minus_sign:                                                                     | The device's operating system.                                                         | Mac OS                                                                                 |