# AlternateTravelPaginatedResponse

Paginated response containing alternate travel answers submitted by attendees who opt out of air or hotel bookings.


## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                    | [AlternateTravelPaginatedResponsePaging](../../Models/Components/AlternateTravelPaginatedResponsePaging.md) | :heavy_check_mark:                                                                                          | Represents pagination information for the list of results.                                                  |
| `Data`                                                                                                      | List<[AlternateTravelDetail](../../Models/Components/AlternateTravelDetail.md)>                             | :heavy_check_mark:                                                                                          | Collection of alternate travel answers for attendees.                                                       |