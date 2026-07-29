# MeetingRoomsOverviewResponse

Paginated overview of meeting rooms for a venue.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [Optional\<Paging>](../../models/components/Paging.md)                       | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[MeetingRoomOverview](../../models/components/MeetingRoomOverview.md)> | :heavy_check_mark:                                                           | Overview of meeting rooms.                                                   |