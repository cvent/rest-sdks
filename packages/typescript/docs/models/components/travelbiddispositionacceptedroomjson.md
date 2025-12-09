# TravelBidDispositionAcceptedRoomJson

Represents bid disposition's accepted room.

## Example Usage

```typescript
import { TravelBidDispositionAcceptedRoomJson } from "@cvent/sdk/models/components";

let value: TravelBidDispositionAcceptedRoomJson = {
  propertyRoom: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  lraRateAccepted: true,
  nlraRateAccepted: true,
};
```

## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `propertyRoom`                                                                                                                             | [components.TravelBidDispositionAcceptedRoomJsonPropertyRoom](../../models/components/travelbiddispositionacceptedroomjsonpropertyroom.md) | :heavy_minus_sign:                                                                                                                         | ID of the property's room.                                                                                                                 |                                                                                                                                            |
| `lraRateAccepted`                                                                                                                          | *boolean*                                                                                                                                  | :heavy_minus_sign:                                                                                                                         | Indicates whether the LRA rates are accepted.                                                                                              | true                                                                                                                                       |
| `nlraRateAccepted`                                                                                                                         | *boolean*                                                                                                                                  | :heavy_minus_sign:                                                                                                                         | Indicates whether the NLRA rates are accepted.                                                                                             | true                                                                                                                                       |