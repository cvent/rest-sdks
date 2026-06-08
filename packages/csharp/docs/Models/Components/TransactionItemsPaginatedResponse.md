# TransactionItemsPaginatedResponse

The response from a request to list of transactions. This includes the paging object as well.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [Paging](../../Models/Components/Paging.md)                                         | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[TransactionItemResponse](../../Models/Components/TransactionItemResponse.md)> | :heavy_check_mark:                                                                  | Collection of transaction details.                                                  |