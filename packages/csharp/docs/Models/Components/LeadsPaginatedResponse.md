# LeadsPaginatedResponse

A paginated response of leads.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Paging`                                                              | [PagingJson](../../Models/Components/PagingJson.md)                   | :heavy_minus_sign:                                                    | Represents pagination information for a collection of resources.      |
| `Data`                                                                | List<[ExistingLeadJson](../../Models/Components/ExistingLeadJson.md)> | :heavy_minus_sign:                                                    | Collection of leads.                                                  |