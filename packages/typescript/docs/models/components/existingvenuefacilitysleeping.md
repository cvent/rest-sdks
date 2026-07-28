# ExistingVenueFacilitySleeping

Sleeping room inventory at the venue.

## Example Usage

```typescript
import { ExistingVenueFacilitySleeping } from "@cvent/sdk/models/components";

let value: ExistingVenueFacilitySleeping = {
  totalRooms: 350,
  suites: 20,
  singleRooms: 200,
  doubleRooms: 130,
};
```

## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `totalRooms`                                         | *number*                                             | :heavy_minus_sign:                                   | Total number of sleeping rooms at the venue.         | 350                                                  |
| `suites`                                             | *number*                                             | :heavy_minus_sign:                                   | Total number of suites at the venue.                 | 20                                                   |
| `singleRooms`                                        | *number*                                             | :heavy_minus_sign:                                   | Total number of single-occupancy rooms at the venue. | 200                                                  |
| `doubleRooms`                                        | *number*                                             | :heavy_minus_sign:                                   | Total number of double-occupancy rooms at the venue. | 130                                                  |