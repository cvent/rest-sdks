# PaginatedRfpAttachments

Paginated list of RFP attachments.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[RfpAttachment](../../models/components/RfpAttachment.md)> | :heavy_check_mark:                                               | List of attachments added on an RFP.                             |