# ContactGroupPaginatedResponse

The response from a request to get the list of contact groups.  This includes the paging object as well as the collection of contact-groups.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ContactGroup](../../models/components/ContactGroup.md)>   | :heavy_check_mark:                                               | Collection of contact groups.                                    |