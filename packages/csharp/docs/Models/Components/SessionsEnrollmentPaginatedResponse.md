# SessionsEnrollmentPaginatedResponse

Represents a paginated collection of session registration objects.


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `Paging`                                                                          | [PagingJson](../../Models/Components/PagingJson.md)                               | :heavy_check_mark:                                                                | Represents pagination information for a collection of resources.                  |
| `Data`                                                                            | List<[SessionsEnrollmentJson](../../Models/Components/SessionsEnrollmentJson.md)> | :heavy_check_mark:                                                                | A collection of session registration objects.                                     |