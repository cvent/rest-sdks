# InvitationListPaginatedResponse

Return a response object containing paginated data for the invitation list(s).


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson25](../../Models/Components/PagingJson25.md)                   | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[InvitationListJson](../../Models/Components/InvitationListJson.md)> | :heavy_check_mark:                                                        | Collection of invitation list objects.                                    |