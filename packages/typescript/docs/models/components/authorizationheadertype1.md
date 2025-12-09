# AuthorizationHeaderType1

Authorization header support characterizing the authentication type to be used for callbacks to the client system. API Key, or HTTP Basic Authentication, each configured with a corresponding option.

## Example Usage

```typescript
import { AuthorizationHeaderType1 } from "@cvent/sdk/models/components";

let value: AuthorizationHeaderType1 = "apiKey";
```

## Values

```typescript
"apiKey" | "basic"
```