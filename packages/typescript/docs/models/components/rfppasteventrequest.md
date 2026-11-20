# RfpPastEventRequest

Request body for creating or updating an RFP past event.

## Example Usage

```typescript
import { RfpPastEventRequest } from "@cvent/sdk/models/components";

let value: RfpPastEventRequest = {
  venueName: "Delta Inn by Supreme Hotels",
  city: "New Delhi",
  stateProvince: "US-AL",
  date: "First week of January 2024",
  attendeeCount: 500,
  guestRoomsPickedUp: 500,
  guestRoomsBlocked: 500,
  foodBeverageSpend: "3,000 dollars",
  notes: "This was the 25th event hosted by Alpha Planners.",
};
```

## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `venueName`                                                                   | *string*                                                                      | :heavy_minus_sign:                                                            | Name of the venue where the event was hosted.                                 | Delta Inn by Supreme Hotels                                                   |
| `city`                                                                        | *string*                                                                      | :heavy_minus_sign:                                                            | Name of the city where the event was hosted.                                  | New Delhi                                                                     |
| `stateProvince`                                                               | *string*                                                                      | :heavy_minus_sign:                                                            | ISO 3166-2 code for name of the state or province where the event was hosted. | US-AL                                                                         |
| `date`                                                                        | *string*                                                                      | :heavy_minus_sign:                                                            | Free form text field for the planner to provide details on the event date.    | First week of January 2024                                                    |
| `attendeeCount`                                                               | *number*                                                                      | :heavy_minus_sign:                                                            | Number of event attendees.                                                    | 500                                                                           |
| `guestRoomsPickedUp`                                                          | *number*                                                                      | :heavy_minus_sign:                                                            | Count of rooms picked up by planners for use during the event.                | 500                                                                           |
| `guestRoomsBlocked`                                                           | *number*                                                                      | :heavy_minus_sign:                                                            | Count of rooms blocked by planner for the event.                              | 500                                                                           |
| `foodBeverageSpend`                                                           | *string*                                                                      | :heavy_minus_sign:                                                            | Expenditure on food and beverage.                                             | 3,000 dollars                                                                 |
| `notes`                                                                       | *string*                                                                      | :heavy_minus_sign:                                                            | Any other information about the event.                                        | This was the 25th event hosted by Alpha Planners.                             |