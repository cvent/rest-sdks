# BoothStaffListResponse

Represents the booth staff list response, with paging information and a list of booth staff.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [Paging](../../Models/Components/Paging.md)                               | :heavy_minus_sign:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[BoothStaffResponse](../../Models/Components/BoothStaffResponse.md)> | :heavy_minus_sign:                                                        | List of booth staff.                                                      |