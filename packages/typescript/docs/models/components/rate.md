# Rate

Add-on rate details.

## Example Usage

```typescript
import { Rate } from "@cvent/sdk/models/components";

let value: Rate = {
  base: 15,
  currency: "USD",
};
```

## Fields

| Field                   | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `base`                  | *number*                | :heavy_check_mark:      | Base rate.              | 15                      |
| `currency`              | *string*                | :heavy_check_mark:      | ISO 4217 currency code. | USD                     |