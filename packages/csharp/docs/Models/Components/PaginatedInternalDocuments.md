# PaginatedInternalDocuments

Paginated list of internal documents attached to an RFP.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [Paging](../../Models/Components/Paging.md)                                 | :heavy_minus_sign:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[RfpInternalDocument](../../Models/Components/RfpInternalDocument.md)> | :heavy_minus_sign:                                                          | List of internal documents linked to an RFP.                                |