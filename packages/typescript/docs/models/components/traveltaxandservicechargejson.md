# TravelTaxAndServiceChargeJson

Tax and service charge information.

## Example Usage

```typescript
import { TravelTaxAndServiceChargeJson } from "@cvent/sdk/models/components";

let value: TravelTaxAndServiceChargeJson = {
  taxAmount: 0,
  serviceChargeAmount: 1,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `taxAmount`                                                                                   | *number*                                                                                      | :heavy_minus_sign:                                                                            | Tax amount.                                                                                   | 0                                                                                             |
| `taxPercent`                                                                                  | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the tax amount represents a percentage, instead of a monetary value.           |                                                                                               |
| `taxIncluded`                                                                                 | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the tax included.                                                              |                                                                                               |
| `serviceChargeAmount`                                                                         | *number*                                                                                      | :heavy_minus_sign:                                                                            | Service charge amount.                                                                        | 1                                                                                             |
| `serviceChargePercent`                                                                        | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the service charge amount represents a percentage, instead of a monetary value |                                                                                               |
| `serviceChargeIncluded`                                                                       | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the service charge is included.                                                |                                                                                               |