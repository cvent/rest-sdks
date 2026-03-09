# AttendeeAddStatusJson

Denotes the status of an attendee being added. No Response: The attendee was added to an invitation list but hasn't taken any action. Accepted: The attendee is registered for the event. Pending Approval: When registration approval is enabled, this status indicates the attendee is still waiting to be approved by the planner.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = AttendeeAddStatusJson.NoResponse;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `NoResponse`      | No Response       |
| `Accepted`        | Accepted          |
| `PendingApproval` | Pending Approval  |