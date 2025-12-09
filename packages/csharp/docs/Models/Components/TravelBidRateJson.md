# TravelBidRateJson

The rate (cost) information for a travel bid.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Level`                                                                 | [RateLevelTypeJson](../../Models/Components/RateLevelTypeJson.md)       | :heavy_minus_sign:                                                      | Rate level                                                              | corporate                                                               |
| `Type`                                                                  | [RateTypeJson](../../Models/Components/RateTypeJson.md)                 | :heavy_minus_sign:                                                      | Rate type.                                                              |                                                                         |
| `PlanCode`                                                              | *string*                                                                | :heavy_minus_sign:                                                      | The code given to the bid (also called rate plan) by the supplier.      | rp123                                                                   |
| `Tier`                                                                  | *string*                                                                | :heavy_minus_sign:                                                      | The rate tier given to the bid (also called rate plan) by the supplier. | tier1                                                                   |