# MeetingRequestDocumentPaginatedResponse

Paginated collection of meeting request documents.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Paging`                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                       | :heavy_check_mark:                                                                        | Represents pagination information for a collection of resources.                          |
| `Data`                                                                                    | List<[MeetingRequestDocumentJson](../../Models/Components/MeetingRequestDocumentJson.md)> | :heavy_check_mark:                                                                        | Collection of meeting request object documents.                                           |