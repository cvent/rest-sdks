# ZeroAnyOf

Denote the configuration for the registration feature.

## Example Usage

```typescript
import { ZeroAnyOf } from "@cvent/sdk/models/components";

let value: ZeroAnyOf = {
  pricing: {
    enabled: true,
    invoicePrefix: "EVE001",
    revenueGoal: 10000,
    merchantAccount: "Event merchant account - USD",
    currency: "USD",
    allowedPaymentMethods: [
      "Visa",
      "Diners Club",
      "Mastercard",
    ],
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `pricing`                                                                    | [components.PricingConfigJson](../../models/components/pricingconfigjson.md) | :heavy_minus_sign:                                                           | Represents the configuration of the event's pricing feature.                 |