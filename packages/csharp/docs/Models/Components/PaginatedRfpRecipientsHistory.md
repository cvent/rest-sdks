# PaginatedRfpRecipientsHistory

Paginated response containing logs of all the recipients that were copied on an RFP.


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Paging`                                                                      | [Paging](../../Models/Components/Paging.md)                                   | :heavy_check_mark:                                                            | Represents pagination information for a collection of resources.              |
| `Data`                                                                        | List<[RfpRecipientLogEntry](../../Models/Components/RfpRecipientLogEntry.md)> | :heavy_check_mark:                                                            | List of RFP recipient logs.                                                   |