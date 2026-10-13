# VenueAttractionsPaginatedResponse

Paginated list of attractions for a venue.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [Paging](../../models/components/Paging.md)                                          | :heavy_check_mark:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | List\<[ExistingVenueAttraction](../../models/components/ExistingVenueAttraction.md)> | :heavy_check_mark:                                                                   | List of attractions for the venue.                                                   |