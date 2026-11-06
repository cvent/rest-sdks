# BoothStaffRequest

Booth staff member of an exhibitor.

## Example Usage

```typescript
import { BoothStaffRequest } from "@cvent/sdk/models/components";

let value: BoothStaffRequest = {
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `attendee`                                                     | [components.Attendee12](../../models/components/attendee12.md) | :heavy_check_mark:                                             | Associated attendee.                                           |
| `event`                                                        | [components.Event4](../../models/components/event4.md)         | :heavy_check_mark:                                             | Associated event.                                              |
| `exhibitor`                                                    | [components.Exhibitor](../../models/components/exhibitor.md)   | :heavy_check_mark:                                             | Associated exhibitor.                                          |