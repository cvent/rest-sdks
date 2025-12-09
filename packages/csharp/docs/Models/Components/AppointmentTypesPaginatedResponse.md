# AppointmentTypesPaginatedResponse

The response for a request of appointment types configured for scheduling appointments.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [PagingJson](../../Models/Components/PagingJson.md)                         | :heavy_minus_sign:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[AppointmentTypeJson](../../Models/Components/AppointmentTypeJson.md)> | :heavy_minus_sign:                                                          | The collection of appointment types object.                                 |