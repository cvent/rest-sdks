# SpeakerCategoryPaginatedResponse

The response from a request to get the list of speaker categories.  This includes the paging object as well as the collection of speaker categories.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [Paging](../../models/components/Paging.md)                                          | :heavy_check_mark:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | List\<[ExistingSpeakerCategory](../../models/components/ExistingSpeakerCategory.md)> | :heavy_check_mark:                                                                   | Collection of speaker categories.                                                    |