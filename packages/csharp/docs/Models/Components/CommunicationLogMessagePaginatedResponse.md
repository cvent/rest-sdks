# CommunicationLogMessagePaginatedResponse

A single page of communication log messages


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `Paging`                                                                                    | [PagingJson](../../Models/Components/PagingJson.md)                                         | :heavy_check_mark:                                                                          | Represents pagination information for a collection of resources.                            |
| `Data`                                                                                      | List<[CommunicationLogMessageJson](../../Models/Components/CommunicationLogMessageJson.md)> | :heavy_check_mark:                                                                          | Collection of communication log messages.                                                   |