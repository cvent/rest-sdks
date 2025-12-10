# AdmissionItemsPaginatedResponse

Paginated collection of admission items.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [PagingJson](../../models/components/PagingJson.md)                              | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[ExistingAdmissionItem](../../models/components/ExistingAdmissionItem.md)> | :heavy_check_mark:                                                               | A collection of admission items and their associated details.                    |