# ExistingCapacity

Capacity of a registration type for an exhibitor, with the available capacity.

## Example Usage

```typescript
import { ExistingCapacity } from "@cvent/sdk/models/components";

let value: ExistingCapacity = {
  registrationType: {
    id: "923d5629-3cac-40c2-8237-34937dd93475",
  },
  reservedCapacity: 5,
  availableCapacity: 4,
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `registrationType`                                                                                         | [components.ExistingCapacityRegistrationType](../../models/components/existingcapacityregistrationtype.md) | :heavy_check_mark:                                                                                         | Registration type of the capacity.                                                                         |                                                                                                            |
| `reservedCapacity`                                                                                         | *number*                                                                                                   | :heavy_check_mark:                                                                                         | Reserved capacity of the registration type for an exhibitor.                                               | 5                                                                                                          |
| `availableCapacity`                                                                                        | *number*                                                                                                   | :heavy_check_mark:                                                                                         | Available capacity of the registration type for an exhibitor.                                              | 4                                                                                                          |