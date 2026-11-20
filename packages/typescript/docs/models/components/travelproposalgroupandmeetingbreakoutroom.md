# TravelProposalGroupAndMeetingBreakOutRoom

The break-out room information of the proposal.

## Example Usage

```typescript
import { TravelProposalGroupAndMeetingBreakOutRoom } from "@cvent/sdk/models/components";

let value: TravelProposalGroupAndMeetingBreakOutRoom = {
  price10PersonRoom: 100,
  price25PersonRoom: 100,
};
```

## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `tenPersonRoomIncluded`                                   | *boolean*                                                 | :heavy_minus_sign:                                        | True indicates a 10-person room is included.              |                                                           |
| `price10PersonRoom`                                       | *number*                                                  | :heavy_minus_sign:                                        | The price of a 10-person room.                            | 100                                                       |
| `twentyFivePersonRoomIncluded`                            | *boolean*                                                 | :heavy_minus_sign:                                        | True indicates a 25-person room is included.              |                                                           |
| `price25PersonRoom`                                       | *number*                                                  | :heavy_minus_sign:                                        | The price of a 25-person room.                            | 100                                                       |
| `permanentBoardRoomSetUp`                                 | *boolean*                                                 | :heavy_minus_sign:                                        | True indicates a permanent board room setup is available. |                                                           |