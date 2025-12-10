# ContactIdPaginatedResponse

The response from a request to get the ids of contacts in a contact group or relationship. This includes the paging object as well as the collection of contact ids.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[IdJson](../../models/components/IdJson.md)>               | :heavy_check_mark:                                               | Collection of contact ids.                                       |