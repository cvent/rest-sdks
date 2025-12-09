# MeetingRequestPaginatedResponse

Paginated collection of meeting requests.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [PagingJson](../../models/components/PagingJson.md)                | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[MeetingRequest](../../models/components/MeetingRequest.md)> | :heavy_check_mark:                                                 | Collection of meeting request objects.                             |