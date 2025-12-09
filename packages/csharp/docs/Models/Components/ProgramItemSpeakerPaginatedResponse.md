# ProgramItemSpeakerPaginatedResponse

The response from a request to get the list of program item speakers.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                       | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[SpeakerProgramItem](../../Models/Components/SpeakerProgramItem.md)> | :heavy_check_mark:                                                        | Collection of program item speakers.                                      |