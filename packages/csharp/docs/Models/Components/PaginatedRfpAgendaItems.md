# PaginatedRfpAgendaItems

Paginated list of agenda items associated with an RFP.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_minus_sign:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[RfpAgendaItemJson](../../Models/Components/RfpAgendaItemJson.md)> | :heavy_minus_sign:                                                      | List of agenda items associated with an RFP.                            |