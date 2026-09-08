# PlayerPaginatedResponse

The response from a request to get the list of players.  This includes the paging object as well as the collection of players.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Paging](../../models/components/Paging.md)                        | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[ExistingPlayer](../../models/components/ExistingPlayer.md)> | :heavy_check_mark:                                                 | Collection of players.                                             |