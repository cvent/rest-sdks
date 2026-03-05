# ContactObfuscationStatusTypeJson

Status of the request to obfuscate a contact.

INITIATED - The obfuscation request has been received.

QUEUED - The obfuscation request is currently waiting in the queue to be executed.

PROCESSING -  The obfuscation request is currently being processed.

COMPLETED -  The obfuscation request is complete.

FAILED - The obfuscation request failed due to an error.

## Example Usage

```java
import com.cvent.models.components.ContactObfuscationStatusTypeJson;

ContactObfuscationStatusTypeJson value = ContactObfuscationStatusTypeJson.INITIATED;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `INITIATED`  | INITIATED    |
| `QUEUED`     | QUEUED       |
| `PROCESSING` | PROCESSING   |
| `COMPLETED`  | COMPLETED    |
| `FAILED`     | FAILED       |