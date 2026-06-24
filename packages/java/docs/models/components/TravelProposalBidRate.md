# TravelProposalBidRate

The rate (cost) information for a travel bid.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `level`                                                                 | [Optional\<RateLevelType>](../../models/components/RateLevelType.md)    | :heavy_minus_sign:                                                      | Rate level                                                              | corporate                                                               |
| `type`                                                                  | [Optional\<RateType>](../../models/components/RateType.md)              | :heavy_minus_sign:                                                      | Rate type.                                                              |                                                                         |
| `planCode`                                                              | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The code given to the bid (also called rate plan) by the supplier.      | rp123                                                                   |
| `tier`                                                                  | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The rate tier given to the bid (also called rate plan) by the supplier. | tier1                                                                   |