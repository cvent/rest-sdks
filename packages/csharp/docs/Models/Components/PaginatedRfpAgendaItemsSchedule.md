# PaginatedRfpAgendaItemsSchedule

Paginated list of agenda items schedule attached to an RFP.


## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                                 | :heavy_minus_sign:                                                                                  | Represents pagination information for a collection of resources.                                    |
| `Data`                                                                                              | List<[RfpAgendaItemScheduleWithIdJson](../../Models/Components/RfpAgendaItemScheduleWithIdJson.md)> | :heavy_minus_sign:                                                                                  | List of agenda items schedule attached to an RFP.                                                   |