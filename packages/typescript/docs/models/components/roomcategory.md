# RoomCategory

The category that classifies a room type.

## Example Usage

```typescript
import { RoomCategory } from "@cvent/sdk/models/components";

let value: RoomCategory = {
  id: 12345,
  name: "Deluxe King",
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *number*                                                 | :heavy_check_mark:                                       | The unique ID of the room category.                      | 12345                                                    |
| `name`                                                   | *string*                                                 | :heavy_minus_sign:                                       | The name of the category that classifies this room type. | Deluxe King                                              |