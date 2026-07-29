# PatchVenueDetailsRequest

## Example Usage

```typescript
import { PatchVenueDetailsRequest } from "@cvent/sdk/models/operations";

let value: PatchVenueDetailsRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueDetailsPatch: {
    type: "HOTEL",
    timeZone: "America/New_York",
    brand: "Quality Hotels",
    chainScale: "UPSCALE_CHAINS",
    mainPhoneNumber: "+1-703-555-0100",
    mainFaxNumber: "+1-703-555-0101",
    salesPhoneNumber: "+1-703-555-0102",
    salesFaxNumber: "+1-703-555-0103",
    tollFreeNumber: "1-800-555-0100",
    websiteAddress: "https://www.example-hotel.com",
    openingDate: "Spring 2025",
    description:
      "A premier conference and event venue in the heart of Northern Virginia.",
    additionalInformation:
      "Complimentary parking available for all event attendees.",
    cancellationPolicy:
      "48-hour cancellation policy applies for all event bookings.",
    locationTypes: [
      "SUBURBAN",
    ],
    address: {
      streetAddress1: "1234 Trap Road",
      streetAddress2: "Suite 100",
      city: "Vienna",
      zipPostalCode: "22182",
      directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
    },
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `venueId`                                                                    | *string*                                                                     | :heavy_check_mark:                                                           | Unique Cvent based identifier for a Venue.                                   | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                         |
| `venueDetailsPatch`                                                          | [components.VenueDetailsPatch](../../models/components/venuedetailspatch.md) | :heavy_check_mark:                                                           | N/A                                                                          |                                                                              |