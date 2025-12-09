# ExhibitorsPaginatedResponse

A paginated response containing a list of exhibitors for an event.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `Paging`                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                             | :heavy_minus_sign:                                                              | Represents pagination information for a collection of resources.                |
| `Data`                                                                          | List<[ExistingExhibitorJson](../../Models/Components/ExistingExhibitorJson.md)> | :heavy_minus_sign:                                                              | Paginated list of exhibitors for an event.                                      |