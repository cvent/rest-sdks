# AudienceSegment

Represents an audience segment. Audience segments are assigned to events and provide the ability for planners to segment their attendees into groups and better manage the attendee experience based on their defined segments.

## Example Usage

```typescript
import { AudienceSegment } from "@cvent/sdk/models/components";

let value: AudienceSegment = {
  event: {
    id: "103097a4-143d-11e5-9f99-d0a637ee0032",
  },
  name: "VIP Attendees",
  description: "A group of VIP attendees.",
};
```

## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `event`                                                                             | [components.EventJson2](../../models/components/eventjson2.md)                      | :heavy_minus_sign:                                                                  | ID of the event.                                                                    |                                                                                     |
| `name`                                                                              | *string*                                                                            | :heavy_check_mark:                                                                  | Name of the audience segment. Must be unique in the event where the segment exists. | VIP Attendees                                                                       |
| `description`                                                                       | *string*                                                                            | :heavy_minus_sign:                                                                  | Description of the audience segment.                                                | A group of VIP attendees.                                                           |