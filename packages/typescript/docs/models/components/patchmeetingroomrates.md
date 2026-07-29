# PatchMeetingRoomRates

Rate information for move in/out and events.

## Example Usage

```typescript
import { PatchMeetingRoomRates } from "@cvent/sdk/models/components";

let value: PatchMeetingRoomRates = {
  moveIn: {
    value: 500,
    applicationType: "PER_DAY",
  },
  moveOut: {
    value: 500,
    applicationType: "PER_DAY",
  },
  event: {
    value: 500,
    applicationType: "PER_DAY",
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `moveIn`                                                                 | [components.MeetingRoomRate](../../models/components/meetingroomrate.md) | :heavy_minus_sign:                                                       | Meeting room rate with a value and application type.                     |
| `moveOut`                                                                | [components.MeetingRoomRate](../../models/components/meetingroomrate.md) | :heavy_minus_sign:                                                       | Meeting room rate with a value and application type.                     |
| `event`                                                                  | [components.MeetingRoomRate](../../models/components/meetingroomrate.md) | :heavy_minus_sign:                                                       | Meeting room rate with a value and application type.                     |