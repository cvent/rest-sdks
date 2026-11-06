# PaginatedOptionalItem

A paginated collection of optional items selected by an attendee during event registration.


## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `paging`                                                                                 | [Paging](../../models/components/Paging.md)                                              | :heavy_check_mark:                                                                       | Represents pagination information for a collection of resources.                         |
| `data`                                                                                   | List\<[PaginatedOptionalItemData](../../models/components/PaginatedOptionalItemData.md)> | :heavy_check_mark:                                                                       | Collection of optional items.                                                            |