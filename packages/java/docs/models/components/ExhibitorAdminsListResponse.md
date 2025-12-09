# ExhibitorAdminsListResponse

Exhibitor Admins List Response schema


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [Optional\<PagingJson>](../../models/components/PagingJson.md)                             | :heavy_minus_sign:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | List\<[ExistingExhibitorAdminJson](../../models/components/ExistingExhibitorAdminJson.md)> | :heavy_minus_sign:                                                                         | List of exhibitor admins.                                                                  |