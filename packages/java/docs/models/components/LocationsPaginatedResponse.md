# LocationsPaginatedResponse

The response for a request of locations for scheduling appointments.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `paging`                                                          | [Optional\<PagingJson>](../../models/components/PagingJson.md)    | :heavy_minus_sign:                                                | Represents pagination information for a collection of resources.  |
| `data`                                                            | List\<[LocationJson](../../models/components/LocationJson.md)>    | :heavy_minus_sign:                                                | Collection of appointment locations and their associated details. |