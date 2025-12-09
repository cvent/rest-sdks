# DiscountAgendaItemsPaginatedResponse

A paginated response containing a list of agenda items associated with a discount.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [PagingJson](../../models/components/PagingJson.md)                                | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[DiscountAgendaItemJson](../../models/components/DiscountAgendaItemJson.md)> | :heavy_check_mark:                                                                 | Collection of associated agenda items for a discount.                              |