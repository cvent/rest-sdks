# AttendeeActivitiesPaginatedResponse

The response from a request to get the list of attendee activities. This includes the paging object as well as the collection of attendee activities.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Paging`                                                              | [Paging](../../Models/Components/Paging.md)                           | :heavy_check_mark:                                                    | Represents pagination information for a collection of resources.      |
| `Data`                                                                | List<[AttendeeActivity](../../Models/Components/AttendeeActivity.md)> | :heavy_check_mark:                                                    | Collection of attendee activities.                                    |