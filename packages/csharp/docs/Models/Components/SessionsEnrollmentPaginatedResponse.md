# SessionsEnrollmentPaginatedResponse

Represents a paginated collection of session registration objects.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [Paging](../../Models/Components/Paging.md)                               | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[SessionsEnrollment](../../Models/Components/SessionsEnrollment.md)> | :heavy_check_mark:                                                        | A collection of session registration objects.                             |