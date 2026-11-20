# UpdateRfpAgendaItemRequest

## Example Usage

```typescript
import { UpdateRfpAgendaItemRequest } from "@cvent/sdk/models/operations";

let value: UpdateRfpAgendaItemRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  rfpAgendaItem: {
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
    schedules: [
      {
        dayNumber: 1,
      },
    ],
    id: "9290ddfb-cc91-4cc3-9b3f-5ee5caba486b",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `rfpId`                                                                        | *string*                                                                       | :heavy_check_mark:                                                             | The unique identifier of the RFP we are requesting                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                           |
| `agendaItemId`                                                                 | *string*                                                                       | :heavy_check_mark:                                                             | The unique identifier of the RFP agenda item.                                  | f56a51a4-84b0-46c9-a612-716dc95a1c96                                           |
| `rfpAgendaItem`                                                                | [components.RfpAgendaItemInput](../../models/components/rfpagendaiteminput.md) | :heavy_check_mark:                                                             | Request body for updating an RFP agenda item.                                  |                                                                                |