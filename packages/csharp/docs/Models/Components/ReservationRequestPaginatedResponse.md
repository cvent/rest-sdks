# ReservationRequestPaginatedResponse

The response from a request to get the list of housing reservation request details for the attendees. This includes the paging object as well as the collection of housing reservation request details.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Paging`                                                                                  | [Paging](../../Models/Components/Paging.md)                                               | :heavy_check_mark:                                                                        | Represents pagination information for a collection of resources.                          |
| `Data`                                                                                    | List<[HousingReservationResponse](../../Models/Components/HousingReservationResponse.md)> | :heavy_check_mark:                                                                        | Collection of reservation request details for attendees.                                  |