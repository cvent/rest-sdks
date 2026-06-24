# MessageRecipientsPaginatedResponse

The response matching the filter criteria for the list of channel members.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [Paging](../../Models/Components/Paging.md)                                           | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[MessageRecipientResponse](../../Models/Components/MessageRecipientResponse.md)> | :heavy_check_mark:                                                                    | Collection of channel members.                                                        |