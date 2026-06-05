# DiscountAgendaItemsPaginatedResponse

A paginated response containing a list of agenda items associated with a discount.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[AgendaItem1](../../models/components/AgendaItem1.md)>     | :heavy_check_mark:                                               | Collection of associated agenda items for a discount.            |