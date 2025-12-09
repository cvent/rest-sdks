# ReservationRequestPaginatedResponse

The response from a request to get the list of housing reservation request details for the attendees. This includes the paging object as well as the collection of housing reservation request details.


## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `paging`                                                                                           | [PagingJson](../../models/components/PagingJson.md)                                                | :heavy_check_mark:                                                                                 | Represents pagination information for a collection of resources.                                   |
| `data`                                                                                             | List\<[ReservationRequestResponseJson](../../models/components/ReservationRequestResponseJson.md)> | :heavy_check_mark:                                                                                 | Collection of reservation request details for attendees.                                           |