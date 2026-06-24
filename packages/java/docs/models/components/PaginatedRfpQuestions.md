# PaginatedRfpQuestions

Paginated response containing questions associated to an RFP.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<Paging>](../../models/components/Paging.md)           | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[RfpQuestion](../../models/components/RfpQuestion.md)>     | :heavy_minus_sign:                                               | List of questions associated to an RFP.                          |