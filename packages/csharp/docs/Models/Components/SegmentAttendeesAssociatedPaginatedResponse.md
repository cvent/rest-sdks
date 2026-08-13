# SegmentAttendeesAssociatedPaginatedResponse

The response from a request to get the paginated list of attendees associated/disassociated to/from an audience segment.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [Paging](../../Models/Components/Paging.md)                                           | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[SegmentAttendee](../../Models/Components/SegmentAttendee.md)>                   | :heavy_check_mark:                                                                    | Collection of list of attendees associated/disassociated to/from an audience segment. |