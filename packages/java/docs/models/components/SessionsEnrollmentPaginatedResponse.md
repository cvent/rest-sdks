# SessionsEnrollmentPaginatedResponse

Represents a paginated collection of session registration objects.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [Paging](../../models/components/Paging.md)                                | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[SessionsEnrollment](../../models/components/SessionsEnrollment.md)> | :heavy_check_mark:                                                         | A collection of session registration objects.                              |