# DonationItemsPaginatedResponse

A paginated response of donation items objects.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [PagingJson](../../models/components/PagingJson.md)                      | :heavy_check_mark:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | List\<[DonationItemJson1](../../models/components/DonationItemJson1.md)> | :heavy_check_mark:                                                       | Collection of donation items.                                            |