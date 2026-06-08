# HotelReservationDetail2

The response from a request to get the list of hotel reservation for the attendees.  This includes the paging object as well as the collection of air actual details.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [Paging](../../Models/Components/Paging.md)                                         | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[HotelReservationDetail1](../../Models/Components/HotelReservationDetail1.md)> | :heavy_check_mark:                                                                  | Collection of hotel reservation for attendees.                                      |