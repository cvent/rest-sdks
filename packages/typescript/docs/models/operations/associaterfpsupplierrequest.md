# AssociateRfpSupplierRequest

## Example Usage

```typescript
import { AssociateRfpSupplierRequest } from "@cvent/sdk/models/operations";

let value: AssociateRfpSupplierRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  supplierId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfpSupplier: {
    leadSource: {
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      section: {
        id: "40dc08af-24a9-4d01-84be-3d43133dc945",
      },
    },
    promotion: {
      id: "41cc09af-61a0-5e21-942e-2d41232dc923",
    },
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `rfpId`                                                                    | *string*                                                                   | :heavy_check_mark:                                                         | The unique identifier of the RFP we are requesting                         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `supplierId`                                                               | *string*                                                                   | :heavy_check_mark:                                                         | The unique identifier of the Supplier we are requesting                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `rfpSupplier`                                                              | [components.RfpSupplierInput](../../models/components/rfpsupplierinput.md) | :heavy_check_mark:                                                         | Request body for associating a supplier to an RFP.                         |                                                                            |