# AvailableNights

List of available room nights and the availabilities associated details.

## Example Usage

```typescript
import { AvailableNights } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: AvailableNights = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      hotel: {
        id: 49543342,
      },
      roomType: {
        id: 11549984,
      },
      attendeeType: {
        id: 34549966,
        name: "Staff",
        codes: [
          "PEWATT0524317",
        ],
      },
      date: new RFCDate("2025-03-25"),
      quantity: 130,
      roomRate: 150,
      displayRate: 150,
      additionalGuestFees: [
        {
          guestCount: 2,
          fee: 20,
        },
      ],
      taxStructure: {
        disclosureStatement:
          "Total room charges will include all room fees and taxes (Subject to change).",
        items: [],
      },
      currency: "USD",
      maxGuests: 2,
      minLengthOfStay: 1,
      hideRate: false,
      waitListEnabled: false,
    },
  ],
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [components.PagingJson](../../models/components/pagingjson.md)                   | :heavy_minus_sign:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | [components.AvailableNightJson](../../models/components/availablenightjson.md)[] | :heavy_minus_sign:                                                               | List of available room nights and their associated details.                      |