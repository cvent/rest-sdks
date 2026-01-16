# ContactPaginatedResponse

The response from a request to get the list of contacts.  This includes the paging object as well as the collection of contacts.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ZeroAllOf7](../../Models/Components/ZeroAllOf7.md)>        | :heavy_check_mark:                                               | Collection of contacts.                                          |