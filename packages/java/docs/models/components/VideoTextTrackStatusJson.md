# VideoTextTrackStatusJson

Denotes the status of a video text track (VTT). Started indicates a request to upload in the API, and the URL to upload to was returned. Uploaded indicates that the upload was completed. Available indicates the VTT is available for use. Rejected indicates a failed virus scan. Error indicates there was a problem processing the VTT.

## Example Usage

```java
import com.cvent.models.components.VideoTextTrackStatusJson;

VideoTextTrackStatusJson value = VideoTextTrackStatusJson.STARTED;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `STARTED`      | Started        |
| `UPLOADED`     | Uploaded       |
| `PROCESSING`   | Processing     |
| `AVAILABLE`    | Available      |
| `REJECTED`     | Rejected       |
| `UPDATING`     | Updating       |
| `TRANSLATING`  | Translating    |
| `TRANSCRIBING` | Transcribing   |
| `ERROR`        | Error          |