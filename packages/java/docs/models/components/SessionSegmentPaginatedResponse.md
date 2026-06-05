# SessionSegmentPaginatedResponse

The response from a request to get the list of SessionSegment associations.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Paging](../../models/components/Paging.md)                        | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[SessionSegment](../../models/components/SessionSegment.md)> | :heavy_check_mark:                                                 | Collection of SessionSegment associations.                         |