# UpdateAudienceSegmentRequest

## Example Usage

```typescript
import { UpdateAudienceSegmentRequest } from "@cvent/sdk/models/operations";

let value: UpdateAudienceSegmentRequest = {
  audienceSegmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  audienceSegment: {
    event: {
      id: "103097a4-143d-11e5-9f99-d0a637ee0032",
    },
    name: "VIP Attendees",
    description: "A group of VIP attendees.",
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `audienceSegmentId`                                                      | *string*                                                                 | :heavy_check_mark:                                                       | ID of an audience segment.                                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                     |
| `audienceSegment`                                                        | [components.AudienceSegment](../../models/components/audiencesegment.md) | :heavy_check_mark:                                                       | Audience segment fields you are updating.                                |                                                                          |