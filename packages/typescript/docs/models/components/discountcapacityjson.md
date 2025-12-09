# DiscountCapacityJson

Details about the discount capacity.

## Example Usage

```typescript
import { DiscountCapacityJson } from "@cvent/sdk/models/components";

let value: DiscountCapacityJson = {
  total: 100,
  used: 10,
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `total`                                                                                                              | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | The total number of instances the discount can be used event wide. Default value of -1 indicates unlimited capacity. | 100                                                                                                                  |
| `used`                                                                                                               | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | The used capacity of the discount.                                                                                   | 10                                                                                                                   |