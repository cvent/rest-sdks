# FeatureTypeJson

The type of feature available for a container event.

| Value | Description |
|-------|-------------|
| `Website` | Allows you to promote your event with a customizable series of pages. |
| `Registration` | Allows attendees to sign up for your event ahead of time. Once done, they can modify their details or cancel altogether if you allow it. |
| `OnArrival` | Adds several options designed to make supporting your live event as smooth as possible. |
| `AttendeeHub` | Delivers the attendee-facing website and mobile app with agenda/content, engagement tools (live Q&A, polls, gamification), and networking—launchable independently of registration. |
| `Appointments` | Enables attendees, exhibitors, and staff to schedule and manage 1:1 meetings within Attendee Hub. |
| `Planning` | Adds new ways to stay organized behind the scenes throughout the entire event process. |
| `Agenda` | Allows you to manage the breakouts, presentations, or activities (known in Cvent as sessions) that make up your event. |
| `Travel` | Allows you to easily collect and manage invitees' hotel and flight preferences. |
| `Marketing` | Allows planners to create, personalize, and automate branded event emails (invites, reminders, confirmations) and track performance to drive registrations and engagement. |
| `Surveys` | Adds a customizable questionnaire you can use to gather feedback. |
| `Speakers` | Allows you to showcase and manage all the headliners, keynoters, presenters, and moderators contributing to your event. |
| `Exhibitors` | Centralizes exhibitor setup—profiles, tasks, content/categories—and booth staff and LeadCapture management, with exhibitor listings and engagement surfaced in Attendee Hub. |
| `Vendors` | Allows planners to source and manage event services directly from the container event. |
| `EventAds` | Allows planners to create, place, and track targeted ads across Attendee Hub and the event app. |
| `EventCredits` | Allows planners to set rules and track credits attendees earn for sessions and the event. |

## Example Usage

```typescript
import { FeatureTypeJson } from "@cvent/sdk/models/components";

let value: FeatureTypeJson = "Registration";
```

## Values

```typescript
"Website" | "Registration" | "OnArrival" | "AttendeeHub" | "Appointments" | "Planning" | "Agenda" | "Travel" | "Marketing" | "Surveys" | "Speakers" | "Exhibitors" | "Vendors" | "EventAds" | "EventCredits"
```