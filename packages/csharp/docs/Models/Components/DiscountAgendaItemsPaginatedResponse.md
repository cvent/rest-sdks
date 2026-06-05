# DiscountAgendaItemsPaginatedResponse

A paginated response containing a list of agenda items associated with a discount.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[AgendaItem1](../../Models/Components/AgendaItem1.md)>      | :heavy_check_mark:                                               | Collection of associated agenda items for a discount.            |