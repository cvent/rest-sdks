# HlsInputWithClipsJson

HTTP Live Streaming input and clips.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `hlsInput`                                                       | *Optional\<String>*                                              | :heavy_minus_sign:                                               | Location for HTTP Live Streaming (HLS) recording.                | s3://bucket/path/to/recording/video.m3u8                         |
| `clips`                                                          | List\<[VideoClipJson](../../models/components/VideoClipJson.md)> | :heavy_minus_sign:                                               | Clips for the HLS recording.                                     |                                                                  |