# SupplierSummary

Represents a summary of supplier information associated with current proposal.

## Example Usage

```typescript
import { SupplierSummary } from "@cvent/sdk/models/components";

let value: SupplierSummary = {
  supplier: {
    type: "VENUE",
  },
};
```

## Fields

| Field                                          | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `supplier`                                     | *components.Supplier*                          | :heavy_minus_sign:                             | The supplier associated with current proposal. |