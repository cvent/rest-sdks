# EliteratureRequestPaginatedResponse

A paginated response for E-literature requests.


## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                        | [Paging](../../Models/Components/Paging.md)                                                                     | :heavy_minus_sign:                                                                                              | Represents pagination information for a collection of resources.                                                |
| `Data`                                                                                                          | List<[ExistingELiteratureRequestDataForLead](../../Models/Components/ExistingELiteratureRequestDataForLead.md)> | :heavy_minus_sign:                                                                                              | Collection of E-literature request data.                                                                        |