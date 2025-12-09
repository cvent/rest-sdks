# RoomTypeDetails

Room type details.

## Example Usage

```typescript
import { RoomTypeDetails } from "@cvent/sdk/models/components";

let value: RoomTypeDetails = {
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
};
```

## Fields

| Field                                                                                                                                   | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             | Example                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                    | *number*                                                                                                                                | :heavy_check_mark:                                                                                                                      | The Room type's unique ID.                                                                                                              | 2345                                                                                                                                    |
| `housingEvent`                                                                                                                          | [components.HousingEventIdJson](../../models/components/housingeventidjson.md)                                                          | :heavy_check_mark:                                                                                                                      | Contains unique ID of the housing event.                                                                                                |                                                                                                                                         |
| `hotel`                                                                                                                                 | [components.HotelIdJson](../../models/components/hotelidjson.md)                                                                        | :heavy_check_mark:                                                                                                                      | Contains unique ID of the hotel.                                                                                                        |                                                                                                                                         |
| `attendeeTypes`                                                                                                                         | [components.RoomAttendeeTypeJson](../../models/components/roomattendeetypejson.md)[]                                                    | :heavy_minus_sign:                                                                                                                      | List of supported attendee types for this room type, and their individual room policies.                                                |                                                                                                                                         |
| `name`                                                                                                                                  | *string*                                                                                                                                | :heavy_check_mark:                                                                                                                      | Name of the room type.                                                                                                                  | Double King                                                                                                                             |
| `description`                                                                                                                           | *string*                                                                                                                                | :heavy_check_mark:                                                                                                                      | Room description.                                                                                                                       | This room is equipped with king bed, a polished marble bedroom and generous wardrobes.                                                  |
| `images`                                                                                                                                | [components.ImageLinkJson](../../models/components/imagelinkjson.md)[]                                                                  | :heavy_minus_sign:                                                                                                                      | List of room images.                                                                                                                    |                                                                                                                                         |
| `customOrder`                                                                                                                           | *number*                                                                                                                                | :heavy_minus_sign:                                                                                                                      | Specifies a custom sort order defined by the user. This property is applicable only when the default price-based sorting is not active. | 1                                                                                                                                       |