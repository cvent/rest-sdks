# ProgramItemPaginatedResponse

The response from a request to get the list of session program items.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ProgramItem1](../../Models/Components/ProgramItem1.md)>    | :heavy_check_mark:                                               | Collection of Session Program Items.                             |