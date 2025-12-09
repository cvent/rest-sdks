# SessionSpeakerPaginatedResponse

The response from a request to get the list of session speakers.  This includes the paging object as well as the collection of session speakers.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                       | :heavy_check_mark:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[SessionSpeakerJson](../../Models/Components/SessionSpeakerJson.md)> | :heavy_check_mark:                                                        | Collection of a session's speakers.                                       |