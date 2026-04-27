# RfpPastEvents

List of past RFP events.

## Example Usage

```typescript
import { RfpPastEvents } from "@cvent/sdk/models/components";

let value: RfpPastEvents = {
  data: [
    {
      venueName: "Delta Inn by Supreme Hotels",
      city: "New Delhi",
      stateProvince: "US-AL",
      date: "First week of January 2024",
      attendeeCount: 500,
      guestRoomsPickedUp: 500,
      guestRoomsBlocked: 500,
      foodBeverageSpend: "3,000 dollars",
      notes: "This was the 25th event hosted by Alpha Planners.",
      id: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    },
  ],
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `data`                                                                       | [components.RfpPastEventJson](../../models/components/rfppasteventjson.md)[] | :heavy_minus_sign:                                                           | List of past events saved on RFP by planner.                                 |