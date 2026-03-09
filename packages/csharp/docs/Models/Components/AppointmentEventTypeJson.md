# AppointmentEventTypeJson

Denotes the type of appointment event.<br/>STANDARD: You or attendees can manage schedules based on the permissions and settings you choose.<br/>UNIVERSAL: Your staff manages their schedules with attendees, at an event your staff is attending.<br/>PLANNER_COORDINATED: You manage attendee schedules for your event based on their preferences.<br/>SIMPLE: Import appointments or let attendees schedule them without any restrictions or prior setup.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = AppointmentEventTypeJson.Standard;
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `Standard`           | STANDARD             |
| `Universal`          | UNIVERSAL            |
| `PlannerCoordinated` | PLANNER_COORDINATED  |
| `Simple`             | SIMPLE               |