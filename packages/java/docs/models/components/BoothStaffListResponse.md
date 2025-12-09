# BoothStaffListResponse

Represents the booth staff list response, with paging information and a list of booth staff.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [Optional\<PagingJson>](../../models/components/PagingJson.md)                     | :heavy_minus_sign:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[ExistingBoothStaffJson](../../models/components/ExistingBoothStaffJson.md)> | :heavy_minus_sign:                                                                 | List of booth staff.                                                               |