# AudienceSegmentCreate

Represents a request to create an audience segment.

## Example Usage

```typescript
import { AudienceSegmentCreate } from "@cvent/sdk/models/components";

let value: AudienceSegmentCreate = {
  event: {
    id: "103097a4-143d-11e5-9f99-d0a637ee0032",
  },
  name: "VIP Attendees",
  description: "A group of VIP attendees.",
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `event`                                                                                                  | [components.EventJson2](../../models/components/eventjson2.md)                                           | :heavy_minus_sign:                                                                                       | ID of the event.                                                                                         |                                                                                                          |
| `name`                                                                                                   | *string*                                                                                                 | :heavy_check_mark:                                                                                       | Name of the audience segment. Must be unique in the event where the segment exists.                      | VIP Attendees                                                                                            |
| `description`                                                                                            | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Description of the audience segment.                                                                     | A group of VIP attendees.                                                                                |
| `creationType`                                                                                           | [components.AudienceSegmentCreationTypeJson](../../models/components/audiencesegmentcreationtypejson.md) | :heavy_minus_sign:                                                                                       | Creation type of the audience segment.                                                                   | MANUAL                                                                                                   |