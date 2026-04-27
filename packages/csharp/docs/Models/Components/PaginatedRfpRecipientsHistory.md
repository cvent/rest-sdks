# PaginatedRfpRecipientsHistory

Paginated response containing logs of all the recipients that were copied on an RFP.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [PagingJson](../../Models/Components/PagingJson.md)                                   | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[RfpRecipientLogEntryJson](../../Models/Components/RfpRecipientLogEntryJson.md)> | :heavy_check_mark:                                                                    | List of RFP recipient logs.                                                           |