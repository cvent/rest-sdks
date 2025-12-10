# HubsPaginatedResponse

The response from a request to get the list of Events+ hubs. This includes the paging object as well as the collection of Events+ hubs.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ExistingHub](../../models/components/ExistingHub.md)>     | :heavy_check_mark:                                               | List of Events+ hubs.                                            |