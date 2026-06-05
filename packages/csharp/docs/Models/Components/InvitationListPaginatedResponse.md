# InvitationListPaginatedResponse

Return a response object containing paginated data for the invitation list(s).


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson19](../../Models/Components/PagingJson19.md)                   | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[InvitationListJson](../../Models/Components/InvitationListJson.md)> | :heavy_check_mark:                                                        | Collection of invitation list objects.                                    |