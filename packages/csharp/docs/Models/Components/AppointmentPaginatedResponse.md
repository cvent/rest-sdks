# AppointmentPaginatedResponse

The response for a request of appointments, including the paging object.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ZeroAllOf3](../../Models/Components/ZeroAllOf3.md)>        | :heavy_check_mark:                                               | Collection of appointments and their related details.            |