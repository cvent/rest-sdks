# AppointmentAttendeePaginatedResponse

The response from a request to get the list of appointment attendees, including paging information.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [PagingJson](../../models/components/PagingJson.md)                          | :heavy_check_mark:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[AppointmentAttendee](../../models/components/AppointmentAttendee.md)> | :heavy_check_mark:                                                           | Collection of appointment attendees and their related details.               |