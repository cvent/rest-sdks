# ContactTypePaginatedResponse

The response from a request to get the list of contact types. This includes the paging object as well as the collection of contact-types.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[ContactTypeJson](../../models/components/ContactTypeJson.md)> | :heavy_check_mark:                                                   | Collection of contact types.                                         |