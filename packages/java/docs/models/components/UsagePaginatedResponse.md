# UsagePaginatedResponse

The list of usage for the caller's account in the date range specified.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<Paging>](../../models/components/Paging.md)           | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Usage](../../models/components/Usage.md)>                 | :heavy_check_mark:                                               | Collection of usage objects.                                     |