# PaginatedExistingMember

A paginated list of Events+ members.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [PagingJson](../../models/components/PagingJson.md)                        | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[ExistingMemberJson](../../models/components/ExistingMemberJson.md)> | :heavy_check_mark:                                                         | Collection of Events+ members.                                             |