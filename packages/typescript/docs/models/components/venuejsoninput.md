# VenueJsonInput

An Event Venue

## Example Usage

```typescript
import { VenueJsonInput } from "@cvent/sdk/models/components";

let value: VenueJsonInput = {
  name: "Capital Convention Center",
  address: {
    address1: "Cvent Inc.",
    address2: "4001 West Parmer Lane",
    address3: "PO Box 123",
    city: "Austin",
    countryCode: "US",
    postalCode: "78727",
    regionCode: "TX",
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `name`                                                                               | *string*                                                                             | :heavy_minus_sign:                                                                   | The name of the venue.                                                               | Capital Convention Center                                                            |
| `address`                                                                            | [components.VenueAddressJsonInput](../../models/components/venueaddressjsoninput.md) | :heavy_minus_sign:                                                                   | Venue Address details                                                                |                                                                                      |