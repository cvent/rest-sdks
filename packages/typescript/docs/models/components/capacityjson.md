# CapacityJson

Registration capacity object containing registration type and reserved capacity

## Example Usage

```typescript
import { CapacityJson } from "@cvent/sdk/models/components";

let value: CapacityJson = {
  registrationType: {
    id: "923d5629-3cac-40c2-8237-34937dd93475",
  },
  reservedCapacity: 5,
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `registrationType`                                                                                 | [components.CapacityJsonRegistrationType](../../models/components/capacityjsonregistrationtype.md) | :heavy_check_mark:                                                                                 | Registration type information                                                                      |                                                                                                    |
| `reservedCapacity`                                                                                 | *number*                                                                                           | :heavy_check_mark:                                                                                 | Reserved capacity of the registration type for an exhibitor                                        | 5                                                                                                  |