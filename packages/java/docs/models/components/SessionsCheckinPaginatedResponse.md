# SessionsCheckinPaginatedResponse

Paginated collection of session attendance objects.


## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `paging`                                                                                           | [PagingJson](../../models/components/PagingJson.md)                                                | :heavy_check_mark:                                                                                 | Represents pagination information for a collection of resources.                                   |
| `data`                                                                                             | List\<[SessionsAttendanceResponseJson](../../models/components/SessionsAttendanceResponseJson.md)> | :heavy_check_mark:                                                                                 | Collection of session attendance objects.                                                          |