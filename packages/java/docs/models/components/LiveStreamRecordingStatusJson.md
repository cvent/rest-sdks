# LiveStreamRecordingStatusJson

This is used to denote the status of the live stream recording job

## Example Usage

```java
import com.cvent.models.components.LiveStreamRecordingStatusJson;

LiveStreamRecordingStatusJson value = LiveStreamRecordingStatusJson.ERROR;
```


## Values

| Name                  | Value                 |
| --------------------- | --------------------- |
| `ERROR`               | error                 |
| `WAITING`             | waiting               |
| `WAITING_FINISH_LIVE` | waiting_finish_live   |
| `PROCESSING`          | processing            |
| `CANCELLING`          | cancelling            |
| `CANCELLED`           | cancelled             |
| `FINISHED`            | finished              |
| `FAILED`              | failed                |
| `CREATING_ASSET`      | creating_asset        |