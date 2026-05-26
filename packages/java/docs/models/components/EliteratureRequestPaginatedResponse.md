# EliteratureRequestPaginatedResponse

A paginated response for E-literature requests.


## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                         | [Optional\<Paging>](../../models/components/Paging.md)                                                           | :heavy_minus_sign:                                                                                               | Represents pagination information for a collection of resources.                                                 |
| `data`                                                                                                           | List\<[ExistingELiteratureRequestDataForLead](../../models/components/ExistingELiteratureRequestDataForLead.md)> | :heavy_minus_sign:                                                                                               | Collection of E-literature request data.                                                                         |