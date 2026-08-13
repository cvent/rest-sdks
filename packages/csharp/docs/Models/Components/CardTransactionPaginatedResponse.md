# CardTransactionPaginatedResponse

The response from a request to get the list of transaction for the event.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [Paging](../../Models/Components/Paging.md)                         | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[CardTransaction](../../Models/Components/CardTransaction.md)> | :heavy_check_mark:                                                  | Collection of virtual card transaction.                             |