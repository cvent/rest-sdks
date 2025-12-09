# TravelBidSeasonJson

Season details for a travel bid.

## Example Usage

```typescript
import { TravelBidSeasonJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: TravelBidSeasonJson = {
  name: "Season 1",
  startDate: new RFCDate("2021-07-13"),
  endDate: new RFCDate("2021-07-13"),
  releasePeriod: 1,
  weekendReleasePeriod: 2,
  rates: [
    {
      propertyRoom: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      singleRate: 100,
      doubleRate: 101,
      tripleRate: 102,
      quadRate: 103,
      nlraSingleRate: 104,
      nlraDoubleRate: 105,
      allotment: 100,
      status: "requested",
    },
  ],
  weekendRates: [
    {
      propertyRoom: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      singleRate: 100,
      doubleRate: 101,
      tripleRate: 102,
      quadRate: 103,
      nlraSingleRate: 104,
      nlraDoubleRate: 105,
      allotment: 100,
      status: "requested",
    },
  ],
  status: "requested",
};
```

## Fields

| Field                                                                                                                                                              | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                                                                             | *string*                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                 | Season name.                                                                                                                                                       | Season 1                                                                                                                                                           |
| `startDate`                                                                                                                                                        | [RFCDate](../../types/rfcdate.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The ISO 8601 start date of the season.                                                                                                                             | 2021-07-13                                                                                                                                                         |
| `endDate`                                                                                                                                                          | [RFCDate](../../types/rfcdate.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The ISO 8601 end date of the season.                                                                                                                               | 2021-07-13                                                                                                                                                         |
| `releasePeriod`                                                                                                                                                    | *number*                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                 | Number of release periods.                                                                                                                                         | 1                                                                                                                                                                  |
| `weekendReleasePeriod`                                                                                                                                             | *number*                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                 | Number of weekend release periods.                                                                                                                                 | 2                                                                                                                                                                  |
| `rates`                                                                                                                                                            | [components.TravelBidSeasonRateJson](../../models/components/travelbidseasonratejson.md)[]                                                                         | :heavy_minus_sign:                                                                                                                                                 | Collection of rates for the season.                                                                                                                                |                                                                                                                                                                    |
| `weekendRates`                                                                                                                                                     | [components.TravelBidSeasonRateJson](../../models/components/travelbidseasonratejson.md)[]                                                                         | :heavy_minus_sign:                                                                                                                                                 | Collection of weekend rates for the season.                                                                                                                        |                                                                                                                                                                    |
| `status`                                                                                                                                                           | [components.BidItemStatusTypeJson](../../models/components/biditemstatustypejson.md)                                                                               | :heavy_minus_sign:                                                                                                                                                 | The status of the item in negotiation.  e.g. The corporation might mark an item as delete_requested, and the hotel, if they agree, can update the item to deleted. | requested                                                                                                                                                          |