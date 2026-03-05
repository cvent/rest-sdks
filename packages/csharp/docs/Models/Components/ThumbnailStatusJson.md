# ThumbnailStatusJson

Denotes the status of a thumbnail. Started indicates the request to upload in the API was submitted, and the URL you'll upload a thumbnail to was returned. Uploaded indicates that the upload was completed. Processing indicates that a virus scan is in progress. Available indicates the thumbnail passed the scan and is ready for use. Rejected indicates there was a problem processing the thumbnail.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ThumbnailStatusJson.Started;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `Started`    | Started      |
| `Uploaded`   | Uploaded     |
| `Processing` | Processing   |
| `Available`  | Available    |
| `Rejected`   | Rejected     |