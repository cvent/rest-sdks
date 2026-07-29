# UpdateVenueFacilityRequest

## Example Usage

```typescript
import { UpdateVenueFacilityRequest } from "@cvent/sdk/models/operations";

let value: UpdateVenueFacilityRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  existingVenueFacility: {
    numberOfMeetingRooms: 25,
    space: {
      totalMeetingRoomSpace: 50000,
      totalExhibitSpace: 75000,
    },
    sleeping: {
      totalRooms: 350,
      suites: 20,
      singleRooms: 200,
      doubleRooms: 130,
    },
    singleRate: {
      low: 129.99,
      high: 249.99,
    },
    doubleRate: {
      low: 149.99,
      high: 299.99,
    },
    taxRate: 8.5,
    occupancyRate: 75.5,
    yearBuilt: 1998,
    yearRenovated: 2021,
    proximityFromAirport: {
      distance: 12.5,
    },
    restrictions:
      "No outside food or beverage permitted. Music must end by 11 PM.",
    maximumCapacity: {
      seated: 500,
      standing: 800,
    },
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `venueId`                                                                                      | *string*                                                                                       | :heavy_check_mark:                                                                             | Unique Cvent based identifier for a Venue.                                                     | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                           |
| `existingVenueFacility`                                                                        | [components.ExistingVenueFacilityInput](../../models/components/existingvenuefacilityinput.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |                                                                                                |