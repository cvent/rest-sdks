# VenueImagesMetadataOverviewResponse

Paginated list of venue image metadata.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Paging`                                                                  | [Paging](../../Models/Components/Paging.md)                               | :heavy_minus_sign:                                                        | Represents pagination information for a collection of resources.          |
| `Data`                                                                    | List<[ExistingVenueImage](../../Models/Components/ExistingVenueImage.md)> | :heavy_check_mark:                                                        | The image metadata for a venue.                                           |