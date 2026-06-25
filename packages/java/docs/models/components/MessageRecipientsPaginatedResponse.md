# MessageRecipientsPaginatedResponse

The response matching the filter criteria for the list of channel members.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [Paging](../../models/components/Paging.md)                                            | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[MessageRecipientResponse](../../models/components/MessageRecipientResponse.md)> | :heavy_check_mark:                                                                     | Collection of channel members.                                                         |