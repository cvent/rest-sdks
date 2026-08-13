# UserGroups

A paginated result for a list of user groups.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [Paging](../../models/components/Paging.md)                            | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | List\<[AccountUserGroup](../../models/components/AccountUserGroup.md)> | :heavy_check_mark:                                                     | The list of user groups retrieved for the specified page.              |