# ProcessFormSubmissionsPaginatedResponse

The response from a request to get the list of process form submissions. This includes the paging object as well as the collection of process form submissions.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [Paging](../../models/components/Paging.md)                                      | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[ProcessFormSubmission](../../models/components/ProcessFormSubmission.md)> | :heavy_check_mark:                                                               | Collection of process form submission objects.                                   |