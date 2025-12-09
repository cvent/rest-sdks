# ProcessFormSubmissionsPaginatedResponse

The response from a request to get the list of process form submissions. This includes the paging object as well as the collection of process form submissions.


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `Paging`                                                                                | [PagingJson](../../Models/Components/PagingJson.md)                                     | :heavy_check_mark:                                                                      | Represents pagination information for a collection of resources.                        |
| `Data`                                                                                  | List<[ProcessFormSubmissionJson](../../Models/Components/ProcessFormSubmissionJson.md)> | :heavy_check_mark:                                                                      | Collection of process form submission objects.                                          |