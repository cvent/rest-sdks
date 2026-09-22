# CreateVenueNeedDateRequest

## Example Usage

```typescript
import { CreateVenueNeedDateRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: CreateVenueNeedDateRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueNeedDate: {
    startDate: new RFCDate("2026-07-01"),
    endDate: new RFCDate("2026-07-31"),
  },
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `venueId`                                                            | *string*                                                             | :heavy_check_mark:                                                   | Unique Cvent based identifier for a Venue.                           | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                 |
| `venueNeedDate`                                                      | [components.VenueNeedDate](../../models/components/venueneeddate.md) | :heavy_check_mark:                                                   | N/A                                                                  |                                                                      |