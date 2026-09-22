# UpdateVenueAvailabilitySettingsRequest

## Example Usage

```typescript
import { UpdateVenueAvailabilitySettingsRequest } from "@cvent/sdk/models/operations";

let value: UpdateVenueAvailabilitySettingsRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueAvailabilitySettings: {
    displayNeedDatesToPlanner: true,
  },
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `venueId`                                                                                    | *string*                                                                                     | :heavy_check_mark:                                                                           | Unique Cvent based identifier for a Venue.                                                   | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                         |
| `venueAvailabilitySettings`                                                                  | [components.VenueAvailabilitySettings](../../models/components/venueavailabilitysettings.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |                                                                                              |