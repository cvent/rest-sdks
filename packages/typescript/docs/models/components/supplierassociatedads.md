# SupplierAssociatedAds

Ads clicked by planner while adding supplier on RFP.

## Example Usage

```typescript
import { SupplierAssociatedAds } from "@cvent/sdk/models/components";

let value: SupplierAssociatedAds = {
  firstClicked: {
    code: "RXBMLPSP",
  },
  lastClicked: {
    code: "RXBMLPSP",
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `firstClicked`                                                                         | [components.FirstClickedSupplierAd](../../models/components/firstclickedsupplierad.md) | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `lastClicked`                                                                          | [components.LastClickedSupplierAd](../../models/components/lastclickedsupplierad.md)   | :heavy_minus_sign:                                                                     | N/A                                                                                    |