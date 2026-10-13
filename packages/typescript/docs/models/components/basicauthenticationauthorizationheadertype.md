# BasicAuthenticationAuthorizationHeaderType

Authorization header support characterizing the authentication type to be used for callbacks to the client system. API Key, or HTTP Basic Authentication, each configured with a corresponding option.

## Example Usage

```typescript
import { BasicAuthenticationAuthorizationHeaderType } from "@cvent/sdk/models/components";

let value: BasicAuthenticationAuthorizationHeaderType = "apiKey";
```

## Values

```typescript
"apiKey" | "basic"
```