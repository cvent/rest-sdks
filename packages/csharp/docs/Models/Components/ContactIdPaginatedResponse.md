# ContactIdPaginatedResponse

The response from a request to get the ids of contacts in a contact group or relationship. This includes the paging object as well as the collection of contact ids.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[IdJson](../../Models/Components/IdJson.md)>                | :heavy_check_mark:                                               | Collection of contact ids.                                       |