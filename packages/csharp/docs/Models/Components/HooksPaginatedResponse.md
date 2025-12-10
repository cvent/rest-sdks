# HooksPaginatedResponse

The response from a request to get the list of hooks with a callback URI. This includes the paging object as well as the collection of hooks.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[HookOutput](../../Models/Components/HookOutput.md)>        | :heavy_check_mark:                                               | Collection of contact hooks.                                     |