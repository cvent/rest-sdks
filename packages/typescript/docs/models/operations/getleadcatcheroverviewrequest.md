# GetLeadCatcherOverviewRequest

## Example Usage

```typescript
import { GetLeadCatcherOverviewRequest } from "@cvent/sdk/models/operations";

let value: GetLeadCatcherOverviewRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  leadCatcherId: "4e09a358-b071-47cc-8f0d-b38a9509fcc3",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `leadCatcherId`                            | *string*                                   | :heavy_check_mark:                         | Unique identifier for a lead catcher.      |                                            |