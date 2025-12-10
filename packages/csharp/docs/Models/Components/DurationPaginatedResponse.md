# DurationPaginatedResponse

Paginated collection of durations.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Paging`                                                              | [PagingJson](../../Models/Components/PagingJson.md)                   | :heavy_check_mark:                                                    | Represents pagination information for a collection of resources.      |
| `Data`                                                                | List<[ExistingDuration](../../Models/Components/ExistingDuration.md)> | :heavy_check_mark:                                                    | Collection of durations.                                              |