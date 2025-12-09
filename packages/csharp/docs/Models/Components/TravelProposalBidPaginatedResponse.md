# TravelProposalBidPaginatedResponse

A paginated list of travel proposals.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_minus_sign:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[TravelProposalBid](../../Models/Components/TravelProposalBid.md)> | :heavy_minus_sign:                                                      | Paginated list of business transient proposal bids.                     |