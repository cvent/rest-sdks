# VoucherCapacity

Represents the capacity details for a voucher, including the total allowed redemptions and the number already redeemed.

## Example Usage

```typescript
import { VoucherCapacity } from "@cvent/sdk/models/components";

let value: VoucherCapacity = {
  total: 100,
  redeemedCount: 42,
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `total`                                                                                                    | *number*                                                                                                   | :heavy_check_mark:                                                                                         | The maximum number of times the voucher can be redeemed. Default value of -1 indicates unlimited capacity. | 100                                                                                                        |
| `redeemedCount`                                                                                            | *number*                                                                                                   | :heavy_check_mark:                                                                                         | The number of times the voucher has already been redeemed.                                                 | 42                                                                                                         |