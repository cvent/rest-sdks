# CurrencyConversionRatePaginatedResponse

The response from a request to get the list of conversions rate for a currency.


## Fields

| Field                                                                                                             | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                          | [PagingJson](../../Models/Components/PagingJson.md)                                                               | :heavy_check_mark:                                                                                                | Represents pagination information for a collection of resources.                                                  |
| `Data`                                                                                                            | List<[CurrencyConversionRateListResponseJson](../../Models/Components/CurrencyConversionRateListResponseJson.md)> | :heavy_check_mark:                                                                                                | Collection of conversion rate for a currency in an account.                                                       |