# DurationPaginatedResponse

Paginated collection of durations.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [PagingJson](../../models/components/PagingJson.md)                    | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | List\<[ExistingDuration](../../models/components/ExistingDuration.md)> | :heavy_check_mark:                                                     | Collection of durations.                                               |