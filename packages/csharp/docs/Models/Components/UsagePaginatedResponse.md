# UsagePaginatedResponse

The list of usage for the caller's account in the date range specified.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[UsageJson](../../Models/Components/UsageJson.md)>          | :heavy_check_mark:                                               | Collection of usage objects.                                     |