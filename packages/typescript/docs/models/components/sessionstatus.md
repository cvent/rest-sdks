# SessionStatus

Active: The registration process is visible to invitees and accepts new registrations. Closed: The registration process is visible but does not accept new registrations or submissions. Cancelled: The planner cancelled the registration process.

## Example Usage

```typescript
import { SessionStatus } from "@cvent/sdk/models/components";

let value: SessionStatus = "Active";
```

## Values

```typescript
"Active" | "Cancelled" | "Closed"
```