# AudienceSegmentsPaginatedResponse

The response from a request to get the paginated list of audience segments for the event.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[AudienceSegmentResponse](../../Models/Components/AudienceSegmentResponse.md)> | :heavy_check_mark:                                                                  | Collection of audience segments.                                                    |