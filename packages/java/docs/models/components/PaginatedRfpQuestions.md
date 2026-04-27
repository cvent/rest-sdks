# PaginatedRfpQuestions

Paginated response containing questions associated to an RFP.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [Optional\<PagingJson>](../../models/components/PagingJson.md)       | :heavy_minus_sign:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[RfpQuestionJson](../../models/components/RfpQuestionJson.md)> | :heavy_minus_sign:                                                   | List of questions associated to an RFP.                              |