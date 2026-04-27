# PaginatedRfpQuestions

Paginated response containing questions associated to an RFP.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_minus_sign:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[RfpQuestionJson](../../Models/Components/RfpQuestionJson.md)> | :heavy_minus_sign:                                                  | List of questions associated to an RFP.                             |