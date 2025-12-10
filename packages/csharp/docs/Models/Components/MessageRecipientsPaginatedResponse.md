# MessageRecipientsPaginatedResponse

The response matching the filter criteria for the list of channel members.


## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `Paging`                                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                                             | :heavy_check_mark:                                                                              | Represents pagination information for a collection of resources.                                |
| `Data`                                                                                          | List<[MessageRecipientsResponseJson](../../Models/Components/MessageRecipientsResponseJson.md)> | :heavy_check_mark:                                                                              | Collection of channel members.                                                                  |