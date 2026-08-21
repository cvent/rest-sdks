# TransactionItemsAccountPaginatedResponse

The response from a request to the list of transaction items. This includes the paging object as well.


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                          | [Paging](../../Models/Components/Paging.md)                                                       | :heavy_check_mark:                                                                                | Represents pagination information for a collection of resources.                                  |
| `Data`                                                                                            | List<[TransactionItemAccountResponse](../../Models/Components/TransactionItemAccountResponse.md)> | :heavy_check_mark:                                                                                | Collection of transaction items.                                                                  |