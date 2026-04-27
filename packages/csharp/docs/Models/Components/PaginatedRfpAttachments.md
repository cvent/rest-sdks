# PaginatedRfpAttachments

Paginated list of RFP attachments.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_check_mark:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[RfpAttachmentJson](../../Models/Components/RfpAttachmentJson.md)> | :heavy_check_mark:                                                      | List of attachments added on an RFP.                                    |