# GeneralLedgerJson

This is used to denote the general ledger detail in an order item

## Example Usage

```typescript
import { GeneralLedgerJson } from "@cvent/sdk/models/components";

let value: GeneralLedgerJson = {
  id: "a6b6c1bc-e410-48da-86c2-80478ecf60f9",
  name: "Other Accounts Receivable",
  code: "123445",
  description: "Other Accounts Receivable; Leg. Accounts Receivable",
  allocationPercentage: 50,
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_minus_sign:                                                                   | A unique identifier for the general ledger.                                          | a6b6c1bc-e410-48da-86c2-80478ecf60f9                                                 |
| `name`                                                                               | *string*                                                                             | :heavy_minus_sign:                                                                   | This denotes the name of the general ledger.                                         | Other Accounts Receivable                                                            |
| `code`                                                                               | *string*                                                                             | :heavy_minus_sign:                                                                   | This denotes the code of the general ledger.                                         | 123445                                                                               |
| `description`                                                                        | *string*                                                                             | :heavy_minus_sign:                                                                   | This denotes the description of the general ledger.                                  | Other Accounts Receivable; Leg. Accounts Receivable                                  |
| `allocationPercentage`                                                               | *number*                                                                             | :heavy_minus_sign:                                                                   | This denotes the percentage allocation of the general ledger code for an order item. | 50                                                                                   |