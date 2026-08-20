# ReservationsPaginatedResponse

Details list about existing reservations.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [Optional\<Paging>](../../models/components/Paging.md)                       | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[ExistingReservation](../../models/components/ExistingReservation.md)> | :heavy_minus_sign:                                                           | List of reservation details.                                                 |