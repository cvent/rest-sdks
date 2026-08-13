# AttendeeAudienceSegmentAssociation

Represents an audience segment associated with an attendee.

## Example Usage

```typescript
import { AttendeeAudienceSegmentAssociation } from "@cvent/sdk/models/components";

let value: AttendeeAudienceSegmentAssociation = {
  segment: {
    id: "b13497ea-c117-4d62-a17b-e6c14d7e49d4",
  },
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `segment`                                                | [components.Segment](../../models/components/segment.md) | :heavy_check_mark:                                       | Segment details                                          |