# ProgramItemSpeakerPaginatedResponse

The response from a request to get the list of program item speakers.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [PagingJson](../../models/components/PagingJson.md)                        | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[SpeakerProgramItem](../../models/components/SpeakerProgramItem.md)> | :heavy_check_mark:                                                         | Collection of program item speakers.                                       |