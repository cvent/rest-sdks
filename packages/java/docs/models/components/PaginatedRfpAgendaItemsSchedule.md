# PaginatedRfpAgendaItemsSchedule

Paginated list of agenda items schedule attached to an RFP.


## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `paging`                                                                                             | [Optional\<PagingJson>](../../models/components/PagingJson.md)                                       | :heavy_minus_sign:                                                                                   | Represents pagination information for a collection of resources.                                     |
| `data`                                                                                               | List\<[RfpAgendaItemScheduleWithIdJson](../../models/components/RfpAgendaItemScheduleWithIdJson.md)> | :heavy_minus_sign:                                                                                   | List of agenda items schedule attached to an RFP.                                                    |