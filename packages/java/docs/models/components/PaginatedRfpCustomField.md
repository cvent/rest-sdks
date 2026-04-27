# PaginatedRfpCustomField

Paginated list of RFP custom fields associated to a RFP.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [Optional\<PagingJson>](../../models/components/PagingJson.md)             | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[RfpCustomFieldJson](../../models/components/RfpCustomFieldJson.md)> | :heavy_minus_sign:                                                         | List of RFP custom fields linked to an RFP.                                |