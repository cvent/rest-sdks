# PaginatedInternalDocuments

Paginated list of internal documents attached to an RFP.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [PagingJson](../../Models/Components/PagingJson.md)                                   | :heavy_minus_sign:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[RfpInternalDocumentJson0](../../Models/Components/RfpInternalDocumentJson0.md)> | :heavy_minus_sign:                                                                    | List of internal documents linked to an RFP.                                          |