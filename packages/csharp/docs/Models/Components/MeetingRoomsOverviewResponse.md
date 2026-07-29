# MeetingRoomsOverviewResponse

Paginated overview of meeting rooms for a venue.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [Paging](../../Models/Components/Paging.md)                                 | :heavy_minus_sign:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[MeetingRoomOverview](../../Models/Components/MeetingRoomOverview.md)> | :heavy_check_mark:                                                          | Overview of meeting rooms.                                                  |