# MessageRecipientsPaginatedResponse

The response matching the filter criteria for the list of channel members.


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `paging`                                                                                         | [PagingJson](../../models/components/PagingJson.md)                                              | :heavy_check_mark:                                                                               | Represents pagination information for a collection of resources.                                 |
| `data`                                                                                           | List\<[MessageRecipientsResponseJson](../../models/components/MessageRecipientsResponseJson.md)> | :heavy_check_mark:                                                                               | Collection of channel members.                                                                   |