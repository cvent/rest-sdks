# ContactPaginatedResponse

The response from a request to get the list of contacts.  This includes the paging object as well as the collection of contacts.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Contact](../../models/components/Contact.md)>             | :heavy_check_mark:                                               | Collection of contacts.                                          |