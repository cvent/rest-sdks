# UsagePaginatedResponse

The list of usage for the caller's account in the date range specified.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[UsageJson](../../models/components/UsageJson.md)>         | :heavy_check_mark:                                               | Collection of usage objects.                                     |