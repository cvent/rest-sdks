# MeetingRequestPaginatedResponse

Paginated collection of meeting requests.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[Models.Components.MeetingRequest](../../Models/Components/MeetingRequest.md)> | :heavy_check_mark:                                                                  | Collection of meeting request objects.                                              |