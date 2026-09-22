# ExistingVenueNeedDate

A venue need date range with its server-assigned identifier.

## Example Usage

```typescript
import { ExistingVenueNeedDate } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ExistingVenueNeedDate = {
  startDate: new RFCDate("2026-07-01"),
  endDate: new RFCDate("2026-07-31"),
  id: "7e5c2c23-b2bb-461a-adc9-025184988519",
};
```

## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               | Example                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `startDate`                                                                                               | [RFCDate](../../types/rfcdate.md)                                                                         | :heavy_check_mark:                                                                                        | The ISO 8601 date representing the start of the need date range (inclusive).                              | 2026-07-01                                                                                                |
| `endDate`                                                                                                 | [RFCDate](../../types/rfcdate.md)                                                                         | :heavy_check_mark:                                                                                        | The ISO 8601 date representing the end of the need date range (inclusive). Must be on or after startDate. | 2026-07-31                                                                                                |
| `id`                                                                                                      | *string*                                                                                                  | :heavy_check_mark:                                                                                        | The need date range ID.                                                                                   | 7e5c2c23-b2bb-461a-adc9-025184988519                                                                      |