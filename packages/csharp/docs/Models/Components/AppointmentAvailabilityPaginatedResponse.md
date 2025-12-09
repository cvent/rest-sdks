# AppointmentAvailabilityPaginatedResponse

The response for a request for appointment availability times, including paging information.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_minus_sign:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[AppointmentAvailability](../../Models/Components/AppointmentAvailability.md)> | :heavy_minus_sign:                                                                  | The collection of appointment availability times and their related details.         |