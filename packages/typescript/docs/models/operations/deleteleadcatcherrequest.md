# DeleteLeadCatcherRequest

## Example Usage

```typescript
import { DeleteLeadCatcherRequest } from "@cvent/sdk/models/operations";

let value: DeleteLeadCatcherRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  leadCatcherId: "7b69544a-2308-4b00-82b7-249b18e863f5",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `leadCatcherId`                            | *string*                                   | :heavy_check_mark:                         | Unique identifier for a lead catcher.      |                                            |