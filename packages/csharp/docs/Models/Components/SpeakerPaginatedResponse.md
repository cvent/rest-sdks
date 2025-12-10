# SpeakerPaginatedResponse

The response from a request to get the list of speakers.  This includes the paging object as well as the collection of speakers.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[ExistingSpeaker](../../Models/Components/ExistingSpeaker.md)> | :heavy_check_mark:                                                  | Collection of speakers.                                             |