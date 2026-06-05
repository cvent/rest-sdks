# ProgramItemPaginatedResponse

The response from a request to get the list of session program items.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ProgramItem1](../../models/components/ProgramItem1.md)>   | :heavy_check_mark:                                               | Collection of Session Program Items.                             |