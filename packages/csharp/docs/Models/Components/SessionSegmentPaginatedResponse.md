# SessionSegmentPaginatedResponse

The response from a request to get the list of SessionSegment associations.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson](../../Models/Components/PagingJson.md)               | :heavy_check_mark:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[SessionSegment](../../Models/Components/SessionSegment.md)> | :heavy_check_mark:                                                | Collection of SessionSegment associations.                        |