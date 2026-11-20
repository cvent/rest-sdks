# CreateRfpAgendaItemRequest

## Example Usage

```typescript
import { CreateRfpAgendaItemRequest } from "@cvent/sdk/models/operations";

let value: CreateRfpAgendaItemRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfpAgendaItemRequest: {
    name: "Agenda Item 1",
    note: "This is a sample comment for this agenda item.",
    startTime: "10:00:00",
    endTime: "10:30:00",
    roomSize: 1000,
    attendeeCount: 10000,
    roomInfoRequired: false,
    twentyFourHourHold: true,
    locatedAtPrimaryEventVenue: false,
    number: 5,
    schedules: [],
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `rfpId`                                                                            | *string*                                                                           | :heavy_check_mark:                                                                 | The unique identifier of the RFP we are requesting                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                               |
| `rfpAgendaItemRequest`                                                             | [components.RfpAgendaItemRequest](../../models/components/rfpagendaitemrequest.md) | :heavy_check_mark:                                                                 | Request body for creating an RFP agenda item.                                      |                                                                                    |