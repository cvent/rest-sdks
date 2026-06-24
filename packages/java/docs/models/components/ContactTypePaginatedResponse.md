# ContactTypePaginatedResponse

The response from a request to get the list of contact types. This includes the paging object as well as the collection of contact-types.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ContactType](../../models/components/ContactType.md)>     | :heavy_check_mark:                                               | Collection of contact types.                                     |