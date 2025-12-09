# ContactPaginatedResponse

The response from a request to get the list of contacts.  This includes the paging object as well as the collection of contacts.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ZeroAllOf6](../../models/components/ZeroAllOf6.md)>       | :heavy_check_mark:                                               | Collection of contacts.                                          |