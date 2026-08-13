# CurrencyConversionRatePaginatedResponse

The response from a request to get the list of conversions rate for a currency.


## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                   | [Paging](../../models/components/Paging.md)                                                                | :heavy_check_mark:                                                                                         | Represents pagination information for a collection of resources.                                           |
| `data`                                                                                                     | List\<[CurrencyConversionRateListResponse](../../models/components/CurrencyConversionRateListResponse.md)> | :heavy_check_mark:                                                                                         | Collection of conversion rate for a currency in an account.                                                |