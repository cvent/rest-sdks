# CreateVenueNeedDateResponse

## Example Usage

```typescript
import { CreateVenueNeedDateResponse } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: CreateVenueNeedDateResponse = {
  headers: {
    "key": [],
  },
  result: {
    startDate: new RFCDate("2026-07-01"),
    endDate: new RFCDate("2026-07-31"),
    id: "7e5c2c23-b2bb-461a-adc9-025184988519",
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `headers`                                                                            | Record<string, *string*[]>                                                           | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `result`                                                                             | [components.ExistingVenueNeedDate](../../models/components/existingvenueneeddate.md) | :heavy_check_mark:                                                                   | N/A                                                                                  |