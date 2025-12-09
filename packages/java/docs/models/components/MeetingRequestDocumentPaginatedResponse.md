# MeetingRequestDocumentPaginatedResponse

Paginated collection of meeting request documents.


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [PagingJson](../../models/components/PagingJson.md)                                        | :heavy_check_mark:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | List\<[MeetingRequestDocumentJson](../../models/components/MeetingRequestDocumentJson.md)> | :heavy_check_mark:                                                                         | Collection of meeting request object documents.                                            |