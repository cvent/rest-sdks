# ConnectionResponseStatus

Status of the connection. `REQUESTED` indicates the connection request is being processed. `NOT_CONNECTED` indicates there is no current connection. `CONNECTED` indicates this housing event is connected to a registration event.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ConnectionResponseStatus.NotConnected;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `NotConnected` | NOT_CONNECTED  |
| `Connected`    | CONNECTED      |
| `Requested`    | REQUESTED      |