# ContactHistoryPaginatedResponse

The response of a request to get the change history for a specific contact.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [Paging](../../Models/Components/Paging.md)                       | :heavy_minus_sign:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[ContactHistory](../../Models/Components/ContactHistory.md)> | :heavy_minus_sign:                                                | Collection of change histories for a specific contact.            |