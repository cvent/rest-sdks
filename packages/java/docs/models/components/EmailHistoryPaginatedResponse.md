# EmailHistoryPaginatedResponse

The response from a request to get the list of email history. This includes the paging object as well as the collection of email history.


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [PagingJson](../../models/components/PagingJson.md)                    | :heavy_check_mark:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | List\<[EmailHistoryJson](../../models/components/EmailHistoryJson.md)> | :heavy_check_mark:                                                     | Collection of emails history data.                                     |