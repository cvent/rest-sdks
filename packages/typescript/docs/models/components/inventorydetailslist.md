# InventoryDetailsList

List of inventory details for room type by night.

## Example Usage

```typescript
import { InventoryDetailsList } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: InventoryDetailsList = {
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
      hideRates: false,
      rate: {
        base: 150,
        currency: "USD",
      },
      originalBlock: 100,
      currentBlock: 150,
      pickup: 50,
      finalPickup: 45,
      maxGuests: 2,
      minLengthOfStay: 1,
      waitListRequests: 1,
      available: 30,
      housingEvent: {
        id: 69121314,
      },
      hotel: {
        id: 49543342,
      },
      roomType: {
        id: 11549984,
      },
      date: new RFCDate("2024-12-01"),
      freeSell: 80,
      unassigned: 20,
      allocation: [
        {
          hideRates: false,
          rate: {
            base: 150,
            currency: "USD",
          },
          originalBlock: 100,
          currentBlock: 150,
          pickup: 50,
          finalPickup: 45,
          maxGuests: 2,
          minLengthOfStay: 1,
          waitListRequests: 1,
          available: 30,
          attendeeType: {
            id: 34549966,
          },
          openForReservation: true,
          freeSellEnabled: true,
          sellHighestRate: false,
          waitListEnabled: false,
          guaranteed: true,
          arrivals: 10,
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [components.PagingJson](../../models/components/pagingjson.md)                 | :heavy_minus_sign:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | [components.RoomInventoryJson](../../models/components/roominventoryjson.md)[] | :heavy_minus_sign:                                                             | List of inventory details by night.                                            |