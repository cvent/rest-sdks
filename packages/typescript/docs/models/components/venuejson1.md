# VenueJson1

Event venue details.

## Example Usage

```typescript
import { VenueJson1 } from "@cvent/sdk/models/components";

let value: VenueJson1 = {
  name: "Holiday Inn",
  address: {
    address1: "West St. 1",
    address2: "Apt. 16",
    city: "Austin",
    region: "Texas",
    regionCode: "TX",
    postalCode: "23452AB",
    country: "United States of America",
    countryCode: "US",
    latitude: 2342.23423,
    longitude: 231234.23423,
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `name`                                                                       | *string*                                                                     | :heavy_minus_sign:                                                           | Venue name.                                                                  | Holiday Inn                                                                  |
| `address`                                                                    | [components.VenueAddressJson1](../../models/components/venueaddressjson1.md) | :heavy_minus_sign:                                                           | Address details for venue.                                                   |                                                                              |