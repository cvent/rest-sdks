# UpdateAudienceSegmentRequest

## Example Usage

```typescript
import { UpdateAudienceSegmentRequest } from "@cvent/sdk/models/operations";

let value: UpdateAudienceSegmentRequest = {
  audienceSegmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  audienceSegment: {
    event: {
      id: "f8a930fa-1f3e-4d75-93d3-597aa6a321ea",
    },
    name: "VIP Attendees",
    description: "A group of VIP attendees.",
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `audienceSegmentId`                                                      | *string*                                                                 | :heavy_check_mark:                                                       | Audience segment ID.                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                     |
| `audienceSegment`                                                        | [components.AudienceSegment](../../models/components/audiencesegment.md) | :heavy_check_mark:                                                       | Audience segment fields you are updating.                                |                                                                          |