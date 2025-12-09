# SessionsEnrollmentPaginatedResponse

Represents a paginated collection of session registration objects.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [PagingJson](../../models/components/PagingJson.md)                                | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[SessionsEnrollmentJson](../../models/components/SessionsEnrollmentJson.md)> | :heavy_check_mark:                                                                 | A collection of session registration objects.                                      |