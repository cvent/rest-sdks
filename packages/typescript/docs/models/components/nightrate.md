# NightRate

Rate details for single night.

## Example Usage

```typescript
import { NightRate } from "@cvent/sdk/models/components";

let value: NightRate = {
  base: 150,
  currency: "USD",
};
```

## Fields

| Field                   | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `base`                  | *number*                | :heavy_check_mark:      | Base rate.              | 150                     |
| `currency`              | *string*                | :heavy_check_mark:      | ISO 4217 currency code. | USD                     |