# UserGroupsJson

A paginated result for a list of user groups.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[UserGroupJson](../../Models/Components/UserGroupJson.md)>  | :heavy_check_mark:                                               | The list of user groups retrieved for the specified page.        |