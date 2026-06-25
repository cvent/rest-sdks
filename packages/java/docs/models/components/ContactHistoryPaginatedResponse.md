# ContactHistoryPaginatedResponse

The response of a request to get the change history for a specific contact.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Optional\<Paging>](../../models/components/Paging.md)             | :heavy_minus_sign:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[ContactHistory](../../models/components/ContactHistory.md)> | :heavy_minus_sign:                                                 | Collection of change histories for a specific contact.             |