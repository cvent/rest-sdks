# RebateType

Rebate type for specifying the rebate value on citywide RFPs. If rebateType is `BY_AMOUNT`, the rebate value will be in decimal format. If rebateType is `BY_PERCENTAGE`, the rebate value will represent a percentage.

## Example Usage

```typescript
import { RebateType } from "@cvent/sdk/models/components";

let value: RebateType = "BY_PERCENTAGE";
```

## Values

```typescript
"BY_AMOUNT" | "BY_PERCENTAGE"
```