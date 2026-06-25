# VideoTextTrackStatus

Denotes the status of a video text track (VTT). Started indicates a request to upload in the API, and the URL to upload to was returned. Uploaded indicates that the upload was completed. Available indicates the VTT is available for use. Rejected indicates a failed virus scan. Error indicates there was a problem processing the VTT.

## Example Usage

```typescript
import { VideoTextTrackStatus } from "@cvent/sdk/models/components";

let value: VideoTextTrackStatus = "Started";
```

## Values

```typescript
"Started" | "Uploaded" | "Processing" | "Available" | "Rejected" | "Updating" | "Translating" | "Transcribing" | "Error"
```