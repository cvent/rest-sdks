# RegistrationPathPaginatedResponse

Represents a paginated collection of registration paths.


## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `paging`                                                                                       | [PagingJson](../../models/components/PagingJson.md)                                            | :heavy_check_mark:                                                                             | Represents pagination information for a collection of resources.                               |
| `data`                                                                                         | List\<[ExistingRegistrationPathJson](../../models/components/ExistingRegistrationPathJson.md)> | :heavy_check_mark:                                                                             | Collection of registration paths.                                                              |