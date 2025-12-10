# TravelAccountSupplierAccount

Details for the supplier travel account. These details are supplier specific and only visible for supply-side clients.

## Example Usage

```typescript
import { TravelAccountSupplierAccount } from "@cvent/sdk/models/components";

let value: TravelAccountSupplierAccount = {
  travelAccount: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  name: "Test Corporation",
  managementLevel: "global",
  active: true,
  crmId: "ABC123",
  chainDefinedId: "1000000299",
  chainDefinedType: "RFP",
};
```

## Fields

| Field                                                                                                                        | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `travelAccount`                                                                                                              | [components.TravelAccountSupplierAccountTravelAccount](../../models/components/travelaccountsupplieraccounttravelaccount.md) | :heavy_minus_sign:                                                                                                           | The travel account that the supplier account is associated with.                                                             |                                                                                                                              |
| `name`                                                                                                                       | *string*                                                                                                                     | :heavy_minus_sign:                                                                                                           | The name of the travel account.                                                                                              | Test Corporation                                                                                                             |
| `managementLevel`                                                                                                            | [components.ManagementLevelTypeJson1](../../models/components/managementleveltypejson1.md)                                   | :heavy_minus_sign:                                                                                                           | The management level of the travel account.  Defined by the supply-side.                                                     | global                                                                                                                       |
| `active`                                                                                                                     | *boolean*                                                                                                                    | :heavy_minus_sign:                                                                                                           | Is this account active for the supplier's hotels.                                                                            | true                                                                                                                         |
| `crmId`                                                                                                                      | *string*                                                                                                                     | :heavy_minus_sign:                                                                                                           | ID of the travel account in the suppliers Customer Relationship Management system. Defined by supplier.                      | ABC123                                                                                                                       |
| `chainDefinedId`                                                                                                             | *string*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Travel account ID defined at the supplier chain level.                                                                       | 1000000299                                                                                                                   |
| `chainDefinedType`                                                                                                           | *string*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Travel account type defined at the supplier chain level.                                                                     | RFP                                                                                                                          |