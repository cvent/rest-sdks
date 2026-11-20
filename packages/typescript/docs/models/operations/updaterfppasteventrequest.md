# UpdateRfpPastEventRequest

## Example Usage

```typescript
import { UpdateRfpPastEventRequest } from "@cvent/sdk/models/operations";

let value: UpdateRfpPastEventRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  rfpPastEvent: {
    venueName: "Delta Inn by Supreme Hotels",
    city: "New Delhi",
    stateProvince: "US-AL",
    date: "First week of January 2024",
    attendeeCount: 500,
    guestRoomsPickedUp: 500,
    guestRoomsBlocked: 500,
    foodBeverageSpend: "3,000 dollars",
    notes: "This was the 25th event hosted by Alpha Planners.",
    id: "db6a6dd9-3284-4936-bd7d-5242494acb03",
  },
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `rfpId`                                                            | *string*                                                           | :heavy_check_mark:                                                 | The unique identifier of the RFP we are requesting                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                               |
| `pastEventId`                                                      | *string*                                                           | :heavy_check_mark:                                                 | The unique identifier of the RFP past event.                       | f56a51a4-84b0-46c9-a612-716dc95a1c96                               |
| `rfpPastEvent`                                                     | [components.RfpPastEvent](../../models/components/rfppastevent.md) | :heavy_check_mark:                                                 | Request body for updating a past event on RFP.                     |                                                                    |