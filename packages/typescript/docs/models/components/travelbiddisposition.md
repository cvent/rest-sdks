# TravelBidDisposition

Represents bid disposition details.

## Example Usage

```typescript
import { TravelBidDisposition } from "@cvent/sdk/models/components";

let value: TravelBidDisposition = {
  bid: {
    id: "1c208c0d-cf96-42ec-a2c3-7ab7a5c04825",
  },
  acceptedBidRooms: [
    {
      propertyRoom: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      lraRateAccepted: true,
      nlraRateAccepted: true,
    },
  ],
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `bid`                                                                                                        | [components.TravelProposalBid1](../../models/components/travelproposalbid1.md)                               | :heavy_minus_sign:                                                                                           | A travel proposal bid.                                                                                       |
| `acceptedBidRooms`                                                                                           | [components.TravelBidDispositionAcceptedRoom](../../models/components/travelbiddispositionacceptedroom.md)[] | :heavy_minus_sign:                                                                                           | List of accepted bid rooms.                                                                                  |
| `rateType`                                                                                                   | [components.RateType](../../models/components/ratetype.md)                                                   | :heavy_minus_sign:                                                                                           | Rate type.                                                                                                   |