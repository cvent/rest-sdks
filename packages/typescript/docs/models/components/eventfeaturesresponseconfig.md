# EventFeaturesResponseConfig

Feature configuration.


## Supported Types

### `components.RegistrationFeatureConfig`

```typescript
const value: components.RegistrationFeatureConfig = {
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

