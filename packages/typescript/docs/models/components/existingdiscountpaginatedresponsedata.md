# ExistingDiscountPaginatedResponseData


## Supported Types

### `components.ExistingDiscountCodeJson`

```typescript
const value: components.ExistingDiscountCodeJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
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
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  level: "EVENT",
  capacity: {
    total: 100,
    used: 10,
  },
  type: "DISCOUNT_CODE",
  applyToAllEvents: false,
};
```

### `components.ExistingVolumeDiscountJson`

```typescript
const value: components.ExistingVolumeDiscountJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
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
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  level: "EVENT",
};
```

