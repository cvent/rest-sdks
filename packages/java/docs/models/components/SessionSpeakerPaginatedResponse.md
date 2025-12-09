# SessionSpeakerPaginatedResponse

The response from a request to get the list of session speakers.  This includes the paging object as well as the collection of session speakers.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [PagingJson](../../models/components/PagingJson.md)                        | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[SessionSpeakerJson](../../models/components/SessionSpeakerJson.md)> | :heavy_check_mark:                                                         | Collection of a session's speakers.                                        |