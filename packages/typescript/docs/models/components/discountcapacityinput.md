# DiscountCapacityInput

Details about the discount capacity.

## Example Usage

```typescript
import { DiscountCapacityInput } from "@cvent/sdk/models/components";

let value: DiscountCapacityInput = {
  total: 100,
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `total`                                                                                                              | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | The total number of instances the discount can be used event wide. Default value of -1 indicates unlimited capacity. | 100                                                                                                                  |