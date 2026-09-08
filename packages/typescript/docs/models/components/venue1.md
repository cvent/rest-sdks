# Venue1

An Event Venue

## Example Usage

```typescript
import { Venue1 } from "@cvent/sdk/models/components";

let value: Venue1 = {
  name: "Capital Convention Center",
  address: {
    address1: "Cvent Inc.",
    address2: "4001 West Parmer Lane",
    address3: "PO Box 123",
    city: "Austin",
    countryCode: "US",
    postalCode: "78727",
    region: "Texas",
    regionCode: "TX",
    country: "United States of America",
    latitude: 30.42501,
    longitude: -97.71518,
  },
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `name`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | The name of the venue.                                               | Capital Convention Center                                            |
| `address`                                                            | [components.VenueAddress1](../../models/components/venueaddress1.md) | :heavy_minus_sign:                                                   | Venue Address details                                                |                                                                      |