# EliteratureRequestPaginatedResponse

A paginated response for E-literature requests.


## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                                       | :heavy_minus_sign:                                                                                        | Represents pagination information for a collection of resources.                                          |
| `Data`                                                                                                    | List<[ExistingEliteratureRequestDataJson](../../Models/Components/ExistingEliteratureRequestDataJson.md)> | :heavy_minus_sign:                                                                                        | Collection of E-literature request data.                                                                  |