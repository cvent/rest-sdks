# SpeakerPaginatedResponse

The response from a request to get the list of speakers.  This includes the paging object as well as the collection of speakers.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[ExistingSpeaker](../../models/components/ExistingSpeaker.md)> | :heavy_check_mark:                                                   | Collection of speakers.                                              |