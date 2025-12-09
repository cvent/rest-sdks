# EmailHistoryPaginatedResponse

The response from a request to get the list of email history. This includes the paging object as well as the collection of email history.


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `Paging`                                                              | [PagingJson](../../Models/Components/PagingJson.md)                   | :heavy_check_mark:                                                    | Represents pagination information for a collection of resources.      |
| `Data`                                                                | List<[EmailHistoryJson](../../Models/Components/EmailHistoryJson.md)> | :heavy_check_mark:                                                    | Collection of emails history data.                                    |