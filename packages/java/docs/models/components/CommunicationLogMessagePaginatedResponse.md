# CommunicationLogMessagePaginatedResponse

A single page of communication log messages


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `paging`                                                                                     | [PagingJson](../../models/components/PagingJson.md)                                          | :heavy_check_mark:                                                                           | Represents pagination information for a collection of resources.                             |
| `data`                                                                                       | List\<[CommunicationLogMessageJson](../../models/components/CommunicationLogMessageJson.md)> | :heavy_check_mark:                                                                           | Collection of communication log messages.                                                    |