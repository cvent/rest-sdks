# PaginatedRfpCustomField

Paginated list of RFP custom fields associated to a RFP.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [Paging](../../Models/Components/Paging.md)                               | :heavy_minus_sign:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[CustomFieldAnswers](../../Models/Components/CustomFieldAnswers.md)> | :heavy_minus_sign:                                                        | List of RFP custom fields linked to an RFP.                               |