# LeadInboundCreated

A lead inbound-created activity.

## Example Usage

```typescript
import { LeadInboundCreated } from "@cvent/sdk/models/components";

let value: LeadInboundCreated = {
  exhibitor: {
    code: "CODE_UPDATE_1",
    marketingCode: "MARKETING_CODE_1",
    name: "Example Company",
  },
  lead: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `exhibitor`                                                                          | [components.ActivityExhibitorJson](../../models/components/activityexhibitorjson.md) | :heavy_minus_sign:                                                                   | An activity exhibitor.                                                               |
| `lead`                                                                               | [components.LeadObjectJson](../../models/components/leadobjectjson.md)               | :heavy_minus_sign:                                                                   | A Lead                                                                               |