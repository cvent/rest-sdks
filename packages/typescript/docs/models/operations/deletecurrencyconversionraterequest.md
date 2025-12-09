# DeleteCurrencyConversionRateRequest

## Example Usage

```typescript
import { DeleteCurrencyConversionRateRequest } from "@cvent/sdk/models/operations";

let value: DeleteCurrencyConversionRateRequest = {
  currency: "USD",
  conversionRateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                       | Type                                        | Required                                    | Description                                 | Example                                     |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `currency`                                  | *string*                                    | :heavy_check_mark:                          | The ISO 4217 standard format currency code. | USD                                         |
| `conversionRateId`                          | *string*                                    | :heavy_check_mark:                          | Unique ID of currency conversion rate.      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3        |