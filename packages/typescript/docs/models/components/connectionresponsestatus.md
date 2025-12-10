# ConnectionResponseStatus

Status of the connection. `REQUESTED` indicates the connection request is being processed. `NOT_CONNECTED` indicates there is no current connection. `CONNECTED` indicates this housing event is connected to a registration event.

## Example Usage

```typescript
import { ConnectionResponseStatus } from "@cvent/sdk/models/components";

let value: ConnectionResponseStatus = "CONNECTED";
```

## Values

```typescript
"NOT_CONNECTED" | "CONNECTED" | "REQUESTED"
```