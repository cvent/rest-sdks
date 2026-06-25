# PaginatedInternalDocuments

Paginated list of internal documents attached to an RFP.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [Optional\<Paging>](../../models/components/Paging.md)                       | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[RfpInternalDocument](../../models/components/RfpInternalDocument.md)> | :heavy_minus_sign:                                                           | List of internal documents linked to an RFP.                                 |