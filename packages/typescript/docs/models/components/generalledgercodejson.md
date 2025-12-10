# GeneralLedgerCodeJson

A general ledger code associated to a fee.

## Example Usage

```typescript
import { GeneralLedgerCodeJson } from "@cvent/sdk/models/components";

let value: GeneralLedgerCodeJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
  name: "General Ledger",
  code: "General Ledger Code",
  allocation: 100,
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `id`                                                                     | *string*                                                                 | :heavy_minus_sign:                                                       | A unique identifier of the general ledger.                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d5                                     |
| `name`                                                                   | *string*                                                                 | :heavy_minus_sign:                                                       | Name of the General Ledger.                                              | General Ledger                                                           |
| `code`                                                                   | *string*                                                                 | :heavy_minus_sign:                                                       | General Ledger Code.                                                     | General Ledger Code                                                      |
| `allocation`                                                             | *number*                                                                 | :heavy_minus_sign:                                                       | The percentage of the fee that is attributed to the general ledger code. | 100                                                                      |