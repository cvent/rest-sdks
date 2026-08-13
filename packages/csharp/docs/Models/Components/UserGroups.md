# UserGroups

A paginated result for a list of user groups.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Paging`                                                              | [Paging](../../Models/Components/Paging.md)                           | :heavy_check_mark:                                                    | Represents pagination information for a collection of resources.      |
| `Data`                                                                | List<[AccountUserGroup](../../Models/Components/AccountUserGroup.md)> | :heavy_check_mark:                                                    | The list of user groups retrieved for the specified page.             |