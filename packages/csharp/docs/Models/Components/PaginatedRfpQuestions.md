# PaginatedRfpQuestions

Paginated response containing questions associated to an RFP.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[RfpQuestion](../../Models/Components/RfpQuestion.md)>      | :heavy_minus_sign:                                               | List of questions associated to an RFP.                          |