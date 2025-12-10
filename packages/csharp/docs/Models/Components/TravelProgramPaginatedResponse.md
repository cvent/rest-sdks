# TravelProgramPaginatedResponse

A paginated list of travel programs.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[TravelProgram](../../Models/Components/TravelProgram.md)>  | :heavy_minus_sign:                                               | Collection of travel programs and their related details.         |