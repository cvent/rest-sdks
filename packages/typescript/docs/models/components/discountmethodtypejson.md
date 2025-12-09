# DiscountMethodTypeJson

The method of the discount. All methods use the `value` field to determine the amount discounted. `BY_PERCENTAGE`: Discounts the item by a percentage. `BY_AMOUNT`: Discount the item by a specific amount. `FLAT_PRICE`: Set the price of the item to a specific value.

## Example Usage

```typescript
import { DiscountMethodTypeJson } from "@cvent/sdk/models/components";

let value: DiscountMethodTypeJson = "BY_PERCENTAGE";
```

## Values

```typescript
"BY_AMOUNT" | "BY_PERCENTAGE" | "FLAT_PRICE"
```