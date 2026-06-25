# RoomBlockDetails

Contains details related to room allotment for a room type.

## Example Usage

```typescript
import { RoomBlockDetails } from "@cvent/sdk/models/components";

let value: RoomBlockDetails = {
  quantity: 24,
  type: "DOUBLE",
};
```

## Fields

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            | Example                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `quantity`                                                                                                                                                             | *number*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | Quantity of rooms required.                                                                                                                                            | 24                                                                                                                                                                     |
| `type`                                                                                                                                                                 | [components.GuestRoomType](../../models/components/guestroomtype.md)                                                                                                   | :heavy_minus_sign:                                                                                                                                                     | Guest room type. `ANY`: Room can be any type. `SINGLE`: Room with one bed. `DOUBLE`: Room with two beds. `SUITE`: Room is an entire suite. `STAFF`: Room is for staff. | DOUBLE                                                                                                                                                                 |