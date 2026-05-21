# ExhibitorsPaginatedResponse

A paginated response containing a list of exhibitors for an event.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [Paging](../../Models/Components/Paging.md)                             | :heavy_minus_sign:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[ExhibitorResponse](../../Models/Components/ExhibitorResponse.md)> | :heavy_minus_sign:                                                      | Paginated list of exhibitors for an event.                              |