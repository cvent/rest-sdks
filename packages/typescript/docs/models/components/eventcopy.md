# EventCopy

Represents directives for the event copy operation.

## Example Usage

```typescript
import { EventCopy } from "@cvent/sdk/models/components";

let value: EventCopy = {
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  registration: {},
  planning: {},
  agenda: {},
  travel: {},
  surveys: {},
  speakers: {},
  exhibitors: {},
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `event`                                                                                              | [components.EventCopyTargetJson](../../models/components/eventcopytargetjson.md)                     | :heavy_minus_sign:                                                                                   | Represents the target event information for an event copy operation.                                 |
| `registration`                                                                                       | [components.RegistrationEventCopyOverride](../../models/components/registrationeventcopyoverride.md) | :heavy_minus_sign:                                                                                   | Determines if registration feature data should be copied over from the source event.                 |
| `planning`                                                                                           | [components.PlanningEventCopyOverride](../../models/components/planningeventcopyoverride.md)         | :heavy_minus_sign:                                                                                   | Determines if planning feature data should be copied over from the source event.                     |
| `agenda`                                                                                             | [components.AgendaEventCopyOverride](../../models/components/agendaeventcopyoverride.md)             | :heavy_minus_sign:                                                                                   | Determines if agenda feature data should be copied over from the source event.                       |
| `travel`                                                                                             | [components.TravelEventCopyOverride](../../models/components/traveleventcopyoverride.md)             | :heavy_minus_sign:                                                                                   | Determines if travel feature data should be copied over from the source event.                       |
| `surveys`                                                                                            | [components.SurveysEventCopyOverride](../../models/components/surveyseventcopyoverride.md)           | :heavy_minus_sign:                                                                                   | Determines if surveys feature data should be copied over from the source event.                      |
| `speakers`                                                                                           | [components.SpeakersEventCopyOverride](../../models/components/speakerseventcopyoverride.md)         | :heavy_minus_sign:                                                                                   | Determines if speakers feature data should be copied over from the source event.                     |
| `exhibitors`                                                                                         | [components.ExhibitorsEventCopyOverride](../../models/components/exhibitorseventcopyoverride.md)     | :heavy_minus_sign:                                                                                   | Determines if exhibitors feature data should be copied over from the source event.                   |