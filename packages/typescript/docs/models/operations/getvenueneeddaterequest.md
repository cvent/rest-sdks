# GetVenueNeedDateRequest

## Example Usage

```typescript
import { GetVenueNeedDateRequest } from "@cvent/sdk/models/operations";

let value: GetVenueNeedDateRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  needDateId: "8a4d1f3c-c9ee-42b5-bcd0-037295f7820a",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `needDateId`                               | *string*                                   | :heavy_check_mark:                         | The venue need date ID.                    | 8a4d1f3c-c9ee-42b5-bcd0-037295f7820a       |