# FeatureUpdate

Representation of an event feature update request

## Example Usage

```typescript
import { FeatureUpdate } from "@cvent/sdk/models/components";

let value: FeatureUpdate = {
  type: "Registration",
  enabled: true,
  enabledTier: "PREMIER",
  config: {
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
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `type`                                                                   | [components.FeatureTypeJson](../../models/components/featuretypejson.md) | :heavy_check_mark:                                                       | These are the types of features used in the event container events.      | Registration                                                             |
| `enabled`                                                                | *boolean*                                                                | :heavy_check_mark:                                                       | If a particular feature is enabled for the event                         | true                                                                     |
| `enabledTier`                                                            | [components.TierJson](../../models/components/tierjson.md)               | :heavy_minus_sign:                                                       | Represents the type of license that the user can choose.                 | PREMIER                                                                  |
| `config`                                                                 | *components.FeatureUpdateConfig*                                         | :heavy_minus_sign:                                                       | Feature configuration.                                                   |                                                                          |