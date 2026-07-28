# MeetingRoomCapacities

Capacity information for a meeting room, grouped by category.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Exhibits`                                                                                | List<[MeetingRoomExhibitCapacity](../../Models/Components/MeetingRoomExhibitCapacity.md)> | :heavy_minus_sign:                                                                        | Maximum number of exhibits per room setup.                                                |
| `Seating`                                                                                 | List<[MeetingRoomSeatingCapacity](../../Models/Components/MeetingRoomSeatingCapacity.md)> | :heavy_minus_sign:                                                                        | Maximum number of attendees per seating style.                                            |