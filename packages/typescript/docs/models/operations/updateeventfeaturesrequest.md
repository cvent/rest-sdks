# UpdateEventFeaturesRequest

## Example Usage

```typescript
import { UpdateEventFeaturesRequest } from "@cvent/sdk/models/operations";

let value: UpdateEventFeaturesRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  type: "Registration",
  featureUpdate: {
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
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `id`                                                                     | *string*                                                                 | :heavy_check_mark:                                                       | Unique Id of an event                                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                     |
| `type`                                                                   | [components.FeatureTypeJson](../../models/components/featuretypejson.md) | :heavy_check_mark:                                                       | String containing event feature type                                     | Registration                                                             |
| `featureUpdate`                                                          | [components.FeatureUpdate](../../models/components/featureupdate.md)     | :heavy_check_mark:                                                       | N/A                                                                      |                                                                          |