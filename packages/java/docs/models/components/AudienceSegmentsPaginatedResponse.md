# AudienceSegmentsPaginatedResponse

The response from a request to get the paginated list of audience segments for the event.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [PagingJson](../../models/components/PagingJson.md)                                  | :heavy_check_mark:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | List\<[AudienceSegmentResponse](../../models/components/AudienceSegmentResponse.md)> | :heavy_check_mark:                                                                   | Collection of audience segments.                                                     |