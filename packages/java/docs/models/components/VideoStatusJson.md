# VideoStatusJson

Denotes the status of a video. Started indicates the request to upload in the API was submitted, and the URL to upload to was returned. Uploaded indicates that the upload was completed. Scanning indicates a virus scan is happening in a quarantine location; Scanned indicates a successful virus scan. Syncing indicates a complete virus scan, and now transcoding has begun. Rejected indicates a failed virus scan. Error indicates there was a problem processing the video. Available indicates the video is available for use.


## Values

| Name         | Value        |
| ------------ | ------------ |
| `STARTED`    | Started      |
| `UPLOADED`   | Uploaded     |
| `SCANNING`   | Scanning     |
| `SCANNED`    | Scanned      |
| `SYNCING`    | Syncing      |
| `REJECTED`   | Rejected     |
| `ERROR`      | Error        |
| `AVAILABLE`  | Available    |
| `UPCOMING`   | Upcoming     |
| `RE_SYNCING` | ReSyncing    |