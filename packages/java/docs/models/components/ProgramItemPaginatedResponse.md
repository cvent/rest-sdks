# ProgramItemPaginatedResponse

The response from a request to get the list of session program items.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ProgramItem](../../models/components/ProgramItem.md)>     | :heavy_check_mark:                                               | Collection of Session Program Items.                             |