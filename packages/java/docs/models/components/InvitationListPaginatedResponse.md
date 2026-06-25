# InvitationListPaginatedResponse

Return a response object containing paginated data for the invitation list(s).


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [PagingJson2](../../models/components/PagingJson2.md)                      | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[InvitationListJson](../../models/components/InvitationListJson.md)> | :heavy_check_mark:                                                         | Collection of invitation list objects.                                     |