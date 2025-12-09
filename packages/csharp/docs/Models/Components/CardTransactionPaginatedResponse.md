# CardTransactionPaginatedResponse

The response from a request to get the list of transaction for the event.


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Paging`                                                                      | [PagingJson](../../Models/Components/PagingJson.md)                           | :heavy_check_mark:                                                            | Represents pagination information for a collection of resources.              |
| `Data`                                                                        | List<[CardTransactionJson1](../../Models/Components/CardTransactionJson1.md)> | :heavy_check_mark:                                                            | Collection of virtual card transaction.                                       |