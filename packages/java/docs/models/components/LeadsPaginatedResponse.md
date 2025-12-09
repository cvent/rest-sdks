# LeadsPaginatedResponse

A paginated response of leads.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [Optional\<PagingJson>](../../models/components/PagingJson.md)         | :heavy_minus_sign:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | List\<[ExistingLeadJson](../../models/components/ExistingLeadJson.md)> | :heavy_minus_sign:                                                     | Collection of leads.                                                   |