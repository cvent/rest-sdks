# AttendeeCreditsPaginatedResponse

Response containing attendee credits information.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                       | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[AttendeeCreditJson](../../Models/Components/AttendeeCreditJson.md)> | :heavy_check_mark:                                                        | Collection of credits assigned to attendees.                              |