# AttendeeAddStatusJson

Denotes the status of an attendee being added. No Response: The attendee was added to an invitation list but hasn't taken any action. Accepted: The attendee is registered for the event. Pending Approval: When registration approval is enabled, this status indicates the attendee is still waiting to be approved by the planner.

## Example Usage

```java
import com.cvent.models.components.AttendeeAddStatusJson;

AttendeeAddStatusJson value = AttendeeAddStatusJson.NO_RESPONSE;
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `NO_RESPONSE`      | No Response        |
| `ACCEPTED`         | Accepted           |
| `PENDING_APPROVAL` | Pending Approval   |