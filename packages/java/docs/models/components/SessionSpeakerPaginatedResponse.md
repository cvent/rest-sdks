# SessionSpeakerPaginatedResponse

The response from a request to get the list of session speakers.  This includes the paging object as well as the collection of session speakers.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Paging](../../models/components/Paging.md)                        | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[SessionSpeaker](../../models/components/SessionSpeaker.md)> | :heavy_check_mark:                                                 | Collection of a session's speakers.                                |