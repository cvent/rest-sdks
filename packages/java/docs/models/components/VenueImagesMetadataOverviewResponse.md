# VenueImagesMetadataOverviewResponse

Paginated list of venue image metadata.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [Optional\<Paging>](../../models/components/Paging.md)                     | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | List\<[ExistingVenueImage](../../models/components/ExistingVenueImage.md)> | :heavy_check_mark:                                                         | The image metadata for a venue.                                            |