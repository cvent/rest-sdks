# TravelProposalDispositionJson

Represent proposal disposition details.

## Example Usage

```typescript
import { TravelProposalDispositionJson } from "@cvent/sdk/models/components";

let value: TravelProposalDispositionJson = {
  bidDispositions: [
    {
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
    },
  ],
  groupAndMeetingAccepted: true,
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `bidDispositions`                                                                            | [components.TravelBidDispositionJson](../../models/components/travelbiddispositionjson.md)[] | :heavy_minus_sign:                                                                           | List of bid dispositions.                                                                    |                                                                                              |
| `groupAndMeetingAccepted`                                                                    | *boolean*                                                                                    | :heavy_minus_sign:                                                                           | Indicates if the group and meeting is accepted.                                              | true                                                                                         |