# CreateUpdateDiscount

Representation of an existing discount that can be created or updated for an event.


## Supported Types

### `components.CreateUpdateDiscountCode`

```typescript
const value: components.CreateUpdateDiscountCode = {
  name: "10% off",
  method: {
    type: "BY_PERCENTAGE",
    value: 10,
  },
  effectiveFrom: new RFCDate("2025-01-01"),
  effectiveTo: new RFCDate("2025-02-01"),
  note: "10% off for early birds.",
  code: "10OFF",
  includeGuestsTowardsCapacity: true,
  autoApply: true,
  type: "DISCOUNT_CODE",
  capacity: {
    total: 100,
  },
};
```

### `components.CreateUpdateVolumeDiscount`

```typescript
const value: components.CreateUpdateVolumeDiscount = {
  name: "10% off",
  method: {
    type: "BY_PERCENTAGE",
    value: 10,
  },
  effectiveFrom: new RFCDate("2025-01-01"),
  effectiveTo: new RFCDate("2025-02-01"),
  note: "10% off for early birds.",
  thresholdType: "ALL",
  thresholdLimit: 10,
  includePrimaryRegistrant: true,
  type: "VOLUME_DISCOUNT",
};
```

