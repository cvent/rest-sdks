# TravelBidDispositionAcceptedRoom

A room that the bid disposition accepts.

## Example Usage

```typescript
import { TravelBidDispositionAcceptedRoom } from "@cvent/sdk/models/components";

let value: TravelBidDispositionAcceptedRoom = {
  propertyRoom: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  lraRateAccepted: true,
  nlraRateAccepted: true,
};
```

## Fields

| Field                                                                                                                              | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        | Example                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `propertyRoom`                                                                                                                     | [components.TravelBidDispositionAcceptedRoomPropertyRoom](../../models/components/travelbiddispositionacceptedroompropertyroom.md) | :heavy_minus_sign:                                                                                                                 | The accepted property room.                                                                                                        |                                                                                                                                    |
| `lraRateAccepted`                                                                                                                  | *boolean*                                                                                                                          | :heavy_minus_sign:                                                                                                                 | True indicates the last room availability (LRA) rates are accepted.                                                                | true                                                                                                                               |
| `nlraRateAccepted`                                                                                                                 | *boolean*                                                                                                                          | :heavy_minus_sign:                                                                                                                 | True indicates the non-last room availability (NLRA) rates are accepted.                                                           | true                                                                                                                               |