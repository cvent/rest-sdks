# EliteratureRequestPaginatedResponse

A paginated response for E-literature requests.


## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                   | [Optional\<PagingJson>](../../models/components/PagingJson.md)                                             | :heavy_minus_sign:                                                                                         | Represents pagination information for a collection of resources.                                           |
| `data`                                                                                                     | List\<[ExistingEliteratureRequestDataJson](../../models/components/ExistingEliteratureRequestDataJson.md)> | :heavy_minus_sign:                                                                                         | Collection of E-literature request data.                                                                   |