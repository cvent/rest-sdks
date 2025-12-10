# SeatsPaginatedResponse

The response from a request to get the event seat for the event.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ExistingSeat](../../Models/Components/ExistingSeat.md)>    | :heavy_check_mark:                                               | A list of event seats                                            |