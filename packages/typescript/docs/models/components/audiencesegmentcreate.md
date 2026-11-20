# AudienceSegmentCreate

Represents a request to create an audience segment.

## Example Usage

```typescript
import { AudienceSegmentCreate } from "@cvent/sdk/models/components";

let value: AudienceSegmentCreate = {
  event: {
    id: "f8a930fa-1f3e-4d75-93d3-597aa6a321ea",
  },
  name: "VIP Attendees",
  description: "A group of VIP attendees.",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `event`                                                                                          | [components.Event3](../../models/components/event3.md)                                           | :heavy_check_mark:                                                                               | Represents an event by its ID.                                                                   |                                                                                                  |
| `name`                                                                                           | *string*                                                                                         | :heavy_check_mark:                                                                               | Name of the audience segment. Must be unique in the event where the segment exists.              | VIP Attendees                                                                                    |
| `description`                                                                                    | *string*                                                                                         | :heavy_minus_sign:                                                                               | Additional text about the audience segment.                                                      | A group of VIP attendees.                                                                        |
| `creationType`                                                                                   | [components.AudienceSegmentCreationType](../../models/components/audiencesegmentcreationtype.md) | :heavy_minus_sign:                                                                               | Creation type of the audience segment.                                                           | MANUAL                                                                                           |