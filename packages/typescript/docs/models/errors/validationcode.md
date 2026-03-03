# ValidationCode

Business validation code for bad requests.

## Example Usage

```typescript
import { ValidationCode } from "@cvent/sdk/models/errors";

let value: ValidationCode = "SEGMENTS_PER_EVENT_LIMIT_REACHED";
```

## Values

```typescript
"ATTENDEES_PER_SEGMENT_LIMIT_REACHED" | "DUPLICATE_SEGMENT_NAME" | "ERROR_CHECKING_CONNECTION_TO_LINKEDIN" | "SEGMENT_CONNECTED_TO_LINKEDIN" | "SEGMENTS_PER_ATTENDEE_LIMIT_REACHED" | "SEGMENTS_PER_EVENT_LIMIT_REACHED"
```