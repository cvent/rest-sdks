# ContactGroupPaginatedResponse

The response from a request to get the list of contact groups.  This includes the paging object as well as the collection of contact-groups.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ContactGroup](../../Models/Components/ContactGroup.md)>    | :heavy_check_mark:                                               | Collection of contact groups.                                    |