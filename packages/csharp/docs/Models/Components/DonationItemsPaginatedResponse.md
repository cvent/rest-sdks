# DonationItemsPaginatedResponse

A paginated response of donation items objects.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_check_mark:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[DonationItemJson1](../../Models/Components/DonationItemJson1.md)> | :heavy_check_mark:                                                      | Collection of donation items.                                           |