# AttendeeUpdateStatusJson

Denotes the status of an attendee to be updated. No Response: The attendee was added to an invitation list but hasn't taken any action. Accepted: The attendee is registered for the event. Cancelled: The attendee's registration for the event is cancelled. Visited: The attendee visited the event's webpage but didn't finish registration. Declined: The attendee declined to attend the event. Pending Approval: When registration approval is enabled, this status indicates the attendee is still waiting to be approved by the planner. Denied Approval: When registration approval is enabled, this status indicates the attendee has been denied approval by the planner. <br>The following status transitions are supported by this API:<br> * No Response -> Visited <br> * No Response -> Accepted <br> * No Response -> Declined <br> * No Response -> Pending Approval <br> * Cancelled -> Accepted <br> * Cancelled -> Pending Approval <br> * Visited -> Accepted <br> * Visited -> Pending Approval <br> * Declined -> Accepted <br> * Declined -> Pending Approval <br> * Accepted -> Cancelled <br> * Pending Approval -> Accepted <br> * Pending Approval -> Denied Approval <br> * Denied Approval -> Pending Approval


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `NoResponse`      | No Response       |
| `Accepted`        | Accepted          |
| `Cancelled`       | Cancelled         |
| `Visited`         | Visited           |
| `Declined`        | Declined          |
| `PendingApproval` | Pending Approval  |
| `DeniedApproval`  | Denied Approval   |