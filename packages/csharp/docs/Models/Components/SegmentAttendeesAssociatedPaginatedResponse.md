# SegmentAttendeesAssociatedPaginatedResponse

A paginated collection of attendees associated with or disassociated from an audience segment.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `Paging`                                                                           | [Paging](../../Models/Components/Paging.md)                                        | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `Data`                                                                             | List<[SegmentAttendee](../../Models/Components/SegmentAttendee.md)>                | :heavy_check_mark:                                                                 | Collection of attendees associated with or disassociated from an audience segment. |