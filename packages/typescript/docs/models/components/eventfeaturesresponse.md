# EventFeaturesResponse

Representation of an event's feature along with its properties

## Example Usage

```typescript
import { EventFeaturesResponse } from "@cvent/sdk/models/components";

let value: EventFeaturesResponse = {
  type: "Registration",
  enabled: true,
  locked: true,
  lockedReason: "Your event is already using some Registration features",
  enabledTier: "PREMIER",
  availableTiers: [
    {
      name: "PREMIER",
      locked: false,
      lockReason: "",
    },
  ],
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
  weblink: "https://cvent.me/XX51b9",
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `type`                                                                                   | [components.FeatureTypeJson](../../models/components/featuretypejson.md)                 | :heavy_check_mark:                                                                       | These are the types of features used in the event container events.                      | Registration                                                                             |
| `enabled`                                                                                | *boolean*                                                                                | :heavy_check_mark:                                                                       | If a particular feature is enabled for the event                                         | true                                                                                     |
| `locked`                                                                                 | *boolean*                                                                                | :heavy_check_mark:                                                                       | If a particular feature is locked to perform any mutation over it                        | true                                                                                     |
| `lockedReason`                                                                           | *string*                                                                                 | :heavy_minus_sign:                                                                       | Generic message informing feature is locked due to some sub-feature/child feature in use | Your event is already using some Registration features                                   |
| `enabledTier`                                                                            | [components.TierJson](../../models/components/tierjson.md)                               | :heavy_minus_sign:                                                                       | Represents the type of license that the user can choose.                                 | PREMIER                                                                                  |
| `availableTiers`                                                                         | [components.FeatureTierJson](../../models/components/featuretierjson.md)[]               | :heavy_minus_sign:                                                                       | Available feature tiers.                                                                 |                                                                                          |
| `config`                                                                                 | *components.EventFeaturesResponseConfig*                                                 | :heavy_minus_sign:                                                                       | Feature configuration.                                                                   |                                                                                          |
| `weblink`                                                                                | *string*                                                                                 | :heavy_minus_sign:                                                                       | URL of the feature's webpage.                                                            | https://cvent.me/XX51b9                                                                  |