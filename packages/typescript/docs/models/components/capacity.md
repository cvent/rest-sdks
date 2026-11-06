# Capacity

Reserved capacity of a registration type.

## Example Usage

```typescript
import { Capacity } from "@cvent/sdk/models/components";

let value: Capacity = {
  registrationType: {
    id: "923d5629-3cac-40c2-8237-34937dd93475",
  },
  reservedCapacity: 5,
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `registrationType`                                                                         | [components.CapacityRegistrationType](../../models/components/capacityregistrationtype.md) | :heavy_check_mark:                                                                         | Registration type of the capacity.                                                         |                                                                                            |
| `reservedCapacity`                                                                         | *number*                                                                                   | :heavy_check_mark:                                                                         | Reserved capacity of the registration type for an exhibitor.                               | 5                                                                                          |