# ContactIdPaginatedResponse

The response from a request to get the ids of contacts in a contact group or relationship. This includes the paging object as well as the collection of contact ids.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[IdOnlyEntity](../../models/components/IdOnlyEntity.md)>   | :heavy_check_mark:                                               | Collection of contact ids.                                       |