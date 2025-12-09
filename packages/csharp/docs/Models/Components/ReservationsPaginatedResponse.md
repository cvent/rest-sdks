# ReservationsPaginatedResponse

Details list about existing reservations.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [PagingJson](../../Models/Components/PagingJson.md)                         | :heavy_minus_sign:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[ExistingReservation](../../Models/Components/ExistingReservation.md)> | :heavy_minus_sign:                                                          | List of reservation details.                                                |