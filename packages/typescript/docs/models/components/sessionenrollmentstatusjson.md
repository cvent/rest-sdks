# SessionEnrollmentStatusJson

Denotes the attendee's status in the session. Registered: The attendee is registered for the session. Waitlisted: The attendee is on a waitlist to register for the session. Cancelled: The attendee's registration for the session has been cancelled.

## Example Usage

```typescript
import { SessionEnrollmentStatusJson } from "@cvent/sdk/models/components";

let value: SessionEnrollmentStatusJson = "Waitlisted";
```

## Values

```typescript
"Registered" | "Waitlisted" | "Cancelled"
```