# PlayerPaginatedResponse

The response from a request to get the list of players.  This includes the paging object as well as the collection of players.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson](../../Models/Components/PagingJson.md)               | :heavy_check_mark:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[ExistingPlayer](../../Models/Components/ExistingPlayer.md)> | :heavy_check_mark:                                                | Collection of players.                                            |