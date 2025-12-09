# SessionsCheckinPaginatedResponse

Paginated collection of session attendance objects.


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                          | [PagingJson](../../Models/Components/PagingJson.md)                                               | :heavy_check_mark:                                                                                | Represents pagination information for a collection of resources.                                  |
| `Data`                                                                                            | List<[SessionsAttendanceResponseJson](../../Models/Components/SessionsAttendanceResponseJson.md)> | :heavy_check_mark:                                                                                | Collection of session attendance objects.                                                         |