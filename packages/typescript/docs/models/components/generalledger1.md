# GeneralLedger1

This is used to denote the general ledger code associated with donation item.

## Example Usage

```typescript
import { GeneralLedger1 } from "@cvent/sdk/models/components";

let value: GeneralLedger1 = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
  name: "General Ledger",
  code: "General Ledger Code",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `id`                                       | *string*                                   | :heavy_minus_sign:                         | A unique identifier of the general ledger. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d5       |
| `name`                                     | *string*                                   | :heavy_minus_sign:                         | Name of the General Ledger.                | General Ledger                             |
| `code`                                     | *string*                                   | :heavy_minus_sign:                         | General Ledger Code.                       | General Ledger Code                        |