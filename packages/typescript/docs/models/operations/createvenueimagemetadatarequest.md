# CreateVenueImageMetadataRequest

## Example Usage

```typescript
import { CreateVenueImageMetadataRequest } from "@cvent/sdk/models/operations";

let value: CreateVenueImageMetadataRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueImage: {
    name: "Grand Ballroom Exterior",
    description: "Main exterior view of the venue showing the grand entrance.",
    imageGroup: "EXTERIOR",
  },
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `venueId`                                                      | *string*                                                       | :heavy_check_mark:                                             | Unique Cvent based identifier for a Venue.                     | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                           |
| `venueImage`                                                   | [components.VenueImage](../../models/components/venueimage.md) | :heavy_check_mark:                                             | N/A                                                            |                                                                |