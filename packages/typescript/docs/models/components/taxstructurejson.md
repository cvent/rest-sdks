# TaxStructureJson

Details about taxes and fees applicable to a room.

## Example Usage

```typescript
import { TaxStructureJson } from "@cvent/sdk/models/components";

let value: TaxStructureJson = {
  disclosureStatement:
    "Total room charges will include all room fees and taxes (Subject to change).",
  items: [
    {
      name: "State Tax",
      amount: 6,
      amountType: "percentage",
      frequency: "per_room",
      partOfBaseRate: false,
      partOfDisplayRate: false,
    },
  ],
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `disclosureStatement`                                                        | *string*                                                                     | :heavy_check_mark:                                                           | Statement disclosing tax and fee information.                                | Total room charges will include all room fees and taxes (Subject to change). |
| `items`                                                                      | [components.TaxAndFeeJson](../../models/components/taxandfeejson.md)[]       | :heavy_check_mark:                                                           | List of tax or fee items.                                                    |                                                                              |