# CardDetailsPaginatedResponse

The response from a request to get the list of Card Details for the event.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[CardDetailsJson](../../Models/Components/CardDetailsJson.md)> | :heavy_check_mark:                                                  | Collection of Card Details.                                         |