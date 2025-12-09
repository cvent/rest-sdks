# BoothStaffListResponse

Represents the booth staff list response, with paging information and a list of booth staff.


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `Paging`                                                                          | [PagingJson](../../Models/Components/PagingJson.md)                               | :heavy_minus_sign:                                                                | Represents pagination information for a collection of resources.                  |
| `Data`                                                                            | List<[ExistingBoothStaffJson](../../Models/Components/ExistingBoothStaffJson.md)> | :heavy_minus_sign:                                                                | List of booth staff.                                                              |