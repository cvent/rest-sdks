# HlsInputWithClipsJson

HTTP Live Streaming input and clips.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `HlsInput`                                                      | *string*                                                        | :heavy_minus_sign:                                              | Location for HTTP Live Streaming (HLS) recording.               | s3://bucket/path/to/recording/video.m3u8                        |
| `Clips`                                                         | List<[VideoClipJson](../../Models/Components/VideoClipJson.md)> | :heavy_minus_sign:                                              | Clips for the HLS recording.                                    |                                                                 |