# ConnectionResponseStatus

Status of the connection. `REQUESTED` indicates the connection request is being processed. `NOT_CONNECTED` indicates there is no current connection. `CONNECTED` indicates this housing event is connected to a registration event.

## Example Usage

```java
import com.cvent.models.components.ConnectionResponseStatus;

ConnectionResponseStatus value = ConnectionResponseStatus.NOT_CONNECTED;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NOT_CONNECTED` | NOT_CONNECTED   |
| `CONNECTED`     | CONNECTED       |
| `REQUESTED`     | REQUESTED       |