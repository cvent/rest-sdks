# LocationsPaginatedResponse

The response for a request of locations for scheduling appointments.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson](../../Models/Components/PagingJson.md)               | :heavy_minus_sign:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[LocationJson](../../Models/Components/LocationJson.md)>     | :heavy_minus_sign:                                                | Collection of appointment locations and their associated details. |