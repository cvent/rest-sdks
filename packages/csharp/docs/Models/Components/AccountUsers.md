# AccountUsers

A paginated result for a list of account users.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[AccountUser](../../Models/Components/AccountUser.md)>      | :heavy_check_mark:                                               | The list of Account Users retrieved for the specified page.      |