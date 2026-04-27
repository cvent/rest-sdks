# PaginatedInternalDocuments

Paginated list of internal documents attached to an RFP.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [Optional\<PagingJson>](../../models/components/PagingJson.md)                         | :heavy_minus_sign:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[RfpInternalDocumentJson0](../../models/components/RfpInternalDocumentJson0.md)> | :heavy_minus_sign:                                                                     | List of internal documents linked to an RFP.                                           |