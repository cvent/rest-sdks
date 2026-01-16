# AppointmentPaginatedResponse

The response for a request of appointments, including the paging object.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ZeroAllOf3](../../models/components/ZeroAllOf3.md)>       | :heavy_check_mark:                                               | Collection of appointments and their related details.            |