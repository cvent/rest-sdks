# UpdateCurrencyConversionRateRequest

## Example Usage

```typescript
import { UpdateCurrencyConversionRateRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateCurrencyConversionRateRequest = {
  currency: "USD",
  conversionRateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  currencyConversionRateRequest: {
    conversionRate: 5.2,
    startDate: new RFCDate("2020-02-07"),
    endDate: new RFCDate("2020-02-08"),
    id: "9463c74e-18c6-401a-a710-ae0f485bf959",
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `currency`                                                                                           | *string*                                                                                             | :heavy_check_mark:                                                                                   | The ISO 4217 standard format currency code.                                                          | USD                                                                                                  |
| `conversionRateId`                                                                                   | *string*                                                                                             | :heavy_check_mark:                                                                                   | Unique ID of currency conversion rate.                                                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                 |
| `currencyConversionRateRequest`                                                                      | [components.CurrencyConversionRateRequest](../../models/components/currencyconversionraterequest.md) | :heavy_check_mark:                                                                                   | The currency conversion rate to be updated.                                                          |                                                                                                      |