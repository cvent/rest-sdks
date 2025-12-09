# HousingEventRoomTypesList

List of room types.

## Example Usage

```typescript
import { HousingEventRoomTypesList } from "@cvent/sdk/models/components";

let value: HousingEventRoomTypesList = {
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
      id: 2345,
      housingEvent: {
        id: 69121314,
      },
      hotel: {
        id: 49543342,
      },
      attendeeTypes: [
        {
          id: 34549966,
          name: "Staff",
          codes: [
            "PEWATT0524317",
          ],
          cancelPolicy:
            "If you wish to cancel your reservation, please do so 72 hours prior to your arrival date.",
          taxPolicy: "New York State Sales Tax is currently 8.875% per night.",
        },
      ],
      name: "Double King",
      description:
        "This room is equipped with king bed, a polished marble bedroom and generous wardrobes.",
      images: [
        {
          href: "https://example.com/content/example.jpg",
        },
      ],
      customOrder: 1,
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.RoomTypeDetails](../../models/components/roomtypedetails.md)[] | :heavy_minus_sign:                                                         | List of room types and their associated details.                           |