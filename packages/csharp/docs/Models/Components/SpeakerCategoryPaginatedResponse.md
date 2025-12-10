# SpeakerCategoryPaginatedResponse

The response from a request to get the list of speaker categories.  This includes the paging object as well as the collection of speaker categories.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[ExistingSpeakerCategory](../../Models/Components/ExistingSpeakerCategory.md)> | :heavy_check_mark:                                                                  | Collection of speaker categories.                                                   |