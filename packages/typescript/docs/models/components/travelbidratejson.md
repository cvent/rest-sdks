# TravelBidRateJson

The rate (cost) information for a travel bid.

## Example Usage

```typescript
import { TravelBidRateJson } from "@cvent/sdk/models/components";

let value: TravelBidRateJson = {
  level: "corporate",
  planCode: "rp123",
  tier: "tier1",
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `level`                                                                      | [components.RateLevelTypeJson](../../models/components/rateleveltypejson.md) | :heavy_minus_sign:                                                           | Rate level                                                                   | corporate                                                                    |
| `type`                                                                       | [components.RateTypeJson](../../models/components/ratetypejson.md)           | :heavy_minus_sign:                                                           | Rate type.                                                                   |                                                                              |
| `planCode`                                                                   | *string*                                                                     | :heavy_minus_sign:                                                           | The code given to the bid (also called rate plan) by the supplier.           | rp123                                                                        |
| `tier`                                                                       | *string*                                                                     | :heavy_minus_sign:                                                           | The rate tier given to the bid (also called rate plan) by the supplier.      | tier1                                                                        |