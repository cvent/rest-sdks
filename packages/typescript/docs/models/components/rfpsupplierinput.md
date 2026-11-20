# RfpSupplierInput

Supplier data for an RFP.

## Example Usage

```typescript
import { RfpSupplierInput } from "@cvent/sdk/models/components";

let value: RfpSupplierInput = {
  leadSource: {
    id: "50dc08af-24a9-4d01-84be-3d43133dc945",
    section: {
      id: "40dc08af-24a9-4d01-84be-3d43133dc945",
    },
  },
  promotion: {
    id: "41cc09af-61a0-5e21-942e-2d41232dc923",
  },
};
```

## Fields

| Field                                                                                                                                                                                                                     | Type                                                                                                                                                                                                                      | Required                                                                                                                                                                                                                  | Description                                                                                                                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `leadSource`                                                                                                                                                                                                              | [components.RfpSupplierLeadSource](../../models/components/rfpsupplierleadsource.md)                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                                                                        | Lead source: only `leadSource.section.id` is used; `leadSource.id` is ignored. If you omit the section, Cvent sets the default section. A caller can send only the default section. Another section is rejected with 400. |
| `promotion`                                                                                                                                                                                                               | [components.Promotion](../../models/components/promotion.md)                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                        | Promotion applied by the planner to the supplier on the RFP. Can be set when the supplier is first associated, or added later by calling Associate Supplier to RFP again for the same supplier.                           |