# ExistingVenueFacilityMaximumCapacity

Maximum attendee capacity at the venue. Applicable only to venue types: Aquarium/Zoo, Arena/Stadium, Banquet Facility, Bar/Club, Corporate Office Space, Educational Facility, Entertainment Venue, Gallery/Museum, Golf Course, Movie Theatre, and Special Event Venue.

## Example Usage

```typescript
import { ExistingVenueFacilityMaximumCapacity } from "@cvent/sdk/models/components";

let value: ExistingVenueFacilityMaximumCapacity = {
  seated: 500,
  standing: 800,
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `seated`                                | *number*                                | :heavy_minus_sign:                      | Maximum seated capacity at the venue.   | 500                                     |
| `standing`                              | *number*                                | :heavy_minus_sign:                      | Maximum standing capacity at the venue. | 800                                     |