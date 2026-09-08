# RoomInfo

Room information.

## Example Usage

```typescript
import { RoomInfo } from "@cvent/sdk/models/components";

let value: RoomInfo = {
  id: 11549984,
  name: "King",
  roomCategory: {
    id: 12345,
    name: "Deluxe King",
  },
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `id`                                                               | *number*                                                           | :heavy_check_mark:                                                 | The unique ID of the room.                                         | 11549984                                                           |
| `name`                                                             | *string*                                                           | :heavy_minus_sign:                                                 | Room name.                                                         | King                                                               |
| `roomCategory`                                                     | [components.RoomCategory](../../models/components/roomcategory.md) | :heavy_minus_sign:                                                 | The category that classifies a room type.                          |                                                                    |