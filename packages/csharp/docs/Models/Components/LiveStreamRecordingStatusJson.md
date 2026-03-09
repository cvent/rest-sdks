# LiveStreamRecordingStatusJson

This is used to denote the status of the live stream recording job

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = LiveStreamRecordingStatusJson.Error;
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `Error`             | error               |
| `Waiting`           | waiting             |
| `WaitingFinishLive` | waiting_finish_live |
| `Processing`        | processing          |
| `Cancelling`        | cancelling          |
| `Cancelled`         | cancelled           |
| `Finished`          | finished            |
| `Failed`            | failed              |
| `CreatingAsset`     | creating_asset      |