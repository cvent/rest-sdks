# VenueAttractionsPaginatedResponse

Paginated list of attractions for a venue.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [Paging](../../Models/Components/Paging.md)                                         | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[ExistingVenueAttraction](../../Models/Components/ExistingVenueAttraction.md)> | :heavy_check_mark:                                                                  | List of attractions for the venue.                                                  |