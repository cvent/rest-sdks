# TransactionDetailsPaginatedResponse

The response from a request to list of transactions. This includes the paging object as well.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [PagingJson](../../models/components/PagingJson.md)                              | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[TransactionDetailJson](../../models/components/TransactionDetailJson.md)> | :heavy_check_mark:                                                               | Collection of transaction details.                                               |