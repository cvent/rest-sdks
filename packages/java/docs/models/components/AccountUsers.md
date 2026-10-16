# AccountUsers

A paginated result for a list of account users.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[AccountUser](../../models/components/AccountUser.md)>     | :heavy_check_mark:                                               | The list of Account Users retrieved for the specified page.      |