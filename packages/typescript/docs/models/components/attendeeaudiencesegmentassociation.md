# AttendeeAudienceSegmentAssociation

Represents an audience segment associated with an attendee.

## Example Usage

```typescript
import { AttendeeAudienceSegmentAssociation } from "@cvent/sdk/models/components";

let value: AttendeeAudienceSegmentAssociation = {
  segment: {
    id: "27c6bdc0-58c4-4d3c-b4be-4f57dbaa77b3",
  },
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `segment`                                                | [components.Segment](../../models/components/segment.md) | :heavy_check_mark:                                       | Represents a segment by its ID.                          |