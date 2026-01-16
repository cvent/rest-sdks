# MembershipItemsPaginatedResponse

A paginated response of membership items.


## Fields

| Field                                                                                                         | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                      | [PagingJson](../../Models/Components/PagingJson.md)                                                           | :heavy_check_mark:                                                                                            | Represents pagination information for a collection of resources.                                              |
| `Data`                                                                                                        | List<[MembershipItemsPaginatedResponseData](../../Models/Components/MembershipItemsPaginatedResponseData.md)> | :heavy_check_mark:                                                                                            | Collection of membership items.                                                                               |