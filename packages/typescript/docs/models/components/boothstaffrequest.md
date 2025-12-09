# BoothStaffRequest

A JSON schema representing booth staff.

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

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `attendee`                                                           | [components.AttendeeJson3](../../models/components/attendeejson3.md) | :heavy_check_mark:                                                   | A JSON Schema for an Attendee object                                 |
| `event`                                                              | [components.EventJson5](../../models/components/eventjson5.md)       | :heavy_check_mark:                                                   | The Associated Event.                                                |
| `exhibitor`                                                          | [components.ExhibitorJson](../../models/components/exhibitorjson.md) | :heavy_check_mark:                                                   | The Associated Exhibitor.                                            |