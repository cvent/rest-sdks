# HousingEventHotelsList

List of hotels associated with a particular housing event.

## Example Usage

```typescript
import { HousingEventHotelsList } from "@cvent/sdk/models/components";

let value: HousingEventHotelsList = {
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
      id: 125664,
      housingEvent: {
        id: 69121314,
      },
      name: "Hotel New York",
      description:
        "Since first opening its doors in 1936, the Hotel New York has welcomed countless guests.",
      childPolicy:
        "Children 17 years or younger will stay free of charge in adult’s room with existing bedding.",
      images: [
        {
          href: "https://example.com/content/example.jpg",
        },
      ],
      proximity: {
        distance: {
          distance: 18.3,
          distanceUnit: "Kilometers",
        },
        mapMessage: "Your hotel is located here.",
      },
      amenities: [
        "Room Service",
      ],
      rating: "3 Star",
      address: {
        address1: "West St. 1",
        address2: "Apt. 16",
        city: "Austin",
        region: "Texas",
        regionCode: "TX",
        postalCode: "23452AB",
        country: "United States of America",
        countryCode: "US",
      },
    },
  ],
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [components.PagingJson](../../models/components/pagingjson.md)                 | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | [components.HousingEventHotel](../../models/components/housingeventhotel.md)[] | :heavy_check_mark:                                                             | List of hotels associated with a particular housing event.                     |