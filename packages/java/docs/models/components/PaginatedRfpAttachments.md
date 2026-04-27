# PaginatedRfpAttachments

Paginated list of RFP attachments.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [PagingJson](../../models/components/PagingJson.md)                      | :heavy_check_mark:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | List\<[RfpAttachmentJson](../../models/components/RfpAttachmentJson.md)> | :heavy_check_mark:                                                       | List of attachments added on an RFP.                                     |