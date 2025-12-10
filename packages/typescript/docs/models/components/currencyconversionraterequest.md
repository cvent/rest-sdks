# CurrencyConversionRateRequest

Currency conversion rate request for a currency in an account.

## Example Usage

```typescript
import { CurrencyConversionRateRequest } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: CurrencyConversionRateRequest = {
  conversionRate: 5.2,
  startDate: new RFCDate("2020-02-07"),
  endDate: new RFCDate("2020-02-08"),
  id: "9463c74e-18c6-401a-a710-ae0f485bf959",
};
```

## Fields

| Field                                                                                                                                        | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  | Example                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `conversionRate`                                                                                                                             | *number*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | Currency conversion rate from accounts base currency to the other defined currency in this conversion rate.                                  | 5.2                                                                                                                                          |
| `startDate`                                                                                                                                  | [RFCDate](../../types/rfcdate.md)                                                                                                            | :heavy_check_mark:                                                                                                                           | The ISO 8601 date format assigned for the currency conversion, typically denotes start date from when defined conversion rate is applicable. | 2020-02-07                                                                                                                                   |
| `endDate`                                                                                                                                    | [RFCDate](../../types/rfcdate.md)                                                                                                            | :heavy_minus_sign:                                                                                                                           | The ISO 8601 date format for the currency conversion, typically denotes end date till when defined conversion rate is applicable.            | 2020-02-08                                                                                                                                   |
| `id`                                                                                                                                         | *string*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | The unique ID for this defined conversion rate.                                                                                              | 9463c74e-18c6-401a-a710-ae0f485bf959                                                                                                         |