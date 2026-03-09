# AudioTrackStatusJson

Denotes the status of an audio track. Started indicates the request to upload in the API was submitted, and the URL you'll upload an audio track to was returned. Uploaded indicates that the upload was completed. Scanning indicates a virus scan is happening in a quarantine location; Scanned indicates a successful virus scan. Syncing indicates a complete virus scan, and now transcoding has begun. Rejected indicates a failed virus scan. Error indicates there was a problem processing the audio track. Available indicates the audio track is available for use.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = AudioTrackStatusJson.Started;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `Started`   | Started     |
| `Uploaded`  | Uploaded    |
| `Scanning`  | Scanning    |
| `Scanned`   | Scanned     |
| `Syncing`   | Syncing     |
| `Rejected`  | Rejected    |
| `Error`     | Error       |
| `Available` | Available   |