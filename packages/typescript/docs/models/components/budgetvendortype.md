# BudgetVendorType

Indicates how the vendor was added to your account. CSN indicates the vendor was sourced from the Cvent Supplier Network. VENDOR indicates a user added the vendor information to your account. REPOSITE indicates the vendor was sourced from the Reposite.

## Example Usage

```typescript
import { BudgetVendorType } from "@cvent/sdk/models/components";

let value: BudgetVendorType = "CSN";
```

## Values

```typescript
"NOT_SPECIFIED" | "VENDOR" | "CSN" | "REPOSITE"
```