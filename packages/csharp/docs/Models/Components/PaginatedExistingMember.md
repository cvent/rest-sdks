# PaginatedExistingMember

A paginated list of Events+ members.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                       | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[ExistingMemberJson](../../Models/Components/ExistingMemberJson.md)> | :heavy_check_mark:                                                        | Collection of Events+ members.                                            |