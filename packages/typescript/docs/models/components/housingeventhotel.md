# HousingEventHotel

Hotel details including name, description, policies and IDs.

## Example Usage

```typescript
import { HousingEventHotel } from "@cvent/sdk/models/components";

let value: HousingEventHotel = {
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
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *number*                                                                                                                 | :heavy_check_mark:                                                                                                       | The hotel's unique ID.                                                                                                   | 125664                                                                                                                   |
| `housingEvent`                                                                                                           | [components.HousingEventIdJson](../../models/components/housingeventidjson.md)                                           | :heavy_check_mark:                                                                                                       | Contains unique ID of the housing event.                                                                                 |                                                                                                                          |
| `name`                                                                                                                   | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | The hotel's name.                                                                                                        | Hotel New York                                                                                                           |
| `description`                                                                                                            | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | The hotel's description.                                                                                                 | Since first opening its doors in 1936, the Hotel New York has welcomed countless guests.                                 |
| `childPolicy`                                                                                                            | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The hotel's child policy.                                                                                                | Children 17 years or younger will stay free of charge in adult’s room with existing bedding.                             |
| `images`                                                                                                                 | [components.ImageLinkJson](../../models/components/imagelinkjson.md)[]                                                   | :heavy_minus_sign:                                                                                                       | List of hotel images.                                                                                                    |                                                                                                                          |
| `proximity`                                                                                                              | [components.ProximityJson](../../models/components/proximityjson.md)                                                     | :heavy_minus_sign:                                                                                                       | Proximity of the event venue to the hotel.                                                                               |                                                                                                                          |
| `amenities`                                                                                                              | *string*[]                                                                                                               | :heavy_minus_sign:                                                                                                       | List of available amenities at the hotel.                                                                                |                                                                                                                          |
| `rating`                                                                                                                 | [components.HotelRatingJson](../../models/components/hotelratingjson.md)                                                 | :heavy_minus_sign:                                                                                                       | The hotel's rating, used to classify the hotel's quality.                                                                | 3 Star                                                                                                                   |
| `address`                                                                                                                | [components.AddressJson3](../../models/components/addressjson3.md)                                                       | :heavy_minus_sign:                                                                                                       | Address details. Required to create/update a guest's reservation if the hotel/event requires an address in reservations. |                                                                                                                          |