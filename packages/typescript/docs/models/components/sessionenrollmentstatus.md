# SessionEnrollmentStatus

Denotes the attendee's status in the session. Registered: The attendee is registered for the session. Waitlisted: The attendee is on a waitlist to register for the session. Cancelled: The attendee's registration for the session has been cancelled.

## Example Usage

```typescript
import { SessionEnrollmentStatus } from "@cvent/sdk/models/components";

let value: SessionEnrollmentStatus = "Waitlisted";
```

## Values

```typescript
"Registered" | "Waitlisted" | "Cancelled"
```