# TravelProposalPaginatedResponse

A paginated list of travel proposals.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Optional\<PagingJson>](../../models/components/PagingJson.md)     | :heavy_minus_sign:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[TravelProposal](../../models/components/TravelProposal.md)> | :heavy_minus_sign:                                                 | Paginated list of business transient proposals.                    |