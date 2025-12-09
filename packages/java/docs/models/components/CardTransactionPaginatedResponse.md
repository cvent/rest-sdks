# CardTransactionPaginatedResponse

The response from a request to get the list of transaction for the event.


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [PagingJson](../../models/components/PagingJson.md)                            | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | List\<[CardTransactionJson1](../../models/components/CardTransactionJson1.md)> | :heavy_check_mark:                                                             | Collection of virtual card transaction.                                        |