# AttendeeUpdateStatus

Denotes the status of an attendee to be updated. No Response: The attendee was added to an invitation list but hasn't taken any action. Accepted: The attendee is registered for the event. Cancelled: The attendee's registration for the event is cancelled. Visited: The attendee visited the event's webpage but didn't finish registration. Declined: The attendee declined to attend the event. Pending Approval: When registration approval is enabled, this status indicates the attendee is still waiting to be approved by the planner. Denied Approval: When registration approval is enabled, this status indicates the attendee has been denied approval by the planner. Waitlisted: The attendee is on the waitlist for the event.
The following status transitions are supported by this API:
* No Response -> Visited
* No Response -> Accepted
* No Response -> Declined
* No Response -> Pending Approval
* Cancelled -> Accepted
* Cancelled -> Pending Approval
* Visited -> Accepted
* Visited -> Pending Approval
* Declined -> Accepted
* Declined -> Pending Approval
* Accepted -> Cancelled
* Pending Approval -> Accepted
* Pending Approval -> Cancelled
* Pending Approval -> Denied Approval
* Denied Approval -> Pending Approval
* Waitlisted -> Accepted

## Example Usage

```java
import com.cvent.models.components.AttendeeUpdateStatus;

AttendeeUpdateStatus value = AttendeeUpdateStatus.NO_RESPONSE;
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `NO_RESPONSE`      | No Response        |
| `ACCEPTED`         | Accepted           |
| `CANCELLED`        | Cancelled          |
| `VISITED`          | Visited            |
| `DECLINED`         | Declined           |
| `PENDING_APPROVAL` | Pending Approval   |
| `DENIED_APPROVAL`  | Denied Approval    |
| `WAITLISTED`       | Waitlisted         |