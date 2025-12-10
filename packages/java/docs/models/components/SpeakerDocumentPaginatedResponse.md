# SpeakerDocumentPaginatedResponse

The response from a request to get the list of documents for a single speaker.  This includes the paging object as well as the collection of documents.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[SpeakerFile](../../models/components/SpeakerFile.md)>     | :heavy_check_mark:                                               | Collection of a speaker's documents.                             |