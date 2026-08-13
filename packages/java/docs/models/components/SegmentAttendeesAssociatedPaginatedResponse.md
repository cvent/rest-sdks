# SegmentAttendeesAssociatedPaginatedResponse

The response from a request to get the paginated list of attendees associated/disassociated to/from an audience segment.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `paging`                                                                              | [Paging](../../models/components/Paging.md)                                           | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `data`                                                                                | List\<[SegmentAttendee](../../models/components/SegmentAttendee.md)>                  | :heavy_check_mark:                                                                    | Collection of list of attendees associated/disassociated to/from an audience segment. |