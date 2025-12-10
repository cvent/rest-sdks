# VideosPaginatedResponse

The response from a request to get the list of videos.  This includes the paging object as well as the collection of videos.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `Paging`                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                             | :heavy_check_mark:                                                              | Represents pagination information for a collection of resources.                |
| `Data`                                                                          | List<[ExistingVideoResponse](../../Models/Components/ExistingVideoResponse.md)> | :heavy_check_mark:                                                              | Collection of videos.                                                           |