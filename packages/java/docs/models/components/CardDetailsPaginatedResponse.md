# CardDetailsPaginatedResponse

The response from a request to get the list of Card Details for the event.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[CardDetailsJson](../../models/components/CardDetailsJson.md)> | :heavy_check_mark:                                                   | Collection of Card Details.                                          |