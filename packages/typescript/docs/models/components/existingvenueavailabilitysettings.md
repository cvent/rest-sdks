# ExistingVenueAvailabilitySettings

Availability settings for a venue.

## Example Usage

```typescript
import { ExistingVenueAvailabilitySettings } from "@cvent/sdk/models/components";

let value: ExistingVenueAvailabilitySettings = {
  displayNeedDatesToPlanner: true,
  id: "6bb0e2db-861f-46e3-a923-eb4d959ff128",
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `displayNeedDatesToPlanner`                                  | *boolean*                                                    | :heavy_check_mark:                                           | When true, the venue's need dates are displayed to planners. | true                                                         |
| `id`                                                         | *string*                                                     | :heavy_check_mark:                                           | Venue ID.                                                    | 6bb0e2db-861f-46e3-a923-eb4d959ff128                         |