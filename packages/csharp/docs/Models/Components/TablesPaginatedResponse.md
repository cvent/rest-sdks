# TablesPaginatedResponse

The response from a request to get the event table for the event.


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `Paging`                                                                          | [PagingJson](../../Models/Components/PagingJson.md)                               | :heavy_minus_sign:                                                                | Represents pagination information for a collection of resources.                  |
| `Data`                                                                            | List<[ExistingTableWithSeats](../../Models/Components/ExistingTableWithSeats.md)> | :heavy_check_mark:                                                                | A list of event tables                                                            |