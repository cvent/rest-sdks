# TravelBidDispositionJson

Represents bid disposition details.

## Example Usage

```typescript
import { TravelBidDispositionJson } from "@cvent/sdk/models/components";

let value: TravelBidDispositionJson = {
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

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `bid`                                                                                                                | [components.TravelProposalBidIdJson](../../models/components/travelproposalbididjson.md)                             | :heavy_minus_sign:                                                                                                   | A travel proposal bid.                                                                                               |
| `acceptedBidRooms`                                                                                                   | [components.TravelBidDispositionAcceptedRoomJson](../../models/components/travelbiddispositionacceptedroomjson.md)[] | :heavy_minus_sign:                                                                                                   | List of accepted bid rooms.                                                                                          |
| `rateType`                                                                                                           | [components.RateTypeJson](../../models/components/ratetypejson.md)                                                   | :heavy_minus_sign:                                                                                                   | Rate type.                                                                                                           |