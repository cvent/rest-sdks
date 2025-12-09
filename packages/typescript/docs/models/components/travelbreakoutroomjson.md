# TravelBreakOutRoomJson

Break-out room information.

## Example Usage

```typescript
import { TravelBreakOutRoomJson } from "@cvent/sdk/models/components";

let value: TravelBreakOutRoomJson = {
  price10PersonRoom: 100,
  price25PersonRoom: 100,
};
```

## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `tenPersonRoomIncluded`                                | *boolean*                                              | :heavy_minus_sign:                                     | True indicates a 10 person room is included.           |                                                        |
| `price10PersonRoom`                                    | *number*                                               | :heavy_minus_sign:                                     | Price for 10 person room.                              | 100                                                    |
| `twentyFivePersonRoomIncluded`                         | *boolean*                                              | :heavy_minus_sign:                                     | True indicates a 25 person room included.              |                                                        |
| `price25PersonRoom`                                    | *number*                                               | :heavy_minus_sign:                                     | Price for 25 person room.                              | 100                                                    |
| `permanentBoardRoomSetUp`                              | *boolean*                                              | :heavy_minus_sign:                                     | True indicates there is a permanent board room set up. |                                                        |