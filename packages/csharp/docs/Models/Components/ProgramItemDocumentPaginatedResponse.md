# ProgramItemDocumentPaginatedResponse

The response from a request to get the list of session program item documents.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Paging`                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                       | :heavy_check_mark:                                                                        | Represents pagination information for a collection of resources.                          |
| `Data`                                                                                    | List<[ProgramItemSessionDocument](../../Models/Components/ProgramItemSessionDocument.md)> | :heavy_check_mark:                                                                        | Collection of Session Program Item Documents.                                             |