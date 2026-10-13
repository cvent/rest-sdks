# APIKeyAuthenticationAuthorizationHeaderType

Authorization header support characterizing the authentication type to be used for callbacks to the client system. API Key, or HTTP Basic Authentication, each configured with a corresponding option.

## Example Usage

```typescript
import { APIKeyAuthenticationAuthorizationHeaderType } from "@cvent/sdk/models/components";

let value: APIKeyAuthenticationAuthorizationHeaderType = "apiKey";
```

## Values

```typescript
"apiKey" | "basic"
```