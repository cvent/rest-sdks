# UpdateVenueNeedDateRequest

## Example Usage

```typescript
import { UpdateVenueNeedDateRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateVenueNeedDateRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  needDateId: "8a4d1f3c-c9ee-42b5-bcd0-037295f7820a",
  existingVenueNeedDate: {
    startDate: new RFCDate("2026-07-01"),
    endDate: new RFCDate("2026-07-31"),
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `venueId`                                                                                      | *string*                                                                                       | :heavy_check_mark:                                                                             | Unique Cvent based identifier for a Venue.                                                     | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                           |
| `needDateId`                                                                                   | *string*                                                                                       | :heavy_check_mark:                                                                             | The venue need date ID.                                                                        | 8a4d1f3c-c9ee-42b5-bcd0-037295f7820a                                                           |
| `existingVenueNeedDate`                                                                        | [components.ExistingVenueNeedDateInput](../../models/components/existingvenueneeddateinput.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |                                                                                                |