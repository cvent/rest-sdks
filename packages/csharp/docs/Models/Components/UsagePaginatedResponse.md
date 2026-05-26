# UsagePaginatedResponse

The list of usage for the caller's account in the date range specified.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [Paging](../../Models/Components/Paging.md)                       | :heavy_minus_sign:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[Models.Components.Usage](../../Models/Components/Usage.md)> | :heavy_check_mark:                                                | Collection of usage objects.                                      |