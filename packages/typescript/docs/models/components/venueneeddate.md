# VenueNeedDate

A need date range indicating when a venue wants to receive event business.

## Example Usage

```typescript
import { VenueNeedDate } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: VenueNeedDate = {
  startDate: new RFCDate("2026-07-01"),
  endDate: new RFCDate("2026-07-31"),
};
```

## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               | Example                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `startDate`                                                                                               | [RFCDate](../../types/rfcdate.md)                                                                         | :heavy_check_mark:                                                                                        | The ISO 8601 date representing the start of the need date range (inclusive).                              | 2026-07-01                                                                                                |
| `endDate`                                                                                                 | [RFCDate](../../types/rfcdate.md)                                                                         | :heavy_check_mark:                                                                                        | The ISO 8601 date representing the end of the need date range (inclusive). Must be on or after startDate. | 2026-07-31                                                                                                |