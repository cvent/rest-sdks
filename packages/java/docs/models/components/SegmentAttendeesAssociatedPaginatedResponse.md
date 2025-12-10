# SegmentAttendeesAssociatedPaginatedResponse

The response from a request to get the paginated list of attendees associated/disassociated to/from an audience segment.


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `paging`                                                                                     | [PagingJson](../../models/components/PagingJson.md)                                          | :heavy_check_mark:                                                                           | Represents pagination information for a collection of resources.                             |
| `data`                                                                                       | List\<[SegmentAttendeeResponseJson](../../models/components/SegmentAttendeeResponseJson.md)> | :heavy_check_mark:                                                                           | Collection of list of attendees associated/disassociated to/from an audience segment.        |