# CreateVenueAttractionRequest

## Example Usage

```typescript
import { CreateVenueAttractionRequest } from "@cvent/sdk/models/operations";

let value: CreateVenueAttractionRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueAttraction: {
    name: "Golden Gate Bridge",
    description: "Iconic suspension bridge, 10 minutes from the venue.",
    url: "https://www.example.com",
    distance: {
      value: 2,
    },
    address: {
      streetAddress1: "Golden Gate Bridge",
      streetAddress2: "Suite 100",
      city: "San Francisco",
      zipPostalCode: "94129",
    },
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `venueId`                                                                | *string*                                                                 | :heavy_check_mark:                                                       | Unique Cvent based identifier for a Venue.                               | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                     |
| `venueAttraction`                                                        | [components.VenueAttraction](../../models/components/venueattraction.md) | :heavy_check_mark:                                                       | N/A                                                                      |                                                                          |