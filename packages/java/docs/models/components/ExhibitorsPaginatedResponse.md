# ExhibitorsPaginatedResponse

A paginated response containing a list of exhibitors for an event.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [Optional\<Paging>](../../models/components/Paging.md)                   | :heavy_minus_sign:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | List\<[ExhibitorResponse](../../models/components/ExhibitorResponse.md)> | :heavy_minus_sign:                                                       | Paginated list of exhibitors for an event.                               |