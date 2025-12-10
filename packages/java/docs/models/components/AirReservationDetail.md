# AirReservationDetail

The response from a request to get the list of air reservation for the attendees.  This includes the paging object as well as the collection of air actual details.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [PagingJson](../../models/components/PagingJson.md)                                    | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[AirReservationDetailJson](../../models/components/AirReservationDetailJson.md)> | :heavy_check_mark:                                                                     | Collection of air reservations for attendees.                                          |