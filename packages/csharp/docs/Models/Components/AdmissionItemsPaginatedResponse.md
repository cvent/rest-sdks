# AdmissionItemsPaginatedResponse

Paginated collection of admission items.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `Paging`                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                             | :heavy_check_mark:                                                              | Represents pagination information for a collection of resources.                |
| `Data`                                                                          | List<[ExistingAdmissionItem](../../Models/Components/ExistingAdmissionItem.md)> | :heavy_check_mark:                                                              | A collection of admission items and their associated details.                   |