# DisassociateRfpSupplierRequest

## Example Usage

```typescript
import { DisassociateRfpSupplierRequest } from "@cvent/sdk/models/operations";

let value: DisassociateRfpSupplierRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  supplierId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `rfpId`                                                 | *string*                                                | :heavy_check_mark:                                      | The unique identifier of the RFP we are requesting      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                    |
| `supplierId`                                            | *string*                                                | :heavy_check_mark:                                      | The unique identifier of the Supplier we are requesting | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                    |