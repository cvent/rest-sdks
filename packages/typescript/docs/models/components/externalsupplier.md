# ExternalSupplier

External supplier associated with the RFP. If planners cannot find a supplier in Cvent, they can add the supplier by providing the name when awarding the RFP.

## Example Usage

```typescript
import { ExternalSupplier } from "@cvent/sdk/models/components";

let value: ExternalSupplier = {
  name: "ABC Corp",
};
```

## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `name`                             | *string*                           | :heavy_minus_sign:                 | The name of the external supplier. | ABC Corp                           |