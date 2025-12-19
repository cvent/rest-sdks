# AlternateTravelPaginatedResponse

Paginated response containing alternate travel answers submitted by attendees who opt out of air or hotel bookings.


## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                    | [AlternateTravelPaginatedResponsePaging](../../models/components/AlternateTravelPaginatedResponsePaging.md) | :heavy_check_mark:                                                                                          | Represents pagination information for the list of results.                                                  |
| `data`                                                                                                      | List\<[AlternateTravelDetailJson](../../models/components/AlternateTravelDetailJson.md)>                    | :heavy_check_mark:                                                                                          | Collection of alternate travel answers for attendees.                                                       |