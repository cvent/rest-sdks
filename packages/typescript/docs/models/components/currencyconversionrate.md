# CurrencyConversionRate

Currency conversion rate for a currency based on dates in an account.

## Example Usage

```typescript
import { CurrencyConversionRate } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: CurrencyConversionRate = {
  conversionRate: 5.2,
  startDate: new RFCDate("2020-02-07"),
  endDate: new RFCDate("2020-02-08"),
};
```

## Fields

| Field                                                                                                                                        | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  | Example                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `conversionRate`                                                                                                                             | *number*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | Currency conversion rate from accounts base currency to the other defined currency in this conversion rate.                                  | 5.2                                                                                                                                          |
| `startDate`                                                                                                                                  | [RFCDate](../../types/rfcdate.md)                                                                                                            | :heavy_check_mark:                                                                                                                           | The ISO 8601 date format assigned for the currency conversion, typically denotes start date from when defined conversion rate is applicable. | 2020-02-07                                                                                                                                   |
| `endDate`                                                                                                                                    | [RFCDate](../../types/rfcdate.md)                                                                                                            | :heavy_minus_sign:                                                                                                                           | The ISO 8601 date format for the currency conversion, typically denotes end date till when defined conversion rate is applicable.            | 2020-02-08                                                                                                                                   |