# SpeakerSessionPaginatedResponse

The response from a request to get the list of speaker sessions.  This includes the paging object as well as the collection of speaker sessions.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [PagingJson](../../models/components/PagingJson.md)                        | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[SpeakerSessionJson](../../models/components/SpeakerSessionJson.md)> | :heavy_check_mark:                                                         | Collection of speaker sessions.                                            |