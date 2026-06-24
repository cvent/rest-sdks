# PaginatedRfpCustomField

Paginated list of RFP custom fields associated to a RFP.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [Optional\<Paging>](../../models/components/Paging.md)                     | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[CustomFieldAnswers](../../models/components/CustomFieldAnswers.md)> | :heavy_minus_sign:                                                         | List of RFP custom fields linked to an RFP.                                |