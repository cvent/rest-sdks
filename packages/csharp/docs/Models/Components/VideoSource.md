# VideoSource

Information about the video's external source, including its ID and status.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Id`                                                              | *string*                                                          | :heavy_minus_sign:                                                | The ID of a video in the external system.                         | VD134567                                                          |
| `Status`                                                          | [VideoSourceStatus](../../Models/Components/VideoSourceStatus.md) | :heavy_minus_sign:                                                | Denotes the status of the video in the third-party system.        | Active                                                            |