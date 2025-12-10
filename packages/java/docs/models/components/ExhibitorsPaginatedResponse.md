# ExhibitorsPaginatedResponse

A paginated response containing a list of exhibitors for an event.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)                   | :heavy_minus_sign:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[ExistingExhibitorJson](../../models/components/ExistingExhibitorJson.md)> | :heavy_minus_sign:                                                               | Paginated list of exhibitors for an event.                                       |