# RegistrationPathPaginatedResponse

Represents a paginated collection of registration paths.


## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `Paging`                                                                                      | [PagingJson](../../Models/Components/PagingJson.md)                                           | :heavy_check_mark:                                                                            | Represents pagination information for a collection of resources.                              |
| `Data`                                                                                        | List<[ExistingRegistrationPathJson](../../Models/Components/ExistingRegistrationPathJson.md)> | :heavy_check_mark:                                                                            | Collection of registration paths.                                                             |