# VenueImagesMetadataOverviewResponse

Paginated list of venue image metadata.

## Example Usage

```typescript
import { VenueImagesMetadataOverviewResponse } from "@cvent/sdk/models/components";

let value: VenueImagesMetadataOverviewResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      name: "Grand Ballroom Exterior",
      description:
        "Main exterior view of the venue showing the grand entrance.",
      imageGroup: "EXTERIOR",
      id: "286e2866-b443-4d09-ab0f-0fac45cc026f",
    },
  ],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [components.Paging](../../models/components/paging.md)                           | :heavy_minus_sign:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | [components.ExistingVenueImage](../../models/components/existingvenueimage.md)[] | :heavy_check_mark:                                                               | The image metadata for a venue.                                                  |