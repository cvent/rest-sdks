# PaginatedOptionalItem

A paginated collection of optional items selected by an attendee during event registration.


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `Paging`                                                                                | [Paging](../../Models/Components/Paging.md)                                             | :heavy_check_mark:                                                                      | Represents pagination information for a collection of resources.                        |
| `Data`                                                                                  | List<[PaginatedOptionalItemData](../../Models/Components/PaginatedOptionalItemData.md)> | :heavy_check_mark:                                                                      | Collection of optional items.                                                           |