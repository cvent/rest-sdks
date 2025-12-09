# LeadScanned

A lead activity

## Example Usage

```typescript
import { LeadScanned } from "@cvent/sdk/models/components";

let value: LeadScanned = {
  exhibitor: {
    code: "CODE_UPDATE_1",
    marketingCode: "MARKETING_CODE_1",
    name: "Example Company",
  },
  lead: {
    deviceId: "123",
    deviceName: "Jack's iPhone",
    boothStaff: {
      firstName: "John",
      lastName: "Doe",
      email: "h.potterfield@test.com",
    },
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `exhibitor`                                                                          | [components.ActivityExhibitorJson](../../models/components/activityexhibitorjson.md) | :heavy_minus_sign:                                                                   | An activity exhibitor.                                                               |
| `lead`                                                                               | [components.ActivityLeadJson](../../models/components/activityleadjson.md)           | :heavy_minus_sign:                                                                   | An activity lead.                                                                    |