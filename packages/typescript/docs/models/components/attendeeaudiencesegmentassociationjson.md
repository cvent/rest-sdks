# AttendeeAudienceSegmentAssociationJson

Represents an audience segment associated with an attendee.

## Example Usage

```typescript
import { AttendeeAudienceSegmentAssociationJson } from "@cvent/sdk/models/components";

let value: AttendeeAudienceSegmentAssociationJson = {
  segment: {
    id: "b13497ea-c117-4d62-a17b-e6c14d7e49d4",
  },
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `segment`                                                        | [components.SegmentJson](../../models/components/segmentjson.md) | :heavy_check_mark:                                               | Segment details                                                  |