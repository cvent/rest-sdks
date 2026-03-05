# VideoTextTrackStatusJson

Denotes the status of a video text track (VTT). Started indicates a request to upload in the API, and the URL to upload to was returned. Uploaded indicates that the upload was completed. Available indicates the VTT is available for use. Rejected indicates a failed virus scan. Error indicates there was a problem processing the VTT.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = VideoTextTrackStatusJson.Started;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `Started`      | Started        |
| `Uploaded`     | Uploaded       |
| `Processing`   | Processing     |
| `Available`    | Available      |
| `Rejected`     | Rejected       |
| `Updating`     | Updating       |
| `Translating`  | Translating    |
| `Transcribing` | Transcribing   |
| `Error`        | Error          |