# VideosPaginatedResponse

The response from a request to get the list of videos.  This includes the paging object as well as the collection of videos.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [PagingJson](../../models/components/PagingJson.md)                              | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[ExistingVideoResponse](../../models/components/ExistingVideoResponse.md)> | :heavy_check_mark:                                                               | Collection of videos.                                                            |