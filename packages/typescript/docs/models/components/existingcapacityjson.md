# ExistingCapacityJson

Represents the existing capacity of the registration type for an exhibitor

## Example Usage

```typescript
import { ExistingCapacityJson } from "@cvent/sdk/models/components";

let value: ExistingCapacityJson = {
  registrationType: {
    id: "923d5629-3cac-40c2-8237-34937dd93475",
  },
  reservedCapacity: 5,
  availableCapacity: 4,
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `registrationType`                                                                                                 | [components.ExistingCapacityJsonRegistrationType](../../models/components/existingcapacityjsonregistrationtype.md) | :heavy_check_mark:                                                                                                 | Registration type information                                                                                      |                                                                                                                    |
| `reservedCapacity`                                                                                                 | *number*                                                                                                           | :heavy_check_mark:                                                                                                 | Reserved capacity of the registration type for an exhibitor                                                        | 5                                                                                                                  |
| `availableCapacity`                                                                                                | *number*                                                                                                           | :heavy_check_mark:                                                                                                 | Available capacity of the registration type for an exhibitor                                                       | 4                                                                                                                  |