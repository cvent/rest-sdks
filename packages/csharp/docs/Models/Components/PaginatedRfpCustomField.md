# PaginatedRfpCustomField

Paginated list of RFP custom fields associated to a RFP.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                       | :heavy_minus_sign:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[RfpCustomFieldJson](../../Models/Components/RfpCustomFieldJson.md)> | :heavy_minus_sign:                                                        | List of RFP custom fields linked to an RFP.                               |