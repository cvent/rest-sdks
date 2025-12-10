# ~~DeviceJson~~

The device details used to watched a video. This field has been deprecated.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `id`                                                                                   | *Optional\<String>*                                                                    | :heavy_minus_sign:                                                                     | The unique ID of the device the viewer used to watch the video.                        | CA1.b4c5061e36fa60ebc5aad0ccea95f900b34794ecad49e965eaa94f7c534dec83                   |
| `type`                                                                                 | [Optional\<DeviceTypeJson>](../../models/components/DeviceTypeJson.md)                 | :heavy_minus_sign:                                                                     | The device used to watch the video. Videos can be viewed on desktop, mobile or tablet. |                                                                                        |
| `operatingSystem`                                                                      | *Optional\<String>*                                                                    | :heavy_minus_sign:                                                                     | The device's operating system.                                                         | Mac OS                                                                                 |