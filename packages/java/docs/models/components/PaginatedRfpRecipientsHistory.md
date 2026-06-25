# PaginatedRfpRecipientsHistory

Paginated response containing logs of all the recipients that were copied on an RFP.


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [Paging](../../models/components/Paging.md)                                    | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | List\<[RfpRecipientLogEntry](../../models/components/RfpRecipientLogEntry.md)> | :heavy_check_mark:                                                             | List of RFP recipient logs.                                                    |