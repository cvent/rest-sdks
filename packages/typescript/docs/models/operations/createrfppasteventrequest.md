# CreateRfpPastEventRequest

## Example Usage

```typescript
import { CreateRfpPastEventRequest } from "@cvent/sdk/models/operations";

let value: CreateRfpPastEventRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfpPastEventRequest: {
    venueName: "Delta Inn by Supreme Hotels",
    city: "New Delhi",
    stateProvince: "US-AL",
    date: "First week of January 2024",
    attendeeCount: 500,
    guestRoomsPickedUp: 500,
    guestRoomsBlocked: 500,
    foodBeverageSpend: "3,000 dollars",
    notes: "This was the 25th event hosted by Alpha Planners.",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `rfpId`                                                                          | *string*                                                                         | :heavy_check_mark:                                                               | The unique identifier of the RFP we are requesting                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                             |
| `rfpPastEventRequest`                                                            | [components.RfpPastEventRequest](../../models/components/rfppasteventrequest.md) | :heavy_check_mark:                                                               | Request body for adding a past event to an RFP.                                  |                                                                                  |