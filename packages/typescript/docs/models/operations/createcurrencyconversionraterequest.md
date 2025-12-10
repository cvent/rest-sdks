# CreateCurrencyConversionRateRequest

## Example Usage

```typescript
import { CreateCurrencyConversionRateRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: CreateCurrencyConversionRateRequest = {
  currency: "USD",
  currencyConversionRate: {
    conversionRate: 5.2,
    startDate: new RFCDate("2020-02-07"),
    endDate: new RFCDate("2020-02-08"),
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `currency`                                                                             | *string*                                                                               | :heavy_check_mark:                                                                     | The ISO 4217 standard format currency code.                                            | USD                                                                                    |
| `currencyConversionRate`                                                               | [components.CurrencyConversionRate](../../models/components/currencyconversionrate.md) | :heavy_check_mark:                                                                     | Currency conversion rate to be created.                                                |                                                                                        |