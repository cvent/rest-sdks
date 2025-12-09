# ContactObfuscationStatusTypeJson

Status of the request to obfuscate a contact.

INITIATED - The obfuscation request has been received.

QUEUED - The obfuscation request is currently waiting in the queue to be executed.

PROCESSING -  The obfuscation request is currently being processed.

COMPLETED -  The obfuscation request is complete.

FAILED - The obfuscation request failed due to an error.

## Example Usage

```typescript
import { ContactObfuscationStatusTypeJson } from "@cvent/sdk/models/components";

let value: ContactObfuscationStatusTypeJson = "INITIATED";
```

## Values

```typescript
"INITIATED" | "QUEUED" | "PROCESSING" | "COMPLETED" | "FAILED"
```