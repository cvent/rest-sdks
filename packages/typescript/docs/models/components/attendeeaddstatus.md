# AttendeeAddStatus

Denotes the status of an attendee being added. No Response: The attendee was added to an invitation list but hasn't taken any action. Accepted: The attendee is registered for the event. Pending Approval: When registration approval is enabled, this status indicates the attendee is still waiting to be approved by the planner.

## Example Usage

```typescript
import { AttendeeAddStatus } from "@cvent/sdk/models/components";

let value: AttendeeAddStatus = "Accepted";
```

## Values

```typescript
"No Response" | "Accepted" | "Pending Approval"
```