# TablesPaginatedResponse

The response from a request to get the event table for the event.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [Optional\<PagingJson>](../../models/components/PagingJson.md)                     | :heavy_minus_sign:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[ExistingTableWithSeats](../../models/components/ExistingTableWithSeats.md)> | :heavy_check_mark:                                                                 | A list of event tables                                                             |