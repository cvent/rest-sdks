# ProgramItemDocumentPaginatedResponse

The response from a request to get the list of session program item documents.


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [Paging](../../models/components/Paging.md)                                                | :heavy_check_mark:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | List\<[ProgramItemSessionDocument](../../models/components/ProgramItemSessionDocument.md)> | :heavy_check_mark:                                                                         | Collection of Session Program Item Documents.                                              |