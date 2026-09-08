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
      id: "db6a6dd9-3284-4936-bd7d-5242494acb03",
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `data`                                                               | [components.RfpPastEvent](../../models/components/rfppastevent.md)[] | :heavy_minus_sign:                                                   | List of past events saved on RFP by planner.                         |