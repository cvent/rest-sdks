# TravelProposalPaginatedResponse

A paginated list of travel proposals.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson](../../Models/Components/PagingJson.md)               | :heavy_minus_sign:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[TravelProposal](../../Models/Components/TravelProposal.md)> | :heavy_minus_sign:                                                | Paginated list of business transient proposals.                   |