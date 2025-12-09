# TravelProgramPaginatedResponse

A paginated list of travel programs.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[TravelProgram](../../models/components/TravelProgram.md)> | :heavy_minus_sign:                                               | Collection of travel programs and their related details.         |