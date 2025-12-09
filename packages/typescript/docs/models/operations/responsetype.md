# ResponseType

The response type must be code. Indicates the client wants an authorization code (authorization code grant flow).

**Note:** *implicit flow* or the *token* value is not supported at this time.


## Example Usage

```typescript
import { ResponseType } from "@cvent/sdk/models/operations";

let value: ResponseType = "code";
```

## Values

```typescript
"code"
```