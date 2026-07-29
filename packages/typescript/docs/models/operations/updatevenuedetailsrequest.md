# UpdateVenueDetailsRequest

## Example Usage

```typescript
import { UpdateVenueDetailsRequest } from "@cvent/sdk/models/operations";

let value: UpdateVenueDetailsRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  existingVenueDetails: {
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
    description: "A modern conference venue in downtown.",
    additionalInformation: "Free parking available on-site.",
    cancellationPolicy: "Full refund if cancelled 48 hours before event.",
    locationTypes: [
      "SUBURBAN",
    ],
    address: {
      streetAddress1: "1234 Trap Road",
      streetAddress2: "Suite 100",
      city: "Vienna",
      zipPostalCode: "22182",
      country: "CH",
      directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
    },
  },
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `venueId`                                                                                    | *string*                                                                                     | :heavy_check_mark:                                                                           | Unique Cvent based identifier for a Venue.                                                   | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                         |
| `existingVenueDetails`                                                                       | [components.ExistingVenueDetailsInput](../../models/components/existingvenuedetailsinput.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |                                                                                              |