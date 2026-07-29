# ActivityLead

An activity lead.

## Example Usage

```typescript
import { ActivityLead } from "@cvent/sdk/models/components";

let value: ActivityLead = {
  deviceId: "123",
  deviceName: "Jack's iPhone",
  boothStaff: {
    firstName: "John",
    lastName: "Doe",
    email: "h.potterfield@test.com",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `id`                                                                           | *string*                                                                       | :heavy_minus_sign:                                                             | Activity Lead ID                                                               |                                                                                |
| `deviceId`                                                                     | *string*                                                                       | :heavy_minus_sign:                                                             | The unique identifier of the device.                                           | 123                                                                            |
| `deviceName`                                                                   | *string*                                                                       | :heavy_minus_sign:                                                             | Name of the device.                                                            | Jack's iPhone                                                                  |
| `boothStaff`                                                                   | [components.ActivityBoothStaff](../../models/components/activityboothstaff.md) | :heavy_minus_sign:                                                             | Booth staff for an activity.                                                   |                                                                                |