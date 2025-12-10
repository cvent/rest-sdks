# GetCurrencyConversionRateResponse

## Example Usage

```typescript
import { GetCurrencyConversionRateResponse } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: GetCurrencyConversionRateResponse = {
  result: {
    paging: {
      previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
      nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
      currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
      limit: 100,
      totalCount: 2,
      links: {
        next: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        self: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        prev: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
    },
    data: [
      {
        conversionRate: 5.2,
        startDate: new RFCDate("2020-02-07"),
        endDate: new RFCDate("2020-02-08"),
        id: "9463c74e-18c6-401a-a710-ae0f485bf959",
        baseCurrency: "USD",
        currency: "EUR",
        lastModified: new Date("2020-02-07T00:00:00.00Z"),
        currentConversionRate: true,
      },
    ],
  },
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                                 | [components.CurrencyConversionRatePaginatedResponse](../../models/components/currencyconversionratepaginatedresponse.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |