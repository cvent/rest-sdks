# HousingReservation

A housing reservation request with its bridge ID and booking-site link.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Id`                                                                        | *string*                                                                    | :heavy_minus_sign:                                                          | Reservation request ID, also known as a bridge ID.                          | D6A63423-G796                                                               |
| `BookingSite`                                                               | [HousingReservationLink](../../Models/Components/HousingReservationLink.md) | :heavy_minus_sign:                                                          | Link to the booking site for this reservation request.                      |                                                                             |