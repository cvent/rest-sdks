# AddOnJson

Common object that holds add-on information.

## Example Usage

```typescript
import { AddOnJson } from "@cvent/sdk/models/components";

let value: AddOnJson = {
  id: 43454324455,
  name: "Fresh Towels",
  rate: {
    base: 15,
    currency: "USD",
  },
};
```

## Fields

| Field                                              | Type                                               | Required                                           | Description                                        | Example                                            |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `id`                                               | *number*                                           | :heavy_check_mark:                                 | Add-on identifier.                                 | 43454324455                                        |
| `name`                                             | *string*                                           | :heavy_minus_sign:                                 | Add-on name.                                       | Fresh Towels                                       |
| `rate`                                             | [components.Rate](../../models/components/rate.md) | :heavy_minus_sign:                                 | Add-on rate details.                               |                                                    |