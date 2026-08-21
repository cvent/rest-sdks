# TransactionItemsAccountPaginatedResponse

The response from a request to the list of transaction items. This includes the paging object as well.


## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `paging`                                                                                           | [Paging](../../models/components/Paging.md)                                                        | :heavy_check_mark:                                                                                 | Represents pagination information for a collection of resources.                                   |
| `data`                                                                                             | List\<[TransactionItemAccountResponse](../../models/components/TransactionItemAccountResponse.md)> | :heavy_check_mark:                                                                                 | Collection of transaction items.                                                                   |