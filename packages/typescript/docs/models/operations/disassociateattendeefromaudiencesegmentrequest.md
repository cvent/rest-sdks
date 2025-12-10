# DisassociateAttendeeFromAudienceSegmentRequest

## Example Usage

```typescript
import { DisassociateAttendeeFromAudienceSegmentRequest } from "@cvent/sdk/models/operations";

let value: DisassociateAttendeeFromAudienceSegmentRequest = {
  audienceSegmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  attendeeId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `audienceSegmentId`                  | *string*                             | :heavy_check_mark:                   | ID of an audience segment.           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `attendeeId`                         | *string*                             | :heavy_check_mark:                   | ID of an attendee.                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |