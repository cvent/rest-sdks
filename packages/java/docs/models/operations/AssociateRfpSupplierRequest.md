# AssociateRfpSupplierRequest


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `rfpId`                                                         | *String*                                                        | :heavy_check_mark:                                              | The unique identifier of the RFP we are requesting              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                            |
| `supplierId`                                                    | *String*                                                        | :heavy_check_mark:                                              | The unique identifier of the Supplier we are requesting         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                            |
| `rfpSupplier`                                                   | [RfpSupplierInput](../../models/components/RfpSupplierInput.md) | :heavy_check_mark:                                              | Request body for associating a supplier to an RFP.              |                                                                 |