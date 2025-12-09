# AttendeeCreditsPaginatedResponse

Response containing attendee credits information.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [PagingJson](../../models/components/PagingJson.md)                        | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[AttendeeCreditJson](../../models/components/AttendeeCreditJson.md)> | :heavy_check_mark:                                                         | Collection of credits assigned to attendees.                               |