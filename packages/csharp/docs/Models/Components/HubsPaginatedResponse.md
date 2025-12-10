# HubsPaginatedResponse

The response from a request to get the list of Events+ hubs. This includes the paging object as well as the collection of Events+ hubs.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ExistingHub](../../Models/Components/ExistingHub.md)>      | :heavy_check_mark:                                               | List of Events+ hubs.                                            |