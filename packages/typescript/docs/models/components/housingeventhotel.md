# HousingEventHotel

Hotel details including name, description, policies and IDs.

## Example Usage

```typescript
import { HousingEventHotel } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

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
  reservationAccessDate: new RFCDate("2030-03-21"),
  hotelCloseDate: new RFCDate("2030-01-14"),
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
  rewardPrograms: [
    {
      id: 10000,
      name: "Hotel Rewards Program",
    },
  ],
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *number*                                                                                                                 | :heavy_check_mark:                                                                                                       | The hotel's unique ID.                                                                                                   | 125664                                                                                                                   |
| `housingEvent`                                                                                                           | [components.HousingEventId](../../models/components/housingeventid.md)                                                   | :heavy_check_mark:                                                                                                       | Contains unique ID of the housing event.                                                                                 |                                                                                                                          |
| `name`                                                                                                                   | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | The hotel's name.                                                                                                        | Hotel New York                                                                                                           |
| `description`                                                                                                            | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | The hotel's description.                                                                                                 | Since first opening its doors in 1936, the Hotel New York has welcomed countless guests.                                 |
| `childPolicy`                                                                                                            | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The hotel's child policy.                                                                                                | Children 17 years or younger will stay free of charge in adult’s room with existing bedding.                             |
| `images`                                                                                                                 | [components.ImageLink](../../models/components/imagelink.md)[]                                                           | :heavy_minus_sign:                                                                                                       | List of hotel images.                                                                                                    |                                                                                                                          |
| `proximity`                                                                                                              | [components.Proximity](../../models/components/proximity.md)                                                             | :heavy_minus_sign:                                                                                                       | Proximity of the event venue to the hotel.                                                                               |                                                                                                                          |
| `amenities`                                                                                                              | *string*[]                                                                                                               | :heavy_minus_sign:                                                                                                       | List of available amenities at the hotel.                                                                                |                                                                                                                          |
| `reservationAccessDate`                                                                                                  | [RFCDate](../../types/rfcdate.md)                                                                                        | :heavy_minus_sign:                                                                                                       | The hotel's reservation access date.                                                                                     | 2030-03-21                                                                                                               |
| `hotelCloseDate`                                                                                                         | [RFCDate](../../types/rfcdate.md)                                                                                        | :heavy_minus_sign:                                                                                                       | The hotel's close date.                                                                                                  | 2030-01-14                                                                                                               |
| `rating`                                                                                                                 | [components.HotelRating](../../models/components/hotelrating.md)                                                         | :heavy_minus_sign:                                                                                                       | The hotel's rating, used to classify the hotel's quality.                                                                | 3 Star                                                                                                                   |
| `address`                                                                                                                | [components.Address3](../../models/components/address3.md)                                                               | :heavy_minus_sign:                                                                                                       | Address details. Required to create/update a guest's reservation if the hotel/event requires an address in reservations. |                                                                                                                          |
| `rewardPrograms`                                                                                                         | [components.RewardProgram](../../models/components/rewardprogram.md)[]                                                   | :heavy_minus_sign:                                                                                                       | List of reward programs available at the hotel.                                                                          | [<br/>{<br/>"id": 10000,<br/>"name": "Hotel Rewards Program"<br/>}<br/>]                                                 |