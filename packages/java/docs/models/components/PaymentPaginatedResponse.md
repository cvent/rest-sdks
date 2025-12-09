# PaymentPaginatedResponse

The response from a request to get the list of payments for event.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[PaymentResponse](../../models/components/PaymentResponse.md)> | :heavy_check_mark:                                                   | Collection of payments for budget items for an event.                |