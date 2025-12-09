# HooksPaginatedResponse

The response from a request to get the list of hooks with a callback URI. This includes the paging object as well as the collection of hooks.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[HookOutput](../../models/components/HookOutput.md)>       | :heavy_check_mark:                                               | Collection of contact hooks.                                     |