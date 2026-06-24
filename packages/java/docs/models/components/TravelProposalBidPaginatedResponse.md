# TravelProposalBidPaginatedResponse

A paginated list of travel proposals.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [Optional\<Paging>](../../models/components/Paging.md)                     | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[TravelProposalBid2](../../models/components/TravelProposalBid2.md)> | :heavy_minus_sign:                                                         | Paginated list of business transient proposal bids.                        |