# AudienceSegment

Represents an audience segment. Audience segments are assigned to events and provide the ability for planners to segment their attendees into groups and better manage the attendee experience based on their defined segments.

## Example Usage

```typescript
import { AudienceSegment } from "@cvent/sdk/models/components";

let value: AudienceSegment = {
  event: {
    id: "f8a930fa-1f3e-4d75-93d3-597aa6a321ea",
  },
  name: "VIP Attendees",
  description: "A group of VIP attendees.",
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `event`                                                                             | [components.Event3](../../models/components/event3.md)                              | :heavy_check_mark:                                                                  | Represents an event by its ID.                                                      |                                                                                     |
| `name`                                                                              | *string*                                                                            | :heavy_check_mark:                                                                  | Name of the audience segment. Must be unique in the event where the segment exists. | VIP Attendees                                                                       |
| `description`                                                                       | *string*                                                                            | :heavy_minus_sign:                                                                  | Additional text about the audience segment.                                         | A group of VIP attendees.                                                           |