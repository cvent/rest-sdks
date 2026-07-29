# MeetingRequestDocumentPaginatedResponse

Paginated collection of meeting request documents.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [Paging](../../models/components/Paging.md)                                        | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[MeetingRequestDocument](../../models/components/MeetingRequestDocument.md)> | :heavy_check_mark:                                                                 | Collection of meeting request object documents.                                    |