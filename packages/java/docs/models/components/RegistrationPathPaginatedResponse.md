# RegistrationPathPaginatedResponse

Represents a paginated collection of registration paths.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [Paging](../../models/components/Paging.md)                                            | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[ExistingRegistrationPath](../../models/components/ExistingRegistrationPath.md)> | :heavy_check_mark:                                                                     | Collection of registration paths.                                                      |