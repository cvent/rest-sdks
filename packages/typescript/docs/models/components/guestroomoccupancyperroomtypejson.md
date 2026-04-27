# GuestRoomOccupancyPerRoomTypeJson

Room occupancy for a room type.

## Example Usage

```typescript
import { GuestRoomOccupancyPerRoomTypeJson } from "@cvent/sdk/models/components";

let value: GuestRoomOccupancyPerRoomTypeJson = {
  occupancy: "SINGLE",
  type: "DOUBLE",
};
```

## Fields

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            | Example                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `occupancy`                                                                                                                                                            | [components.GuestRoomOccupancyJson](../../models/components/guestroomoccupancyjson.md)                                                                                 | :heavy_minus_sign:                                                                                                                                                     | Guest room occupancy. `SINGLE`: Single occupant. `DOUBLE`: Two occupants. `TRIPLE`: Three occupants. `QUAD`: Four occupants.                                           | SINGLE                                                                                                                                                                 |
| `type`                                                                                                                                                                 | [components.GuestRoomTypeJson](../../models/components/guestroomtypejson.md)                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Guest room type. `ANY`: Room can be any type. `SINGLE`: Room with one bed. `DOUBLE`: Room with two beds. `SUITE`: Room is an entire suite. `STAFF`: Room is for staff. | DOUBLE                                                                                                                                                                 |