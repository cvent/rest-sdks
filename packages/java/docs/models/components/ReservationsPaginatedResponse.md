# ReservationsPaginatedResponse

Details list about existing reservations.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [Optional\<PagingJson>](../../models/components/PagingJson.md)               | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[ExistingReservation](../../models/components/ExistingReservation.md)> | :heavy_minus_sign:                                                           | List of reservation details.                                                 |