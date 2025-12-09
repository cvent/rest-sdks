# ExhibitorAdminsListResponse

Exhibitor Admins List Response schema


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Paging`                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                       | :heavy_minus_sign:                                                                        | Represents pagination information for a collection of resources.                          |
| `Data`                                                                                    | List<[ExistingExhibitorAdminJson](../../Models/Components/ExistingExhibitorAdminJson.md)> | :heavy_minus_sign:                                                                        | List of exhibitor admins.                                                                 |