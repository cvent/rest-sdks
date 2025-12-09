# UserGroupsJson

A paginated result for a list of user groups.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[UserGroupJson](../../models/components/UserGroupJson.md)> | :heavy_check_mark:                                               | The list of user groups retrieved for the specified page.        |