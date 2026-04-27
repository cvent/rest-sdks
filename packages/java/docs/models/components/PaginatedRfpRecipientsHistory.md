# PaginatedRfpRecipientsHistory

Paginated response containing logs of all the recipients that were copied on an RFP.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [PagingJson](../../models/components/PagingJson.md)                                    | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[RfpRecipientLogEntryJson](../../models/components/RfpRecipientLogEntryJson.md)> | :heavy_check_mark:                                                                     | List of RFP recipient logs.                                                            |